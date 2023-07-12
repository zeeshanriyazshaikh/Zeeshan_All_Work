package ApplicationLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	WebDriver driver;
	@CacheLookup
	@FindBy(name="uid")
	private WebElement userId;
	@FindBy(name="password")
	private WebElement userPwd;
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
public void toCheckRadio(String user,String pwd) {
	elementControl.sendKeys(userId, user);
	elementControl.sendKeys(userPwd, pwd);
	elementControl.click(loginButton);
	elementControl.click(newCustomer);
	elementControl.click(radioButtonFemale);
	boolean f=elementControl.isDisplayed(radioButtonFemale);
	Assert.assertEquals(f, true);
	
}
}
