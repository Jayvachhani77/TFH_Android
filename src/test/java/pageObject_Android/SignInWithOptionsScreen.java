package pageObject_Android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SignInWithOptionsScreen {
	public static final String signInWithGoogle = "//android.widget.TextView[@text='Sign in with Google']";
	public static final String skipButton = "//android.widget.TextView[@text='Skip']";
	
//	public static final String cancelMobileNumberModal = "com.google.android.gms:id/cancel";	
//	public static final String emailInputField = "//android.widget.TextView[@index='2']";
//	public static final String passwordInputField = "//android.widget.TextView[@index='2']";
//	public static final String nextButton = "//android.widget.Button[@text='Next']";
//	public static final String agreeButton = "//android.widget.Button[@text='I agree']";
//	public static final String backUpToggleSwitch = "com.google.android.gms:id/sud_items_switch";
//	public static final String moreButton = "//android.widget.Button[@text='MORE']";
//	public static final String acceptButton = "//android.widget.Button[@text='ACCEPT']";
//	public static final String gmailAccountSelect = "com.google.android.gms:id/account_name";

	
//	String emailId = "tfhtest0@gmail.com";
//	String password = "Test@1234";
	
	
	@SuppressWarnings("deprecation")
	public void signInWithGoogleId(AndroidDriver driver) throws InterruptedException{

		driver.findElement(By.xpath(skipButton)).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		if(driver.findElement(By.id(cancelMobileNumberModal)).isDisplayed()) {
//			driver.findElement(By.id(cancelMobileNumberModal)).click();
//			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		}
//		driver.findElement(By.xpath(signInWithGoogle)).click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		//driver.findElement(By.id(cancelMobileNumberModal)).click();
//		driver.findElement(By.id(gmailAccountSelect)).click();
//		
//		
//		
//		driver.findElement(By.xpath(emailInputField)).sendKeys(emailId);
//		driver.findElement(By.xpath(nextButton)).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(passwordInputField)).sendKeys(password);
//		driver.findElement(By.xpath(nextButton)).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(agreeButton)).click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.findElement(By.id(backUpToggleSwitch)).click();
//		driver.findElement(By.xpath(moreButton)).click();
//		driver.findElement(By.xpath(acceptButton)).click();
		
	}

}
