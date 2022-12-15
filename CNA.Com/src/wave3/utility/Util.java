package wave3.utility;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import wave3.pages.LoginPage;
import wave3.reports.ExtentTestManager;

public class Util extends CNABaseUtil {

	private LoginPage loginPage;

	public Util(WebDriver driver, long timeout) throws InterruptedException {
		super(driver, timeout);
		loginPage = new LoginPage(driver, timeout);

	}

	public String LoginToEPC(String userName, String password) throws InterruptedException {
		loginPage.txtCID().sendKeys(userName);
		ExtentTestManager.getTest().log(Status.PASS, "User name is entered");
		loginPage.txtPassword().sendKeys(password);
		ExtentTestManager.getTest().log(Status.PASS, "Password is entered");
		loginPage.btnLogin().click();
		ExtentTestManager.getTest().log(Status.PASS, "Login button is clicked");
		return loginPage.GetTitle();
	}
	public void ignorePopup(){                          
		String Ignorepoup="//span[contains(text(),'NO')]";
        try {
            for(int i=0; i< 2 ;i++){
                try {
                    if(!driver.findElements(By.xpath(Ignorepoup)).isEmpty())            {
                        try {
                            driver.findElement(By.xpath(Ignorepoup)).click();
                        } catch (NoSuchElementException e) {
                            e.printStackTrace();
                        }
                    }

                    else{
                        try {
                            System.out.println("no element found ");
                        } catch (NoSuchElementException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (NoSuchElementException e) {
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
public void ignoreSurveyPopup(WebElement clickElement) throws InterruptedException {
	System.out.println("Window handle - > " );
	driver.findElement(By.xpath("//span[contains(text(),'NO')]")).sendKeys(Keys.TAB);
	for(int i = 0; i < 3; i++)
	{
	clickElement.click();
	Thread.sleep(3000);
	}
	 
	Set<String> allWindowHandles = driver.getWindowHandles();
	 
	for(String handle : allWindowHandles)
	{
	System.out.println("Window handle - > " + handle);
	}
	 
	}

	 
}
