package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Disclaimer_POM extends BasePage{
	
	@FindBy(id="BtnCookiesXout")
	public WebElement cookieButton;

	public Disclaimer_POM(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement privacyStatement() {
		WaitforElementToBeVisible(By.cssSelector("#heroImg > div.deskHeroImg.mHide > a > img"));
		return driver.findElement(By.cssSelector("#heroImg > div.deskHeroImg.mHide > a > img"));
	}
}
