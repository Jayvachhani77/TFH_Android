package pageObject_Android;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class DueDateSelectionScreen {
	SetFirstNameScreen setFirstNameScreenObj = new SetFirstNameScreen();
	
	public static final String selectFirstMonth = "//android.widget.TextView[@text='1']";
	public static final String nextButton = "//android.widget.TextView[@text='NEXT']";
	public String welcomeString = "//android.widget.TextView[@text='Hello Jay Vachhani']";
	//public String[] expectedWelcomeString = setFirstNameScreenObj.firstName.split(" ");
	
	@SuppressWarnings("deprecation")
	public void monthSelector(AndroidDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.print(driver.findElement(By.xpath(welcomeString)).getText());;
		assertEquals(driver.findElement(By.xpath(welcomeString)).getText(),"Hello "+ setFirstNameScreenObj.firstName);
		driver.findElement(By.xpath(selectFirstMonth)).click();;
		driver.findElement(By.xpath(nextButton)).click();
	}
	
}
