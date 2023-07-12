package com.guru99.pages;

import org.openqa.selenium.WebDriver;

import commonLib.implementation.ElementControl;

public class BasePage {
	WebDriver driver;
	
	public ElementControl elementcontrol;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver; //here we equals local and instance variable so that we use same driver instance of webdriver to maintain same sessions,this.driver=driver means webdriver instance driver is equal as that of local constructor instance or variable
		
		elementcontrol =new ElementControl(driver);
	}
}
