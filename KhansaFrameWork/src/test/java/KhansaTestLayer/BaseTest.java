package KhansaTestLayer;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

import KhansaCommonLibs.Implementation.CommonDriver;
import KhansaCommonLibs.Utility.ConfigUtils;
import KhansaCommonLibs.Utility.ReportUtils;
import KhansaCommonLibs.Utility.ScreenshotUtils;
import khansaApplicationLayer.LoginPage;

public class BaseTest {

	String currentWorkingDirectory;
	 String configFile;
	 Properties configProperty;
	String reportFile;
	ReportUtils reportUtils;
	String url;
	String browser;
	CommonDriver commonDriver;
	WebDriver driver;
	ScreenshotUtils screenshotUtils;
	LoginPage loginPage;

	
	
	@BeforeSuite
	public void preSetUp() throws IOException {
		
	currentWorkingDirectory = System.getProperty("user.dir");
	
	configFile=currentWorkingDirectory + "/ConfigFolder/config.properties";
	
	configProperty=ConfigUtils.readProperties(configFile);
		
	reportFile = currentWorkingDirectory + "/ExtentReports/reports.html";
	
	reportUtils = new ReportUtils(reportFile);
		}
	@BeforeClass
	public void setUp() throws Exception {
	url = 	configProperty.getProperty("url");
	browser = configProperty.getProperty("browser");
	
	commonDriver = new CommonDriver(browser);
	driver = commonDriver.getDriver();
	commonDriver.navigateToUrl(url);	
	screenshotUtils	= new ScreenshotUtils(driver);
	loginPage = new LoginPage(driver);
		
		
	}
	@AfterMethod
	public void postTesttation(ITestResult result) throws Exception {
		String testCaseName=result.getName();
		long executionTime = System.currentTimeMillis();
		String screenshotFile = currentWorkingDirectory + "/ScreenshotFolder/" + testCaseName + executionTime + ".jpeg";
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			reportUtils.addLogsToReports(Status.FAIL, "one or more steps failed");
			screenshotUtils.captureAndStoreTheScreenShot(screenshotFile);
			reportUtils.addScreenShotsToReport(screenshotFile);
			
		}
		
		
		
	}
	@AfterClass
	public void tearDown() {
		commonDriver.closeBrowsers();
	}
	@AfterSuite
	public void postTearDown(){
		reportUtils.flushTheReports();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
