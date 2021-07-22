package DriverManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	//in this field we specify the browser type
	private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;
	private static WebDriver driver;
//construktor
	private DriverManager() {	}
     
	//Class designed to create only one instance of the WebDriver / Singleton pattern
	//driver getter
	@Parameters("browser")
	public static WebDriver getWebDriver() {
		if (driver == null) {
			//initiating driver using WebDriverManager
			//WebDriverManager.chromedriver().setup();
			//below lines only used once you are using driver installed on your system
			// Initiate chrome driver
			driver = BrowserFactory.getBrowser(BROWSER_TYPE);
			 

		}
		return driver;

	}
       //Stopping the WebDriver method
	public static void killDriver() {
		driver.close();
		//that if statement is presented only to make sure that browser is killed
		// if (!BROWSER_TYPE.equals(BrowserType.FIREFOX))
			 driver.quit();
         
		driver = null;

	}

}
