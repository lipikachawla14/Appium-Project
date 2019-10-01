 package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.relevantcodes.extentreports.ExtentReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import Utills.Reports.ExtentReportManager;

public class Driver {
	public static String timeStamp;
	public static String snapshotFolderPath;
	public static String testReportFolderPath;
	public static ExtentReports report= ExtentReportManager.getInstance();
	public static  AppiumDriverLocalService service;
	public static  AppiumDriver<MobileElement> driver;
	public void invoke_driver() throws MalformedURLException {
        DesiredCapabilities capabilties = new DesiredCapabilities();
	    
	    service=AppiumDriverLocalService.buildDefaultService();
	           
	    service.start();
	    
	    capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "ABC");
	    capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	    capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
	    capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.apis.ApiDemos");
	    capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.android.apis");
	    
	    URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
	    driver = new AndroidDriver<MobileElement>(serverURL,capabilties);
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

}




