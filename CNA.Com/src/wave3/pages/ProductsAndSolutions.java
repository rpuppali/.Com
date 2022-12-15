package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsAndSolutions extends BasePage{
	
	@FindBy(id="subNavbarDiv_productsandservices")
	public WebElement productSub;
	
	@FindBy(id="CTAQuoteFormLink")
	public WebElement getAQuote;
	
	@FindBy(id="beginQuotebutton")
	public WebElement getAQUoteToday;
	
	

	public ProductsAndSolutions(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement productsLink() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Products & Solutions')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Products & Solutions')]"));
	}
	
	public WebElement readMore() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_productsandservices > div.col-md-5.col-sm-5.subNavbarLeftContent.mHide > a"));
		return driver.findElement(By.cssSelector("#subNavBar_productsandservices > div.col-md-5.col-sm-5.subNavbarLeftContent.mHide > a"));
	}
	
	public WebElement businessZipValidationMessage() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[2]/p"));
		return driver.findElement(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[2]/p"));
	}
	
	public WebElement emailValidationMessage() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[3]/p"));
		return driver.findElement(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[3]/p"));
	}
	
	public WebElement productValidationMessage() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[4]/p"));
		return driver.findElement(By.xpath("//*[@id=\"eligibilityRightContent\"]/div[4]/p"));
	}

}
