package TestLayer;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LoginTest extends BaseTest {
	
	@Parameters({"username","userpassword"})
@Test(priority=2)
public void toVerifyLoginTest(String username,String userpassword) {
		
		report.createTestCaseName("to Verify Login Test");
		report.addLogs(Status.INFO, "Perform Login");
		loginPage.loginToApplication(username, userpassword);
		String expectedTitleOfPage = "Guru99 Bank Manager HomePage";
		String actualTitleOfPage=commonDriver.titleOfPage();
		report.addLogs(Status.INFO, "Perform Validation");
		Assert.assertEquals(actualTitleOfPage, expectedTitleOfPage);
		System.out.println(actualTitleOfPage);
	
}
}
