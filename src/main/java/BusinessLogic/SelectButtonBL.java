package BusinessLogic;

import org.dom4j.DocumentException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClass.Driver;
import CommonUtills.CommonUtilities;
import ObjectRepository.ActionBarPL;
import ObjectRepository.SelectButtonPL;
import Utills.Screenshot.ScreenshotManager;


public class SelectButtonBL extends Driver {
	
	ActionBarPL actionbarpl = new ActionBarPL();
	ScreenshotManager screenshots = new ScreenshotManager();
	public ExtentTest test;
	
	SelectButtonPL selectbuttonPL= new SelectButtonPL();	
	public boolean selectbttn() throws DocumentException {
		test = report.startTest("Hide_Buttons");
		test.log(LogStatus.INFO, "Starting Test");
		try {
			CommonUtilities.click(selectbuttonPL.selectanimation());
			test.log(LogStatus.INFO, "Click on animation button");
			CommonUtilities.click(selectbuttonPL.hide_showanimation());
			test.log(LogStatus.INFO, "Click on hide/show button");
			CommonUtilities.click(selectbuttonPL.hide());
			test.log(LogStatus.INFO, "Click on hide button");
			CommonUtilities.click(selectbuttonPL.selectzero());
			
			if(!CommonUtilities.isDisplayed(selectbuttonPL.selectzero())){
				test.log(LogStatus.PASS, "Zero button selected");
				report.endTest(test);
				return true;
			}
			
			else {
				test.log(LogStatus.FAIL, "Zero button not selected");
				report.endTest(test);
				test.log(LogStatus.INFO,test.addScreenCapture(screenshots.CaptureScreenShot("Zero button not selected", driver)));
			    return false;
			}
		}
	
	   	   catch(Exception e) {
				test.log(LogStatus.FAIL, e.getMessage());
				report.endTest(test);
				test.log(LogStatus.FAIL,test.addScreenCapture(screenshots.CaptureScreenShot("Not selected", driver)));
                System.out.println(e.getMessage());
		        return false;
	    }
	}

		
		public boolean show() throws DocumentException {
			
		CommonUtilities.click(selectbuttonPL.selectshow());
		
		if(CommonUtilities.isDisplayed(selectbuttonPL.selectzero())){
			test.log(LogStatus.PASS, "Show button selected");
			report.endTest(test);
			
			return true;
		}
		
		else {
			test.log(LogStatus.FAIL, "Show button not selected");
			report.endTest(test);
			test.log(LogStatus.INFO,test.addScreenCapture(screenshots.CaptureScreenShot("Show button not selected", driver)));
           
		    return false;
		}
	}
}



	
	


						