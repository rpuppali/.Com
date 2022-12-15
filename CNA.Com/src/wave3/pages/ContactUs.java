package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUs extends BasePage {
	
	@FindBy(id="contactDD")
	public WebElement contactSelect;
	
	@FindBy(id="departmentWrapper")
	public WebElement departmentWrapper;
	
	@FindBy(id="searchResultHeader")
	public WebElement searchResultHeader;
	
	@FindBy(id="btnFind")
	public WebElement agentFindButton;
	
	@FindBy(id="QSIFeedbackButton-btn")
	public WebElement feedbackButton;
	
	@FindBy(id="btnTopSearchImg")
	public WebElement SearchButton;
	
	@FindBy(id="news")
	public WebElement searchNews;
	
	@FindBy(id="findState")
	public WebElement findState;
	
	@FindBy(id="btnMatch")
	public WebElement matchToAgentButton;//#cfnamespace_FirstNameF #cfnamespace_LastNameF #cfnamespace_EmailF #cfnamespace_CompanyNameF
	//#cfnamespace_CityNameF #cfnamespace_ZipCodeF #cfnamespace_PhoneF #cfnamespace_IndustryF #matchMeAgentSubmit
	
	@FindBy(id="cfnamespace_FirstNameF")
	public WebElement matchFirstName;
	
	@FindBy(id="cfnamespace_LastNameF")
	public WebElement matchLastName;
	
	@FindBy(id="cfnamespace_EmailF")
	public WebElement matchEmail;
	
	@FindBy(id="cfnamespace_CompanyNameF")
	public WebElement matchComapany;
	
	@FindBy(id="cfnamespace_CityNameF")
	public WebElement matchCity;
	
	@FindBy(id="cfnamespace_ZipCodeF")
	public WebElement matchZipcode;
	
	@FindBy(id="cfnamespace_PhoneF")
	public WebElement matchPhone;
	
	@FindBy(id="cfnamespace_IndustryF")
	public WebElement matchIndustry;
	
	@FindBy(id="matchMeAgentSubmit")
	public WebElement matchAgentSubmit;
	
	@FindBy(id="btnCloseWhitePaper")
	public WebElement matchCloseButton;
	
	@FindBy(id="QID10-1-label")
	public WebElement checkBox;
	
	@FindBy(id="QR\\~QID2")
	public WebElement feedbackMessage;
	
	@FindBy(id="QID3-1-label")
	public WebElement feedbackInsurer;
	
	@FindBy(id="QID4-1-label")
	public WebElement feedbcakOftenVisit;
	
	@FindBy(id="QID5-1-label")
	public WebElement feedbackPurpose;
	
	@FindBy(id="QID6-1-label")
	public WebElement feedbackAccomplish;
	
	@FindBy(id="NextButton")
	public WebElement feedbackSubmit;
	
	@FindBy(id="QSIFeedbackButton-close-btn")
	public WebElement feedbcakClose;
	
	@FindBy(id="QSIFeedbackButton-survey-iframe")
	public WebElement iFrame;
	
	
	public ContactUs(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement contactCLick() {
		WaitforElementToBeVisible(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Contact')]"));
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Contact')]"));
	}
	
	
	
	public WebElement findAnAgent() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Find an Agent')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Find an Agent')]"));
	}
	
	public WebElement agentZipcode() {
		WaitforElementToBeVisible(By.xpath("//input[@id='zipCode']"));
		return driver.findElement(By.xpath("//input[@id='zipCode']"));
	}
	
	public WebElement searchPagination() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\\\"cnaPagination\\\"]/label/span[4]"));
		return driver.findElement(By.xpath("//*[@id=\"cnaPagination\"]/label/span[4]"));
	}
	
	public WebElement zipCodevalidatioMessage() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"footerALMFormErrMsg\"]"));
		return driver.findElement(By.xpath("//*[@id=\"footerALMFormErrMsg\"]"));
	}
	
	public WebElement matchtoagent() {
		WaitforElementToBeVisible(By.xpath("//div[contains(text(),'MATCH ME TO AN AGENT')]"));
		return driver.findElement(By.xpath("//div[contains(text(),'MATCH ME TO AN AGENT')]"));
	}
	
	public WebElement checkbox() {
		//WaitforElementToBeVisible(By.cssSelector("QID1-1-label"));
		return (WebElement) driver.switchTo().frame(driver.findElement(By.cssSelector("QID1-1-label")));
	}

}
