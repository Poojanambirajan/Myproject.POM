package configreader;


	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	 
	public class ConfigPage {

	 

	        // TODO Auto-generated method stub
	             String configPath;
	             Properties prop;
	             public ConfigPage(String configPath) throws Exception
	             {
	                 this.configPath=configPath;
	                 File fi=new File(this.configPath);
	                 FileInputStream read=new FileInputStream(fi);
	                 prop=new Properties();
	                 prop.load(read);
	               
	             }
	             public void Configshow(String key)throws Exception
	             {
	                //Properties prop=new Properties();
	                //prop.get(key);
	                System.out.println(prop.getProperty(key));
	             } 
	            public static void main(String args[])throws Exception {
	                ConfigPage cr=new ConfigPage("C:\\Users\\Lotus\\eclipse-workspace\\demo\\src\\test\\resources\\config\\config.properties");
	                cr.Configshow("browserName");
	                cr.Configshow("username");
	                cr.Configshow("password");
	            }
	         }
	 

