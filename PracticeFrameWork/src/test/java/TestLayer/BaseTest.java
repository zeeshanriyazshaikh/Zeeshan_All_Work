package TestLayer;

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

import ApplicationLayer.HomePage;
import ApplicationLayer.LoginPage;
import UtilityLayer.Implementation.CommonDriver;
import UtilityLayer.Reporting.ConfigReport;
import UtilityLayer.Reporting.Report;
import UtilityLayer.Reporting.ScreenShot;

public class BaseTest {
	WebDriver driver;
	String currentWorkingDirectory;
	String configFile;
	Properties configProperty;
	String htmlReport;
	CommonDriver commonDriver;
	ScreenShot screenShot;
	Report report;
	String testCaseName;
	String screenShotFile;
	LoginPage loginPage;
	String browser;
	String url;
	//HomePage homePage;
@BeforeSuite
public void preSetUp() throws IOException {
	currentWorkingDirectory = System.getProperty("user.dir");
	configFile=currentWorkingDirectory + "/Config/config.properties";
	configProperty=ConfigReport.readproperty(configFile);
	htmlReport=currentWorkingDirectory + "/ExtentReport/report.html";
	report = new Report(htmlReport);
}
@BeforeClass
public void setUp() throws Exception {
	browser=configProperty.getProperty("browser");
	url=configProperty.getProperty("url");
	commonDriver = new CommonDriver(browser);
	commonDriver.navigateToUrl(url);
	driver=commonDriver.getDriver();
	loginPage= new LoginPage(driver);
	
	screenShot=new ScreenShot(driver);

	
	
}
@AfterMethod
public void captureIfTestFails(ITestResult result) throws Exception {
	testCaseName=result.getName();
	long executionTime=System.currentTimeMillis();
	screenShotFile=currentWorkingDirectory + "/ScreenShot/" + 	testCaseName + executionTime + ".jpeg";
	if(result.getStatus()==ITestResult.FAILURE) {
		screenShot.captureScreentShotAndSave(screenShotFile);
		report.addLogs(Status.FAIL, "one or more steps failed");
		report.addScreenShotToReport(screenShotFile);;
	}
}
@AfterClass
public void tearDown() {
	commonDriver.closeBrowsers();
}
@AfterSuite
public void postTearDown() {
	report.flushReport();
}
}
