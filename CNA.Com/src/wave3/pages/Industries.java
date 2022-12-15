package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Industries extends BasePage {
	
	
	@FindBy(id="heroImg")
	public WebElement heroImage;
	
	
	@FindBy(id="headLineId")
	public WebElement headLine;

	public Industries(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement industryLink() {
		WaitforElementToBeVisible(By.xpath("//a[@id='subNavbarDiv_industries']"));
		return driver.findElement(By.xpath("//a[@id='subNavbarDiv_industries']"));
	}
	
	public WebElement industrySubLink() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_industries > div.col-md-7.col-sm-7.subNavbarRightContent > ul:nth-child(1) > li:nth-child(1) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_industries > div.col-md-7.col-sm-7.subNavbarRightContent > ul:nth-child(1) > li:nth-child(1) > a"));
	}												
	
	public WebElement heroImage() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\\\"heroImg\\\"]/div/a/img"));
		return driver.findElement(By.xpath("//*[@id=\\\"heroImg\\\"]/div/a/img"));
	}
	
	public WebElement heroText() {
		WaitforElementToBeVisible(By.cssSelector("//*[@id=\"divToPrint\"]/div[1]/div[2]/div"));
		return driver.findElement(By.cssSelector("//*[@id=\"divToPrint\"]/div[1]/div[2]/div"));
	}
	
	public WebElement readMoreLink() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_industries > div.col-md-5.col-sm-5.subNavbarLeftContent.mHide > a"));
		return driver.findElement(By.cssSelector("#subNavBar_industries > div.col-md-5.col-sm-5.subNavbarLeftContent.mHide > a"));
	}
	
	public WebElement readMoreLinkN() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Read More')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Read More')]"));
	}
	
	public WebElement headLineN() {
		WaitforElementToBeVisible(By.xpath("//input[@id='headLineId']"));
		return driver.findElement(By.xpath("//input[@id='headLineId']"));
	}
	

}
