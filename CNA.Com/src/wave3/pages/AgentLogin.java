package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AgentLogin extends BasePage{

	public AgentLogin(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement agentLogin() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Agent Login')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Agent Login')]"));
	}

}
