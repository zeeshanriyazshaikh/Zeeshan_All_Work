import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
public class BrokenLinksExample {
   public static void main(String[] args) {
       // Set path to Chrome driver executable
       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
       // Set Chrome options
       ChromeOptions options = new ChromeOptions();
       // Initialize Chrome driver
       WebDriver driver = new ChromeDriver(options);
       // Open a website
       driver.get("https://www.example.com");
       // Find all links on the webpage
       List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println("Total links found: " + links.size());
       // Iterate through each link and check if it's broken
       for (WebElement link : links) {
           String url = link.getAttribute("href");
           verifyLink(url);
       }
       // Close browser
       driver.quit();
   }
   public static void verifyLink(String url) {
       try {
           URL link = new URL(url);
           HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
           httpURLConnection.setConnectTimeout(5000);
           httpURLConnection.connect();
           if (httpURLConnection.getResponseCode() == 200) {
               System.out.println(url + " - " + httpURLConnection.getResponseMessage());
           } else {
               System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
           }
       } catch (Exception e) {
           System.out.println(url + " - " + "Link is broken or invalid.");
       }
   }
}
