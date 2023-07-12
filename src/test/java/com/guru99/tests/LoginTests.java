package com.guru99.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTests extends BaseTests{
	@Parameters({"username","userpassword"})
	@Test
	public void verifyUserLoginWithCorrectCredentials(String username,String password) { //TEST CASE
		
		reportUtils.createATestCase("verify User Login With Correct Credentials"); //basically write test case name in extent report in big//createATestCase is method in report utils class,reportutils is instance created of report utils class in base test class
		
		reportUtils.addTestLogs(Status.INFO, "Performing login");// addTestLogs is method in report utils class to add logs before login// Status.INFO is List of allowed status for 
		
		loginpage.loginToApplication(username, password); //login page instance created in base test class, login to application is method in login page class
		
		String expectedTitle="Guru99 Bank Manager HomePage";
		
		String actualTitle=cmndriver.getTitleOfThePage(); //getTitleOfThePage is method created in common driver class,and to call this method common driver class instance is created cmndriver named in base test class
		
		reportUtils.addTestLogs(Status.INFO, "comparing actual vs expected title"); //adding logs after test and before validation
		
		Assert.assertEquals(actualTitle, expectedTitle); //validation after test actual vs expected title
		
		System.out.println(actualTitle);
	}
	
	
}
