package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage {
	WebDriver Driver;
	
 By EmailAddress = 	By.id("email");
 By Password = 	By.id("pass");
 By LoginButton = 	By.id("send2");
	
	
	public void LogintoApplication() {
		
		Driver.findElement(EmailAddress).sendKeys("QAAuto145867@gmail.com");
		Driver.findElement(Password).sendKeys("Test@12345");
		Driver.findElement(LoginButton).click();
	}
	

}
