package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseCases {

	WebDriver driver;
	@BeforeMethod
	public void Setup(String browserName) {
		CrossBrowserUtility cr=new CrossBrowserUtility();
		cr.method(browserName);
	}
	
	@AfterMethod
	public  void close() {
		driver.quit();
	}
	
}
