package UtilityLayer.Reporting;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	WebDriver driver;
	private TakesScreenshot camera;
	
	public ScreenShot(WebDriver driver) {
		camera =(TakesScreenshot)driver;
	}
	public void captureScreentShotAndSave(String fileName) throws Exception {
		fileName=fileName.trim();
		File imgSrcFile,imgTempFile;
		imgSrcFile = new File(fileName);
		
		if(imgSrcFile.exists()) {
			throw new Exception("Already Exists");
		}
		imgTempFile = camera.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(imgTempFile, imgSrcFile);
	}
}
