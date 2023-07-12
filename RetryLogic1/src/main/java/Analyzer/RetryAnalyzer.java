package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {//IRetryAnalyzer interface in testng,@test level

	int counter = 0;
	int retryLimit = 3 ;
	
	
	public boolean retry(ITestResult result)                //retry method in IRetryAnalyzer,boolean is return type
	{
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
}
}