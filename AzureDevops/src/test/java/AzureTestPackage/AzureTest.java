package AzureTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AzureTest {    //CHILD BRANCH TEST
	ChromeDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(400,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(400,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	
	@Test                                 //1.TITLE TEST
	public void sidraTitleTest() {
	String title = driver.getTitle();
	System.out.println(title); 
	Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","title not match"); 
	}
	@Test                                 //1.TITLE TEST
	public void ssidraTitleTest() {
	String title = driver.getTitle();
	System.out.println(title); 
	Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","title not match"); 
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
