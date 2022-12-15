package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisclaimerFunctionality extends BasePage{
	
	
	@FindBy(id="BtnCookiesXout")
	public WebElement continueButton;

	public DisclaimerFunctionality(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stubdriver.findElement(By.xpath("//div[@id='BtnCookiesXout']"))
	}
	
	public WebElement continueButton() {
		WaitforElementToBeVisible(By.xpath("//div[@id='BtnCookiesXout']"));
		return driver.findElement(By.xpath("//div[@id='BtnCookiesXout']"));
	}
	
	public WebElement privacyStatement() {
		WaitforElementToBeVisible(By.xpath("//span[@id='PrivacyStatement']//a[contains(text(),'Privacy')]"));
		return driver.findElement(By.xpath("//span[@id='PrivacyStatement']//a[contains(text(),'Privacy')]"));
	}
	
	public WebElement backButton() {
		WaitforElementToBeVisible(By.xpath("//div[@id='btnbrwback']"));
		return driver.findElement(By.xpath("//div[@id='btnbrwback']"));
	}
	public WebElement conflictOfInterest() {
		WaitforElementToBeVisible(By.xpath("//span[@id='PrivacyStatement']//a[contains(text(),'Privacy')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Conflict of Interest')]"));
	}
	
	public WebElement licensing() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Licensing')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Licensing')]"));
	}
	
	public WebElement generalDIsclaimer() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'General Disclaimer')]"));
		return 	driver.findElement(By.xpath("//a[contains(text(),'General Disclaimer')]"));
	}
	
	public WebElement privacyPolicy() {
		WaitforElementToBeVisible(By.xpath("//span[@id='PrivacyPolicy']//a[contains(text(),'Privacy Policy')]"));
		return driver.findElement(By.xpath("//span[@id='PrivacyPolicy']//a[contains(text(),'Privacy Policy')]"));
	}
	
	public WebElement siteMap() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Sitemap')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]"));
	}
	
	public WebElement californiaResidents() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'California Resident Privacy Policy')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'California Resident Privacy Policy')]"));
	}
	
	public WebElement investorRelations() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Investor Relations')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Investor Relations')]"));
	}
	
	public WebElement payMyBill() {
		WaitforElementToBeVisible(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Pay My Bill')]"));
		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Pay My Bill')]"));
	}

}
