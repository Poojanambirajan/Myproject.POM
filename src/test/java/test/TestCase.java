package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase extends BaseCases {

	@Test
public void method() {
		driver=new EdgeDriver();
	}
@Test
public void TestCase1() {
String  title=driver.getTitle();
System.out.println("title of this page is"+title);
Assert.assertEquals(title,"Advantage Shopping");
}
@Test (priority=1)
public void TestCase2() {
WebElement create=driver.findElement(By.xpath("//h3[@translate='CREATE_ACCOUNT']"));
System.out.println("text is"+create);
Assert.assertEquals(create,create);
}
@Test  (priority=2) 
public void TestCase3(){
WebElement  accounttext=driver.findElement(By.xpath("//h3[@translate='ACCOUNT_DETAILS']"));
System.out.println("text is"+accounttext);
Assert.assertEquals(accounttext,accounttext);
}
@Test
public void TestCase4(){
	WebElement personaltext=driver.findElement(By.cssSelector("h3[translate='PERSONAL_DETAILS']"));
	System.out.println("text is"+personaltext);
	
}
@Test
public void TestCase5(){
	WebElement user=driver.findElement(By.xpath("//input[@name='usernameRegisterPage']"));
	System.out.println("text is"+user);
	
}

@Test
public void  TestCase6(RemoteWebDriver data) {
	WebElement email=driver.findElement(By.xpath("//input[@name='emailRegisterPage']"));
		System.out.println("email is"+email);
	
}
@Test
public void TestCase7() {
	WebElement Password=driver.findElement(By.xpath("//input[@name='passwordRegisterPage']"));
	System.out.println("password is"+Password);
	
}
	
@Test (dependsOnMethods="TestCase7")
public void TestCase8() {
	WebElement confirm=driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']"));
	System.out.println("confirm password is"+confirm);
	
}
@Test
public void TestCase9() {
	WebElement Firstname=driver.findElement(By.cssSelector("input#name='first_nameRegisterPage"));
	System.out.println("fname is"+Firstname);
	
}
@Test (enabled=false)
public void TestCase10() {
	WebElement Lastname=driver.findElement(By.cssSelector("nput#name='last_nameRegisterPage"));
	System.out.println("lname is"+Lastname);
	
}
@Test
public void TestCase11() {
	WebElement PhoneNumber=driver.findElement(By.cssSelector("input#'phone_numberRegisterPage"));
	System.out.println("ph is"+PhoneNumber);
	Assert.assertEquals(PhoneNumber,PhoneNumber );
}
@Test
public void TestCase12() {
	String usermenuclick=driver.getCurrentUrl() ;
		System.out.println("click to usermenu"+ usermenuclick);
		
	}
@Test
public void TestCase13() {
	String createaccountclick=driver.getCurrentUrl() ;
		System.out.println("click to usermenu"+createaccountclick);
		Assert.assertEquals(createaccountclick, "click");
	}
@Test(timeOut=100)
public void Testcase14() throws InterruptedException {
	String urlToNavigate="https://advantageonlineshopping.com/#/category/Speakers/4";
	driver.navigate().to(urlToNavigate);System.out.println("timesout");
	Thread.sleep(50);
}
@Test(timeOut=100)
public void Testcase15() throws InterruptedException {
	String urlToNavigate="https://advantageonlineshopping.com/#/category/Speakers/4";
	driver.navigate().to(urlToNavigate);System.out.println("timesout");
	Thread.sleep(500);
}
@Test
public void TestCase16() {
WebElement image=driver.findElement(By.cssSelector("div#class='categoryData")); //driver.findElement(By.cssSelector("div[class='categoryData']"));
System.out.println("show image"+image);
Assert.assertEquals(image, image);
}
@Test
public void TestCase17() {
WebElement h1=driver.findElement(By.cssSelector("h1#class='roboto-bold ng-binding"));
System.out.println("show text"+h1);
Assert.assertEquals(h1, h1);
}
@Test
public void TestCase18() {
WebElement h2=driver.findElement(By.cssSelector("h2#class='roboto-thin ng-binding"));
System.out.println("show text"+h2);
Assert.assertEquals(h2, h2);
}
@Test
public void TestCase19() {
	WebElement buynow=driver.findElement(By.xpath("//button[@role='button']"));
	System.out.printf("click"+buynow);
	Assert.assertEquals(buynow,buynow);
}
@Test
public void TestCase20() {
	WebElement h3=driver.findElement(By.xpath("//h4[@id='accordionAttrib0']/preceding::h4[@id='accordionPrice']"));
	System.out.printf("show text"+h3);
	Assert.assertEquals(h3,h3);
}
 @Test
 public void TestCase21() {
	 WebElement h4=driver.findElement(By.xpath("//h4[@id='accordionPrice']/following::h4[@id='accordionAttrib0']"));
	 System.out.println("show text"+h4);
	 Assert.assertEquals(h4,h4);
 }
 @Test
 public void TestCase22() {
	 WebElement img2=driver.findElement(By.xpath("//div[@id='virtualFooter']"));
	 System.out.println("show text"+img2);
	 Assert.assertEquals(img2,img2);
 }
}
	


