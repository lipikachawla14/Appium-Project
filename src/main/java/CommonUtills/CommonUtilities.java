package CommonUtills;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;

public class CommonUtilities {
	public static boolean click(MobileElement go) {
		if(go!=null){
			go.click();
			return true;
		}
		else {
			System.out.println("Null parameter found");
			return false;
		}
	}
	public static boolean isDisplayed(WebElement element) {
		if(element != null) {
			boolean b = element.isDisplayed();
			if(b == true) {
				return true;
			}
			else 
				return false;
		}
		else
			return false;
	}

}
