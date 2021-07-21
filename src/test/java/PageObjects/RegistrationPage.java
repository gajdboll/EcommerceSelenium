package PageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataDriven.DataDriven;
import DriverManagement.DriverManager;

public class RegistrationPage {

	public static String em;
	public static String s;
	
	WebDriver driver = DriverManager.getWebDriver();
	 WebDriverWait wait = new WebDriverWait(driver,5);
	 
	public RegistrationPage() {
		// Accessing WebDriver from DriverManager.java
		PageFactory.initElements(DriverManager.getWebDriver(), this);
	}
    ////Finding the elements on the RegistrationPage
	@FindBy(id = "uniform-id_gender2")
	private WebElement Title;
	
	@FindBy(id = "customer_firstname")
	private WebElement first;

	@FindBy(name = "customer_lastname")
	private WebElement last;

	@FindBy(name = "phone_mobile")
	private WebElement phone; 

	@FindBy(name = "passwd")
	private WebElement pass;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "submitAccount")
	private WebElement button;

	@FindBy(name = "postcode")
	private WebElement postcode;

	@FindBy(name = "id_state")
	private WebElement state;
	
	@FindBy(name = "id_country")
	private WebElement country;

	@FindBy(name = "city")
	private WebElement city;
	/* those variables might be used later in the testing
	 * public static String getEmail() {
		return em;
	}
	public static String getPassword() {
		return s;
	}
	*/
	// Methods used to call the elements on the RegistrationPage
	public WebElement getfirstName() {
		return first;
	}

	public WebElement getlastName() {
		return last;
	}

	public WebElement getphone() {
		return phone;
	}
 
	public WebElement getpassword() {
		return pass;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement signUpButton() {
		return button;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getPostCode() {
		return postcode;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	 
	
       //Methods used to input data into each field on RegistrationPage

	public RegistrationPage enterFirstName(String firstname)
	{
		 wait.until(ExpectedConditions.visibilityOf(first));
		first.sendKeys(firstname);
		return this;
	}
	public RegistrationPage enterSecName(String secname)
	{
		last.sendKeys(secname);
		return this;
	}
	public RegistrationPage enterPassword(String _pass)
	{
		pass.sendKeys(_pass);
		return this;
	}
	
	public RegistrationPage enterAddress(String _address) {
		address.sendKeys(_address);
		return this;
	}
	public RegistrationPage enterCity(String _city) {
		city.sendKeys(_city);
		return this;
	}
	public RegistrationPage enterState(String _state) {
		state.click();
		Select select = new Select(state);
		select.getOptions();
		select.selectByValue(_state);
		return this;//////////////////////////////////////////////////work on that
	}
	public RegistrationPage enterZip(String _zip) {
		postcode.sendKeys(_zip);
		return this; 
	}
	public RegistrationPage enterCountry(String _country) {
		Select select = new Select(country);
		select.selectByValue(_country);
		return this;//////////////////////////////////////////////////work on that
	}
	public RegistrationPage enterContactNumber(String _phone) {
		phone.sendKeys(_phone);
		return this;
	}

	public AfterLoginPage ClickSignUp() {
		button.click();
		return new AfterLoginPage();
	}


}
