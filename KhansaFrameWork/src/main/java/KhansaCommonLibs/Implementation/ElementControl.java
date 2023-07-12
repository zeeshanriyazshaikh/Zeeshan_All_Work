package KhansaCommonLibs.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementControl {

	WebDriver driver;
	
	public ElementControl(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	public void click(WebElement element) {
		element.click();
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
