package pageObject_Android;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {

	public static final String allowLocationButton = "//android.widget.TextView[@text='Allow']";
	
	
	public void locationPermission(AndroidDriver driver) {
		driver.findElement(By.xpath(allowLocationButton)).click();
	}
	
}
