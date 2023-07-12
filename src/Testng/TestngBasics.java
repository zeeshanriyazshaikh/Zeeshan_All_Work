package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics{                       //we do not use main method in Test n g.
	
	@BeforeSuite      //1                          //all this Before annotations are prerequisite or precondition annotation
	public void setUP()
	{
		System.out.println("set up system property for chrome");
	}
	@BeforeTest//2
	public void launchBrowser()
	{
		System.out.println("launch chrome Browser");
	}
	@BeforeClass     //3                           //each and every annotation there must be a method
	public void login()
	{
		System.out.println("login to app");
	}
	
	@BeforeMethod//4
	public void enterURL()
	{
		
		System.out.println("enter URL");
	}
	
//if we see out put sequence of pairs is Before method-test1-after method and before method-test2-after method
	
	@Test                          //5                   //1st test case
	public void googleTitleTest() {
		System.out.println("Google Title test");  
	}
	@Test                                            //2nd test case
	public void searchTest() {
		System.out.println("search test");  
	}
	
	                                                  //post test case conditions
	@AfterMethod//6
	public void logOut()
	{
		System.out.println("logout from app");
	}
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	@AfterTest //8
	public void deleteCookies()
	{
		System.out.println("delete all cookies");
		
	}
	

	@AfterSuite  //9
	public void generateTestReport()
	{
		System.out.println("generateTestReport");
	}
	//Sequence
	/*set up system property for chrome
launch chrome Browser
login to app
enter URL
Google Title test
logout from app
close browser
delete all cookies
PASSED: googleTitleTest
*/
	

}
