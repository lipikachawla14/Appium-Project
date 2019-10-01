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
import BusinessLogic.SelectButtonBL;

public class ShowButtonTestCase extends Driver {
	SelectButtonBL sb = new SelectButtonBL();
	
	@BeforeClass
	public void appLaunch() throws MalformedURLException{
		invoke_driver();
	}
	
	@Test(priority=1)
	public void test() throws MalformedURLException, DocumentException {
		AssertJUnit.assertTrue(sb.selectbttn());
	   
	}
	
	@Test(priority=2)
	public void verify() throws DocumentException {
		AssertJUnit.assertTrue(sb.show());
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

