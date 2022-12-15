package wave3.pages;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver , long timeout ) {
		super(driver, timeout);
	}

	public WebElement txtCID() {
		WaitforElementToBeVisible(By.name("username"));
		return driver.findElement(By.name("username"));
	}

	public WebElement txtPassword() {
		WaitforElementToBeVisible(By.name("password"));
		return driver.findElement(By.name("password"));
	}

	public WebElement btnLogin() {
		WaitforElementToBeVisible(By.name("login"));
		return driver.findElement(By.name("login"));
	}
	
	public WebElement reportCliam() {
		WaitforElementToBeVisible(By.xpath("//a[@id='BtnFileAClain']"));
		return driver.findElement(By.xpath("//a[@id='BtnFileAClain']"));
	}
	
	public WebElement IgnorePopup() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'NO')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'NO')]"));

	}
	public void navigateToElement(WebElement ele){
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)",ele);
		je.executeScript("javascript:window.scrollBy(0,-150)");
	}
	
	public void navigateToElementAt(WebElement ele){
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)",ele);
		je.executeScript("javascript:window.scrollBy(0,-250)");
	}
}
