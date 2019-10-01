package ObjectRepository;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;

import BaseClass.Driver;
import DataSource.Data;
import io.appium.java_client.MobileElement;

public class ActionBarPL extends Driver{
	
	public MobileElement selectapp() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "app")));
	}
	
	public MobileElement selectactionbar() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "bar")));
	}
	
	public MobileElement selectdisplay() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "display_option")));
	}
	public MobileElement show_Title() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "show_titlebar")));
	}
	public boolean get_title() throws DocumentException {
		try {
		  
			driver.findElement(By.xpath(Data.Reader("buttons", "title"))).isDisplayed();
		    return true;
	    }
      
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		    }
	}
}
