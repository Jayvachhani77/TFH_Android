package pageObject_Android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import io.appium.java_client.android.AndroidDriver;

public class PermissionSetupScreens2 {
	//AndroidDriver driver;
	public static final String allowNotification = "//android.widget.Button[@text='Allow']";
	public static final String selectEnglish = "//android.widget.TextView[@text='Eng']";
	public static final String nextButton = "//android.widget.TextView[@text='Next']";
	
	@SuppressWarnings("deprecation")
	public void permissionSetup(AndroidDriver driver) throws InterruptedException {
		//System.out.print("Heree");
		//System.out.print(allowNotification);
		//driver=this.driver;
		driver.findElement(By.xpath(allowNotification)).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public void languageSelector(AndroidDriver driver) {
		//driver=this.driver;
		driver.findElement(By.xpath(selectEnglish)).click();
		driver.findElement(By.xpath(nextButton)).click();
	}
	
}
