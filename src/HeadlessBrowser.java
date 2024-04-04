import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessBrowserExample {
   public static void main(String[] args) {
       // Set path to Chrome driver executable
       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
       // Set Chrome options to run headlessly
       ChromeOptions options = new ChromeOptions();
      
       options.addArguments("--headless"); // THIS SYNTAX MAKE IT HEADLESS
      
       // Initialize Chrome driver
       WebDriver driver = new ChromeDriver(options);
       // Open a website
       driver.get("https://www.example.com");
       // Print page title
       System.out.println("Page title is: " + driver.getTitle());
       // Close browser
       driver.quit();
   }
}
