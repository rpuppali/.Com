package wave3.test;

import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IAttributes;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import wave3.general.utility.Constants;
import wave3.general.utility.ExcelReader;
import wave3.general.utility.ReadWritePolicyNumber;
import wave3.pages.AboutCNA;
//import wave3.reports.ExtentTestManager;

public class BaseTest {
	public WebDriver driver;
	protected WebDriverWait driverWait;
	protected long timeout;
	protected long renewalWorkflowTimeoutInSecs;
	protected long implicitTimeout;
	public Properties environmentProperties;
	public String drtURL;
	public String eteURL;
	public String URL;
	public String claim;
	//protected ExcelReader excelData;
	protected Random random;
	//protected ReadWritePolicyNumber storePolicyNumber;
	//public String sauceProxyPortNum;
	public String localHost;
	public String SauceLabsID = "cae7901";
	public String SauceLabsAPIKey = "9e6c277b-5b36-491b-8c56-4456199f3b26";
	public String SauceURL = "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	public String RimUrl = "https://ete4-www.cna.com/web/guest/cna/microsite/rims/welcome";
	//public String SauceURL = "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	public Properties urlProperties;

	String executionPath = System.getProperty("user.dir");

	public BaseTest() throws IOException, URISyntaxException {
		
		
		//excelData = new ExcelReader();

		// random = new Random();
		// storePolicyNumber= new ReadWritePolicyNumber();

		try (InputStream inputEnvironment = new FileInputStream(

				System.getProperty("user.dir") + "\\Environment.properties")) {
			environmentProperties = new Properties();
			environmentProperties.load(inputEnvironment);
			timeout = Long.parseLong(environmentProperties.getProperty("WebDriverTimeOut").toString());
			renewalWorkflowTimeoutInSecs = Long
					.parseLong(environmentProperties.getProperty("RenewalWorkflowTimeoutInSecs").toString());
			implicitTimeout = Long.parseLong(environmentProperties.getProperty("ImplicitWaitTimeout").toString());
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public boolean isImageLinkClickable(String xpath) {
		WebElement imgElement = driver.findElement(By.xpath(xpath));
		try {
			imgElement.click();
			return true;
		} catch (Exception e) {
			System.out.println("***ERROR*** Failed to click");
			return false;
		}
	}
	
	public void SendanEmail() throws InterruptedException {
		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
		aboutCNA.recipientEmail.sendKeys("ravikishore.gajula@cna.com");
		aboutCNA.senderEmail.sendKeys("ravikishore.gajula@cna.com");
		aboutCNA.senderFirstName.sendKeys("Test");
		aboutCNA.sendLastName.sendKeys("bios");
		aboutCNA.InputField().sendKeys("executive bios");
		aboutCNA.SendMailbtn().click();
		
	}

	

	
//	public boolean verifyHomePageAccessable() throws InterruptedException {
//		slowDown(3);
//		String ignorePopupClick = "//span[contains(text(),'NO')]";
//		ignorePopup(ignorePopupClick);
//		boolean ignore = !ignorePopupClick.isEmpty();
//
//		ExtentTestManager.getTest().info(getClass().getSimpleName().toString());
//		ExtentTestManager.getTest()
//				.info("Verify that the application is successfully launching to the expected CNA Home landing page");
//
//		Reporter.log(
//				"<b><font color='purple'>Verify that the application is successfully launching to the expected landing page<p align='right'>[Sprint_01 TC_01 Landing Page]</p></font></b>");
//		return ignore;
//	}

	public void ignorePopup(String webelement) {

		try {
			for (int i = 0; i < 2; i++) {
				try {
					if (!driver.findElements(By.xpath(webelement)).isEmpty()) {
						try {
							driver.findElement(By.xpath(webelement)).click();
						} catch (NoSuchElementException e) {
							e.printStackTrace();
						}
					}

					else {
						try {
							System.out.println("no element found ");
						} catch (NoSuchElementException e) {
							e.printStackTrace();
						}
					}
				} catch (NoSuchElementException e) {
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean ishrefelement(By by) {
		return !driver.findElement(by).getAttribute("href").isEmpty();
	}

	public void slowDown() {

		try {
			Thread.sleep(3000); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void slowDown(int sec) {
		try {
			Thread.sleep(sec * 1000); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public void changeToLatestTab() {
		String winHandleBefore = driver.getWindowHandle();
		if (driver.getWindowHandles().size() > 0) {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(winHandleBefore);
			// tabs2.get(driver.getWindowHandle().size()-1)
			slowDown(1);
		}
	}

	public void hideElement(WebElement element) { // Useful to hide element that is overlapping and preventing click of
													// object behind it
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeTab() {
		String winHandleBefore = driver.getWindowHandle();
		if (!(driver.getWindowHandles().size() == 2)) {
			driver.close();
			changeToLatestTab();
			// driver.switchTo().window(winHandleBefore);
		}
	}

	public void swapTab() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}
	public void switchToFirstTab() {
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        }
	public void closeAdditionalTabs() {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(windowHandles);                               
		int m = tabs.size();
		if ( m > 1)
		{        
		for(int i =1 ; i<m ; i++) {
		  driver.switchTo().window(tabs.get(i)).close();      
		}
		switchToFirstTab();
		}
		}
//	public void HomePageAccessable() {
//		try {
//			if (verifyHomePageAccessable()) {
//				System.out.println("Clicked on popup");
//				ExtentTestManager.getTest().info("Clicked on popup");
//			} else {
//				ExtentTestManager.getTest().info("Unable to click on popup");
//				System.out.println("Unable to click on popup");
//			}
//		} catch (InterruptedException notaccessable) {
//			// TODO Auto-generated catch block
//			notaccessable.printStackTrace();
//		}
//	}
	public WebElement ContinueButton() {
		WaitforElementToBeVisible(By.xpath("//div[@id='BtnCookiesXout']"));
		return driver.findElement(By.xpath("//div[@id='BtnCookiesXout']"));
	}
	public void WaitforElementToBeVisible(By xpath) {
		// TODO Auto-generated method stub
		
	}
	public void NavigateToBaseUrl() {
		driver.navigate().to(environmentProperties.getProperty("URL").toString());
		closeAdditionalTabs();
		//HomePageAccessable();
		
		
	}
	public void NavigateToBaseURL() {
		driver.navigate().to(environmentProperties.getProperty("URL").toString());
		closeAdditionalTabs();
		//HomePageAccessable();
		/*ExtentTestManager.getTest().log(Status.PASS,
		"Navigating to URL: " + environmentProperties.getProperty("URL").toString());
	}
	
	
/*	public void NavigateToBaseURL() {
		if(URL!= drtURL) {
		driver.navigate().to(environmentProperties.getProperty("eteURL").toString());
		}
		else if(URL!=eteURL) {
			driver.navigate().to(environmentProperties.getProperty("drtURL").toString());	
		}
		
		/*ExtentTestManager.getTest().log(Status.PASS,
				"Navigating to URL: " + environmentProperties.getProperty("URL").toString());*/
	}
	
		public void sleniumGridIE(DesiredCapabilities cap) throws MalformedURLException {
		// System.setProperty("https.proxyHost", localHost);
		// System.setProperty("https.proxyPort", sauceProxyPortNum);
		System.out.println("Automated grizid test run. We're running on Internet Explorer");
		String Node = environmentProperties.getProperty("HubIP").toString();
		String portNum = environmentProperties.getProperty("PortNum").toString();
		String nodeUrl = "http://" + Node + ":" + portNum + "/wd/hub";
		System.out.println("Grid url  " + nodeUrl);
		driver = new RemoteWebDriver(new URL(nodeUrl), cap);
	}

	public void sleniumGridChrome(DesiredCapabilities cap, ITestContext context) throws MalformedURLException {
		//System.setProperty("https.proxyHost", sauceProxyPortNum);
		System.setProperty("https.proxyPort", localHost);
		System.out.println("Automated grid test run. We're running on chrome");
		String Node = environmentProperties.getProperty("NodeIP").toString();
		String portNum = environmentProperties.getProperty("PortNum").toString();
		String nodeUrl = "http://" + Node + ":" + portNum + "/wd/hub";

		System.out.println("Grid url  " + nodeUrl);
		driver = new RemoteWebDriver(new URL(nodeUrl), cap);
		context.setAttribute("driver", driver);
	}

	protected void ClearBrowsers() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		System.out.println("Killing driver and Browser instance .......");
	}
	
	

	/**
	 * @throws WebDriverException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@SuppressWarnings("deprecation")
	@BeforeClass
	protected void GetDriverInstance(ITestContext context)
			throws WebDriverException, IOException, InterruptedException {
		System.out.println(System.getProperty("user.dir"));

		String Browser = environmentProperties.getProperty("Browser").toString();
		System.setProperty(Constants.ChromeDriverKey, System.getProperty("user.dir") + "//chromedriver.exe");
		System.setProperty(Constants.FireFoxDriverKey,
				System.getProperty("user.dir") + "/" + Constants.FireFoxDriverPath);
		System.setProperty(Constants.IEDriverKey, System.getProperty("user.dir") + "/" + Constants.IEDriverPath);
		System.setProperty(Constants.MsedgeDriverkey, System.getProperty("user.dir") + "//msedgedriver.exe");

		if (Browser.equalsIgnoreCase("CHROME")) {
			killChrome();
			// Chrome Application Options
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> preferences = new Hashtable<String, Object>();
			//DesiredCapabilities cap = DesiredCapabilities.chrome();

			// Disable flash and the PDF viewer
			preferences.put("plugins.plugins_disabled", new String[] { "Adobe Flash Player", "Chrome PDF Viewer" });
			options.setExperimentalOption("prefs", preferences);
			options.addArguments("disable-infobars");
			//cap.setCapability("requireWindowFocus", true);
			//cap.setCapability(ChromeOptions.CAPABILITY, options);
			// cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
			 //NavigateToBaseURL();

			// Chrome Application Path (Only needed if not default chrome
			// location)
			// options.setBinary("C:\\Program Files
			// (x86)\\Google\\Chrome\\Application\\chrome.exe");
			// //*[@id="subNavBar_productsandservices"]/div[1]/a
			
			ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.add_experimental_option("prefs", {"profile.managed_default_content_settings.images": 2}) 
			//cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeOptions.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-extensions");
			chromeOptions.addArguments("--disable-application-cache");
			chromeOptions.addArguments("--disable-setuid-sandbox");
			chromeOptions.addArguments("--remote-debugging-port=9222");
			chromeOptions.addArguments("--disable-dev-shm-using"); 
			chromeOptions.addArguments("--disable-extensions") ;
			chromeOptions.addArguments("--disable-gpu") ;
			chromeOptions.addArguments("start-maximized") ;
			chromeOptions.addArguments("disable-infobars");
			
			
			driver = new ChromeDriver(chromeOptions);
			context.setAttribute("driver", driver);
			System.out.println("Automated test run. We�re running on Chrome ");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (Browser.equalsIgnoreCase("MSEDGE")) {
			killEdge ( );
			// Chrome Application Options
			EdgeOptions options = new EdgeOptions();
			Map<String, Object> preferences = new Hashtable<String, Object>();
			//DesiredCapabilities cap = DesiredCapabilities.edge();
			// Disable flash and the PDF viewer
			//options.;
			//preferences.put("plugins.plugins_disabled", new String[] { "Adobe Flash Player", "Chrome PDF Viewer" });
//			cap.setCapability("prefs", preferences);
//			cap.setCapability("requireWindowFocus", true);
			//cap.setCapability(ChromeOptions.CAPABILITY, options);
			
			EdgeOptions EdgeOptions = new EdgeOptions();
			//chromeOptions.add_experimental_option("prefs", {"profile.managed_default_content_settings.images": 2}) 
//    		EdgeOptions.addArguments("--no-sandbox");
//			EdgeOptions.addArguments("--disable-setuid-sandbox");
//			EdgeOptions.addArguments("--remote-debugging-port=9222");
//			EdgeOptions.addArguments("--disable-dev-shm-using"); 
//			EdgeOptions.addArguments("--disable-extensions") ;
//			EdgeOptions.addArguments("--disable-gpu") ;
//			EdgeOptions.addArguments("start-maximized") ;
//			EdgeOptions.addArguments("disable-infobars");

			// Chrome Application Path (Only needed if not default chrome
			// location)
			// options.setBinary("C:\\Program Files
			// (x86)\\Google\\Chrome\\Application\\chrome.exe"); //*[@id="subNavBar_productsandservices"]/div[1]/a
			driver = new EdgeDriver(EdgeOptions);
			context.setAttribute("driver", driver);
			System.out.println("Automated test run. We�re running on Edge ");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
 else if (Browser.equalsIgnoreCase("CHROME SAUCE")) {
//	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
//			ChromeOptions ChromeCaps = new ChromeOptions();
//			cap.setCapability("browserName", "chrome");
//			cap.setCapability("platform", "Windows 10");
//			cap.setCapability("version", "latest");
//			cap.setCapability("name", "CNA Inside APP");
//			cap.setCapability("build", "CNA Inside");

			System.out.print(
					"Automated test Run. Launching with Windows 10 with latest version chrome \nRequesting Emulator from SauceLabs... ");
			System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
//			driver = new RemoteWebDriver(new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL),
//					cap);
			context.setAttribute("driver", driver);
			Thread.sleep(30000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Emulator Ready");
			driver.manage().window().maximize();
			driver.navigate().to(environmentProperties.getProperty("URL").toString());

		} else if (Browser.equalsIgnoreCase("SAFARI SAUCE")) {
			System.setProperty("https.proxyHost", localHost);
			//System.setProperty("https.proxyPort", sauceProxyPortNum);
			// System.setProperty("https.proxyHost", "127.0.0.1");
			/// System.setProperty("https.proxyPort", "3128");
			MutableCapabilities sauceOptions = new MutableCapabilities();

			EdgeOptions browserOptions = new EdgeOptions();
			sauceOptions.setCapability("platformName", "macOS 10.15");
			sauceOptions.setCapability("browserVersion", "beta");
			sauceOptions.setCapability("name", "CNA Inside APP");
			sauceOptions.setCapability("build", "CNA Inside");
			sauceOptions.setCapability("sauce:options", sauceOptions);

			System.out.print(
					"Automated test Run. Launching with Windows 10 with latest version chrome \nRequesting Emulator from SauceLabs... ");
			System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
			driver = new RemoteWebDriver(new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL),
					sauceOptions);
			context.setAttribute("driver", driver);
			Thread.sleep(30000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Emulator Ready");
			driver.manage().window().maximize();
			driver.navigate().to(environmentProperties.getProperty("URL").toString());

		} else if (Browser.equalsIgnoreCase("EDGE SAUCE")) {
			System.setProperty("https.proxyHost", localHost);
			//System.setProperty("https.proxyPort", sauceProxyPortNum);
			// System.setProperty("https.proxyHost", "127.0.0.1");
			/// System.setProperty("https.proxyPort", "3128");
			MutableCapabilities sauceOptions = new MutableCapabilities();

			EdgeOptions browserOptions = new EdgeOptions();
			sauceOptions.setCapability("platformName", "Windows 10");
			sauceOptions.setCapability("browserVersion", "latest");
			sauceOptions.setCapability("name", "CNA Inside APP");
			sauceOptions.setCapability("build", "CNA Inside");
			sauceOptions.setCapability("sauce:options", sauceOptions);

			System.out.print(
					"Automated test Run. Launching with Windows 10 with latest version chrome \nRequesting Emulator from SauceLabs... ");
			System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
			driver = new RemoteWebDriver(new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL),
					sauceOptions);
			context.setAttribute("driver", driver);
			Thread.sleep(30000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Emulator Ready");
			driver.manage().window().maximize();
			driver.navigate().to(environmentProperties.getProperty("URL").toString());

		} else if (Browser.equalsIgnoreCase("FIREFOX SAUCE")) {
			System.setProperty("https.proxyHost", localHost);
			//System.setProperty("https.proxyPort", sauceProxyPortNum);
			// System.setProperty("https.proxyHost", "127.0.0.1");
			/// System.setProperty("https.proxyPort", "3128");
			MutableCapabilities sauceOptions = new MutableCapabilities();

			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setCapability("platformName", "Windows 10");
			browserOptions.setCapability("browserVersion", "66.0");
			browserOptions.setCapability("name", "CNA Inside APP");
			browserOptions.setCapability("build", "CNA Inside");
			browserOptions.setCapability("sauce:options", sauceOptions);

			System.out.print(
					"Automated test Run. Launching with Windows 10 with latest version chrome \nRequesting Emulator from SauceLabs... ");
			System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
			driver = new RemoteWebDriver(new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL),
					browserOptions);
			context.setAttribute("driver", driver);
			Thread.sleep(30000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Emulator Ready");
			driver.manage().window().maximize();
			driver.navigate().to(environmentProperties.getProperty("URL").toString());

		}

		else if (Browser.equalsIgnoreCase("IPHONE")) {
			

			 /*caps.setCapability("testobject_api_key", SauceLabsAPIKey);
			    caps.setCapability("testobject_app_id", SauceLabsID);
			    caps.setCapability("appiumVersion", "1.20.1");
			    caps.setCapability("deviceName","iPhone XS Simulator");
			    caps.setCapability("deviceOrientation", "portrait");
			    caps.setCapability("platformVersion","14.3");
			    caps.setCapability("platformName", "iOS");
			    caps.setCapability("browserName", "Safari");
			    System.out.print("Automated test Run. Launching with Iphone \nRequesting Emulator from SauceLabs... ");
				System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
				RemoteWebDriver driver = new RemoteWebDriver(
					    new URL("https://cae7901:9e6c277b-5b36-491b-8c56-4456199f3b26@ondemand.us-west-1.saucelabs.com:443/wd/hub"), caps
					);
				RemoteWebDriver driver = new RemoteWebDriver(
						new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL), caps);
				Thread.sleep(30000);
				context.setAttribute("driver", driver);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.print("Finishing up prep...");
				NavigateToBaseURL();*/

		} else if (Browser.equalsIgnoreCase("ANDROID")) {
			/*System.setProperty("https.proxyHost", localHost);
			System.setProperty("https.proxyPort", sauceProxyPortNum);*/
			DesiredCapabilities andoirdrlcap = new DesiredCapabilities();
			andoirdrlcap.setCapability("platformVersion", "6.0");
			andoirdrlcap.setCapability("idleTimeout", 90000);
			andoirdrlcap.setCapability("deviceName", "Android Emulator");
			andoirdrlcap.setCapability("platformName", "Android");
			andoirdrlcap.setCapability("browserName", "chrome");
			andoirdrlcap.setCapability("deviceOrientation", "portrait");
			// set your test case name so that it shows up in Sauce Labs
			andoirdrlcap.setCapability("name", "CNA .com Android");
			System.out.print(
					"Automated test Run. Launching with Android with  safar \nRequesting Emulator from SauceLabs... ");
			System.out.println(" Sauce url +++++ :" + "https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL);
			driver = new RemoteWebDriver(new URL("https://" + SauceLabsID + ":" + SauceLabsAPIKey + SauceURL),
					andoirdrlcap);
			Thread.sleep(30000);
			context.setAttribute("driver", driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Emulator Ready");
			driver.navigate().to(environmentProperties.getProperty("URL").toString());
		}

		else if (Browser.equalsIgnoreCase("FIREFOX")) {
			/*
			 * FirefoxOptions ffOptions = new FirefoxOptions(); FirefoxProfile profile = new
			 * FirefoxProfile(); ffOptions.setCapability(FirefoxDriver.PROFILE, profile);
			 * ffOptions.setCapability("marionette", true);
			 * ffOptions.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
			 * //.setPageLoadStrategy(PageLoadStrategy.EAGER);
			 * ffOptions.addPreference("browser.download.folderList", 2);
			 * ffOptions.addPreference("browser.download.dir",
			 * System.getProperty("user.dir") + "\\PDFFiles");
			 * ffOptions.addPreference("browser.download.useDownloadDir", true);
			 * ffOptions.addPreference("browser.helperApps.neverAsk.saveToDisk",
			 * "application/pdf"); ffOptions.addPreference("pdfjs.disabled", true);
			 * ffOptions.addPreference("dom.disable_beforeunload", true);
			 * ffOptions.setCapability(CapabilityType.HAS_NATIVE_EVENTS, false);
			 * ffOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			 * org.openqa.selenium.UnexpectedAlertBehaviour.IGNORE);
			 */

			driver = new FirefoxDriver();
			context.setAttribute("driver", driver);

		}

		else if (Browser.equalsIgnoreCase("IE")) {

			killIE();
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, NavigateToBaseURL1());
			cap.setCapability("ignoreProtectedModeSettings", true);
			cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			cap.setCapability("IE.binary", "C:/Program Files/Internet Explorer/iexplore.exe");
			System.setProperty("webdriver.ie.driver", executionPath + "\\lib\\IEDriverServer_x32.exe");
			System.out.println("Automated test run. We're running on Internet Explorer");
			// sleniumGridIE(cap);
			driver = new InternetExplorerDriver();
			context.setAttribute("driver", driver);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else {
			System.out.println("BrowserUtility: Browser not initiated");
			driver = null;
		}
	}

	
	 
	private void MSEDGE() {
		// TODO Auto-generated method stub
		
	}

	public String NavigateToBaseURL1() {
		String url = environmentProperties.getProperty("URL").toString();
		return url;
	}

//	public String findregion() {
//		String url= environmentProperties.getProperty("URL").toString();
//		
//		if (url.contains("ete"))
//		{
//			return "ete1";
//		}else if(url.contains("drt"))
//		{
//			return "drt1";
//		} else 
//			return null;
//	}
	public void NavigateToAgentCenter() {
		driver.navigate().to(environmentProperties.getProperty("agentCenter").toString());
//		ExtentTestManager.getTest().log(Status.PASS,
//				"Navigating to URL: " + environmentProperties.getProperty("URL").toString());
	}

	public void NavigateToSupplierDiversityURL() {
		driver.navigate().to(environmentProperties.getProperty("supplierDiversity").toString());
//		ExtentTestManager.getTest().log(Status.PASS,
//				"Navigating to URL: " + environmentProperties.getProperty("supplierDiversity").toString());
	}

	@AfterMethod
	protected void Cleanup() throws Exception {
		if (driver != null) {
			driver.manage().deleteAllCookies();
		} else {
			throw new Exception("Driver is null");
		}
	}

	@AfterSuite
	protected void CleanupSuite() throws WebDriverException, IOException, InterruptedException {
		if (driver != null) {
			driver.quit();
			ClearBrowsers();
			Thread.sleep(5000);
		}
	}

	public String TakeScreenShot(String sreenshotName) throws IOException {
		String targetLocation = null;
		String timeStamp = new SimpleDateFormat("MMddyyyy_HHmmss").format(new Date());
		String screenShotName = sreenshotName + timeStamp + ".png";
		String fileSeperator = System.getProperty("file.separator");
		String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
				+ "screenshots";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		targetLocation = reportsPath + fileSeperator + screenShotName;
		File targetFile = new File(targetLocation);
		FileHandler.copy(screenshotFile, targetFile);
		return "screenshots" + fileSeperator + screenShotName;
	}

	private void killChrome() {
		try {
			if (isProcessRunning("chrome.exe")) {

				killProcess("chrome.exe");
				killProcess("chromedriver_x32.exe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void killEdge() {
		try {
			if (isProcessRunning("chrome.exe")) {

				killProcess("chrome.exe");
				killProcess("chromedriver_x32.exe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean isProcessRunning(String serviceName) throws IOException { // checks that theservice with the
																					// string
																					// parameter
		String TASKLIST = "TASKLIST";
		Process p = Runtime.getRuntime().exec(TASKLIST);
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {

			if (line.contains(serviceName)) {
				return true;
			}
		}

		return false;

	}

	public static void killProcess(String serviceName) throws IOException {
		String KILL = "taskkill /F /IM ";
		Runtime.getRuntime().exec(KILL + serviceName);
	}

	private void killIE() {
		try {
			if (isProcessRunning("IEDriverServer_x32.exe")) {

				killProcess("IEDriverServer_x32.exe");
				killProcess("iexplore.exe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
