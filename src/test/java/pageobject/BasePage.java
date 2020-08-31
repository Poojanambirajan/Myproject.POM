package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage(){ 
		String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
		System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
		driver = new EdgeDriver();
	
	}
	
	protected void open( String Url) {
		this .driver.get("https://advantageonlineshopping.com/#/");
	}
	protected void max() {
		this.driver.manage().window().maximize();
	}

	
protected void get(By image,By h1,By h2,By h3,By h4,By img2) {
		 driver.findElement(image).click();
		 driver.findElement(h1).click();
		 driver.findElement(h2).click();
		 driver.findElement(h3).click();
		 driver.findElement(h4).click();
		 driver.findElement(img2).click();
		}
protected void click(By  buynow) {
		 driver.findElement(buynow).click();
		}	
	
		}

