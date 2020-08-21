package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage(){ 
		String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
		System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
		driver = new EdgeDriver();
	
	}
	
	protected void open(final String Url) {
		this .driver.get("https://advantageonlineshopping.com/#/");
	}
	protected void max() {
		this.driver.manage().window().maximize();
	}

	
protected void get(By image,By h1,By h2,By h3,By h4,By img2) {
		 driver.findElement(image);
		 driver.findElement(h1);
		 driver.findElement(h2);
		 driver.findElement(h3);
		 driver.findElement(h4);
		 driver.findElement(img2);
		}
protected void click(By  buynow) {
		 driver.findElement(buynow).click();
		}	
	
		}

