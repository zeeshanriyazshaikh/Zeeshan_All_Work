package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase { //making child of Parent base class "TestBase"
//here we Know that we have to define OBJECT REPOSITORY for LoginPage class
	
//PageFactory-OBJECT REPOSITORY
@FindBy(linkText="Login") //no need to write driver.FindBy n all we can also use annotations like follows
WebElement Login1;
@FindBy(name="email") //no need to write driver.FindBy n all we can also use annotations like follows
WebElement email;
@FindBy(name="password")
WebElement password;
@FindBy(xpath="//div[contains(text(),'Login')]") //custom xpath
WebElement LoginBtn;


//Initializing the Page Objects
public LoginPage()
{
	PageFactory.initElements(driver, this); //in login page constructor we initialize page factory by in it(initialize it) elements method with driver and this means current class objects(all above elements)
	
}
//Actions

public String ValidateLoginPageTitle() //String as below return type will be in string output
{
	
	return driver.getTitle(); //verify title of page
	
}

public HomePage login(String em, String pwd) throws InterruptedException // writing HomePage in place of void to make it return type
{
	Login1.click();
	Thread.sleep(2000);
	email.sendKeys(em);
	password.sendKeys(pwd);
	LoginBtn.click();
	        return new HomePage();            //after clicking on login button we land on the home page,so return Home Page class  Object.
}

}