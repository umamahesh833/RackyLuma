package TestScripts;

import org.testng.annotations.Test;

import UtilityMethods.AppMethods;

public class PriceCalTests {
	AppMethods ObjApp = new AppMethods();
	
	@Test 
	public void TestPriceCalculation() throws Exception {
		ObjApp.LaunchApplication("Chrome");
		ObjApp.LogintoApplication();
		ObjApp.NavigateToWomenBottom();
		ObjApp.SelectAnyItemAddtoCart();
		ObjApp.NavigateToCart();
		ObjApp.ValidateSubtotalCalculation();
		ObjApp.CloseApp();
	}
	
	
}
