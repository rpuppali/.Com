package wave3.general.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class GeneralUtil {

	public static String GetTimeZoneDateTime(Date date, TimeZone timeZone) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		dateFormat.setTimeZone(timeZone);
		return dateFormat.format(date);
	}

	public static String GetCurrentCSTDate() throws ParseException {
		LocalDate date = LocalDate.now(ZoneId.of("CST6CDT"));
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return newFormat.format(date).toString();
	}

	public static String AddDaysToCurrentCSTDate(long daysToAdd) throws ParseException {
		LocalDate date = LocalDate.now(ZoneId.of("CST6CDT"));
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return newFormat.format(date.plusDays(daysToAdd)).toString();
	}

	public static String MinusDaysToCurrentCSTDate(long daysToSubtract) throws ParseException {
		LocalDate date = LocalDate.now(ZoneId.of("CST6CDT"));
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return newFormat.format(date.minusDays(daysToSubtract)).toString();
	}

	public static List<HashMap<String, Object>> ReadDataFromDatabase(String dbURL, String username, String password, String queryToExecute) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Connection con = DriverManager.getConnection(dbURL, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(queryToExecute);
			List<HashMap<String, Object>> list = convertResultSetToList(rs);
			con.close();
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static List<HashMap<String, Object>> convertResultSetToList(ResultSet rs) throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		while (rs.next()) {
			HashMap<String, Object> row = new HashMap<String, Object>(columns);
			for (int i = 1; i <= columns; ++i) {
				row.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(row);
		}

		return list;
	}

	public static String ReadDataFromPDF(String filePath, int startPage, int endPage) throws IOException {
		String pdfText = null;
		PDDocument pdDocument = null;
		try {
			File file = new File(filePath);
			pdDocument = PDDocument.load(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			pdfStripper.setStartPage(startPage);
			pdfStripper.setEndPage(endPage);
			pdfStripper.setSortByPosition(true);			
			pdfText = pdfStripper.getText(pdDocument);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pdDocument != null) {
				pdDocument.close();
			}
		}
		return pdfText;

	}

	public static void SearchAndMoveByPartialFileName(String srcFolder, String destFolder, String partialFileNameStartsWithToSearch, String renameFileTo) {

		File[] listFiles = new File(srcFolder).listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isFile()) {
				String fileName = listFiles[i].getName();
				if (fileName.startsWith(partialFileNameStartsWithToSearch)) {
					System.out.println("found file" + " " + fileName);
					try {
						File file = new File(destFolder + fileName);
						if (file.exists()) {
							file.delete();
						}
						String src = srcFolder + System.getProperty("file.separator") + fileName;
						String dest = destFolder + System.getProperty("file.separator") + fileName;
						Path temp = Files.move(Paths.get(src), Paths.get(dest));
						if (temp != null) {
							Files.move(temp, temp.resolveSibling(renameFileTo + ".pdf"));
							System.out.println("File renamed and moved successfully");
							break;
						} else {
							System.out.println("Failed to move the file");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}
		}
	}

}
