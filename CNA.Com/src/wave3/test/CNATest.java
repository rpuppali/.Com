package wave3.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Properties;

//import org.codehaus.jackson.map.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.MediaEntityBuilder;

import wave3.pages.AboutCNA;
import wave3.pages.AgentCenter;
import wave3.pages.AgentLogin;
import wave3.pages.BasePage;
import wave3.pages.ClaimPage;
import wave3.pages.ContactUs;
import wave3.pages.DisclaimerFunctionality;
import wave3.pages.Industries;
import wave3.pages.LoginPage;
import wave3.pages.ProductsAndSolutions;
import wave3.pages.RiskControl;
import wave3.pages.SearchPage;
import wave3.pages.SupplierDiversityForm;
//import wave3.reports.ExtentTestManager;

public class CNATest extends BaseTest {
//
     public Properties urlProperties;
	String Browser = environmentProperties.getProperty("Browser").toString();

	public CNATest() throws InterruptedException, IOException, URISyntaxException {
		super();
	}
	
//
//	@Test(enabled = false)
//	public void TestCaseID_1() throws InterruptedException, Exception {
//		/*
//		 * 
//		 */
////		ExtentTestManager.getTest().log(Status.INFO,
////				"<h5><font color='blue'>TestCaseName: Launching application</font>");
//		String methodName = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		BasePage basepage = new BasePage(driver, timeout);
//
//		// Navigate to URL
//		NavigateToBaseURL();
//		// loginpage.IgnorePopup().click();
//
//		driver.findElement(By.cssSelector("#emergencyAlertWrapper > div > div.emergency-alert-content")).isDisplayed();
//
//		driver.findElement(
//				By.cssSelector("#emergencyAlertWrapper > div > div.emergency-alert-content > p:nth-child(3) > a"))
//				.isDisplayed();
//		driver.findElement(By.cssSelector("#emergency-banner-expand")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#btn_BillPay")).click();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//		// driver.findElement(By.cssSelector("#emergency-banner-expand")).click();
//		Thread.sleep(3000);
//		// driver.findElement(By.cssSelector("#emergencyAlertWrapper > div >
//		// div.emergency-alert-content > p:nth-child(3) > a")).click();
//		Thread.sleep(3000);
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//
//		driver.navigate().refresh();
//		System.out.println(driver.getTitle());
//
////		String exceptedMessage = excelData.GetTestData("Login", "LoginPage", "Expected Message", methodName);
////		String actualMessage = loginpage.reportCliam().getText();
////		ExtentTestManager.getTest().log(Status.PASS,
////				"Expected message- " + exceptedMessage + "<br/> Actual message-" + actualMessage);
////		Assert.assertEquals(actualMessage, exceptedMessage, actualMessage + " NOT DISPLAYED");
////		Thread.sleep(2000);
////		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
////				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	
//	@Test(enabled = false)
//	public void reportAClaim() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPgae = new ClaimPage(driver, timeout);

//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPgae.claimCenterlink.click();
//		Thread.sleep(3000);
//
//		Select dropdown = new Select(claimPgae.dropDownValue);
//		loginpage.navigateToElement(claimPgae.dropDownValue);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = claimPgae.dropDownValue;
//		js.executeScript("arguments[0].setAttribute('style', 'text-transform: none;')", element);
//
//		//ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		System.out.println("*****************************");
//		System.out.println(url);
//		
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		System.out.println("multimap " + myMultimap.get("claims"));
//
//		// Getting values
//		 List<String> claimvalues = myMultimap.get("claims");
//		 System.out.println("Key "+claimvalues);
//		List<WebElement> targetListElements = dropdown.getOptions();
//		List<String> targetList = new ArrayList<String>();
//		List<String> compareValues = new ArrayList<String>();
//		for (WebElement webElement : targetListElements) {
//			dropdown.selectByVisibleText(webElement.getText());
//			targetList.add(webElement.getText());
//			//ExtentTestManager.getTest().info(webElement.getText());
//		}
//
//		System.out.println("compareValues " + claimvalues);
//		System.out.println("targetListElements " + targetList);
//
//		 Assert.assertEquals(claimvalues, targetList);
////		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
////				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//}
//	
//	@Test(enabled = false)
//	public void reportAClaim_Auto() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Auto");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		loginpage.navigateToElement(claimPage.repprtNewOnline());
//		claimPage.reportOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//
//		Thread.sleep(3000);
//		claimPage.companyName.clear();
//		claimPage.companyName.sendKeys("TestAutomation");
//		loginpage.navigateToElement(claimPage.clickNext);
//		claimPage.clickNext.click();
//		Thread.sleep(3000);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2019");
//		Thread.sleep(2000);
//		claimPage.claimAddress.clear();
//		claimPage.claimAddress.sendKeys("UX Bridge Shillong");
//		loginpage.navigateToElement(claimPage.claimIncidentDescription);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys("Vehicle damage");
//		loginpage.navigateToElement(claimPage.claimGLNext);
//		claimPage.claimGLNext.click();
//		Thread.sleep(3000);
//		claimPage.claimDriverFname.clear();
//		claimPage.claimDriverFname.sendKeys("TestInsuredFname");
//		claimPage.claimDriverLname.clear();
//		claimPage.claimDriverLname.sendKeys("TestInsuredLname");
//		claimPage.claimDriverPhone.clear();
//		claimPage.claimDriverPhone.sendKeys("9898767890");
//		claimPage.claimDriverAddress.clear();
//		claimPage.claimDriverAddress.sendKeys("Lake Street Vinis");
//		loginpage.navigateToElement(driver.findElement(By.cssSelector("#claimformns_AUvehicleDamage")));
//		claimPage.claimDriverYear.clear();
//		claimPage.claimDriverYear.sendKeys("2019");
//		// driver.manage().deleteAllCookies();
//		Thread.sleep(5000);
//		loginpage.navigateToElement(claimPage.clickOnNext3());
//		claimPage.clickOnNext3().click();
//		Thread.sleep(2000);
//		loginpage.navigateToElement(claimPage.claimFormAdditionalDesc);
//		claimPage.claimFormAdditionalDesc.clear();
//		claimPage.claimFormAdditionalDesc.sendKeys("Renovation work");
//		loginpage.navigateToElement(claimPage.claimSubmit);
//		Thread.sleep(1000);
//		claimPage.claimSubmit.click();
//		Thread.sleep(2000);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	// #claimformns_informationMainContactPR
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		slowDown(4);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		claimPage.claimCenterlink.click();
//		js.executeScript("window.scrollBy(0,30)");
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		js.executeScript("window.scrollBy(0,50)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("INSURED");
//		claimPage.reeipientSurveyCheckbox_Yes().click();
//		claimPage.companyName.clear();
//		
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.claimGLNext.click();
//		slowDown(3);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		js.executeScript("window.scrollBy(0,40)");
//		claimPage.findAnAgent().click();
//		slowDown(3);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss");
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_HealthCare() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		String pageUrl = driver.getCurrentUrl();
//	//	String temp2 = null;
//	    String reg = findregion();
//	    if(reg != null)
//	    {
//	    	pageUrl = pageUrl.substring(13,pageUrl.length());
//	    } else if (reg == null) {
//	    	pageUrl = pageUrl.substring(8 ,pageUrl.length());
//	    	
//	    }
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		slowDown(4);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		claimPage.claimCenterlink.click();
//		
//		js.executeScript("window.scrollBy(0,30)");
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Healthcare");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		js.executeScript("window.scrollBy(0,50)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorPhone().getText());
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("fafffff");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		System.out.println(claimPage.vaildEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("INSURED");
//		claimPage.reeipientSurveyCheckbox_Yes().click();
//		claimPage.companyName.clear();
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.healthCareClaimFirstName.clear();
//		claimPage.healthCareClaimFirstName.sendKeys("Tom");
//		claimPage.healthCareClaimLastName.clear();
//		claimPage.healthCareClaimLastName.sendKeys("Johny");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,2000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("07/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		slowDown(1);
//		claimPage.clickNextHEalthCare().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss");
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled =false)
//	public void reportAClaim_HealthCare_Scenario1() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Healthcare");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("PRODUCER");
//		claimPage.reeipientSurveyCheckbox_No().click();
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.healthCareClaimFirstName.clear();
//		claimPage.healthCareClaimFirstName.sendKeys("Tom");
//		claimPage.healthCareClaimLastName.clear();
//		claimPage.healthCareClaimLastName.sendKeys("Johny");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("07/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.clickNextHEalthCare().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 1"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability_Scenario1() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("PRODUCER");
//		claimPage.reeipientSurveyCheckbox_No().click();
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 1"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_HealthCare_Scenario2() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Healthcare");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("testautomation@cna.com");
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("OWNER");
//		claimPage.insuredMainContact_No().click();
//		js.executeScript("window.scrollBy(0,200)");
//		claimPage.mainClaimantFirstName.clear();
//		claimPage.mainClaimantFirstName.sendKeys("MainContact");
//		claimPage.mainClaimantLastName.clear();
//		claimPage.mainClaimantLastName.sendKeys("Last Contact");
//		claimPage.mainClaimantPhone.clear();
//		claimPage.mainClaimantPhone.sendKeys("6767676767");
//		claimPage.mainClaimantEmail.clear();
//		claimPage.mainClaimantEmail.sendKeys("testauto@cna.com");
//		Select dropdown2 = new Select(claimPage.mainCLaimantRelation);
//		dropdown2.selectByValue("ATTORNEY");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.compan yName.sendKeys("");
//		 * claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown3 = new Select(claimPage.insuredState);
//		dropdown3.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.healthCareClaimFirstName.clear();
//		claimPage.healthCareClaimFirstName.sendKeys("Tom");
//		claimPage.healthCareClaimLastName.clear();
//		claimPage.healthCareClaimLastName.sendKeys("Johny");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.clickNextHEalthCare().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 2"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability_Scenario2() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("testautomation@cna.com");
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("OWNER");
//		claimPage.insuredMainContact_No().click();
//		js.executeScript("window.scrollBy(0,200)");
//		claimPage.mainClaimantFirstName.clear();
//		claimPage.mainClaimantFirstName.sendKeys("MainContact");
//		claimPage.mainClaimantLastName.clear();
//		claimPage.mainClaimantLastName.sendKeys("Last Contact");
//		claimPage.mainClaimantPhone.clear();
//		claimPage.mainClaimantPhone.sendKeys("6767676767");
//		claimPage.mainClaimantEmail.clear();
//		claimPage.mainClaimantEmail.sendKeys("testauto@cna.com");
//		Select dropdown2 = new Select(claimPage.mainCLaimantRelation);
//		dropdown2.selectByValue("ATTORNEY");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.compan yName.sendKeys("");
//		 * claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown3 = new Select(claimPage.insuredState);
//		dropdown3.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 2"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_HealthCare_Scenario3() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Healthcare");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		claimPage.claimant().click();
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("CLAIMANT");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		/*claimPage.healthCareClaimFirstName.clear();
//		claimPage.healthCareClaimFirstName.sendKeys("Tom");
//		claimPage.healthCareClaimLastName.clear();
//		claimPage.healthCareClaimLastName.sendKeys("Johny");*/
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("07/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.clickNextHEalthCare().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 3"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability_Scenario3() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		claimPage.claimant().click();
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("CLAIMANT");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 3"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_HealthCare_Scenario4() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Healthcare");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		slowDown(3);
//		claimPage.agent().click();
//		/*
//		 * Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		 * dropdown1.selectByValue("CLAIMANT");
//		 */
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare  scenario 4");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.healthCareClaimFirstName.clear();
//		claimPage.healthCareClaimFirstName.sendKeys("Tom");
//		claimPage.healthCareClaimLastName.clear();
//		claimPage.healthCareClaimLastName.sendKeys("Johny");
//		claimPage.claimGLNext.click();
//		slowDown(3);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		claimPage.lawSuit_Yes().click();
//		js.executeScript("window.scrollBy(0,20)");
//		claimPage.officialReport_Yes().click();
//		Select report = new Select(claimPage.reportType);
//		report.selectByValue("FIRE REPORT");
//		claimPage.reportnumber.clear();
//		claimPage.reportnumber.sendKeys("53555");
//		claimPage.lossLocationInsured_Yes().click();
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("07/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare  scenario4");
//		claimPage.clickNextHEalthCare().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 4"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//		slowDown(3);
//	}
//	
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability_Scenario4() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		slowDown(3);
//		claimPage.agent().click();
//		/*
//		 * Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		 * dropdown1.selectByValue("CLAIMANT");
//		 */
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare  scenario 4");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		claimPage.lawSuit_Yes().click();
//		js.executeScript("window.scrollBy(0,20)");
//		claimPage.officialReport_Yes().click();
//		Select report = new Select(claimPage.reportType);
//		report.selectByValue("FIRE REPORT");
//		claimPage.reportnumber.clear();
//		claimPage.reportnumber.sendKeys("53555");
//		claimPage.lossLocationInsured_Yes().click();
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare  scenario4");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 4"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//		slowDown(3);
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_ManagementLiability_Scenario5() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		claimPage.thirdParty().click();
//		/*
//		 * Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		 * dropdown1.selectByValue("CLAIMANT");
//		 */
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare  scenario 4");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare  scenario4");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 4"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//
//	@Test(enabled =false)
//	public void reportAClaim_ManagementLiability_Scenario6() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		slowDown(3);
//		claimPage.claimant().click();
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("OTHER");
//		claimPage.companyName.clear();
//
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 3"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//		slowDown(1);
//	}
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		slowDown(4);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		claimPage.claimCenterlink.click();
//		js.executeScript("window.scrollBy(0,30)");
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Professional Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		js.executeScript("window.scrollBy(0,50)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("INSURED");
//		claimPage.reeipientSurveyCheckbox_Yes().click();
//		claimPage.companyName.clear();
//		
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		js.executeScript("window.scrollBy(0,40)");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss");
//		 */
//		claimPage.claimSubmit.click();
//	}
//	
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario1() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Professional Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("PRODUCER");
//		claimPage.reeipientSurveyCheckbox_No().click();
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 1"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario2() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("testautomation@cna.com");
//		Thread.sleep(3000);
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("OWNER");
//		claimPage.insuredMainContact_No().click();
//		js.executeScript("window.scrollBy(0,200)");
//		claimPage.mainClaimantFirstName.clear();
//		claimPage.mainClaimantFirstName.sendKeys("MainContact");
//		claimPage.mainClaimantLastName.clear();
//		claimPage.mainClaimantLastName.sendKeys("Last Contact");
//		claimPage.mainClaimantPhone.clear();
//		claimPage.mainClaimantPhone.sendKeys("6767676767");
//		claimPage.mainClaimantEmail.clear();
//		claimPage.mainClaimantEmail.sendKeys("testauto@cna.com");
//		Select dropdown2 = new Select(claimPage.mainCLaimantRelation);
//		dropdown2.selectByValue("ATTORNEY");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.compan yName.sendKeys("");
//		 * claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown3 = new Select(claimPage.insuredState);
//		dropdown3.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(3);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 2"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario3() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		System.out.println(claimPage.errorEmail().getText());
//		ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		ExtentTestManager.getTest().info(claimPage.vaildEmail().getText());
//		Thread.sleep(3000);
//		claimPage.claimant().click();
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("CLAIMANT");
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 3"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario4() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		slowDown(3);
//		claimPage.agent().click();
//		/*
//		 * Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		 * dropdown1.selectByValue("CLAIMANT");
//		 */
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare  scenario 4");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		claimPage.lawSuit_Yes().click();
//		js.executeScript("window.scrollBy(0,20)");
//		claimPage.officialReport_Yes().click();
//		Select report = new Select(claimPage.reportType);
//		report.selectByValue("FIRE REPORT");
//		claimPage.reportnumber.clear();
//		claimPage.reportnumber.sendKeys("53555");
//		claimPage.lossLocationInsured_Yes().click();
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare  scenario4");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 4"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//		slowDown(3);
//	}
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario5() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorFieldFirstName().getText());
//		System.out.println(claimPage.firstNamePR.getAttribute("maxlength").length());
//		ExtentTestManager.getTest().info(claimPage.firstNamePR.getAttribute("maxlength"));
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrf");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("rfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr!@#$%^&*(");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorLastName().getText());
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9877675");
//		claimPage.firstNamePR.sendKeys(Keys.TAB);
//		ExtentTestManager.getTest().info(claimPage.errorPhone().getText());
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("ghfhgfh");
//		claimPage.emailAddress.sendKeys(Keys.TAB);
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//	//	System.out.println(claimPage.errorEmail().getText());
//	//	ExtentTestManager.getTest().info(claimPage.errorEmail().getText());
//		Thread.sleep(3000);
//		claimPage.thirdParty().click();
//		/*
//		 * Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		 * dropdown1.selectByValue("CLAIMANT");
//		 */
//		claimPage.companyName.clear();
//		/*
//		 * claimPage.companyName.sendKeys(""); claimPage.companyName.sendKeys(Keys.TAB);
//		 * ExtentTestManager.getTest().info(claimPage.errorCompanyName().getText());
//		 */
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare  scenario 4");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("07/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare  scenario4");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 4"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//	}
//	@Test(enabled = false)
//	public void reportAClaim_ProfessionalLiability_Scenario6() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		/*
//		 * if (verifyHomePageAccessable()) {
//		 * ExtentTestManager.getTest().info("Clicked on popup"); } else {
//		 * ExtentTestManager.getTest().info("Unable to click on popup"); }
//		 */
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Management Liability");
//		//// tbody/tr[1]/td[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)");
//		loginpage.navigateToElement(claimPage.manageOnline());
//		claimPage.manageOnline().click();
//		Thread.sleep(3000);
//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("AutoTestFirstName");
//
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("TestLastName");
//		claimPage.phoneNumberPR.clear();
//
//		claimPage.phoneNumberPR.sendKeys("9876543210");
//		claimPage.companyPR.clear();
//		claimPage.companyPR.sendKeys("SLK");
//		claimPage.emailAddress.clear();
//		claimPage.emailAddress.sendKeys("amrutha.lakshmi@cna.com");
//		slowDown(3);
//		claimPage.claimant().click();
//		Select dropdown1 = new Select(claimPage.relationToInsuredCompanydropDown);
//		dropdown1.selectByValue("OTHER");
//		claimPage.companyName.clear();
//
//		js.executeScript("window.scrollBy(0,100)");
//		claimPage.companyName.sendKeys("TestAutomation  Healthcare ");
//		claimPage.insuredCompanyAddresse.clear();
//		claimPage.insuredCompanyAddresse.sendKeys("Chicago");
//		claimPage.insuredCity.clear();
//		claimPage.insuredCity.sendKeys("Sentinele");
//		Select dropdown2 = new Select(claimPage.insuredState);
//		dropdown2.selectByVisibleText("Alabama");
//		claimPage.claimGLNext.click();
//		slowDown(1);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/12/2020");
//		js.executeScript("window.scrollBy(0,1000)");
//		claimPage.claimInsuredDate.clear();
//		claimPage.claimInsuredDate.sendKeys("06/12/2020");
//		claimPage.claimInsuredDate.sendKeys(Keys.TAB);
//		slowDown(4);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys(Keys.TAB);
//		claimPage.claimIncidentDescription.sendKeys(" Healthcare ");
//		claimPage.findAnAgent().click();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,150)");
//		/*
//		 * claimPage.claimFormAdditionalDesc.clear();
//		 * claimPage.claimFormAdditionalDesc.sendKeys(" Healthcare  Loss for scenario 3"
//		 * );
//		 */
//		claimPage.claimSubmit.click();
//		slowDown(1);
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_Cargo() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Cargo");
//		loginpage.navigateToElement(claimPage.repprtNewOnline());
//		claimPage.reportOnline().click();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_CrisisManagement() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Crisis Management Event");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,750)");
//		Thread.sleep(2000);
//		String billing =claimPage.WrapperText().getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("CrisisManagement");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	
//
//	@Test(enabled = false)
//	public void reportAClaim_Property() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//
//		// driver.navigate().refresh();//body/div[2]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/form[1]/section[2]/div[14]/div[1]/input[2]
//		// Thread.sleep(3000);
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(3000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Property");
//		loginpage.navigateToElement(claimPage.repprtNewOnline());
//		claimPage.reportOnline().click();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		//
//		slowDown(3);
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("NameProoperty");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("LNameProperty");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9976543210");
//		/*
//		 * loginpage.navigateToElement(driver.findElement(By.cssSelector(
//		 * "#claimAutoNext")));
//		 * driver.findElement(By.cssSelector("#claimAutoNext")).click();
//		 */
//		Thread.sleep(3000);
//		claimPage.companyName.clear();
//		claimPage.companyName.sendKeys("TestAutomation For Property");
//		loginpage.navigateToElement(claimPage.claimPropertyNext);
//		claimPage.claimPropertyNext.click();// #claimformns_incidentDesc
//		Thread.sleep(3000);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("07/08/2019");
//		Thread.sleep(3000);
//		loginpage.navigateToElement(claimPage.claimCity);
//		claimPage.claimCity.sendKeys("Shillong");
//		Select dropdownState = new Select(claimPage.claimState);
//		dropdownState.selectByVisibleText("Alabama");
//		loginpage.navigateToElement(claimPage.claimIncidentDescription);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys("Property damage");
//		Thread.sleep(3000);
//		claimPage.NextbuttonN().click();
//		Thread.sleep(3000);
//		claimPage.claimFormAdditionalDesc.clear();
//		claimPage.claimFormAdditionalDesc.sendKeys("Renovation work Property");
//		loginpage.navigateToElement(claimPage.claimSubmit);
//		Thread.sleep(3000);
//		claimPage.claimSubmit.click();// #claimFormWCNext
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled =false )
//	public void reportAClaim_WorkersCompensation() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(2000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Workers' Compensation");
//		loginpage.navigateToElement(claimPage.repprtNewOnline());
//		claimPage.reportOnline().click();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("NameWorkersCompensation");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("LNameWorkersCompensation");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9976543210");
//		/*
//		 * loginpage.navigateToElement(driver.findElement(By.cssSelector(
//		 * "#claimAutoNext")));
//		 * driver.findElement(By.cssSelector("#claimAutoNext")).click();
//		 */
//		Thread.sleep(3000);
//		claimPage.companyName.clear();
//		claimPage.companyName.sendKeys("TestAutomation For Worker's Compensation");
//		Select dropdownState = new Select(claimPage.claimFormState);
//		dropdownState.selectByVisibleText("Alabama");
//		loginpage.navigateToElement(claimPage.claimFormWCNext);
//		claimPage.claimFormWCNext.click();// #claimformns_incidentDesc
//		Thread.sleep(3000);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("06/07/2019");
//		Thread.sleep(1000);
//		loginpage.navigateToElement(claimPage.claimAddress);
//		claimPage.claimAddress.sendKeys("Lake Street Dew");
//
//		loginpage.navigateToElement(claimPage.claimIncidentDescription);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys("Workers Comopensation damage");
//		loginpage.navigateToElement(claimPage.claimFormWCNet());
//		claimPage.claimFormWCNet().click();
//		Thread.sleep(3000);// #claimformns_firstNameID #claimformns_lastNameID #claimformns_nodependentsL
//		claimPage.firstNameID.clear();
//		claimPage.firstNameID.sendKeys("Tommy Dan");
//		claimPage.lastNameID.clear();
//		claimPage.lastNameID.sendKeys("D'souza");
//		loginpage.navigateToElement(claimPage.claimDependents);
//		claimPage.claimDependents.sendKeys("2");
//		claimPage.claimOccupation.clear();
//		claimPage.claimOccupation.sendKeys("Carpenter");
//		loginpage.navigateToElement(claimPage.claimSupervisor);
//		claimPage.claimSupervisor.sendKeys("Aanya");
//		loginpage.navigateToElement(claimPage.claimDays);
//		claimPage.claimDays.clear();
//		claimPage.claimDays.sendKeys("4");
//		// loginpage.navigateToElement(driver.findElement(By.cssSelector("#claimFormWCNext")));
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = claimPage.claimFormWCNext3();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		claimPage.claimFormWCNext3().click();
//	//	claimPage.claimFormWCNext3().click();
//		loginpage.navigateToElement(claimPage.claimFormAdditionalDesc);
//		claimPage.claimFormAdditionalDesc.clear();// #claimformns_occupation
//													// #claimformns_supervisorFName
//		claimPage.claimFormAdditionalDesc.sendKeys("Workers Compenstaion");
//		loginpage.navigateToElement(claimPage.claimSubmit);
//		Thread.sleep(1000);
//		claimPage.claimSubmit.click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void verify_Careers() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(2);
//		aboutCNA.Careers().click();
//		Thread.sleep(2000);
//		boolean social = aboutCNA.socialIcon();
//		System.out.println("social icons " + social);
//		Thread.sleep(3000);
//		//aboutCNA.linkedInButton.click();
//		//Thread.sleep(2000);
//		//changeToLatestTab();
//		System.out.println(driver.getTitle());
//	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = aboutCNA.twitterIdButton;
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(2000);
//		aboutCNA.twitterIdButton.click(); */
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
//		slowDown(2);
//		aboutCNA.twitterIdButton.click();
//		slowDown(2);
//		changeToLatestTab();
//	/*	aboutCNA.twitterIdButton.click();
//		Thread.sleep(2000);
//		changeToLatestTab(); */
//	/*	JavascriptExecutor Js = (JavascriptExecutor) driver;
//		WebElement elementS = aboutCNA.shareEmailButton;
//		Js.executeScript("window.scrollBy(0,10000)", element);
//		aboutCNA.shareEmailButton.click(); */
//		aboutCNA.shareEmailButton.click(); 
//		changeToLatestTab();
//		slowDown(1);
//	//	driver.findElement(By.cssSelector("#respBtnClose")).click();
//		/*
//		 * Thread.sleep(2000); aboutCNA.recipientEmail.clear();
//		 * aboutCNA.recipientEmail.sendKeys("Raghavender.GoudPuppali@cna.com");
//		 * aboutCNA.senderEmail.clear();
//		 * aboutCNA.senderEmail.sendKeys("jacob.sheeba@cna.com");
//		 * aboutCNA.senderFirstName.clear();
//		 * aboutCNA.senderFirstName.sendKeys("Sheeba "); aboutCNA.sendLastName.clear();
//		 * aboutCNA.sendLastName.sendKeys("Jacob"); aboutCNA.message.clear();
//		 * aboutCNA.message.sendKeys("Trainee Rotational program");
//		 * aboutCNA.emailSubmit.click(); slowDown(5); aboutCNA.thankYouClose.click();
//		 * slowDown(3);
//		 */
//	//	JavascriptExecutor Js = (JavascriptExecutor) driver;
//	//	js.executeScript("window.scrollBy(0,200)");
//	/*	aboutCNA.printIdButtonN().click();
//		slowDown(2);*/
//	/*	aboutCNA.printIdButton.click();
//		slowDown(3);// */
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("careers");
//		String pageUrl = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageUrl);
//		System.out.println("pageTitle" + locationUrl);
//		Assert.assertEquals(locationUrl, pageUrl);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//	
//
//	@Test(enabled = true)
//	public void aboutCNA_Dashboard() throws InterruptedException, IOException {
//	    LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			System.out.println("Clicked on popup");
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//			System.out.println("Unable to click on popup");
//		}
//		Thread.sleep(2000);
//		aboutCNA.aboutCNA().click();
//		Thread.sleep(2000);
//		aboutCNA.socialIcon();
//		WebElement aboutLocations = aboutCNA.aboutLocations();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(aboutLocations).perform();
//
//		WebElement aboutManagement = aboutCNA.aboutManagement();
//		Actions actions1 = new Actions(driver);
//		actions.moveToElement(aboutManagement).perform();
//
//		WebElement aboutNewsroom = aboutCNA.aboutNewsroom();
//		Actions actions2 = new Actions(driver);
//		actions.moveToElement(aboutNewsroom).perform();
//
//		WebElement aboutCorporate = aboutCNA.aboutCorporateResponsibility();
//		Actions actions3 = new Actions(driver);
//		actions.moveToElement(aboutCorporate).perform();
//		Thread.sleep(3000);
//
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("aboutCNA");
//		String pageUrl = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageUrl);
//		Assert.assertEquals(locationUrl, pageUrl);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void aboutCNA_Locations() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		BasePage basepage = new BasePage(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		WebElement about = aboutCNA.aboutCNA();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(about).perform();
//		Thread.sleep(3000);
//		aboutCNA.aboutCNALocations().click();
//		Thread.sleep(1000);
//		loginpage.navigateToElement(aboutCNA.unitedStates);
//		aboutCNA.pagination().click();
//		Thread.sleep(3000);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("locationsUrl");
//		Thread.sleep(2000);
//		boolean icon = aboutCNA.socialIcon();
//		String pageUrl = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageUrl);
//		System.out.println("socialIcon :" + icon);
//		Assert.assertTrue(icon);
//		Assert.assertEquals(locationUrl, pageUrl);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//		}
//
//	@Test(enabled = true)
//	public void aboutCNA_Locations_International() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		WebElement about = aboutCNA.aboutCNA();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(about).perform();
//		Thread.sleep(3000);
//		aboutCNA.aboutCNALocations().click();
//		Thread.sleep(1000);
//		loginpage.navigateToElement(aboutCNA.international);
//		aboutCNA.international.click();
//		Thread.sleep(1000);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("locationsUrl");
//		boolean location = aboutCNA.socialIcon();
//		String pageTitle = driver.getCurrentUrl();
//		// #list0 #
//		System.out.println("pageTitle" + pageTitle);
//		Assert.assertEquals(locationUrl, pageTitle);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void aboutCNA_Management() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//	//	aboutCNA.ContinueButton().click();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		WebElement about = aboutCNA.aboutCNA();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(about).perform();
//		Thread.sleep(3000);
//		aboutCNA.management().click();
//		Thread.sleep(3000);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("managementUrl");
//		boolean list = aboutCNA.socialIcon();
//		String pageTitle = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageTitle);
//		aboutCNA.ContinueButton().click();
//		slowDown(2);
//		aboutCNA.Executive_committee().click();
//		Thread.sleep(2000);
//		aboutCNA.More().click();
//		Thread.sleep(2000);
//		aboutCNA.MailIcon().click();
//		SendanEmail();
//	//	aboutCNA.LedershipTeam().click();;
//		Assert.assertEquals(locationUrl, pageTitle);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void aboutCNA_newsroom() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		WebElement about = aboutCNA.aboutCNA();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(about).perform();
//		aboutCNA.newsRoom().click();
//		Thread.sleep(1000);
//		aboutCNA.PressRelease().click();
//		Thread.sleep(1);
//		String PressReleaseUrl = driver.getCurrentUrl();
//		String Actualtext = aboutCNA.MediaContact().getText();
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		ObjectMapper ObjectMapper = new ObjectMapper();
//		URL URL = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader Read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, List<String>> Multimap = objectMapper.readValue(Read, Map.class);
//		List<String>ExpectedText = new ArrayList<String>();
//		ExpectedText = Multimap.get("MediaContact");
//		String ExpMediaContact = ExpectedText.get(0).replaceAll("\n", " ");
//		String ActMediaContact = Actualtext.replaceAll("\n", " ");
//		Assert.assertEquals(ActMediaContact, ExpMediaContact);
//		String PressReleaseUrlExp = myMultimap.get("newsroomPRUrl");
//		String pageTitle = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageTitle);
//		Assert.assertEquals(PressReleaseUrl, PressReleaseUrlExp);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void aboutCNA_corporateResponsibility() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		AboutCNA aboutCNA = new AboutCNA(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		WebElement about = aboutCNA.aboutCNA();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(about).perform();
//		Thread.sleep(3000);
//		aboutCNA.socialResponsibility().click();
//		Thread.sleep(3000);
//		String pageUrl = driver.getCurrentUrl();
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("corporateresponsibilityUrl");
//		//String pageTitle = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageUrl);
//		Assert.assertEquals(locationUrl, pageUrl);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void verifyDisclaimer_PrivacyStatement() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		disclaimer.privacyStatement().click();
//		System.out.println("Privacy Statement" + driver.getTitle());
//		Thread.sleep(5000);
//		//disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_ConflictOfInterest() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		disclaimer.conflictOfInterest().click();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//		disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_LicensingDsiclosure() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(1000);
//		disclaimer.licensing().click();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//		disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_GeneralDisclaimer() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(1000);
//		disclaimer.generalDIsclaimer().click();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//		disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_PrivacyPolicy() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(1000);
//		//disclaimer.privacyPolicy().click();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//		//disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_SiteMap() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(1000);
//		disclaimer.siteMap().click();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//		disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyDisclaimer_CaliforniaResidents() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = disclaimer.privacyStatement();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		Thread.sleep(1000);
//		//disclaimer.californiaResidents().click();
//		slowDown(2);
//		//disclaimer.printAndShareIcon_Discliamer();
//		System.out.println("Conflict of Interest " + driver.getTitle());
//		Thread.sleep(1000);
//	//	disclaimer.backButton().click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyInvestorRelations() throws InterruptedException, IOException, InterruptedException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		disclaimer.investorRelations().click();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.switchTo().defaultContent();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void verifyPayMyBill() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		NavigateToBaseURL();
//		disclaimer.payMyBill().click();
//		ExtentTestManager.getTest().info(driver.getCurrentUrl());
//		driver.switchTo().defaultContent();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void verifyContactUs() throws InterruptedException, IOException, InterruptedException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Select dropdown = new Select(contact.contactSelect);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = contact.contactSelect;
//		js.executeScript("arguments[0].setAttribute('style', 'text-transform: none;')", element);
//
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		System.out.println("multimap " + myMultimap.get("contact"));
//
//		// Getting values
//		// List<String> fruits = myMultimap.get("Claim");
//		// System.out.println("Key "+myMultimap.entrySet());
//		List<WebElement> targetListElements = dropdown.getOptions();
//		List<String> targetList = new ArrayList<String>();
//		List<String> compareValues = new ArrayList<String>();
//		for (WebElement webElement : targetListElements) {
//			dropdown.selectByVisibleText(webElement.getText());
//			targetList.add(webElement.getText());
//		}
//
//		System.out.println("compareValues " + compareValues);
//
//		System.out.println("targetListElements " + targetList);
//
//		// Assert.assertEquals(myMultimap.values(), targetList);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_DataValidation_Affiliates() throws InterruptedException, IOException {
//		// #departmentWrapper
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(3000);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Affiliates");
//		Thread.sleep(2000);
//	/*	String affiliates = contact.departmentWrapper.getText();
//		// System.out.println(affiliates);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		List<String> affiliate = new ArrayList<String>();
//		affiliate = myMultimap.get("affiliates");
//		String expected = affiliate.get(0).replaceAll("\n", "");
//		String actual = affiliates.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);  */
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyConatct_Billing() throws InterruptedException, IOException {
//		// #departmentWrapper Billing & Collections
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(3000);
//		/*
//		 * driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click();
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Billing & Collections");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("billing");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertNotSame(actual, expected, "Failed due to change in content");
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_Claimfraud() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(3000);
//		/*
//		 * driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click();
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Claim Fraud");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("claimfraud");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertNotSame(actual, expected, "Failed due to change in content");
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_International() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		Thread.sleep(3000);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("International");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("international");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		if (expected.equals(actual)) {
//			ExtentTestManager.getTest().info(actual);
//			ExtentTestManager.getTest().info(expected);
//			ExtentTestManager.getTest().info("Contents are equal");
//		} else {
//			ExtentTestManager.getTest().fail("Contents are not equal , hence failed due to change in content");
//		}
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_Litigation() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(2);
//		Thread.sleep(3000);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Litigation Counsel");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("litigation");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_Longtermcare() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(3);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Long Term Care");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("LongTermcareProd");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_Media() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(3);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Media");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("media");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertNotSame(actual, expected, "Failed due to change in content");
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_policyInfo() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(3);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Policy Information");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("policy");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_premiumAudit() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(3);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Premium Audit");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("premiumAuditProd");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_SocialResp() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(3);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Social Responsibility");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("social");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(actual, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyContact_Warranty() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(2);
//		/*
//		 * if (Browser.equalsIgnoreCase("ANDROID SAUCE")) { driver.findElement(By.
//		 * xpath("//div[@class='burger-menu-container dHide tHide']")).click();
//		 * Thread.sleep(2000);
//		 * driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]")).click(); }
//		 */
//		ContactUs contact = new ContactUs(driver, timeout);
//		contact.contactCLick().click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(contact.contactSelect);
//		dropdown.selectByVisibleText("Warranty");
//		Thread.sleep(2000);
//		String billing = contact.departmentWrapper.getText();
//		System.out.println(billing);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		// System.out.println("multimap "+myMultimap.get("billing"));
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("warranty");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = billing.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(actual, actual);
//		ExtentTestManager.getTest().info(expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled=true)
//	public void verifyFindAnAgent() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		ContactUs contact = new ContactUs(driver, timeout);
//		Actions action = new Actions(driver);
//		action.moveToElement(contact.findAnAgent()).perform();
//		// contact.agentZipcode().sendKeys("60001");
//		Thread.sleep(3000);
//		contact.agentFindButton.click();
//		ExtentTestManager.getTest().info("Validation Message for Zipcode "+contact.zipCodevalidatioMessage().getText());
//		Select dropdown = new Select(contact.findState);
//		dropdown.selectByVisibleText("Florida");
//		Thread.sleep(3000);
//		contact.agentFindButton.click();
//		slowDown(2);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,150)");
//		contact.matchtoagent().click();
//		slowDown(7);
//		contact.matchFirstName.clear();
//		contact.matchFirstName.sendKeys("Tom");
//		contact.matchLastName.clear();
//		contact.matchLastName.sendKeys("D'cruz");
//		contact.matchEmail.clear();
//		contact.matchEmail.sendKeys("tom.dcruz@cna.com");
//		contact.matchComapany.clear();
//		contact.matchComapany.sendKeys("CNA");
//		contact.matchCity.clear();
//		contact.matchCity.sendKeys("Edinberg");
//		contact.matchZipcode.clear();
//		contact.matchZipcode.sendKeys("50001");
//		js.executeScript("window.scrollBy(0,150)");
//		contact.matchPhone.clear();
//		contact.matchPhone.sendKeys("9876543210");
//		Select matchIndustry = new Select(contact.matchIndustry);
//		matchIndustry.selectByVisibleText("Construction");
//		contact.matchAgentSubmit.click();
//		slowDown(2);
//		contact.matchCloseButton.click();
//		String actual = driver.getCurrentUrl();
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		String expected = myMultimap.get("findAnAgent");
//		if (expected.contains(actual)) {
//			ExtentTestManager.getTest().info(actual);
//			ExtentTestManager.getTest().info(expected);
//			ExtentTestManager.getTest().info("Find An Agent has correct URL");
//		} else {
//			ExtentTestManager.getTest().info(actual);
//			ExtentTestManager.getTest().info(expected);
//			ExtentTestManager.getTest().info("URL is not in Find An Agent");
//		}
//	/*	String agencycount = driver.findElement(By.cssSelector("#numAgency")).getText();
//		ExtentTestManager.getTest().info("Agency count for Florida "+agencycount);
//		System.out.println(driver.findElement(By.cssSelector("#numAgency")).getText()); */
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
///*	@Test(enabled = true)
//	public void verifyFeedback() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		ContactUs contact = new ContactUs(driver, timeout);
//	//	contact.feedbackButton.click();
//		slowDown(3);
//		WebElement iframeSwitch = contact.iFrame;
//		driver.switchTo().frame(iframeSwitch);
//		System.out.println("Switched");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)");
//		Actions action = new Actions(driver);
//		WebElement we = contact.checkBox;
//		slowDown(7);
//		action.moveToElement(we).build().perform();
//		contact.checkBox.click();
//		slowDown(2);
//	/*	js.executeScript("window.scrollBy(0,10000)");
//	/*	WebElement feedackMsg = contact.feedbackMessage; */
//		
//		/*
//		 * Actions action1 = new Actions(driver);
//		 * action1.moveToElement(feedackMsg).build().perform(); feedackMsg.clear();
//		 * feedackMsg.sendKeys("Automation Feed back message"); WebElement insurer =
//		 * contact.feedbackInsurer; js.executeScript("window.scrollBy(0,150)", insurer);
//		 * contact.feedbackInsurer.click(); WebElement often =
//		 * contact.feedbcakOftenVisit; js.executeScript("window.scrollBy(0,150)",
//		 * often); contact.feedbcakOftenVisit.click(); WebElement purpose =
//		 * contact.feedbackPurpose; js.executeScript("window.scrollBy(0,150)", purpose);
//		 * contact.feedbackPurpose.click();
//		 */
//		// WebElement accomplish = contact.feedbackAccomplish;
//	/*	js.executeScript("window.scrollBy(0,150)");
//		contact.feedbackAccomplish.click();
//		slowDown(1);
//		contact.feedbackSubmit.click();
//		slowDown(1); */
//		// contact.feedbcakClose.click();
///*		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	} */
//
//	@Test()
//	public void verifyIndustries_landingpage() throws InterruptedException, IOException {
//		// #subNavbarDiv_industries
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		Actions action = new Actions(driver);
//		Industries industry = new Industries(driver, timeout);
//		industry.industryLink().click();
//		slowDown(1);
//		boolean social = industry.socialIconLandingPage();
//		System.out.println("social " + social);
//		boolean heroImage = industry.heroImage.isDisplayed();
//		System.out.println("heroImage " + heroImage);
//		boolean herotext = industry.headLine.isDisplayed();
//		System.out.println("herotext " + herotext);
//		String text = industry.headLine.getText();
//		System.out.println("herotext " + text);
//		ExtentTestManager.getTest().equals(social);
//		ExtentTestManager.getTest().getStatus().equals(heroImage);
//		ExtentTestManager.getTest().getStatus().equals(herotext);
//		ExtentTestManager.getTest().info(text);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyIndustries() throws InterruptedException, IOException {
//		// #subNavbarDiv_industries
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		Actions action = new Actions(driver);
//		Industries industry = new Industries(driver, timeout);
//		WebElement we = industry.industryLink();
//		action.moveToElement(we).perform();
//		boolean read = industry.readMoreLinkN().isDisplayed();
//		System.out.println("read " + read);
//		slowDown(3);
//		industry.readMoreLinkN().click();
//		//industry.industrySubLink().click();
//		slowDown(2);
//		//boolean social = industry.socialIconLandingPage();
//		//System.out.println("social " + social);
//		boolean heroImage = industry.heroImage.isDisplayed();
//		System.out.println("heroImage " + heroImage);
//		slowDown(3);
//		boolean herotext = industry.headLine.isDisplayed();
//		System.out.println("herotext " + herotext);
//		String text = industry.headLine.getText();
//		System.out.println("herotext " + text);
//		String actual = driver.getCurrentUrl();
//		//ExtentTestManager.getTest().getStatus().equals(social);
//		ExtentTestManager.getTest().getStatus().equals(heroImage);
//		ExtentTestManager.getTest().getStatus().equals(herotext);
//		ExtentTestManager.getTest().info(text);
//		ExtentTestManager.getTest().info("The URL landed for Industries " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyProductsandSolutions() throws InterruptedException, IOException {
//		// #subNavbarDiv_industries
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		Actions action = new Actions(driver);
//		ProductsAndSolutions pas = new ProductsAndSolutions(driver, timeout);
//		WebElement we = pas.productsLink();
//		action.moveToElement(we).build();
//		WebElement find = pas.productSub;
//		find.click();
//		Thread.sleep(3000);
//		String actual = driver.getCurrentUrl();
//		ExtentTestManager.getTest().info("The URL landed Products And Solutions " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyGetAQuote() throws InterruptedException, IOException {
//		DisclaimerFunctionality disclaimer = new DisclaimerFunctionality(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		disclaimer.continueButton().click();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		ProductsAndSolutions pas = new ProductsAndSolutions(driver, timeout);
//		
//		pas.getAQuote.click();
//		slowDown(2);
//		String actual = driver.getCurrentUrl();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
//		pas.getAQUoteToday.click();
//		slowDown(2);
//		System.out.println(pas.businessZipValidationMessage().getText());
//		ExtentTestManager.getTest().info("Business validation "+pas.businessZipValidationMessage().getText());
//		ExtentTestManager.getTest().info("Email Validation messge "+ pas.emailValidationMessage().getText());
//		ExtentTestManager.getTest().info("Product Validation messge "+ pas.productValidationMessage().getText());
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		String expected = myMultimap.get("getAQuote");
//		if (expected.contains(actual)) {
//			ExtentTestManager.getTest().info(actual);
//			ExtentTestManager.getTest().info(expected);
//			ExtentTestManager.getTest().info("Get A Quote has correct URL");
//			ExtentTestManager.getTest().info("Actual URL "+driver.getCurrentUrl());
//			ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//					.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//		} else {
//			ExtentTestManager.getTest().fail("URL is not in Get A Quote");
//		}
//
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_LawyesrAlliedVendor() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);//
//		rc.AlliedVendorProgram().click();
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		boolean feedbackbutoon = rc.FeedBackButton().isDisplayed();
//		System.out.println("Feed Back Button :" + feedbackbutoon);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("LawyersAlliedVendorURL");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for LawyesrAlliedVendor " + Expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled=false)
//	public void verifyRiskControl_RiskRelatedtoProperty() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedToProperty().click();
//		System.out.println(rc.contentArea.isDisplayed());
//		String actual = driver.getCurrentUrl();
//		ExtentTestManager.getTest().info("The URL landed for Property " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_BeyondHr() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.beyond_hr().click();
//		rc.HrLogin_page();
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("Beyon HR URL");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for _BeyondHr " + Actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_ReadMore() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.readmore().click();
//		String Readmore_Title = driver.getTitle();
//		System.out.println(Readmore_Title);
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("ReadMore URL");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for ReadMore " + Actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_Prepwise() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedtoPrepwise().click();
//		String Prepwise_Title = driver.getTitle();
//		System.out.println(Prepwise_Title);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,50)");
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		System.out.println(rc.FeedBackButton().isDisplayed());
//		String actual = driver.getCurrentUrl();
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("Prepwise");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for PrepWise " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	@Test(enabled=true)
//	public void verifyRiskControl() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		Select dropdown = new Select(rc.Topics());
////		rc.navigateToElement(rc.dropDownValue());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = rc.riskControl();
//		js.executeScript("arguments[0].setAttribute('style', 'text-transform: none;')", element);
//
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		System.out.println("*****************************");
//		System.out.println(url);
//		
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		// Map<String,String> dropdownValues = objectMapper.readValue(read, Map.class);
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		System.out.println("multimap " + myMultimap.get("RiskControlCapabilities"));
//
//		// Getting values
//		 List<String> riskcontorl = myMultimap.get("RiskControlCapabilities");
//		 System.out.println("Key "+riskcontorl);
//		List<WebElement> targetListElements = dropdown.getOptions();
//		List<String> targetList = new ArrayList<String>();
//		List<String> compareValues = new ArrayList<String>();
//		for (WebElement webElement : targetListElements) {
//			dropdown.selectByVisibleText(webElement.getText());
//			targetList.add(webElement.getText());
//			ExtentTestManager.getTest().info(webElement.getText());
//		}
//
//		System.out.println("compareValues " + riskcontorl);
//		System.out.println("targetListElements " + targetList);
//
//		 Assert.assertEquals(riskcontorl, targetList);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//
//	
//	
//	@Test()
//	public void verifyRiskControl_Sorce() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedtoSorce().click();
//		String Sorce_title = driver.getTitle();
//		System.out.println(Sorce_title);
//		String actual = driver.getCurrentUrl();
//		System.out.println(actual);
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		boolean feedbackbutoon = rc.FeedBackButton().isDisplayed();
//		System.out.println("Feed Back Button :" + feedbackbutoon);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("SorceURL");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for Sorce " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_Capabilities() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedtoCapailities().click();
//		String Capabilities_Title = driver.getTitle();
//		System.out.println(Capabilities_Title);
//		String actual = driver.getCurrentUrl();
//		System.out.println(actual);
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		boolean feedbackbutoon = rc.FeedBackButton().isDisplayed();
//		System.out.println("Feed Back Button :" + feedbackbutoon);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("ProductCapabilities");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for Capabilities " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyRiskControl_Alliedvendors() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedtoAlliedResource().click();
//		boolean social = rc.socialIcon();
//		System.out.println("socialIcon Display " + social);
//		Assert.assertTrue(social);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("AlliedVendorURL");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for Alliedvendors " + Actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyRiskControl_CNABlog() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		Actions action = new Actions(driver);
//		RiskControl rc = new RiskControl(driver, timeout);
//		WebElement we = rc.riskControl();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		rc.riskRelatedtoCNABlog().click();
//		String CNABlog_Title = driver.getTitle();
//		System.out.println(CNABlog_Title);
//		String actual = driver.getCurrentUrl();
//		System.out.println(actual);
//		boolean social = rc.socialIcon();
//		System.out.println("social " + social);
//		Assert.assertTrue(social);
//		boolean feedbackbutoon = rc.FeedBackButton().isDisplayed();
//		System.out.println("Feed Back Button :" + feedbackbutoon);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("CNABlog");
//		String Expected = driver.getCurrentUrl();
//		System.out.println("pageTitle :" + Expected);
//		Assert.assertEquals(Actual, Expected);
//		ExtentTestManager.getTest().info("The URL landed for CNA Blog" + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test()
//	public void verifyAgentLoginSublinks() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(2);
//		verifyHomePageAccessable();
//		Thread.sleep(1000);
//		Actions action = new Actions(driver);
//		AgentLogin al = new AgentLogin(driver, timeout);
//		WebElement we = al.agentLogin();
//		action.moveToElement(we).perform();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifySupplierDiversityForm() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		NavigateToSupplierDiversityURL();
//		
//		slowDown(1);
//		SupplierDiversityForm supplier = new SupplierDiversityForm(driver, timeout);
//		boolean social = supplier.socialIconLandingPage();
//		System.out.println("social " + social);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		supplier.registerButton().click();
//		slowDown(1);
//		supplier.registerTinNum.clear();
//		
//		supplier.registerTinNum.sendKeys("456765345");
//		slowDown(1);
//		supplier.registerFirstName.clear();
//		supplier.registerFirstName.sendKeys("Sheeba");
//		slowDown(1);
//		supplier.registerLastName.clear();
//		supplier.registerLastName.sendKeys("Jacob");
//		slowDown(1);
//		supplier.registerCompanyName.clear();
//		supplier.registerCompanyName.sendKeys("Automation Supplier Diversity Form");
//		slowDown(1);
//		supplier.registerEmail.clear();
//		supplier.registerEmail.sendKeys("sheeba.jacob@cna.com");
//		slowDown(1);
//		supplier.registerDescription.clear();
//		supplier.registerDescription.sendKeys("Desciption automation for supplier diversity");
//		slowDown(1);
//		supplier.registerPhone.clear();
//		supplier.registerPhone.sendKeys("7894562345");
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,50)");
//		supplier.vendorFemale.click();
//		slowDown(1);
//		boolean text = supplier.disclaimerText().isDisplayed();
//		System.out.println("disclaimer text" + text);
//		slowDown(1);
//		supplier.vendorSubmit.click();
//		slowDown(1);
//		supplier.thanksAndCloseButton.click();
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyDirectBillPayment() throws InterruptedException, IOException {
//		NavigateToBaseURL();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(2);
//		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)");
//		AboutCNA about = new AboutCNA(driver, timeout);
//		//about.directBill().click();
//		slowDown(5);
//		String expected = driver.getCurrentUrl();
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String directBillPayment = myMultimap.get("directBillPayment");
//		Assert.assertEquals(directBillPayment, expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyCareersAtCNA() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,9000)");
//		AboutCNA about = new AboutCNA(driver, timeout);
//		//about.careersAtCNA().click();
//		slowDown(5);// *[@id="linkedInButtonId"]/i
//		// driver.switchTo().alert().dismiss();
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		//about.socialIcon();
//		slowDown(1);
//		js.executeScript("window.scrollBy(0,200)");
//		//about.clickApplyNow.click();
//		String expected = driver.getCurrentUrl();
//		System.out.println("expected " + expected);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String directBillPayment = myMultimap.get("careersURL");
//		Assert.assertEquals(directBillPayment, expected);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	@Test(enabled = true)
//	public void verify_Riskcontrolsearch() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		RiskControl rc = new RiskControl(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(1);
//		rc.continuebutton().click();
//		slowDown(1);
//		rc.searchButton.click();
//		WebElement search = rc.topSearch;
//		search.sendKeys("Claim");
//		search.sendKeys(Keys.ENTER);
//		slowDown(3);
//	// #searchResultHeader
//	//	WebElement SearchRiskcontrol = rc.SearchRiskcontrol();
//	//	Actions elem2 = new Actions(driver);
//	//	elem2.moveToElement(SearchRiskcontrol).perform();
//		rc.SearchRiskcontrol().click();
//		slowDown(2);
//		
//	//	WebElement ele = rc.DropDown();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//		rc.Topics().click();
//		String[] actual = {"Business Resilience","COVID-19","Cybersecurity Awareness","Ergonomics","Hurricanes","Slip and Fall Prevention","SORCE"};
//		WebElement dropdown=rc.Topics();
//		List<String> expected = new ArrayList<String>();
//	//	dropdown.click();
//		expected.add(dropdown.getText());
//		System.out.println(expected);
//		Assert.assertEquals(actual, expected);
//	}
//	@Test(enabled = true)
//	public void verify_search_Product() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		RiskControl rc = new RiskControl(driver, timeout);
//		SearchPage SP = new SearchPage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(1);
//		boolean searchbutton = rc.searchButton.isDisplayed();
//		if(searchbutton = true) {
//		rc.searchButton.click();
//		WebElement search = rc.topSearch;
//		search.sendKeys("Claim");
//		search.sendKeys(Keys.ENTER);
//		slowDown(3);// #searchResultHeader
//		String SearchTerm = "claim";
//		slowDown(2);
//		SP.Search_products().click();
//		slowDown(1);
//		int count = 0;
//		List<WebElement>results = driver.findElements(By.xpath("//span[contains(text(),' claim ')]"));
//		for(int i=0; i<results.size(); i++) {
//	
//			Assert.assertTrue(results.get(i).getText().contains(SearchTerm));
//			}
//		System.out.println("Search Results :"+results.size());
//		slowDown(2);
//		
//		SP.Drop_down().click();
//		slowDown(2);
//		List<WebElement> allOptions = driver.findElements(By.xpath("//span[@class='icon icon-down']"));
//		System.out.println("SortBy :" + allOptions.size());
//		for(int i=0; i<=allOptions.size()-1 ; i++) {
//		if(allOptions.get(i).getText().contains("Relevance")) {
//			allOptions.get(i).click();
//			}
//		}
//		
//		}
//	}
//		
//		
//	
//	@Test(enabled = true)
//	public void verify_search() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		RiskControl rc = new RiskControl(driver, timeout);
//		SearchPage SP = new SearchPage(driver, timeout);
//		NavigateToBaseURL();
//		slowDown(1);
//		boolean searchbutton = rc.searchButton.isDisplayed();
//		if(searchbutton = true) {
//		rc.searchButton.click();
//		WebElement search = rc.topSearch;
//		search.sendKeys("Claim");
//		search.sendKeys(Keys.ENTER);
//		slowDown(3);// #searchResultHeader
//		String SearchTerm = "claim";
//		int count = 0;
//		List<WebElement>results = driver.findElements(By.xpath("//span[contains(text(),' claim ')]"));
//		for(int i=0; i<results.size(); i++) {
//			Assert.assertTrue(results.get(i).getText().contains(SearchTerm));
//			}
//		System.out.println("Search Results :"+results.size());
//		slowDown(2);
//		SP.Drop_down().click();
//		slowDown(2);
//		List<WebElement> allOptions = driver.findElements(By.xpath("//span[@class='icon icon-down']"));
//		System.out.println("SortBy :" + allOptions.size());
//		for(int i=0; i<=allOptions.size()-1 ; i++) {
//		if(allOptions.get(i).getText().contains("Relevance")) {
//			allOptions.get(i).click();
//		}
//		}
//	/*	Select dropdown = new Select(SP.Drop_down());
//		loginpage.navigateToElement(SP.Drop_down());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = SP.Drop_down();
//		js.executeScript("arguments[0].setAttribute('style', 'text-transform: none;')", element);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);
//		System.out.println("multimap " + myMultimap.get("SortByOptions"));// Getting values
//		List<String> claimvalues = myMultimap.get("SortByOptions");
//		System.out.println("Key "+claimvalues);
//		Select Dropdown = new Select(SP.Drop_down());
//		List<WebElement> targetListElements = dropdown.getOptions();
//		List<String> targetList = new ArrayList<String>();
//		List<String> compareValues = new ArrayList<String>();
//		for (WebElement webElement : targetListElements) {
//			dropdown.selectByVisibleText(webElement.getText());
//			targetList.add(webElement.getText());
//			ExtentTestManager.getTest().info(webElement.getText());
//		}
//		System.out.println("compareValues " + claimvalues);
//		System.out.println("targetListElements " + targetList);
//
//		 Assert.assertEquals(claimvalues, targetList);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build()); */
//		slowDown(2);
//		WebElement SearchProduct = rc.SearchProducts();
//		Actions elem1 = new Actions(driver);
//		elem1.moveToElement(SearchProduct).perform();
//		rc.SearchProducts().click();
//		slowDown(1);
//		WebElement SearchRiskcontrol = rc.SearchRiskcontrol();
//	//	Actions elem2 = new Actions(driver);
//	//	elem2.moveToElement(SearchRiskcontrol).perform();
//		rc.SearchRiskcontrol().click();
//		slowDown(2);
//		WebElement ele = rc.Topics();
//		JavascriptExecutor Js = (JavascriptExecutor) driver;
//		Js.executeScript("arguments[0].click();", ele);
//	//	rc.DropDown().click();
//		String[] actual = {"Business Resilience","COVID-19","Cybersecurity Awareness","Ergonomics","Hurricanes","Slip and Fall Prevention","SORCE"};
//		WebElement DropDown=rc.Topics();
//	//	Select select = new Select(dropdown);
//		List<String> expected = new ArrayList<String>();
//	//	dropdown.click();
//		expected.add(DropDown.getText());
//		Assert.assertEquals(actual, expected);
//		}
//		WebElement SearchIndustries = rc.Searchindustries();
//		Actions elem3 = new Actions(driver);
//		elem3.moveToElement(SearchIndustries).perform();
//		rc.Searchindustries().click();
//		slowDown(1);
//	/*	WebElement SearchApplications = contact.Searchapplications();
//		Actions elem4 = new Actions(driver);
//		elem4.moveToElement(SearchApplications).perform();
//		slowDown(1); */
//		WebElement SearchNews = rc.Searchnews();
//		Actions elem5 = new Actions(driver);
//		elem5.moveToElement(SearchNews).perform();
//		rc.Searchnews().click();
//		slowDown(1);
//		WebElement SearchSolutions = rc.Searchsolutions();
//		Actions elem6 = new Actions(driver);
//		elem6.moveToElement(SearchSolutions).perform();
//		rc.Searchsolutions().click();
//		slowDown(1);
//		String PageTitle = driver.getTitle();
//		System.out.println(PageTitle);
//		// contact.searchResultHeader.click();
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//	//	String SortbyColor = contact.sortby().getCssValue("color");
//	//	System.out.println(SortbyColor);// rgba=147, 148, 149, 1
//		rc.verify_Sortbycolor();//#939495
//		String locationUrl = myMultimap.get("searchUrl");
//		boolean currentUrl = driver.getCurrentUrl().contains("searchUrl");
//		System.out.println("currentUrl " + currentUrl);
//
//	}
//
//	@Test(enabled = true)
//	public void verifySimpleRedirect() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPgae = new ClaimPage(driver, timeout);
//		NavigateToBaseURL();
//
//		/*km 
//		 * //String exceptedMessage = excelData.GetTestData("Login", "LoginPage",
//		 * "Expected Message", ""); String exceptedMessage =
//		 * excelData.getCellData("Login", "Field Name", 2); String actualMessage =
//		 * driver.getCurrentUrl();
//		 */
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		System.out.println("multimap " + myMultimap.get("simpleRedirect"));
//		System.out.println(myMultimap.get("newUrl"));
//
//		// Getting values
//		List<String> newUrls = myMultimap.get("newUrl");
//		List<String> redirectUrls = myMultimap.get("simpleRedirect");
//		String currentUrl = null;
//		for (String webElement : redirectUrls) {
//			driver.get(webElement);
//			slowDown(4);
//			currentUrl = driver.getCurrentUrl();
//		if (newUrls.contains(currentUrl)) {
//				System.out.println(webElement + " in if  " + currentUrl);
//				ExtentTestManager.getTest().info(webElement + " " + currentUrl);
//				System.out.println("   ");
//			} else {
//				System.out.println("   ");
//				System.out.println(webElement + " in else  " + currentUrl);
//				ExtentTestManager.getTest().fail(webElement + " " + currentUrl);
//			}
//		}
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
//	@Test(enabled = true)
//	public void verifyAgentCenter() throws InterruptedException, IOException {
//		LoginPage loginpage = new LoginPage( driver , timeout);
//		AgentCenter agentCenter = new AgentCenter(driver, timeout);
//		NavigateToAgentCenter();
//		slowDown(2);
//		// verifyHomePageAccessable1();
//		/*
//		 * Actions actions = new Actions(driver);
//		 * actions.moveToElement(agentCenter.agentLogin).perform(); slowDown(2);
//		 * agentCenter.agentCenterClick().click();
//		 */
//		
//		agentCenter.agentLoginUsername.clear();
//		agentCenter.agentLoginUsername.sendKeys("cae9700");
//		agentCenter.agentLoginUsername.sendKeys(Keys.TAB);
//		slowDown(5);
//
//		String encrptData = "password";
//
//		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
//		System.out.println("encodedBytes --------------->" + new String(encodedBytes));
//
//		byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
//		System.out.println("encodedBytes --------------->" + new String(decodedBytes));
//
//		agentCenter.Click(agentCenter.agentLoginPassword);
//		agentCenter.agentLoginPassword.clear();
//		agentCenter.agentLoginPassword.sendKeys(new String(encodedBytes));
//		slowDown(3);
//		agentCenter.agentLoginPassword.clear();
//		agentCenter.agentLoginPassword.sendKeys("Ravi1993");
//		agentCenter.agentLoginButton.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		agentCenter.applicationAndMarketing().click();
//		slowDown(2);
//		js.executeScript("window.scrollBy(0,150)");
//		agentCenter.applicationOption1().click();
//		agentCenter.applicationOption2().click();
//		js.executeScript("window.scrollBy(0,350)");
//
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//	@Test()
//	public void verifyAgentLogin_CNACentral() throws InterruptedException, IOException {
//		
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		
//		Actions action = new Actions(driver);
//		AgentCenter agentCenter = new AgentCenter(driver, timeout);
//		WebElement we = agentCenter.cnaCentral();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		agentCenter.cna_CentralLink().click();
//		agentCenter.agentLoginUsername.clear();
//		agentCenter.agentLoginUsername.sendKeys("cae4783");
//		agentCenter.agentLoginUsername.sendKeys(Keys.TAB);
//		
//		agentCenter.agentLoginPassword.clear();
//		//agentCenter.agentLoginPassword.sendKeys(new String(encodedBytes));
//		slowDown(3);
//		agentCenter.agentLoginPassword.sendKeys("mGbsv006");
//		agentCenter.agentLoginButton.click();
//		slowDown(4);
//		//driver.findElement(By.xpath("/html/body/div[4]/div[4]/section[1]/div/div[3]/div/div/ul/li[5]")).click();
//		// action.moveToElement(find).perform();
//		String actual = driver.getCurrentUrl();
//		ExtentTestManager.getTest().info("The URL landed for CNA Central " + actual);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	
//	@Test()
//	public void verifyAgentLogin_lawyersInsurance() throws InterruptedException, IOException {
//		driver.manage().deleteAllCookies();
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		Actions action = new Actions(driver);
//		AgentCenter agentCenter = new AgentCenter(driver, timeout);
//		WebElement we = agentCenter.cnaCentral();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		agentCenter.lawyersInsurance().click();
//		/*agentCenter.agentLoginUsername.clear();
//		agentCenter.agentLoginUsername.sendKeys("cae4783");
//		agentCenter.agentLoginUsername.sendKeys(Keys.TAB);
//		
//		agentCenter.agentLoginPassword.clear();
//		//agentCenter.agentLoginPassword.sendKeys(new String(encodedBytes));
//		slowDown(3);
//		agentCenter.agentLoginPassword.sendKeys("mGbsv006");
//		agentCenter.agentLoginButton.click();*/
//		// action.moveToElement(find).perform();
//		String actual = driver.getCurrentUrl();
//		ExtentTestManager.getTest().info("The URL landed for Lawyesr Insurance " + actual);
//		slowDown(3);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	
//	@Test()
//	public void verifyAgentLogin_surety() throws InterruptedException, IOException {
//		driver.manage().deleteAllCookies();
//		NavigateToBaseURL();
//		slowDown(2);
//		if (verifyHomePageAccessable()) {
//			ExtentTestManager.getTest().info("Clicked on popup");
//		} else {
//			ExtentTestManager.getTest().info("Unable to click on popup");
//		}
//		slowDown(1);
//		
//		Actions action = new Actions(driver);
//		AgentCenter agentCenter = new AgentCenter(driver, timeout);
//		WebElement we = agentCenter.cnaCentral();
//		action.moveToElement(we).perform();
//		Thread.sleep(3000);
//		agentCenter.surety().click();
//		/*agentCenter.agentLoginUsername.clear();
//		agentCenter.agentLoginUsername.sendKeys("cae4783");
//		agentCenter.agentLoginUsername.sendKeys(Keys.TAB);
//		
//		agentCenter.agentLoginPassword.clear();
//		//agentCenter.agentLoginPassword.sendKeys(new String(encodedBytes));
//		slowDown(3);
//		agentCenter.agentLoginPassword.sendKeys("mGbsv006");
//		agentCenter.agentLoginButton.click();*/
//		// action.moveToElement(find).perform();
//		String actual = driver.getCurrentUrl();
//		ExtentTestManager.getTest().info("The URL landed for Lawyesr Insurance " + actual);
//		slowDown(3);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	
//	@Test(enabled = true)
//	public void verifyNewsroom_5247() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPgae = new ClaimPage(driver, timeout);
//		NavigateToBaseURL();
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		System.out.println("multimap " + myMultimap.get("newsroomRedirect"));
//		System.out.println(myMultimap.get("newNewsRoom"));
//
//		// Getting values
//		List<String> newUrls = myMultimap.get("newNewsRoom");
//		List<String> redirectUrls = myMultimap.get("newsroomRedirect");
//		String currentUrl = null;
//		for (String webElement : redirectUrls) {
//			driver.get(webElement);
//			slowDown(4);
//			currentUrl = driver.getCurrentUrl();
//			if (newUrls.contains(currentUrl)) {
//				System.out.println(webElement + " in if  " + currentUrl);
//				ExtentTestManager.getTest().info(webElement + " " + currentUrl);
//				System.out.println("   ");
//			} else {
//				System.out.println("   ");
//				System.out.println(webElement + " in else  " + currentUrl);
//				ExtentTestManager.getTest().fail(webElement + " " + currentUrl);
//			}//newsroomRedirect newNewsRoom
//		}
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	@Test(enabled = false)
//	public void reportAClaim_GeneralLiability() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(2000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("General Liability");
//		loginpage.navigateToElement(claimPage.repprtNewOnline());
//		claimPage.reportOnline().click();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//		//
//		claimPage.firstNamePR.clear();
//		claimPage.firstNamePR.sendKeys("NameGeneralLiability");
//		claimPage.lastNamePR.clear();
//		claimPage.lastNamePR.sendKeys("LNameGeneralLiability");
//		claimPage.phoneNumberPR.clear();
//		claimPage.phoneNumberPR.sendKeys("9976543210");
//
//		Thread.sleep(3000);
//		claimPage.companyName.clear();
//		claimPage.companyName.sendKeys("TestAutomation For General Liability");
//		loginpage.navigateToElement(claimPage.claimGLNext);
//		claimPage.claimGLNext.click();// #claimformns_incidentDesc
//		Thread.sleep(3000);
//		claimPage.incidentDate.clear();
//		claimPage.incidentDate.sendKeys("07/08/2019");
//		Thread.sleep(3000);
//		claimPage.claimAddress.clear();
//		claimPage.claimAddress.sendKeys("UX Bridge Shillong");
//		loginpage.navigateToElement(claimPage.claimIncidentDescription);
//		claimPage.claimIncidentDescription.clear();
//		claimPage.claimIncidentDescription.sendKeys("Vehicle damage");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = claimPage.clickOnNex2t();
//		js.executeScript("window.scrollBy(0,10000)", element);
//		claimPage.clickOnNex2t().click();
//		Thread.sleep(3000);
//		loginpage.navigateToElement(claimPage.claimFormAdditionalDesc);
//		claimPage.claimFormAdditionalDesc.sendKeys("Renovation work");
//		loginpage.navigateToElement(claimPage.claimSubmit);
//		Thread.sleep(1000);
//		claimPage.claimSubmit.click();//
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//
//	@Test(enabled = false)
//	public void reportAClaim_LongTremCare() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseURL();
//
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(2000);
//		claimPage.claimCenterlink.click();
//		Thread.sleep(3000);
//		Select dropdown = new Select(claimPage.dropDownValue);
//		dropdown.selectByVisibleText("Long-Term Care");
//		String text = claimPage.departmentWrapper().getText();
//		System.out.println(text);
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, List<String>> myMultimap = objectMapper.readValue(read, Map.class);// ArrayListMultimap.create();
//		List<String> bill = new ArrayList<String>();
//		bill = myMultimap.get("LongTermCare");
//		String expected = bill.get(0).replaceAll("\n", "");
//		String actual = text.replaceAll("\n", "");
//		System.out.println(expected);
//		System.out.println(actual);
//		Assert.assertEquals(expected, actual);
//
//				ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//
//	}
//	
//	@Test(enabled = true)
//	public void Verify_SlipandFall() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//
//		// BasePage basepage = new BasePage(driver, timeout);
//		driver.get("https://www.cna.com/slip-and-fall");
//		Thread.sleep(2000);
//		claimPage.continuebutton().click();
////		driver.manage().deleteAllCookies();
////		driver.navigate().refresh();
//		boolean icon = claimPage.socialIcon();
//		System.out.println("socialIcon :" + icon);
//		Thread.sleep(2000);
//		claimPage.shareicon().click();
//		Thread.sleep(2000);
//		boolean SocialIcon1 = claimPage.twitterIdButton().isDisplayed();
//		System.out.println(SocialIcon1);
//		boolean SocialIcon2 = claimPage.linkedinbutton().isDisplayed();
//		System.out.println(SocialIcon1);
//		boolean SocialIcon3 = claimPage.gmailbutton().isDisplayed();
//		System.out.println(SocialIcon1);
//		
//		String Title = claimPage.SkipFallTitle().getText();
//		System.out.println("PageTitle :" + Title);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("SlipandFall");
//		String pageTitle = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageTitle);
//		Assert.assertEquals(locationUrl, pageTitle);
//		ExtentTestManager.getTest().getStatus().equals(Title);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//	@Test(enabled = true)
//	public void Verify_microsite_rims() throws InterruptedException, Exception {
//		LoginPage loginpage = new LoginPage(driver, timeout);
//		ClaimPage claimPage = new ClaimPage(driver, timeout);
//		BasePage basepage = new BasePage(driver, timeout);
//		driver.get(RimUrl);
//		Thread.sleep(2000);
//		claimPage.continuebutton().click();
//		slowDown(2);
//		boolean icon = claimPage.socialicon();
//		System.out.println("socialIcon :" + icon);
//		Assert.assertTrue(icon);
//		Thread.sleep(2000);
//		String Title = driver.getTitle();
//		System.out.println("PageTitle :" + Title);
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String locationUrl = myMultimap.get("RimUrl");
//		String pageTitle = driver.getCurrentUrl();
//		System.out.println("pageTitle" + pageTitle);
//		Assert.assertEquals(locationUrl, pageTitle);
//		ExtentTestManager.getTest().getStatus().equals(Title);
//		ExtentTestManager.getTest().log(Status.PASS, "Navigating  application", MediaEntityBuilder
//				.createScreenCaptureFromPath(TakeScreenShot("Navigating  application Passed")).build());
//	}
//
	@Test(enabled =true )
	public void Verify_Cookiemessage() throws InterruptedException, Exception {
		LoginPage loginpage = new LoginPage(driver, timeout);
		ClaimPage claimPage = new ClaimPage(driver, timeout);

		// BasePage basepage = new BasePage(driver, timeout);
//		NavigateToBaseUrl();
//		
//		// loginpage.IgnorePopup().click();
//		Thread.sleep(2000);
//		claimPage.Cookie_PrivacyCenter().click();
//		ObjectMapper objectMapper = new ObjectMapper();
//		URL url = CNATest.class.getClass().getResource("/wave3/testdata/static_data.json");
//		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
//		Map<String, String> myMultimap = objectMapper.readValue(read, Map.class);
//		String Actual = myMultimap.get("PrivacyURL");
//		String Expected = driver.getCurrentUrl();
//		Assert.assertEquals(Actual, Expected);
		
	}
	}
//
//}
