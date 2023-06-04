package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import testUtils.ExtentReporterNG;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidDriverInitiator {

	AndroidDriver driver;
	ExtentReporterNG reporterObject = new ExtentReporterNG();
	
	
	@BeforeClass
	public void driverInitiator() throws MalformedURLException,IOException, InterruptedException {
		
		//object of properties file to load data
		Properties prop = new Properties();      
		
		//creating FileInputString Object to pass properties file path as load function only accept FIS object
		FileInputStream fisObject = new FileInputStream("//Users//jvachhani//eclipse-workspace//TFH_Android//src//test//java//resources//app.properties");   
		prop.load(fisObject);
		
		
		//storing data into variables from properties file
		String ipAddress = prop.getProperty("ipAddress");
		String androidDeviceName = prop.getProperty("androidDeviceName");
		String port = prop.getProperty("port");
		String platformName = prop.getProperty("platformName");
		String appPath = prop.getProperty("appPath");
		
		//setting application capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(androidDeviceName);
		options.setPlatformName(platformName);
		options.setApp(appPath);
		options.setCapability("unicodeKeyboard", "true");
		options.setCapability("resetKeyboard", "true");
		
		//Starting driver
		driver = new AndroidDriver(new URL("http://"+ipAddress+":"+port), options);
		Thread.sleep(5000);
	}
	
	
	
	@AfterClass
	public void sessionTearDown() {
		//killing driver session
		driver.quit();
	}
}
