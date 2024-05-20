package TestScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilityMethods.AppMethods;

public class ItemsDisplayTest {
	AppMethods ObjApp = new AppMethods();
	
	
	@BeforeMethod
	public void DataTest() {
		System.out.println("Creating data for test");
	}
	
	
	@Test 
	public void TestItemsDisplay() {
		//6th test case
		ObjApp.LaunchApplication("Chrome");
		ObjApp.LogintoApplication();
		ObjApp.NavigateToMensTops();
		int Items = ObjApp.CountItems();
		//Test validation
		if(Items == 12) {
			System.out.println("6 th test case is pass");
		}else {
			System.out.println("6 th test case is Fail");
		}
		ObjApp.CloseApp();	
	}
	
	@Test 
	public void TestItemsImages() {
		ObjApp.LaunchApplication("Chrome");
		ObjApp.LogintoApplication();
		ObjApp.NavigateToMensTops();
		System.out.println("TestItemsImages");
	}

}
