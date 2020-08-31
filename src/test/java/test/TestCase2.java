package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
WebDriver driver;

		 @BeforeClass
		 public void driver() {
		 		// TODO Auto-generated method stub
		 		
		 		String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
		 		System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
		 		driver=new EdgeDriver();
		 		driver.manage().window().maximize();
		 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	}
		 @Test(priority=1)
			public void Gotolink() throws Exception{
						//this .driver();
					driver.navigate().to("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
}
		 @Test(priority=2)
		 public void login()throws Exception {
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("n");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("poojakasthuri0507@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("poojakasthuri0507@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234user");
			System.out.println("acoount name created");
		 }
		 @Test(priority=3)
		 public void dropdown() {
			 WebElement date=driver.findElement(By.id("day"));
			 WebElement month=driver.findElement(By.id("month"));
			 WebElement year=driver.findElement(By.id("year"));
			 
			 Select dayDropdown=new Select (date);
			 Select monthDropdown=new Select(month);
			 Select yearDropdown=new Select(year);
			 
			 dayDropdown.selectByVisibleText("5");
			 monthDropdown.selectByVisibleText("Jul");
			 yearDropdown.selectByVisibleText("1998");
			 }
		 @Test(priority=4)
		 public void radio() {
			 WebElement radio1= driver.findElement(By.xpath("//input[@id='u_0_4']"));
			//WebElement radio2= driver.findElement(By.xpath("//input[@id='u_0_5']"));
			//WebElement radio3= driver.findElement(By.xpath("//input[@id='u_0_6']"));
			radio1.click();
			
		 }
		 @Test(priority=5)
		 public void button()
		 {
			 WebElement button=driver.findElement(By.id("u_0_14"));
			button.click();
	 }
	@AfterClass
	public void close() {
		driver.quit();
	}
}
				
			
		 
	
	

