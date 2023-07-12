package com.crm.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{//ctrl+click on test base class will take u to it.
	LoginPage loginPage;       //defining object reference variable at class level so that can be used through out my program
	HomePage homepage;
	public LoginPageTest() {   //constructor
		super();              // to call super class i.e: TestBase constructor
	}
	@BeforeMethod
	public void setUp() {
		
		initialization();    //calling initialization method from parent class test base.
		loginPage=new LoginPage(); //login page class object created
		}
	
	@Test(priority=1)                             //1st test case
	public void loginPageTitleTest() {
		String title =loginPage.ValidateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support."); //to validate test case is pass or fail
	}
	@Test(priority=2)                                 //1st test case
	public void loginTest() throws InterruptedException{
	homepage =	loginPage.login(prop.getProperty("email"), prop.getProperty("password")); //save in home page variable as return type of this method is home page as after click login we lands to home page S
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
