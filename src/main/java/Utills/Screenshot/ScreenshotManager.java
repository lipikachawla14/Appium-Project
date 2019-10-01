package Utills.Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import BaseClass.Driver;


public class ScreenshotManager extends Driver {
	public String CaptureScreenShot(String ScreenShotname,WebDriver driver) {
		String path=null;
		String relativepath=null;
		try {
			path =Driver.testReportFolderPath+"Screenshots/"+ScreenShotname+".png";
			relativepath="./Screenshots"+ScreenShotname+".png";
			File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(path));
			return relativepath;
		}
		catch(Exception e) {
			System.out.println("Exception in screenshot"+e.getMessage());
		}
		return relativepath;
	}

}
