import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
public class BrokenLinksExample {
   public static void main(String[] args) {
       // Set path to ChromeDriver executable
       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
       // Initialize ChromeDriver
       WebDriver driver = new ChromeDriver();
       // Navigate to the webpage
       driver.get("https://example.com");
       // Find all links on the webpage
       List<WebElement> links = driver.findElements(By.tagName("a"));
       // Iterate through each link and check if it's broken
       for (WebElement link : links) {
           String url = link.getAttribute("href");
           if (url != null && !url.isEmpty()) {
               try {
                   HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                   connection.connect();
                   int responseCode = connection.getResponseCode();
                   if (responseCode >= 400) {
                       System.out.println("Broken link found: " + url + " - Response Code: " + responseCode);
                   } else {
                       System.out.println("Valid link: " + url + " - Response Code: " + responseCode);
                   }
                   connection.disconnect();
               } catch (Exception e) {
                   System.out.println("Error while checking link: " + url);
               }
           }
       }
       // Close the browser
       driver.quit();
   }
}
