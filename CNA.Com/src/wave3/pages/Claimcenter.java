package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Claimcenter extends BasePage {

	public Claimcenter(WebDriver driver, long timeout) {
		super(driver, timeout);
		}
	public WebElement claimcenterCLick() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Claim Center')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Claim Center')]"));
	}

}
