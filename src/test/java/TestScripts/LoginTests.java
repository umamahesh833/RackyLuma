package TestScripts;


import org.testng.annotations.Test;

import UtilityMethods.AppMethods;

public class LoginTests {
	AppMethods ObjApp = new AppMethods();
	
	

	
	@Test 
	public void TestAddToCart() {
		
		//9th Test case add to cart
		ObjApp.LaunchApplication("Edge");
		ObjApp.LogintoApplication();
		ObjApp.NavigateToGearBags();
		ObjApp.SelectthirdItemAddtoCart();
		ObjApp.CaptureProductName();
		ObjApp.CaptureProductPrice();
		ObjApp.NavigateToCart();
		ObjApp.ValidateProductName();
		ObjApp.CloseApp();
		
	}
	
	@Test 
	public void TestReOrder() {
		
		//14th test case - Find out how many orders are there, check if order 000000671 is there or not
		ObjApp.LaunchApplication("Edge");
		ObjApp.LogintoApplication();
		ObjApp.GoToMyorders();
		ObjApp.OrderCount();
		ObjApp.VerifyOrderNo();
		ObjApp.CloseApp();
	}

	@Test
	public void TestAccountCreation() {
		ObjApp.LaunchApplication("Edge");
		ObjApp.AddDataToCreateAccount();
		ObjApp.SignOut();
	}
	

	
	
	
	
	
	
	
	
	
	
	


}
