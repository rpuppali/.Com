package wave3.general.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadWritePolicyNumber {

	private   String path;

	public  ReadWritePolicyNumber() throws IOException {
		CreateDirectory();
	}

	public  void CreateDirectory() throws IOException {
		Date todaysDate = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String DateFormat = dateFormat.format(todaysDate);
		path = System.getProperty("user.dir") + "\\PolicyData\\" + DateFormat;
		File newDirectory = new File(path);
		boolean isCreated = newDirectory.mkdirs();
		if (isCreated) {
			System.out.printf("Successfully Policy Data created directories, path:%s", newDirectory.getCanonicalPath());
		} else if (newDirectory.exists()) {
			System.out.printf("Directory path already exist, path:%s", newDirectory.getCanonicalPath());
		} else {
			System.out.println("Unable to create directory");
			return;
		}
	}

	public  void WritePolicyNumber(String testCaseName, String policyType, String policyNumber) throws IOException {
		File policyFile = new File(path + File.separator + testCaseName + ".txt");
		FileWriter fileWriter = new FileWriter(policyFile, true);
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(policyFile, true)));
		printWriter.print(policyType + "---> " + policyNumber + "\n");
		printWriter.close();
		fileWriter.close();
	}

	public String ReadFileAsString(String path) {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("Generated policy number ----" + text);
		return text;
	}
	
	/*public static void main(String args[]) throws IOException {
		CreateDirectory();	
		WritePolicyNumber("TestCaseID_12", "New Submission: ", "1548947894");
		WritePolicyNumber("TestCaseID_13", "New Submission: ", "3534534534");
	}*/

}
