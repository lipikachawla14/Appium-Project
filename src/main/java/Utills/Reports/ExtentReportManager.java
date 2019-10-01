package Utills.Reports;

import java.io.File;
import java.util.Date;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import BaseClass.Driver;

public class ExtentReportManager {
	private static ExtentReports repo;
	public static ExtentReports getInstance() {
		if(repo==null) {
			Date dte=new Date();
			Driver.timeStamp=dte.toString().replace(":","_").replace(" ", "_");
			String reportFolderPath=System.getProperty("user.dir")+"\\Resources\\"+"Test_Report_"+Driver.timeStamp+"\\";
			Driver.testReportFolderPath=reportFolderPath;
			String filename=Driver.timeStamp+".html";
			repo=new ExtentReports(Driver.testReportFolderPath+filename,true,DisplayOrder.NEWEST_FIRST);
			repo.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
			repo.addSystemInfo("Selenium Version","3.11.0");
					
		}
		return repo;
	}

	

}
