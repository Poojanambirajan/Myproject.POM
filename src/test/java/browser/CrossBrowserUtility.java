package browser;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import propertyfile.ConfigProperties;

public class CrossBrowserUtility  extends ConfigProperties{

public static String browserName;
public static String appURL;
protected static WebDriver driver;
static String Path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
	
@BeforeClass
	public  void setBrowserConfig() {
	  		System.out.println("BrowserConfiguration is called");
	    	browserName = ConfigProperties.getConfigValue("BrowserName");
	    	appURL=ConfigProperties.getConfigValue("appURL");
	    	System.out.println("thread id is" + Thread.currentThread().getId());
	    
		switch (browserName){
		
		case "Chrome":
			System.setProperty("webdriver.chrome.drive",Path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver",Path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",Path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
	
		default:
			System.setProperty("webdriver.gecko.driver",Path+"geckodriver.exe");
			driver=new FirefoxDriver();
		}
	driver.manage().window().maximize();
	driver.get(appURL);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

}


	 

	 



	
