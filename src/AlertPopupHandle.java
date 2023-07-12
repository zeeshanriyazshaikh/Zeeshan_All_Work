import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"queryTop\"]/input")).click();  //clicking on search button
		Thread.sleep(3000);                     //after click on search it will wait for 3sec and then handle or accept pop up 
		
		
		Alert alert=driver.switchTo().alert(); // Alert is class in Selenium for pop ups,alert is variable to store,switchTo().alert() are methods in Alert class
		System.out.println(alert.getText());    //Validation of Alert pop up.
		/*alert.accept();                        //click on ok button,accept() method in Alert class
		alert.dismiss();           */          //click on cancel button
		String text=alert.getText();
		if(text.equals("Please enter search keyword"))
		{
			System.out.println("correct");
			alert.accept();
		}
		else
		{
			System.out.println("in correct");
		}
		
		//alert.accept();                        //click on ok button,accept() method in Alert class
		/*	alert.dismiss();           */          //click on cancel button
		
		
		
		
	}

}
