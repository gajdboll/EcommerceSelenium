package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverManagement.DriverManager;
import utilities.Log;

public class AfterLoginPage {
	
	WebDriver driver = DriverManager.getWebDriver();
	 WebDriverWait wait = new WebDriverWait(driver,10);
	 //constructor
	public AfterLoginPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
	
    //Elements for the page after The Login form on the PHPTRAVELS
	@FindBy(xpath = "//div/a[contains(text(),'Sign out')]")
	private WebElement signOut;
	
	//Method to call the elements on this page
	public WebElement GetSignOut() {
		
		return signOut;
	}
	public AfterLoginPage WaitForSignOutElement()
	{
		Log.info("Waiting Process begins here");
		wait.until(ExpectedConditions.visibilityOf(signOut));
		return this;
	}
	 

	

}
