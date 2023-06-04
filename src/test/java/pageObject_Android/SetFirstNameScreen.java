package pageObject_Android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SetFirstNameScreen {
	public static final String firstNameInput = "//android.widget.EditText[@text='Type here']";
	public static final String nextButton1 = "//android.widget.TextView[@text='Next']";
	String firstName = "Jay Vachhani";
	
	@SuppressWarnings("deprecation")
	public void setName (AndroidDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(firstNameInput)).sendKeys(firstName);
		driver.findElements(By.xpath(nextButton1)).get(1).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	

}
