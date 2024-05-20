package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DummyTests {
	
	@BeforeMethod
	public void DataTest() {
		System.out.println("--@@@@@Creating data for test");
	}
	@AfterMethod
	public void DataClean() {
		System.out.println("---@@@@@Delete data");
	}
	
	@BeforeClass
	public void ClearCookies() {
		System.out.println("&&&&&&&&&&&&&&&&&&&Clear Cookies");
	}

	
	@Test 
	public void TestItemsDisplay() {
		System.out.println("Test - TestItemsDisplay");
	}
	
	@Test 
	public void TestItemsImages() {
		System.out.println("Test - TestItemsImages");
	}

}
