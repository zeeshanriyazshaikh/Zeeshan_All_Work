import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBoxBySelect {

	public static void main(String[] args) {
		
                System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.id("businessName")).sendKeys("zeeshan");
		driver.findElement(By.id("businessEmail")).sendKeys("zee.shaikcool786@gmail.com");
		
	        //Handle Drop Down
		Select select=new Select(driver.findElement(By.id("businessCountry"))); //select is class used for drop down ,and in object we are passing find element by id.
		
		select.selectByVisibleText("Austria");
		
		
		
		//LIST OF ALL OPTIONS IN DROP DOWN 
		
		List<WebElement> lists=select.getOptions(); //get all options in list
		System.out.println(lists.size());

		for(int i=0; i<lists.size();i++)   //we can also write  (int i=1; i<=linklists.size();i++)
		{
		String linktext  =	lists.get(i).getText();
	        System.out.println(linktext);
		}
		
		
		
		
		
		
		
		
	}

}
