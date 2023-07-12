package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	@CacheLookup                             //Marker annotation to be applied to WebElements to indicate that it never changes (that is, that the same instance in the DOM will always be used)
	@FindBy(name="uid")
	private WebElement userId;
@CacheLookup
	@FindBy(name="password")
	private WebElement userPassword;
@CacheLookup
	@FindBy(name="btnLogin")
	private WebElement loginButton;

	
@CacheLookup
@FindBy(xpath="//*[@href='addcustomerpage.php']")
private WebElement newCustomer;
@CacheLookup
@FindBy(xpath="//*[@value='f']")
private WebElement radioButtonFemale;
@CacheLookup
@FindBy(xpath="//*[@value='m']")
private WebElement radioButtonMale;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void toCheckRadio(String userName, String password) {
		elementcontrol.setText(userId, userName);  //element control instance created in base page,set text method is in element control class that defines action of send keys,
		elementcontrol.setText(userPassword, password);
		elementcontrol.clickElement(loginButton);
		elementcontrol.clickElement(newCustomer);
		elementcontrol.clickElement(radioButtonFemale);
		
		
	}
}
