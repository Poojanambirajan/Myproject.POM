package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLogin {

	//Initiate Webdriver globally
	WebDriver driver;
	
	//Created xpath locator
	
	By create=By.xpath("//h3[@translate='CREATE_ACCOUNT']");
	By accounttext=By.xpath("//h3[@translate='ACCOUNT_DETAILS']");
	By username=By.xpath("//input[@name='usernameRegisterPage']");
	By email=By.xpath("//input[@name='emailRegisterPage']");
	By Password=By.xpath("//input[@name='passwordRegisterPage']");
	By confirm=By.xpath("//input[@name='confirm_passwordRegisterPage']");
	//Created CSS locator
	
	By personaltext=By.cssSelector("h3#translate='PERSONAL_DETAILS");
	By FirstName=By.cssSelector("input#name='first_nameRegisterPage");
	By LastName=By.cssSelector("input#last_nameRegisterPage");
	By PhoneNumber=By.cssSelector("input#'phone_numberRegisterPage");

	//method

public void login(String password,String user,String mail,String confo,String fname,String lname, String ph) {


	type(username,user);
	type(email,mail);
	type(Password,password);
	type(confirm,confo);
	type(FirstName,fname);
	type(LastName,lname);
	type(PhoneNumber,ph);
	
}

private void type(By login, String login2) {
		// TODO Auto-generated method stub
	driver.findElement(username).sendKeys("name");
	driver.findElement(email).sendKeys("name@gmainlcom");
	driver.findElement(Password).sendKeys("1234hai");
	driver.findElement(confirm).sendKeys("1234hai");
	driver.findElement(FirstName).sendKeys("firstname");
	driver.findElement(LastName).sendKeys("lastname");
	driver.findElement(PhoneNumber).sendKeys("987654321");
	
}

//Created Constructor
public CreateLogin(WebDriver driverFromPreviousClass) {

	this.driver=driverFromPreviousClass;
}
}



