package wave3.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver, long timeout) {
		super(driver, timeout);
		// TODO Auto-generated constructor stub
	}

	public WebElement Search_results() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),' claim ')]"));
		return  driver.findElement(By.xpath("//span[contains(text(),' claim ')]"));	
	}
	public WebElement Search_products() {
		WaitforElementToBeVisible(By.xpath("//span[@class='productsTab']"));
		return  driver.findElement(By.xpath("//span[@class='productsTab']"));	
	}
	public WebElement Drop_down() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		return driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));	
	}

}
