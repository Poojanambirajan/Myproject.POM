package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


 class TestEdge {
	
 WebDriver driver;
 WebDriverWait wait ;
	

 @Test(priority=1)
 public void driver() {
 		// TODO Auto-generated method stub
 		
 		String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
 		System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
 		driver=new FirefoxDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
 		wait= new WebDriverWait(driver,30);
 		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 		
 	}
 	
	@Test(priority=2)
	public void Gotolink() throws Exception{
				//this .driver();
			driver.navigate().to("http://advantageonlineshopping.com/#/");
			
		}

	@Test(enabled=false)
	public void user() throws Exception {
		
	        
	       driver.findElement(By.id("menuUserSVGPath")).click();
	        System.out.println("user icon clicked");
	
	}
	@Test(enabled=false)
	public void login() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='sign_in_btnundefined']")));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pooja");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pooja1234");
     driver.findElement(By.xpath("//button[@id='sign_in_btnundefined']")).click();
     System.out.println("login given");
	}
	@Test(priority=3)
	public void click_Mice() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("miceImg")));
        driver.findElement(By.id("miceImg")).click();
	}
	/*@Test(priority=6)
    public void searchIteam() {
        driver.findElement(By.xpath("//input[@id='autoComplete']")).sendKeys("speaker");
        System.out.println("speaker is searched");
    }*/
	@Test(priority=4)
	  public void select_Mice() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='29']")));
        driver.findElement(By.xpath("//img[@id='29']")).click();
	}

	@Test(priority=5)
	  public void addToCart() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='save_to_cart']")));
        driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
    }
	 @Test(priority=6)
	    public void clickOnMenuCart() {
	        driver.findElement(By.xpath("//*[@id='menuCart']")).click();
	       
	    }
		@SuppressWarnings("deprecation")
		@Test(priority=7)
	    public void verifPageTitleTest() {
	        String title = driver.getTitle();
	        System.out.println("Title is:" +title);
	       String expectedTitle="Advantage Shopping";
	   Assert.assertEquals(title,expectedTitle);
				}
		
}


