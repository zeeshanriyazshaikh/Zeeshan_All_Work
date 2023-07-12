package commonLib.utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportUtils {
	
	ExtentHtmlReporter htmlReport;           //The ExtentHtmlReporter creates a rich stand alone HTML file. It allows several configuration options via the config() method.
	
ExtentReports extentReports;                //The ExtentReports report client for starting reporters and building reports//ExtentReports itself does not build any reports, but allows reporters to access information, which inturn build the said reports. An example of building an HTML report and adding information to ExtentX: 

ExtentTest extentTest;                      //Defines a test. You can add logs, snapshots, assign author and categories to a test and its children


public ReportUtils(String htmlReportFilename) {//constructor //htmlReportFilename coming from base test/before suite
	
	htmlReportFilename = htmlReportFilename.trim();
	
	htmlReport = new ExtentHtmlReporter(htmlReportFilename);
	
	extentReports = new ExtentReports();
	
	extentReports.attachReporter(htmlReport);//attachReporter Attach a ExtentReporter reporter, allowing it to access all started tests, nodes and logs 
}

public void createATestCase(String testcaseName) {
	extentTest = extentReports.createTest(testcaseName);     //this create new test case//testcaseName=verify User Login With Correct Credentials(coming from login test class)
	
}
public void addTestLogs(Status status, String comment) {
	extentTest.log(status, comment);                          //this is method to add logs to reports//status=Status.INFO//comment=Performing login//coming from login test class
	}
public void attachScreenshotToReport(String filename) throws IOException {
	extentTest.addScreenCaptureFromPath(filename); //addScreenCaptureFromPath is pre-defined method
}
public void flushReport() {
	extentReports.flush(); //it will disclose the report basically//•It is mandatory to call the flush method to ensure information is written to the started reporters.
}


}
