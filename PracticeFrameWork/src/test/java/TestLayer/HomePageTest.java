package TestLayer;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ApplicationLayer.HomePage;

public class HomePageTest extends BaseTest{

@Parameters({"username","userpassword"})	
@Test(priority=3)
public void toVerifyRadioTest(String userName,String userPassword) {
		
		report.createTestCaseName("to Verify Radio Test");
		report.addLogs(Status.INFO, "Perform Login");
		HomePage homePage = new HomePage(driver);
		homePage.toCheckRadio(userName, userPassword);
		report.addLogs(Status.INFO, "Perform Validation");
		
	
}
}
