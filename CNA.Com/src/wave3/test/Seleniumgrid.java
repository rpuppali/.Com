package wave3.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class Seleniumgrid {
	public static Properties environmentProperties;
	public static void main(String[] args) throws IOException {
		InputStream inputEnvironment = new FileInputStream(System.getProperty("user.dir") + "\\Environment.properties");
		environmentProperties = new Properties();
		environmentProperties.load(inputEnvironment);
		
		String nodeIPaddress=environmentProperties.getProperty("NodeIP").toString();
		String nodePortNum=environmentProperties.getProperty("NodePorttNum").toString();
		//String hubPortNum=environmentProperties.getProperty("PortNum").toString();
		String setPath="SET PATH=C:\\Program Files\\Java\\jdk1.8.0_191\\bin";
		String fileSeperator = System.getProperty("file.separator");
		String reportFilepath = System.getProperty("user.dir") + fileSeperator + "lib";
		String chromeDriver="-Dwebdriver.chrome.driver="+reportFilepath+"\\chromedriver.exe";
		String ieDriver="-Dwebdriver.ie.driver="+reportFilepath+"\\IEDriverServer_x32.exe";
		
		String seleniumServerJar="selenium-server-standalone-3.141.59.jar";
		String seleniumNodeServerJar="selenium-server-standalone-3.141.59.jar";
	//	String seleniumHubServer= ""+reportFilepath+ "\\"+seleniumServerJar+" -port "+hubPortNum;
		String seleniumHubServer= ""+reportFilepath+ "\\"+seleniumServerJar;
		String seleniumNodeServer= ""+reportFilepath+ "\\"+seleniumNodeServerJar;
		//String Node="java "+chromeDriver+" -jar "+seleniumNodeServer+" -role node -hub http://"+nodeIPaddress+":"+nodePortNum+"/grid/register  -port "+nodePortNum;
		String chromeNode="java "+chromeDriver+" -jar "+seleniumNodeServer+" -role node -hub http://"+nodeIPaddress+":"+nodePortNum+"/grid/register";
		String internetExplorerNode="java "+ieDriver+" -jar "+seleniumNodeServer+" -role node -hub http://"+nodeIPaddress+":"+nodePortNum+"/grid/register";
		String hubServer= "java -jar "+seleniumHubServer+" -role hub";
		System.out.println("chrome Driver path "+chromeDriver);
		System.out.println("																					");
		System.out.println("Ie Driver path "+ieDriver);
		System.out.println("																					");
		System.out.println("Please run Hub server command in commond prompt: --->   "+hubServer);
		System.out.println("																					");
		System.out.println("Please run Node server command  in commond prompt for chrome :--->   "+chromeNode);
		System.out.println("																					");
		System.out.println("Please run Node server command  in commond prompt for Internet Explorer :--->   "+internetExplorerNode);
		WriteGridUrls(internetExplorerNode,chromeNode,hubServer);
	}
	
	public static void WriteGridUrls(String IEserverUrl,String ChromeUrl,String hubServer) throws IOException {
		String path = System.getProperty("user.dir");
		String GridUrl="GridServerUrl";
		File selGridFile = new File(path + File.separator + GridUrl + ".txt");
		FileWriter fileWriter = new FileWriter(selGridFile, false);
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(selGridFile, true)));
		printWriter.print("Command to start hub server : ---> " + hubServer + "\n");
		printWriter.print("\n");
		printWriter.print("Chrome : ---> " + ChromeUrl + "\n");
		printWriter.print("\n");
		printWriter.print("Internet explorer : ---> " + IEserverUrl + "\n");
		printWriter.close();
		fileWriter.close();
	}

}
