package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginpage {
	
	public static void main(String args[]) {
	
//Initiate WebDriver Globally
	WebDriver driver;

//Configure Path
	String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
	System.setProperty("webdriver.chrome.driver",path+"msedgedriver.exe");
	driver=new EdgeDriver();
	
//Get Link
	driver.get("https://advantageonlineshopping.com/#/");
	
// FIND The Elements Using LinkText locator	
	driver.findElement(By.linkText("menuUser")).click();
	driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
	}

	 }

	
	

