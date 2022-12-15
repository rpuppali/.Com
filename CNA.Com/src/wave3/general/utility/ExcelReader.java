package wave3.general.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private String TestData = System.getProperty("user.dir") + "\\src\\wave3\\testdata\\CNATestdata.xlsx";

	public ExcelReader() throws IOException {
		fis = new FileInputStream(TestData);
		workbook = new XSSFWorkbook(fis);
	}

	public String GetTestData(String sheetName, String cellContent1, String cellContent2, String testCaseName) throws Exception {
		sheet = workbook.getSheet(sheetName);
		DataFormatter formatter = new DataFormatter();
		int colnum = getColNum(sheetName, testCaseName);
		if (colnum != -1) {
			for (Row row : sheet) {
				if (row.getCell(0) != null && row.getCell(1) != null && row.getCell(0).getCellType() == Cell.CELL_TYPE_STRING && row.getCell(1).getCellType() == Cell.CELL_TYPE_STRING) {
					if (row.getCell(0).getRichStringCellValue().getString().trim().equalsIgnoreCase(cellContent1.trim()) && row.getCell(1).getRichStringCellValue().getString().trim().equalsIgnoreCase(cellContent2.trim())) {
						System.out.println(row.getCell(0).getRichStringCellValue().getString().trim() + " & " + row.getCell(1).getRichStringCellValue().getString().trim() + " - Test data Found in rownum --> " + row.getRowNum());
						String srow = formatter.formatCellValue(row.getCell(colnum)).trim();
						System.out.println("Test data is --> " + srow);
						return srow;
					}
				}
			}
		}
		throw new Exception("Data not found in the data sheet.Sheet:" + sheetName + " search criteria-1:" + cellContent1 + " search criteria-2:" + cellContent2 + " testcase name:" + testCaseName);
	}

	public int getColNum(String sheetName, String colName) throws IOException {

		sheet = workbook.getSheet(sheetName);
		int colNum = -1;

		row = sheet.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			if (row.getCell(i) != null && row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName)) {
				colNum = i;
				return colNum;
			}
		}
		return colNum;
	}

}
