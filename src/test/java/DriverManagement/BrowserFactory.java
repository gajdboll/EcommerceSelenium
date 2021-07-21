package DriverManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	public static WebDriver getBrowser(BrowserType browserType)
	{
		switch(browserType) 
		{
		case CHROME:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
        case EDGE:
        	WebDriverManager.edgedriver().setup();
        	return new EdgeDriver();
        default:
            throw new IllegalStateException("Unknown browser type! Please check your configuration");
		}
	}
	
	
	

}
