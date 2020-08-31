package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserUtility {
		
	WebDriver driver;
	String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
	public void method( String browserName) {
		
		switch (browserName){
		case "Chrome":
			System.setProperty("webdriver.chrome.drive",path+"\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://advantageonlineshopping.com/#/");	
			break;
		
		case "Edge":
			System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://advantageonlineshopping.com/#/");
			break;
	}
		dafault:
		{
		System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://advantageonlineshopping.com/#/");
	
		
		}
		}
	public static void main(String args[]) {
		CrossBrowserUtility browser= new CrossBrowserUtility();
		browser.method("edge");
	}
}
