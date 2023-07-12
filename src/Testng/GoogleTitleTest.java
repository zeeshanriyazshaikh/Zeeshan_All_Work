
package Testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTitleTest {
	WebDriver driver;
   // @SuppressWarnings("deprecation")
@BeforeMethod            //pre-requisities are to be done here,no need to write all annotations just make B method-test-A method pairs.
public void setUp(){    //we can use any name ,generally we use set up method
//System.setProperty("webdriver.driver.chrome", "C:\\Users\\Faiz Riyaz\\Desktop.exe");
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();                    //this are all precondition i want to execute before each test case
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.get("https://www.google.com");
    }
@Test(threadPoolSize=3, invocationCount=3, timeOut=10000)                                 
public void googleTitleTest() {
String title = driver.getTitle();
System.out.println(title); 
System.out.println("thread id check | "+Thread.currentThread().getId());

Assert.assertEquals(title, "Google","title not match");   //MOST IMPORTANT:VALIDATION,ACTUAL VS EXPECTED,is failed then title is not match will be printed,title here is actual and Google is expected

//Assert.assertEquals(b,true); --for boolean
}
@Test                                 
public void parallelTesting()
{
	System.out.println("parallel testing in testng/packageexplorer/testng/googletitletest/rigthclick/convert to testng | "+Thread.currentThread().getId());
}
@AfterMethod                              //this are all post condition i want to execute after each test case
public void tearDown() {
	driver.quit();
}
}
/*THEORY
 * 1:HOW TO RUN TEST IN PARALLEL
 * 2:HOW TO SET PARALLEL TREAD COUNT
 * 3:WHAT HAPPENS WHEN TREAD COUNT IS LESS  THAN METHOD COUNT
 * 4:HOW TO CONFIGURE A SINGLE METHOD TO RUN IN MULTIPLE THREADS*/


