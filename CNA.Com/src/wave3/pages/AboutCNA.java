package wave3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutCNA extends BasePage{
	
	@FindBy(id="hiddenRecordCount")
	public WebElement count;
	
	@FindBy(id="printCBtn1")
	public WebElement printButton;
	
	@FindBy(id="IN")
	public WebElement international;
	
	@FindBy(id="NA")
	public WebElement unitedStates;
	
	@FindBy(id="leaderListWrapper")
	public WebElement listWrapper;
	
	@FindBy(id="abtcheck")
	public WebElement clickApplyNow;
	
	
	
	public AboutCNA(WebDriver driver, long timeout) {
		super(driver,timeout);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement aboutCNA() {
		WaitforElementToBeVisible(By.xpath("//span[contains(text(),'About CNA')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'About CNA')]"));
	}
	
	public WebElement aboutCNALocations() {
		WaitforElementToBeVisible(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(1) > a"));
		return driver.findElement(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(1) > a"));
	}
	
	
	
	public WebElement management() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Management')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Management')]"));
	
	}
	
	public WebElement Executive_committee() {
		WaitforElementToBeVisible(By.xpath("//li[contains(text(),'Executive Committee')]"));
		return driver.findElement(By.xpath("//li[contains(text(),'Executive Committee')]"));
	}
	
	public WebElement LedershipTeam() {
		WaitforElementToBeVisible(By.xpath("//li[contains(text(),'Leadership Team')]"));
		return driver.findElement(By.xpath("//li[contains(text(),'Leadership Team')]"));
	}
	
	public WebElement Recipient_mail() {
		WaitforElementToBeVisible(By.id("E-senderemail"));
		return driver.findElement(By.id("E-senderemail"));
	}
	
	public WebElement Sender_Mail() {
		WaitforElementToBeVisible(By.id("E-senderCCemail"));
		return driver.findElement(By.id("E-senderCCemail"));
	}
	
	public WebElement Sender_Fname() {
		WaitforElementToBeVisible(By.id("firstName"));
		return driver.findElement(By.id("firstName"));
	}
	public WebElement Sender_Sname() {
		WaitforElementToBeVisible(By.id("lastName"));
		return driver.findElement(By.id("lastName"));
	}
	public WebElement MailIcon() {
		WaitforElementToBeVisible(By.id("shareemail"));
		return driver.findElement(By.id("shareemail"));
	}
	
	public WebElement ContinueButton() {
		WaitforElementToBeVisible(By.id("BtnCookiesXout"));
		return driver.findElement(By.id("BtnCookiesXout"));
	}
	
	public WebElement InputField() {
		WaitforElementToBeVisible(By.id("E-text"));
		return driver.findElement(By.id("E-text"));
	}
	public WebElement SendMailbtn() {
		WaitforElementToBeVisible(By.id("ebtnSubmit"));
		return driver.findElement(By.id("ebtnSubmit"));
	}
	
	public WebElement More() {
		WaitforElementToBeVisible(By.xpath("//div[@class='btn_MORE']"));
		return driver.findElement(By.xpath("//div[@class='btn_MORE']"));
	}
	
	public WebElement newsRoom() {
		WaitforElementToBeVisible(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(3) > a"));
		return driver.findElement(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(3) > a"));
	}
	
	public WebElement socialResponsibility() {
		WaitforElementToBeVisible(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(4) > a"));
		return driver.findElement(By.cssSelector("#navbar > ul > li.active > ul > li:nth-child(4) > a"));
	}
	
	public WebElement pagination() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"cnaPagination\"]/div/span[4]"));
		return driver.findElement(By.xpath("//*[@id=\"cnaPagination\"]/div/span[4]"));
	}
	
	public WebElement aboutLocations() {
		WaitforElementToBeVisible(By.cssSelector("#levelA > a:nth-child(2) > div > div.rowCopy > h3"));
		return driver.findElement(By.cssSelector("#levelA > a:nth-child(2) > div > div.rowCopy > h3"));
	}
	
	public WebElement aboutManagement() {
		WaitforElementToBeVisible(By.cssSelector("#levelA > a:nth-child(4) > div > div.rowCopy > h3"));
		return driver.findElement(By.cssSelector("#levelA > a:nth-child(4) > div > div.rowCopy > h3"));
	}
	
	public WebElement aboutNewsroom() {
		WaitforElementToBeVisible(By.cssSelector("#levelA > a:nth-child(5) > div > div.rowCopy > h3"));
		return driver.findElement(By.cssSelector("#levelA > a:nth-child(5) > div > div.rowCopy > h3"));
	}
	
	public WebElement aboutCorporateResponsibility() {
		WaitforElementToBeVisible(By.cssSelector("#levelA > a:nth-child(6) > div > div.rowCopy > h3"));
		return driver.findElement(By.cssSelector("#levelA > a:nth-child(6) > div > div.rowCopy > h3"));
	}
	
	public WebElement Careers() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Careers')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
	}
	public WebElement PressRelease() {
		WaitforElementToBeVisible(By.xpath("//a[contains(text(),'Press Releases')]"));
		return driver.findElement(By.xpath("//a[contains(text(),'Press Releases')]"));
	}
	public WebElement MediaContact() {
		WaitforElementToBeVisible(By.xpath("(//div[@class='colBody'])[1]"));
		return driver.findElement(By.xpath("(//div[@class='colBody'])[1]"));
	}
	
	public WebElement directBill() {
		WaitforElementToBeVisible(By.cssSelector("#homeArticleSection_SA-HomeRow2_2 > div.notFullImg > div > p.homeArticleHeadline > a"));
		return driver.findElement(By.cssSelector("#homeArticleSection_SA-HomeRow2_2 > div.notFullImg > div > p.homeArticleHeadline > a"));
	}
	
	public WebElement careersAtCNA() {
		WaitforElementToBeVisible(By.cssSelector("#homeArticleSection_SA-HomeRow5_1 > div.notFullImg > div > p.homeArticleHeadline > a"));
		return driver.findElement(By.cssSelector("#homeArticleSection_SA-HomeRow5_1 > div.notFullImg > div > p.homeArticleHeadline > a"));
	}
	
	
	
}
