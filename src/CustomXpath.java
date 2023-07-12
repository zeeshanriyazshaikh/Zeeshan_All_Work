import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/b/Books-Magazines/267/bn_1854946");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("books"); // we had created our own x path,we can use any html property or attributes to create,input is html tag ,id is attribute 
		//to handle dynamic id's we use CONTAINS,or starts-with or ends-with, dynamic id means id value changes after each reload
		//driver.findElement(By.xpath("//input[contains(@id='gh-ac')]")).sendKeys("books");
		                                //OR
		//	driver.findElement(By.xpath("//input[starts-with(@id='gh-ac')]")).sendKeys("books");
		
		//ONLY for links custom xpath
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		//CUSTOM X PATH INFO:1>//-double slash means anywhere n this page,input mean searching for input tag,@value is attribute
		// //table[@id='customer']/tbody/tr[4]/td[2].getText();
		
		
		
		
		
	}

}
