package DriverManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	public static WebDriver getBrowser( BrowserType browser) 
	{
		System.out.println("The value of that is: " + browser);
		switch(browser) 
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
