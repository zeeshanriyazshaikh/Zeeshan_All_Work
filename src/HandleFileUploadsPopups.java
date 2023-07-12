import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadsPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://html.com/input-type-file/*");
		driver.findElement(By.xpath("    ")).sendKeys("path of file need to be uploaded and file name as well"); //so if we need to upload file by clicking on button then window pop up will occur that cannot be handle by selenium so what we need to do is we will write path name of file and file name with extension and upload it 
	
		//NOTE:-only done when type="file" in HTML tag/when inspect browse button/attach file/upload file buttons.
	
	
	}
	
	

}
