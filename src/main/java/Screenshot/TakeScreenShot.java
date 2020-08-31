package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String path="C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\src\\test\\resources\\drivers\\";
		System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://advantageonlineshopping.com/#/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File("C:\\Users\\Lotus\\eclipse-workspace\\Myproject\\ScreenShots.png"));
		System.out.println("The ScreenShot is taken");
		driver.quit();

	}
}








