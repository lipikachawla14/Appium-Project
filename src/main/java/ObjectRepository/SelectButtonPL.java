package ObjectRepository;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;

import BaseClass.Driver;
import DataSource.Data;
import io.appium.java_client.MobileElement;

public class SelectButtonPL extends Driver {
	
	public MobileElement selectanimation() throws DocumentException {
		
		return driver.findElement(By.xpath(Data.Reader("buttons", "animation")));
	}
	
	public MobileElement hide_showanimation() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "show_animations")));
	}
	
	public MobileElement hide() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "hide_checkbox")));
	}
	
	public MobileElement selectzero() throws DocumentException {
		try {
			return driver.findElement(By.xpath(Data.Reader("buttons", "zero_button")));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public MobileElement selectfirst() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons","first_button")));
	}
	
	public MobileElement selectsecond() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "second_button")));
	}
	
	public MobileElement selectthird() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons", "third_button")));
	}
	
	public MobileElement selectshow() throws DocumentException {
		return driver.findElement(By.xpath(Data.Reader("buttons","show_button")));
	}
		

	

}

