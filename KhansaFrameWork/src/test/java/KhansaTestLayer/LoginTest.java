package KhansaTestLayer;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import khansaApplicationLayer.LoginPage;

public class LoginTest extends BaseTest {

	@Parameters({"userName","userPassword"})
	@Test
	public void toVerifyLoginFunction(String userName,String userPassword) {
		
		reportUtils.createTestCase("to Verify Login Function");
		
		reportUtils.addLogsToReports(Status.INFO, "Performing Login");
		
		loginPage.loginToApplication(userName, userPassword);
		
		reportUtils.addLogsToReports(Status.INFO, "Validation");
		
		String expectedTitleOfPage = "Guru99 Bank Manager HomePage";
		
		String actualTitleOfPage = commonDriver.getTitleOfThePage();
		
		Assert.assertEquals(actualTitleOfPage, expectedTitleOfPage);
		
		System.out.println(actualTitleOfPage);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
