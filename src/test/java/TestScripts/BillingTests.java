package TestScripts;

import org.testng.annotations.Test;

import UtilityMethods.AppMethods;

public class BillingTests {
	AppMethods ObjApp = new AppMethods();
	@Test
	public void VerifyBilling() {
		ObjApp.LaunchApplication("Edge");
		ObjApp.AddDataToCreateAccount();
		ObjApp.SignOut();
	}
	

}
