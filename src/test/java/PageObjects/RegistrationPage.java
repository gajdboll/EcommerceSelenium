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
import utilities.Log;

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
	{	Log.info("Start of the Enter First Name");
		wait.until(ExpectedConditions.visibilityOf(first));
		first.sendKeys(firstname);
		Log.info("Finish of the Enter First Name");
		return this;
	}
	public RegistrationPage enterSecName(String secname)
	{
		Log.info("Start of the Enter Second Name");
		last.sendKeys(secname);
		Log.info("Finish of the Enter Second Name -> your sec name is: " + secname);
		return this;
	}
	public RegistrationPage enterPassword(String _pass)
	{
		Log.info("Start of the Enter Password");
		pass.sendKeys(_pass);
		Log.info("Finish of the Enter Password");
		return this;
	}
	
	public RegistrationPage enterAddress(String _address) {
		Log.info("Start of the Enter Address");
		address.sendKeys(_address);
		Log.info("Finish of the Enter Address");
		return this;
	}
	public RegistrationPage enterCity(String _city) {
		Log.info("Start of the Enter City");
		city.sendKeys(_city);
		Log.info("Finish of the Enter City");
		return this;
	}
	 
	public RegistrationPage enterState(String _state) {
		Log.info("Start of the Enter State");
		state.click();
		Select select = new Select(state);
		int sizeOfTheDropDownState= select.getOptions().size();	
		Random r = new Random();
		select.selectByIndex(r.nextInt(sizeOfTheDropDownState-1));
		Log.info("Finish of the Enter State");
		return this;/////////////////////////////////////////////////randomly select one value -> by index
	}
	public RegistrationPage enterZip(String _zip) {
		Log.info("Start of the Enter ZipCode");
		postcode.sendKeys(_zip);
		Log.info("Finish of the Enter ZipCode");
		return this; 
	}
	public RegistrationPage enterCountry(String _country) {
		Log.info("Start of the Enter Country");
		Select select = new Select(country);
		int sizeOfTheDropDownCountry= select.getOptions().size();	 
		select.selectByIndex( sizeOfTheDropDownCountry-1);
		Log.info("Finish of the Enter Country");
		return this;///////////////////////////////////////////////always select last value////
	}
	public RegistrationPage enterContactNumber(String _phone) {
		Log.info("Start of the Enter Phone Number");
		phone.sendKeys(_phone);
		Log.info("Finish of the Enter Number-> your phone  is: " + _phone);
		return this;
	}

	public AfterLoginPage ClickSignUp() {
		button.click();
		return new AfterLoginPage();
	}


}
