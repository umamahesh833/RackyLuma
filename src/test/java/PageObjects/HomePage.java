package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver Driver;
	
	By SigninLInk = By.linkText("Sign In");
	By CreateAccountLink = By.linkText("Create an Account");
	
	
	
	public void ClickSignin() {
		Driver.findElement(SigninLInk).click();
	}
	
	public void ClickCreateAccount() {
		Driver.findElement(CreateAccountLink).click();
	}
	

}
