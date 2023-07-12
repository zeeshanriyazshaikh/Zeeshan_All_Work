package ApplicationLayer;

import org.openqa.selenium.WebDriver;

import UtilityLayer.Implementation.ElementControl;

public class BasePage {
WebDriver driver;
public ElementControl elementControl;
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		elementControl = new ElementControl(driver);
	}
}
