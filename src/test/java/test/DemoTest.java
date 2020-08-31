package test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import browser.CrossBrowserUtility;
public class DemoTest extends CrossBrowserUtility{
// public  WebDriver driver;
// WebDriverWait Wait;
	

	@Test(priority=1)
	public void get_title() {
		 String title = driver.getTitle();
	     System.out.println("Title is:" +title);
	     String expectedtitle="Index";
	     Assert.assertEquals(expectedtitle,title);
	     System.out.println("Assert passes");
	     System.out.println("thread id for get_title is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=2)
	public void get_logo() {
		WebElement logo=driver.findElement(By.id("logo"));
		Assert.assertEquals(true,logo.isDisplayed());
		System.out.println("logo is displayes----- Assert passed");
		System.out.println("thread id for logo is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=3)
	public void sign_in1() {
		driver.findElement(By.id("btn1")).click();
		System.out.println("thread id for sign_in is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=4)
	public void get_signin() {
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("pooja@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pooja1234");
		driver.findElement(By.id("enterbtn")).click();
		System.out.println("thread id for get_signin1 is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=5)
	public void navigate_to() {
		driver.navigate().to("http://demo.automationtesting.in/Index.html");
		System.out.println("thread id for navigate_to  is"+ Thread.currentThread().getId());
	}
	@Test(priority=6)
	public void sign_in() {
	
		driver.findElement(By.id("email")).sendKeys("pooja@gmil.com");
		driver.findElement(By.id("enterimg")).click();
		System.out.println("thread id forsign_in is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=7)
	public void register() {
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nambirajan");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("madurai'");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("pooja@gmil.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("987654321");
		System.out.println("thread id for register is"+ Thread.currentThread().getId());
	}
		@Test(priority=8)
		public void checkbox_assert() {
		WebElement cricket=driver.findElement(By.id("checkbox1"));
		cricket.click();
		Assert.assertEquals(true, cricket.isSelected());
		System.out.println("checkbox1 is clicked-- assert passed");
	
		WebElement movie=driver.findElement(By.id("checkbox2"));
		movie.click();
		Assert.assertEquals(true,movie.isSelected());
		System.out.println("checkbox2 is clicked-- assert passed");
		System.out.println("thread id forcheck_box is"+ Thread.currentThread().getId());
		}
		@Test(priority=9)
		public void radiobutton_assert() {
		WebElement radio1=driver.findElement(By.xpath("//input[@value='FeMale']"));
		radio1.click();
		Assert.assertEquals(true, radio1.isSelected());
		System.out.println("button is selected--assert passed");
		System.out.println("thread id for radiobutton is"+ Thread.currentThread().getId());
	}
	
	@Test(priority=10)
	public void assert_test_text() {
		WebElement text1=driver.findElement(By.xpath("//label[text()='Full Name* ']"));
		String ExpectedText1="Full Name*";
		Assert.assertEquals(ExpectedText1, text1.getText());
		System.out.println("Full Name*--assert is passed");
		
		//Address text
		WebElement text2=driver.findElement(By.xpath("//label[text()='Address']"));
		String ExpectedText2="Address";
		Assert.assertEquals(ExpectedText2,text2.getText());
		System.out.println("Address--assert passed");
		
		//Email address
		WebElement text3=driver.findElement(By.xpath("//label[text()='Email address*']"));
		String ExpectedText3="Email address*";
		Assert.assertEquals(ExpectedText3,text3.getText());
		System.out.println("thread id for assert_text_test is"+ Thread.currentThread().getId());
	}
	@Test(priority=11)
	public void language() {
		
       driver.findElement(By.xpath("//div[@id='msdd']")).click();
       List<WebElement> ele = driver.findElements(By.xpath("//div[@id='msdd']/following-sibling::div/ul/li"));
       for (int i=1; i<ele.size();i++)
       {
         String langname=ele.get(i).getText();
         if (langname.contains("English") || langname.contains("French"))
         {
            ele.get(i).click();
            System.out.println(ele.get(i).getText());
            System.out.println("Thread id for language is" + Thread.currentThread().getId());
         }
       }
	}
	
	@Test(priority=12)
		public void dropdown_assert() {
		WebElement select=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select dropdown=new Select(select);
		dropdown.selectByVisibleText("Java");
		System.out.println("thread id fordropdown_assert is"+ Thread.currentThread().getId());
	
	}
	

}
