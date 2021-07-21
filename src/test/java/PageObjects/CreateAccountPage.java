package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverManagement.DriverManager;

public class CreateAccountPage {
	
	public CreateAccountPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
	//Finding the elements on the CreateAccountPage
	WebDriver driver = DriverManager.getWebDriver();
	 WebDriverWait wait = new WebDriverWait(driver,10);
	
	@FindBy(id = "email_create")
	private WebElement emailAddress;
	
	@FindBy(id = "SubmitCreate")
	private WebElement SubmitBtn;
 
	
	public WebElement getEmail() {
		return emailAddress;
	}
	
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	// fill in the email and password to Login In
	public CreateAccountPage enterEmail(String Email)
	{
		emailAddress.sendKeys(Email);
		return this;
		
	}
	public RegistrationPage ClickSubmit( )
	{
		 wait.until(ExpectedConditions.visibilityOf(SubmitBtn));
		SubmitBtn.click();
		return new RegistrationPage();
		
	}

}
