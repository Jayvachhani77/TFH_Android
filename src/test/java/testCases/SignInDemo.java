package testCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import pageObject_Android.PermissionSetupScreens2;
import pageObject_Android.SetFirstNameScreen;
import pageObject_Android.DueDateSelectionScreen;
import pageObject_Android.HomeScreen;
import pageObject_Android.SignInWithOptionsScreen;

public class SignInDemo extends AndroidDriverInitiator{
	

	@Test
	public void TFHLogin() throws MalformedURLException, InterruptedException{
		PermissionSetupScreens2 permissionScreenSetup2object  = new PermissionSetupScreens2();
		SetFirstNameScreen setFirstNameScreenObj = new SetFirstNameScreen();
		DueDateSelectionScreen dueDateSelectionScreenObj = new DueDateSelectionScreen();
		SignInWithOptionsScreen signInWithOptionsScreenObj = new SignInWithOptionsScreen();
		HomeScreen homeScreenObj = new HomeScreen();
		
		permissionScreenSetup2object.permissionSetup(driver);
		permissionScreenSetup2object.languageSelector(driver);
		setFirstNameScreenObj.setName(driver);
		dueDateSelectionScreenObj.monthSelector(driver);
		signInWithOptionsScreenObj.signInWithGoogleId(driver);
		homeScreenObj.locationPermission(driver);
		}
}
