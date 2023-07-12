package khansaApplicationLayer;

import org.openqa.selenium.WebDriver;

import KhansaCommonLibs.Implementation.ElementControl;

public class BasePage {

	WebDriver driver;
	
	ElementControl elementControl;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		
		elementControl = new ElementControl(driver);
		
	}
	
	
}
