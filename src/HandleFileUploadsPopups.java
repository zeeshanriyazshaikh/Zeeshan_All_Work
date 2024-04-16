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
	
		//NOTE:-only done when <input> element has the attribute type="file" in HTML tag/when inspect browse button/attach file/upload file buttons.
	
	}
}

/*
FILE UPLOADS USING ROBO CLASS
        // Create a new Robot instance
        Robot robot = new Robot();

        // Pause for a moment to give time to switch to the file upload dialog
        Thread.sleep(2000);

        // Set the path of the file to be uploaded
        StringSelection stringSelection = new StringSelection("path/to/your/file.txt");

        // Copy the file path to the clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate keyboard events to paste the file path and confirm the upload
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

	*/
//THEORY
/*
Scenario 1 (Without type="file" attribute):
In this scenario, the website does not have a direct file upload input field (<input type="file">). Instead, it provides a trigger element (e.g., a button or a link) that, when clicked, opens a file upload dialog. The Selenium script locates this trigger element, clicks on it to open the dialog, and then proceeds with uploading the file using the sendKeys() method.
Scenario 2 (With type="file" attribute):
In this scenario, the website has a direct file upload input field (<input type="file">). The Selenium script directly locates this input field and uses the sendKeys() method to provide the file path, triggering the file upload dialog.
	*/
