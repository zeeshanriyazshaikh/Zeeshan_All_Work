package khansaApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@CacheLookup                             //Marker annotation to be applied to WebElements to indicate that it never changes (that is, that the same instance in the DOM will always be used)
	@FindBy(name="uid")
	private WebElement userId;
@CacheLookup
	@FindBy(name="password")
	private WebElement userPassword;
@CacheLookup
	@FindBy(name="btnLogin")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}
	public void loginToApplication(String username,String password) {
		
		elementControl.sendKeys(userId, username);
		elementControl.sendKeys(userPassword, password);
		elementControl.click(loginButton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
