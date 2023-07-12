package capgguru99Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99AapplicationTest {
	ChromeDriver driver;
	String url="http://demo.guru99.com/v4";
@BeforeMethod   //we can also make it @Test and give priority -100 for opening browser onetime only
public void invokeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
	@Test(priority=0)
	public void verifyTitleOfThePage()
	{
		String expectedTitle="Guru99 Bank Home Page";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);//Assert is class to compare actual vs expected
		
	}
	
	@Test(priority=1)
	public void verifyLogin() {
		WebElement userId=driver.findElement(By.name("uid"));
		WebElement userPassword=driver.findElement(By.name("password"));
		WebElement loginButton=driver.findElement(By.name("btnLogin"));
		userId.sendKeys("mngr427870");
		userPassword.sendKeys("sarErUs");
		loginButton.click();
	}
	@Test
	public void addCustomer() {
		WebElement addCustomerLink=driver.findElement(By.linkText("New Customer"));//link text work for <a anchor tag href attribute
		addCustomerLink.click();
	}
	//CUSTOM X PATH INFO:1>//-double slash means anywhere n this page,input mean searching for input tag,@value is attribute
			////table[@id='customer']/tbody/tr[4]/td[2].getText();
			
	
	
	
	
	
}
