package wave3.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class CNABaseUtil {

	protected WebDriver driver;
	protected WebDriverWait driverWait;
	protected Actions seleniumActions;
	
	public CNABaseUtil(WebDriver driver, long timeout) {
		this.driver = driver;
		driverWait = new WebDriverWait(driver, timeout);
		seleniumActions = new Actions(driver);
	}

	public void WaitforElementToBeVisible(By locator) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void WaitforElementToBeVisible(WebElement webElement,By locator) {
	
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(webElement));
	}

	public void WaitForElementTobeClickable(By locator) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void WaitForElementTobeClickable(WebElement webElement) {
		driverWait.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public String TakeScreenShot(String sreenshotName) throws IOException {
		String targetLocation = null;
		String timeStamp = new SimpleDateFormat("MMddyyyy_HHmmss").format(new Date());
		String screenShotName = sreenshotName + timeStamp + ".png";
		String fileSeperator = System.getProperty("file.separator");
		String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator + "screenshots";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		targetLocation = reportsPath + fileSeperator + screenShotName;
		File targetFile = new File(targetLocation);
		FileHandler.copy(screenshotFile, targetFile);
		return "screenshots" + fileSeperator + screenShotName;
	}

}
