package UtilityLayer.Reporting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	ExtentHtmlReporter htmlReporter;
ExtentTest extenTest;
	ExtentReports extentReports;
	
	public Report(String fileName) {
		fileName=fileName.trim();
		htmlReporter = new ExtentHtmlReporter(fileName);
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
	}
	public void createTestCaseName(String testCaseName) {
		extenTest = extentReports.createTest(testCaseName);
	}
public void addLogs(Status status,String comment) {
	extenTest.log(status, comment);
}
public void addScreenShotToReport(String fileName) throws IOException {
	extenTest.addScreenCaptureFromPath(fileName);
}
public void flushReport() {
	extentReports.flush();
}
}
