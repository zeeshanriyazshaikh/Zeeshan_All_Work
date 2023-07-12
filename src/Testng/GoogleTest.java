package Testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	                                                    @SuppressWarnings("deprecation")
	@BeforeMethod            //pre-requisities are to be done here,no need to write all annotations just make B method -test- A method pairs.
	public void setUp(){    //we can use any name ,generally we use set up method
		System.setProperty("webdriver.drive.chrome", "C:\\Users\\Faiz Riyaz\\Desktop.exe");
		
		driver = new ChromeDriver();                    //this are all precondition i want to execute before each test case
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	                                                    }
	     @Test(priority=1,groups="Title")                                  //test cases are independent of each other
	     public void googleTitleTest() {
	    	 String title = driver.getTitle();
	    	 System.out.println(title); 
	     }
	    	 @Test(priority=2,groups="Logo")
	    	 public void googleLogoTest() {
	    		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed(); //isDisplay method gives boolean value so store in boolean i.e:true/false
	    	 Assert.assertEquals(b, true);  //here b in bracket is actual and true is expected
	    	 }
	    	 @Test   (priority=3,groups="LinkTest")                         //for html report of output,project refresh,index.html.
	    	 public void mailLinkTest() {
	    		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	    		 Assert.assertEquals(b, true);
	    	 } @Test(priority=4,groups="LinkTest")
	    	 public void imagesLinkTest() {
	    		boolean b = driver.findElement(By.linkText("Images")).isDisplayed();
	    		 Assert.assertEquals(b, true);
	    	 }
	                                                    
	                                                    
		@AfterMethod                              //this are all post condition i want to execute after each test case
		public void tearDown() {
			driver.quit();
		}
		
		
		
		
	}
	
	

