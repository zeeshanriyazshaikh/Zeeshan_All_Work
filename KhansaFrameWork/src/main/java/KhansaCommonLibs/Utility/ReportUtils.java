package KhansaCommonLibs.Utility;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportUtils {

	
	ExtentHtmlReporter extentReporter;
	
	ExtentReports extentReports;
	
	ExtentTest extentTest;
	
	public ReportUtils(String htmlReportFile) {
		
		htmlReportFile=htmlReportFile.trim();
		
		extentReporter = new ExtentHtmlReporter(htmlReportFile);
		
		extentReports = new ExtentReports();
		
		extentReports.attachReporter(extentReporter);
		
	}
	public void createTestCase(String testCaseName) {
		extentTest = extentReports.createTest(testCaseName);
	}
	public void addLogsToReports(Status status,String comment) {
		extentTest.log(status, comment);
	}
	public void addScreenShotsToReport(String filename) throws IOException {
		extentTest.addScreenCaptureFromPath(filename);
	}
	public void flushTheReports() {
	
		extentReports.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
