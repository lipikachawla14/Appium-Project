package TestCases;

import java.net.MalformedURLException;

import org.dom4j.DocumentException;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.Driver;
import BusinessLogic.ActionBarBL;

public class ActionBarTestCase extends Driver {
	ActionBarBL ab = new ActionBarBL();
	
	@BeforeClass
	public void appLaunch() throws MalformedURLException {
		invoke_driver();
	}
	
	@Test
		public void check() throws MalformedURLException, DocumentException {
			AssertJUnit.assertTrue(ab.selectoption());
	}	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void stop() {
		service.stop();
	}
	
	@AfterMethod
	public void refresh() {
		if (!(report == null))
		{
			report.flush();
			
		}

}
}
