package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierDiversityForm extends BasePage
{
	
	@FindBy(id="firstName")
	public WebElement registerFirstName;
	
	@FindBy(id="companyName")
	public WebElement registerCompanyName;
	
	@FindBy(id="contactEmail")
	public WebElement registerEmail;
	
	@FindBy(id="descriptionOfService")
	public WebElement registerDescription;
	
	@FindBy(id="vendorTinNUM")
	public WebElement registerTinNum;
	
	@FindBy(id="lastName")
	public WebElement registerLastName;
	
	@FindBy(id="vendorCcontactPhone")
	public WebElement registerPhone;
	
	@FindBy(id="vendorIsFemale")
	public WebElement vendorFemale;
	
	@FindBy(id="vendorRegSubmit")
	public WebElement vendorSubmit;
	
	@FindBy(id="btnCloseWhitePaper")
	public WebElement thanksAndCloseButton;

	public SupplierDiversityForm(WebDriver driver, long timeout) {
		super(driver, timeout);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement registerButton() {
		WaitforElementToBeVisible(By.xpath("//div[contains(text(),'REGISTER')]"));
		return driver.findElement(By.xpath("//div[contains(text(),'REGISTER')]"));
	}
	
	public WebElement disclaimerText() {
		WaitforElementToBeVisible(By.cssSelector("#vendorRegistrationForm > div:nth-child(14) > div > p"));
		return driver.findElement(By.cssSelector("#vendorRegistrationForm > div:nth-child(14) > div > p"));
	}

}
