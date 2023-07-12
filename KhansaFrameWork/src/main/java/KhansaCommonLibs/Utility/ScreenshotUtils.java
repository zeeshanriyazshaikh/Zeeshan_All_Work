package KhansaCommonLibs.Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	WebDriver driver;
	
	TakesScreenshot camera;
	
	public ScreenshotUtils(WebDriver driver) {
camera = (TakesScreenshot)driver;

	}
	
	public void captureAndStoreTheScreenShot(String filename) throws Exception {
		
		filename=filename.trim();
		
		File imgFile,tempFile;
		
		imgFile = new File(filename);
		
		if(imgFile.exists()) {
			throw new Exception("File exists");
		}
		
		tempFile=camera.getScreenshotAs(OutputType.FILE);
		
		FileUtils.moveFile(tempFile, imgFile);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
