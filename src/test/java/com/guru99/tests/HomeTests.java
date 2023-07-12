package com.guru99.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomeTests extends BaseTests {
	
	@Parameters({"username","userpassword"})
	@Test
	public void toVerifyRadioTest(String username,String password) {
			
		reportUtils.createATestCase("to Verify Radio Test");
		reportUtils.addTestLogs(Status.INFO, "Perform Login");
		
			homepage.toCheckRadio(username, password);
			reportUtils.addTestLogs(Status.INFO, "Validations");
			String expectedTitle="Guru99 Bank Manager HomePage";
			
			String actualTitle=cmndriver.getTitleOfThePage(); //getTitleOfThePage is method created in common driver class,and to call this method common driver class instance is created cmndriver named in base test class
			
			reportUtils.addTestLogs(Status.INFO, "comparing actual vs expected title"); //adding logs after test and before validation
			
			Assert.assertEquals(actualTitle, expectedTitle); //validation after test actual vs expected title
			
			System.out.println(actualTitle);
		
	}
}
