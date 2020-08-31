package propertyfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//import browser. CrossBrowserUtility;

public class ConfigProperties {
	private static Properties props ;

	public  ConfigProperties () {
		try {
			props = new Properties();
			InputStream input = new FileInputStream("./src/test/resources/config/config.properties");
			props.load(input);
			System.out.println("property is loaded successfully.");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
	}

protected static  String getConfigValue(String key) {
		System.out.println(props.getProperty(key));
		return props.getProperty(key);

	}

}
