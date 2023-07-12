package Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngFeatures {

	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="loginTest")  //here we are defining dependency,it means home page method is dependent on login test method,if login page has issue and not working fine than what we will do of other test so we keep dependency if login is fine then go to next step to test that is home page
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	@Test 
	public void SearchPageTest() {    //if above test case failed this will be ignored
		System.out.println("SearchPageTest");
		throw new SkipException("skipping purposely as want to execute selected test cases");
	}
	@Test(enabled=false)
	public void skipTestCase() //it will be skipped
	{
		System.out.println("Skip Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
