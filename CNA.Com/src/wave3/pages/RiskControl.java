package wave3.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RiskControl extends BasePage{
	
	@FindBy(id="levelBWrapper")
	public WebElement contentArea;

	public RiskControl(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement continuebutton() {
		WaitforElementToBeVisible(By.id("BtnCookiesXout"));
		return driver.findElement(By.id("BtnCookiesXout"));
	}
	@FindBy(id="search-button")
	public WebElement searchButton;
	
	@FindBy(id="topSearch")
	public WebElement topSearch;
	public void verify_Sortbycolor() {
		String SortbyColor = sortby().getCssValue("color"); //rgba=147, 148, 149, 1
		String SortbyFont = sortby().getCssValue("font-family");
		System.out.println(SortbyFont);
		String[] hexValue = SortbyColor.replace("rgba(", "").replace(")", "").split(",");
		System.out.println(hexValue);
		hexValue[0] = hexValue[0].trim();
		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);
		String actualcolor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println(actualcolor);
		Assert.assertTrue(actualcolor.equals("#939495"));
	}
	public void HrLogin_page() {
		if(Credential_Tab().isDisplayed()) {
			Credential_Tab().sendKeys("Ravi", "1234");
		}
	}
	public void navigateToElement(WebElement ele){
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)",ele);
		je.executeScript("javascript:window.scrollBy(0,-150)");
	}
	public WebElement FeedBackButton() {
		WaitforElementToBeVisible(By.xpath("//button[@id='QSIFeedbackButton-btn']"));
		return driver.findElement(By.xpath("//button[@id='QSIFeedbackButton-btn']"));
	}
	public List<WebElement> dropDownValue() {
		WaitforElementToBeVisible(By.xpath("//span[contains(@class,'glyphicon glyphicon-menu-down')]"));
		return (List<WebElement>) driver.findElement(By.xpath("//span[contains(@class,'glyphicon glyphicon-menu-down')]"));
	}
	public WebElement Topics() {
		WaitforElementToBeVisible(By.xpath("//label[contains(text(),'Topics')]"));
		return driver.findElement(By.xpath("//label[contains(text(),'Topics')]"));
	}
	public WebElement Credential_Tab() {
		WaitforElementToBeVisible(By.xpath("//input[@id='login-userid']|.//input[@id='login-userpwd']"));
		return driver.findElement(By.xpath("//input[@id='login-userid']|.//input[@id='login-userpwd']"));
		
	}
	public WebElement sortby() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Sort by:')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Sort by:')]"));
	}
	public WebElement SearchProducts() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[2]"));
		return driver.findElement(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[2]"));
	}
	public WebElement Searchindustries() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[4]"));
		return driver.findElement(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[4]"));
	}
	public WebElement Searchapplications() {
		WaitforElementToBeVisible(By.xpath("//a[@class='tab-items cna-search-tab-list active']"));
		return driver.findElement(By.xpath("//a[@class='tab-items cna-search-tab-list active']"));
	}
	public WebElement Searchnews() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[5]"));
		return driver.findElement(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[5]"));
	}
	public WebElement Searchsolutions() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[6]"));
		return driver.findElement(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[6]"));
	}
	public WebElement SearchRiskcontrol() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'Risk Control (43)')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Risk Control (43)')]"));
	}
	public WebElement Riskcontrol() {
		WaitforElementToBeVisible(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[3]"));
		return driver.findElement(By.xpath("(//a[@class='tab-items cna-search-tab-list'])[3]"));
	}
	
	public WebElement riskControl() {
		WaitforElementToBeVisible(By.cssSelector("#subNavbarDiv_managerisk"));
		return driver.findElement(By.cssSelector("#subNavbarDiv_managerisk"));
	}
	public WebElement readmore() {
		WaitforElementToBeVisible(By.xpath("(//a[contains(text(),'Read More ')])[3]"));
		return driver.findElement(By.xpath("(//a[contains(text(),'Read More ')])[3]"));
	}
	public WebElement beyond_hr() {
		WaitforElementToBeVisible(By.xpath("(//a[contains(text(),'Beyond HR')])[1]"));
		return driver.findElement(By.xpath("(//a[contains(text(),'Beyond HR')])[1]"));
	}
	public WebElement AlliedVendorProgram() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(3) > a"));
		return  driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(3) > a"));
	}
	
	public WebElement riskRelatedToProperty() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(2) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(2) > a"));
	}
	
	public WebElement riskRelatedToProfessional() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(3) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(3) > a"));
	}
	
	public WebElement riskRelatedtoAlliedResource() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(2) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(2) > a"));
	}
	
	public WebElement riskRelatedtoCNABlog() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(2) > ul > li:nth-child(2) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(2) > ul > li:nth-child(2) > a"));
	}
	
	
	public WebElement riskRelatedtoSorce() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(2) > ul > li:nth-child(1) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(2) > ul > li:nth-child(1) > a"));
	}
	public WebElement riskRelatedtoCapailities() {
		WaitforElementToBeVisible(By.xpath("(//a[contains(text(),'Industry & Product Capabilities')])[1]"));
		return driver.findElement(By.xpath("(//a[contains(text(),'Industry & Product Capabilities')])[1]"));
	}
	
	public WebElement riskRelatedtoPrepwise() {
		WaitforElementToBeVisible(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(1) > a"));
		return driver.findElement(By.cssSelector("#subNavBar_managerisk > div.col-md-7.col-sm-7.subNavbarMiddleContent > div:nth-child(1) > ul > li:nth-child(1) > a"));
	}
}
