package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobject.BasePage;


public class SecondPage extends BasePage {
	WebDriver driver;
	
	public void type2() {
	By.cssSelector("div.class='categoryData");
	By.cssSelector("h1.class='roboto-bold ng-binding");
	By.cssSelector("h2.class='roboto-thin ng-binding']");
		
	By.xpath("//button[@role='button']");
	By.xpath("//h4[@id='accordionAttrib0']/preceding::h4[@id='accordionPrice']");
	By.xpath("//h4[@id='accordionPrice']/following::h4[@id='accordionAttrib0']");
	By.xpath("//div[@id='virtualFooter']");
		
}
	public void Second(WebDriver driverFromPreviousClass) {

		this.driver=driverFromPreviousClass;
	
}
}

