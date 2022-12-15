package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentCenter extends BasePage {
	
	@FindBy(id="userId")
	public WebElement agentLoginUsername;
	
	@FindBy(id="password")
	public WebElement agentLoginPassword;
	
	@FindBy(id="btnGo2")
	public WebElement agentLoginButton;
	
	
	@FindBy(id="subNavbarDiv_agentlogin")
	public WebElement agentLogin;
//#CAT-Corporate\ Capabilities 
	public AgentCenter(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement cnaCentral() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"subNavbarDiv_agentlogin\"]/span[1]"));
		return driver.findElement(By.xpath("//*[@id=\"subNavbarDiv_agentlogin\"]/span[1]"));
	}
	
	public WebElement cna_CentralLink() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[1]/a"));
		return driver.findElement(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[1]/a"));
	}
	
	public WebElement lawyersInsurance() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[3]/a"));
		return driver.findElement(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[3]/a"));
	}
	
	public WebElement appetite() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"bloc2\"]/a"));
		return driver.findElement(By.xpath("//*[@id=\"bloc2\"]/a"));
	}
	
	public WebElement surety() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[4]/a"));
		return driver.findElement(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[4]/a"));
	}
	
	public WebElement agentCenterClick() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[2]/a"));
		return driver.findElement(By.xpath("//*[@id=\"subNavBar_agentlogin\"]/div[2]/ul/li[2]/a"));
	}
	public WebElement applicationAndMarketing() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"bloc3\"]/a"));
		return driver.findElement(By.xpath("//*[@id=\"bloc3\"]/a"));
	}
	
	public WebElement applicationOption1() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"CAT-Corporate Capabilities\"]"));
		return driver.findElement(By.xpath("//*[@id=\"CAT-Corporate Capabilities\"]"));
	}
	
	public WebElement applicationOption2() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"CAT-Construction\"]"));
		return driver.findElement(By.xpath("//*[@id=\"CAT-Construction\"]"));
	}
	
	public WebElement agentLogin() {
		WaitforElementToBeVisible(By.xpath("//input[@id='userId']"));
		return driver.findElement(By.xpath("//input[@id='userId']"));
	}
}
