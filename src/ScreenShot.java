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
		#Explaination for above code
			1>if(scenario.isFailed()) : checks if scenario failed and return boolean as true/false
			2>final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		-byte array/It is just a format that Cucumber understands to show the image inside its report.
			-driver → Your Selenium WebDriver (Chrome, Firefox, etc.)
-(TakesScreenshot) driver → Converts the driver to something that can take screenshots.
-getScreenshotAs(OutputType.BYTES) → Captures the screenshot as bytes (raw data), not a file
			
			3>scenario.attach(scr,"image/png",scenario.getName());
		variable scr → the screenshot image in bytes
"image/png" → tells Cucumber the type of file
scenario.getName() → gives a label/name (title) for the screenshot in the report
			
	}

}
