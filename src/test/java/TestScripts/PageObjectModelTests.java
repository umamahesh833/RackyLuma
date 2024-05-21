package TestScripts;

import org.testng.annotations.Test;

import PageObjects.CustomerLoginPage;
import PageObjects.HomePage;
import UtilityMethods.AppMethods;

public class PageObjectModelTests {
	

	@Test
	public void TestReOrder() {
		
		AppMethods ObjAppMethods = new AppMethods();
		HomePage ObjHomePage = new HomePage();
		CustomerLoginPage ObjCustomerLogin = new CustomerLoginPage();
		
		ObjAppMethods.LaunchApplication("Chrome");
		ObjHomePage.ClickSignin();
		ObjCustomerLogin.LogintoApplication();
		
	
	}
	
	

}
