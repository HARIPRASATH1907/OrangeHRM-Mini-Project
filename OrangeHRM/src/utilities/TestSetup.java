package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestSetup {


		public static Properties prop;
		public static WebDriver driver;
		static {
			try {
				System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\Driver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
		    options.addArguments("start-maximized");  
		    driver=new ChromeDriver(options);
				
		    File f=new File("D:\\eclipse-workspace\\OrangeHRM\\input1.properties");
			FileInputStream obj=new FileInputStream(f);
			prop=new Properties();
			prop.load(obj);
			}
			catch (Exception e) {	
			}
		}
}
