package Resources;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public WebDriver driver;
	
	public void browserInitalization() throws IOException {
		
		
		// to read the properties file
		FileInputStream fis = new FileInputStream ("C:\\Users\\Piyus\\eclipse-workspace\\selenium19thsepTsetNGProject\\src\\main\\java\\Resources\\data.properties");
		//rrrrrrr
		
		// to access the properties
		Properties prop =new Properties();
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("Webdriver.chrome.driver","C:\\Users\\Piyus\\eclipse-workspace\\selenium19thsepTsetNGProject\\src\\main\\java\\Resources\\data.properties");
			
			 
			driver = new ChromeDriver();
		}
			else if(browserName.equalsIgnoreCase("firefox")) {
				
				//
			}
			else {
				
				
				System.out.println("please enter valid browser");
				
			}
		}
		
		
	
	
}
