package UtilityMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppMethods {
	

	public WebDriver Driver;
	int OrdersCount;
	String IName;
	
	public void LaunchApplication(String sStr) {
		
		if(sStr.equals("Chrome")) {
			//Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
			Driver = new ChromeDriver();
			
		}else if(sStr.equals("Edge")) {
			String EdgDriverPath = "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\edgedriver_win64 (3)\\msedgedriver.exe";
			//Launch the browser - Edge
			System.setProperty("webdriver.edge.driver", EdgDriverPath);
			Driver = new EdgeDriver();
			
		}else {
			System.out.println("Invalid browser name");
		}


		//add page pageload time
		Driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//Add implicit wait of 20 secs
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Driver.get("https://magento.softwaretestingboard.com/");
		Driver.manage().window().maximize();
		
		//Click on accept cookies by clicking on Concent
		//WebElement ConcentBTN = Driver.findElement(By.cssSelector("button[aria-label='Consent']"));
		//ConcentBTN.click();
	}
	
	
	public void LogintoApplication() {
		//CLick on sign in
		WebElement SignInLink = Driver.findElement(By.linkText("Sign In"));
		SignInLink.click();
		
		Driver.findElement(By.id("email")).sendKeys("QAAuto145867@gmail.com");
		Driver.findElement(By.id("pass")).sendKeys("Test@12345");
		Driver.findElement(By.id("send2")).click();
	}
	
	public void NavigateToMensTops() {
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eMen = Driver.findElement(By.cssSelector("#ui-id-5"));
		
		ObjAct.moveToElement(eMen).build().perform();
		
		//Click tops and jackets
		Driver.findElement(By.linkText("Tops")).click();
	}
	
	public void NavigateToWomenBottom() {
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eMen = Driver.findElement(By.cssSelector("#ui-id-4"));
		
		ObjAct.moveToElement(eMen).build().perform();
		
		//Click tops and jackets
		Driver.findElement(By.linkText("Bottoms")).click();
	}
	
	public int CountItems() {
		List<WebElement> Items =Driver.findElements(By.xpath("//li[@class='item product product-item']"));
		int value = Items.size();
		
		return value;
	}
	
	
	public void NavigateToWomenTops() {
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eMen = Driver.findElement(By.cssSelector("#ui-id-4"));
		
		ObjAct.moveToElement(eMen).build().perform();
		
		//Click tops and jackets
		Driver.findElement(By.linkText("Tops")).click();
	}
	
	
	public void NavigateToGearWatches() {
		
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eGear = Driver.findElement(By.cssSelector("#ui-id-6"));
		ObjAct.moveToElement(eGear).build().perform();
		
		//Click tops and jackets
		Driver.findElement(By.linkText("Watches")).click();
	}
	
	public void GoToMyorders() {
		Driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
		Driver.findElement(By.linkText("My Account")).click();
		Driver.findElement(By.linkText("My Orders")).click();
				
	}
	
	public void OrderCount() {
		
		
		List<WebElement> OrderCntELE = Driver.findElements(By.xpath("//table[@id='my-orders-table']/tbody/tr**"));
		
		OrdersCount = OrderCntELE.size();
		System.out.println("Orders count is -"+OrdersCount);
		
		
	}
	
	public void VerifyOrderNo() {
		
		
		for(int i=1;i<OrdersCount+1;i++) {
			
		String TableXpath = "//table[@id='my-orders-table']/tbody/tr["+i+"]/td[1]";
			
		String str = Driver.findElement(By.xpath(TableXpath)).getText();
			if(str.equals("000000671")) {
				System.out.println("Yes order no is there in the table");
			}	
		}
		
	}
	
	
	public void NavigateToGearBags() {
		
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eGear = Driver.findElement(By.cssSelector("#ui-id-6"));
		ObjAct.moveToElement(eGear).build().perform();
		
		//Click on bags
		Driver.findElement(By.linkText("Bags")).click();
	}
	
	public void SelectthirdItemAddtoCart() {
		String sXpath = "//ol[@class='products list items product-items']/li[3]/div/div/strong/a";
		Driver.findElement(By.xpath(sXpath)).click();
		
		//Click on add to cart button
		Driver.findElement(By.cssSelector("button[title='Add to Cart']")).click();
	}
	
	public void SelectAnyItemAddtoCart() {
		String sXpath = "//ol[@class='products list items product-items']/li[3]/div/div/strong/a";
		Driver.findElement(By.xpath(sXpath)).click();
		
		//Select size and color
		Driver.findElement(By.xpath("//div[@option-id='171']")).click();
		Driver.findElement(By.xpath("//div[@option-id='49']")).click();
		
		
		//Click on add to cart button
		Driver.findElement(By.cssSelector("button[title='Add to Cart']")).click();
	}
	
	public void CaptureProductName() {

		
		//Capture product name
		IName = Driver.findElement(By.cssSelector("span[itemprop='name']")).getText();
		System.out.println(IName);
	}
	public void CaptureProductPrice() {	
		////Capture product Price
		//String IPrice = Driver.findElement(By.cssSelector("(//span[@itemprop='offers']/span/span)[1]")).getText();

		//System.out.println(IPrice);
	}
	

	public void NavigateToCart(){
		System.out.println("IN NavigateToCart method");
		//Thread.sleep(5000);
		//navigate to cart page
		//Driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		//Driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
		Driver.findElement(By.linkText("shopping cart")).click();
	}
	
	
	
	public void ValidateProductName() {
		//Capture product name in cart page
		String INameCart = Driver.findElement(By.xpath("(//strong[@class='product-item-name'])[2]")).getText();
		
		if(INameCart.equals(IName)) {
			System.out.println("add to cart Test case is pass");
		}
		
	}
	
	public void ValidateSubtotalCalculation() throws Exception {
		
	//Capture unit price
	String UnitPrice = Driver.findElement(By.xpath("//td[@class='col price']/span/span/span")).getText();
	//Update Qantity
	Driver.findElement(By.xpath("//input[@title='Qty']")).clear();
	Driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("5");
	//CLick on Update shopping cart button
	Driver.findElement(By.xpath("//button[@title='Update Shopping Cart']")).click();
	
	Thread.sleep(5000);
	//Capture unit price
	//Implement Explicit wait
	WebElement EleSubtotal = Driver.findElement(By.xpath("//td[@class='col subtotal']/span/span/span"));
	WebDriverWait ObjExpWait = new WebDriverWait(Driver, 120);
	ObjExpWait.until(ExpectedConditions.elementToBeClickable(EleSubtotal));
	
	String SubTotalPrice = EleSubtotal.getText();
	int uPrice = Integer.valueOf(UnitPrice.replace("$", "").replace(".00", ""));
	int stPrice = Integer.valueOf(SubTotalPrice.replace("$", "").replace(".00", ""));
	System.out.println("Unit price-"+uPrice);
	System.out.println("SubTotalPrice-"+stPrice);
		if(uPrice*5==stPrice) {
			System.out.println("Price calculation test case pass");
		}else {
			System.out.println("Price calculation test case fail");
		}
	}
	
	
	public void CloseApp() {
		Driver.quit();
	}
	
	public void AddDataToCreateAccount() {
		
		//Click on Create an account link
		WebElement CreateAcntLink = Driver.findElement(By.linkText("Create an Account"));
		CreateAcntLink.click();
		
		//Fill all fileds to create an account
		Driver.findElement(By.id("firstname")).sendKeys("QA");
		Driver.findElement(By.id("lastname")).sendKeys("Automation");
		
		Driver.findElement(By.name("email")).sendKeys("QAAuto12480@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("Test@12345");
		Driver.findElement(By.name("password_confirmation")).sendKeys("Test@12345");
	
		//Click on Create an account button
		WebElement CreatacntBtn = Driver.findElement(By.xpath("//button[@title='Create an Account']"));
		CreatacntBtn.click();
	}
	
	
	public void SignOut() {
		//CLick on Arrow
		Driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
		//Click on signout
		Driver.findElement(By.linkText("Sign Out")).click();
	}
	
	
	
	

}
