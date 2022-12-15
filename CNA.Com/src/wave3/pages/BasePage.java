package wave3.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import wave3.reports.ExtentTestManager;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait driverWait;
	private long timeOut;
	
	@FindBy(id="printCBtn")
	public WebElement printButton;
	
	@FindBy(id="printCBtn1")
	public WebElement printButton1;
	
	@FindBy(id="printButtonId")
	public WebElement printButtonIcon;
	
	@FindBy(id="sharepanel")
	public WebElement sharepanel;
	
	@FindBy(id="linkedInButtonId")
	public WebElement linkedInButton;
	
	@FindBy(id="twitterButtonId")
	public WebElement twitterIdButton;
	
	@FindBy(id="shareemail")
	public WebElement shareEmailButton;
	
	@FindBy(id="printButtonId")
	public WebElement printIdButton;
	
	@FindBy(id="E-senderemail")
	public WebElement recipientEmail;
	
	@FindBy(id="E-senderCCemail")
	public WebElement senderEmail;
	
	@FindBy(id="firstName")
	public WebElement senderFirstName;
	
	@FindBy(id="lastName")
	public WebElement sendLastName;
	
	@FindBy(id="E-text")
	public WebElement message;
	
	@FindBy(id="btnCloseEmailWhitePaper")
	public WebElement thankYouClose;
	
	
	@FindBy(id="ebtnSubmit")
	public WebElement emailSubmit;
	
	@FindBy(id="btnPrintC")
	public WebElement directBillPrintButton;
	
	

	public BasePage(WebDriver driver, long timeout) {
		this.driver = driver;
		driverWait = new WebDriverWait(driver, timeout);
	//	timeOut = timeout;
	}
	public String GetURL() {
		return driver.getCurrentUrl();
	}
	
	public boolean printAndShareIcon() {
		boolean print =printButton1.isDisplayed();
		boolean share = sharepanel.isDisplayed();
		return print && share;
	}
	
	public boolean printIcon() {
		boolean print =printButtonIcon.isDisplayed();
		
		return print ;
	}
	
	public boolean printAndShareIcon_Discliamer() {
		boolean print =printButton.isDisplayed();
		return print ;
	}
	public boolean socialIcon() {
		boolean linkedIn = linkedInButton.isDisplayed();
		boolean twitter = twitterIdButton.isDisplayed();
		boolean print =printIdButton.isDisplayed();
		boolean share = shareEmailButton.isDisplayed();
		return linkedIn && twitter && print&& share;
	}
	
	public boolean socialIconLandingPage() {
		boolean linkedIn = linkedInButton.isDisplayed();
		boolean twitter = twitterIdButton.isDisplayed();
		boolean share = shareEmailButton.isDisplayed();
		return linkedIn && twitter  && share;
	}
	public WebElement linkedInButton() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"linkedInButtonId\"]/i"));
		return driver.findElement(By.xpath("//*[@id=\"linkedInButtonId\"]/i"));
	}
	
	public WebElement printIdButtonN() {
		WaitforElementToBeVisible(By.xpath("//*[@class='glyphicon glyphicon-print fa-sm']"));
		return driver.findElement(By.xpath("//*[@class='glyphicon glyphicon-print fa-sm']"));
	}
	public WebElement twitteridButton() {
		WaitforElementToBeVisible(By.xpath("//*[@id=\"twitterButtonId\"]/i"));
		return driver.findElement(By.xpath("//*[@id=\"twitterButtonId\"]/i"));
	}

	public String GetTitle() {
		return driver.getTitle();
	}

	public void Hold(int holdInMilliseconds) throws InterruptedException {
		Thread.sleep(holdInMilliseconds);
	}

	public void Click(WebElement webElement) throws InterruptedException {
		By by = GetByFromElement(webElement);
		long remainingTime = timeOut;
		while (remainingTime >= 0) {
			try {
				driver.findElement(by).click();
				return;
			} catch (StaleElementReferenceException ex) {
				ex.printStackTrace();
			} catch (NoSuchElementException ex) {
				ex.printStackTrace();
			}
			Thread.sleep(500);
			remainingTime = remainingTime - TimeUnit.MILLISECONDS.toSeconds(500);
		}
	}

	private By GetByFromElement(WebElement element) {
		By by = null;
		String[] pathVariables = (element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":", 2);
		String selector = pathVariables[0].trim();
		String value = pathVariables[1].trim();

		switch (selector) {
		case "id":
			by = By.id(value);
			break;
		case "className":
			by = By.className(value);
			break;
		case "tagName":
			by = By.tagName(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "cssSelector":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			throw new IllegalStateException("locator : " + selector + " not found!!!");
		}
		return by;
	}

	public void WaitforElementToBeVisible(By locator) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void WaitforElementToBeVisible(WebElement webElement) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(webElement));
	}

	public void WaitForElementTobeClickable(By locator) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}
	

	public void WaitForElementTobeClickable(WebElement webElement) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public boolean VerifyElementDisplayed(WebElement element) {
		if (element != null) {
			return element.isDisplayed();
		}
		return false;
	}

	public boolean VerifyElementEnabled(WebElement element) {
		if (element != null) {
			return element.isEnabled();
		}
		return false;
	}

	public boolean VerifyElementSelected(WebElement element) {
		if (element != null) {
			return element.isSelected();
		}
		return false;
	}

	public void ClickThroughJS(WebElement element) {
		if (element != null) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			
		}
	}

}
