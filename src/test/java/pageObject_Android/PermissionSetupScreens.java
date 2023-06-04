package pageObject_Android;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PermissionSetupScreens {
//		AndroidDriver driver;
//		
//		public PermissionSetupScreens(AndroidDriver driver) {
//			this.driver = driver;
//			PageFactory.initElements(new AppiumFieldDecorator(driver),this);
//		}
//
//		@AndroidFindBy(xpath="//android.widget.Button[@text='Allow']")
//		private WebElement allowNotification;
//		
//		@AndroidFindBy(xpath="//android.widget.TextView[@text='Eng']")
//		private WebElement selectEnglish;
//		
//		//@AndroidFindBy(xpath = "(//android.widget.TextView[@text='हिंदी'])")
//		//public WebElement selectHindi;
//		
//		@AndroidFindBy(xpath="//android.widget.TextView[@text='Next']")
//		private WebElement nextButton;
//		
//		
//		
//		@SuppressWarnings("deprecation")
//		public void permissionSetup() throws InterruptedException {
//			System.out.print("Heree");
//			System.out.print(allowNotification);
//			allowNotification.click();
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		}
//		public void languageSelector() {
//			selectEnglish.click();
//			nextButton.click();
//		}
}
