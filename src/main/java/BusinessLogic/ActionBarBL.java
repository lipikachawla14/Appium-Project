package BusinessLogic;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.Driver;
import CommonUtills.CommonUtilities;
import ObjectRepository.ActionBarPL;
import Utills.Screenshot.ScreenshotManager;

public class ActionBarBL extends Driver {
	
	ActionBarPL actionbarpl = new ActionBarPL();
	ScreenshotManager screenshots = new ScreenshotManager();
	public ExtentTest test;
	
	public boolean selectoption() {
		test = report.startTest("Show_Title");
		test.log(LogStatus.INFO, "Starting Test");
		try {
		CommonUtilities.click(actionbarpl.selectapp());
		test.log(LogStatus.INFO, "Click on app button");
		CommonUtilities.click(actionbarpl.selectactionbar());
		test.log(LogStatus.INFO, "Click on action bar button");
		CommonUtilities.click(actionbarpl.selectdisplay());
		test.log(LogStatus.INFO, "Click on display button");
		CommonUtilities.click(actionbarpl.show_Title());

			if(!actionbarpl.get_title()) {
				test.log(LogStatus.INFO, "Title not found");
				test.log(LogStatus.INFO, "Click on ShowTitle button");
				
			CommonUtilities.click(actionbarpl.show_Title());
			System.out.println("showtitle");
			if(actionbarpl.get_title())
			{
				System.out.println("title");
				test.log(LogStatus.PASS, "Title button pass");
				report.endTest(test);
				return true;
			}
			else {
				System.out.println("Title");
				test.log(LogStatus.FAIL, "Title not found");
				test.log(LogStatus.INFO,test.addScreenCapture(screenshots.CaptureScreenShot("Title not found", driver)));
                report.endTest(test);
				return false;
			}
			}
			else {
				test.log(LogStatus.FAIL,"Title is visible");
				test.log(LogStatus.INFO, test.addScreenCapture(screenshots.CaptureScreenShot("Title is visible", driver)));
				report.endTest(test);
				return false;
			}
			
		}	
		catch(Exception e) {
			
			    System.out.println(e.getMessage()); 
			    test.log(LogStatus.FAIL, test.addScreenCapture(screenshots.CaptureScreenShot(e.getMessage(), driver)));
			    report.endTest(test);
			    return false;
		   }
		}
}
