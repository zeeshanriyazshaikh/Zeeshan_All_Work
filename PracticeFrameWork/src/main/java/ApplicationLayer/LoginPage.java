package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	WebDriver driver;
	
@CacheLookup
@FindBy(name="uid")
private WebElement userId;
@FindBy(name="password")
private WebElement userPwd;
@FindBy(name="btnLogin")
private WebElement loginButton;

public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	super(driver);
	PageFactory.initElements(driver, this);
}
public void loginToApplication(String username,String userpassword) {
	elementControl.sendKeys(userId, username);
	elementControl.sendKeys(userPwd, userpassword);
	elementControl.click(loginButton);
}
}
