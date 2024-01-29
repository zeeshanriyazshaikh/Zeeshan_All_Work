import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//no need to learn just copy paste
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //just copy paste
		FileUtils.copyFile(src, new File("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\src\\google.png"));// copy project location from properties \\name of screenshot dot png.

		/* #cucumber bdd screenshot code
		@After(order = 1)
    public void tearDown(Scenario scenario) throws Exception {
        //Take screenshot
        if(scenario.isFailed()){
            final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            //Embed into report
            scenario.attach(scr,"image/png",scenario.getName());

        }
		*/
	}

}
