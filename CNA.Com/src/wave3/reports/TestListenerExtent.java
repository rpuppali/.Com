//package wave3.reports;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//
//public class TestListenerExtent implements ITestListener {
//
//	public void onStart(ITestContext context) {
//		System.out.println("*** Test Suite " + context.getName() + " started ***");
//	}
//
//	public void onFinish(ITestContext context) {
//		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
//		ExtentManager.getInstance().flush();
//		ExtentTestManager.endTest();
//	}
//
//	public void onTestStart(ITestResult result) {
//		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
//		ExtentTestManager.startTest(result.getMethod().getMethodName());
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
//		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
//	}
//
//	public void onTestFailure(ITestResult result) {
//		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
//
//		ITestContext context = result.getTestContext();
//		WebDriver driver = (WebDriver) context.getAttribute("driver");
//
//		String targetLocation = null;
//
//		String testClassName = result.getInstanceName().trim();
//		String timeStamp = new SimpleDateFormat("MMddyyyy_HHmmss").format(new Date());
//		String testMethodName = result.getName().toString().trim();
//		String screenShotName = testMethodName + timeStamp + ".png";
//		String fileSeperator = System.getProperty("file.separator");
//		String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator + "screenshots";
//		String relativeTargetLocation = "screenshots" + fileSeperator + testClassName + fileSeperator + screenShotName;
//		System.out.println("Screen shots reports path - " + reportsPath);
//		try {
//			File file = new File(reportsPath + fileSeperator + testClassName);
//			if (!file.exists()) {
//				if (file.mkdirs()) {
//					System.out.println("Directory: " + file.getAbsolutePath() + " is created!");
//				} else {
//					System.out.println("Failed to create directory: " + file.getAbsolutePath());
//				}
//			}
//
//			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			targetLocation = reportsPath + fileSeperator + testClassName + fileSeperator + screenShotName;
//
//			File targetFile = new File(targetLocation);
//			System.out.println("Screen shot file location - " + screenshotFile.getAbsolutePath());
//			System.out.println("Target File location - " + targetFile.getAbsolutePath());
//			FileHandler.copy(screenshotFile, targetFile);
//
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found exception occurred while taking screenshot " + e.getMessage());
//		} catch (Exception e) {
//			System.out.println("An exception occurred while taking screenshot " + e.getCause());
//		}
//		try {
//			ExtentTestManager.getTest().fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(relativeTargetLocation).build());
//		} catch (IOException e) {
//			System.out.println("An exception occured while taking screenshot " + e.getCause());
//		}
//		ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable());
//		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
//		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
//	}
//
//}
