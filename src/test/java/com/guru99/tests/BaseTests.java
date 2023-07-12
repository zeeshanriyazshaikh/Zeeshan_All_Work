package com.guru99.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;

import commonLib.implementation.CommonDriver;
import commonLib.utils.ConfigUtils;
import commonLib.utils.ReportUtils;
import commonLib.utils.ScreenshotUtils;

public class BaseTests {
	
	String currentWorkingDirectory;
	String configFileName;
	Properties configProperty;
	String reportFileName;
	ReportUtils reportUtils;
	
	CommonDriver cmndriver;
	String url;
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	
	
	
	
	
	
	ScreenshotUtils screenshot;
	
	@BeforeSuite
	public void preSetup() throws IOException {
		currentWorkingDirectory = System.getProperty("user.dir");
		
		configFileName = currentWorkingDirectory + "/config/config.properties";
		configProperty  = ConfigUtils.readProperties(configFileName); //ConfigUtils here is class and readProperties is static method in configutils class and as it is a static method we can call directly as ConfigUtils.readProperties,and in constructor filename is actual config.properties location that will get pass in constructor of configutils methods constructor
		
		reportFileName = currentWorkingDirectory + "/reports/guru99TestReport.html";
		reportUtils = new ReportUtils(reportFileName); //sending html file with name to report utils class constructor
		
	}
	
@BeforeMethod
public void setUp() throws Exception{
	
	url = configProperty.getProperty("baseUrl"); //url = "http://demo.guru99.com/v4";
	String browserType = configProperty.getProperty("browserType");
	
	cmndriver=new CommonDriver(browserType);  //creating common driver instance and passing browserType readed from config properties in constructor
	
	driver=cmndriver.getDriver();       //cmndriver is common driver class instance to call get driver method which we had made by setting getters to driver
	
	loginpage = new LoginPage(driver);   //creating login page instance and passing driver in constructor
	
	homepage = new HomePage(driver);
	
	screenshot = new ScreenshotUtils(driver); //screenshot initialization of ScreenshotUtils class
	
	cmndriver.navigateToUrl(url);
}
@AfterMethod
public void postTestAtion(ITestResult result) throws Exception { //this logic will execute after each test case run,ITestResult store result of each test case
	
	String testcasename = result.getName(); //it will store verifyUserLoginWithCorrectCredentials test case method name so that we can use below for screen shot
	
	long executionTime = System.currentTimeMillis();
	
	String screenshotFilename = currentWorkingDirectory + 
			"/screenshots/"
			+ testcasename + executionTime +".jpeg";//we are creating jpeg file in screenshot folder with testcasename and execution time,to distinguish file name
	if(result.getStatus() == ITestResult.FAILURE){
		
	reportUtils.addTestLogs(Status.FAIL, "one or more steps failed");
	screenshot.captureAndSaveScreenshot(screenshotFilename); // captureAndSaveScreenshot is custom method to take screen shot and save in img file instance constructor to pass output file in screenshot folder filename
	reportUtils.attachScreenshotToReport(screenshotFilename); //
	}
}

@AfterClass
public void tearDown() {
	
	cmndriver.closeAllBrowsers();  //closeAllBrowsers method in common driver class to close browser
}


@AfterSuite
public void postTearDown() {
	reportUtils.flushReport();
}

}
