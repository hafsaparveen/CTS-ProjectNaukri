package ScreenShot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	static WebDriver driver;

	public Screenshot(WebDriver driver) {
		Screenshot.driver = driver;
	}

	public void takeSnapshot(String path) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File Source = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Source, new File(path));
		} catch (IOException e) {
			System.out.println();
		}

	}

}
