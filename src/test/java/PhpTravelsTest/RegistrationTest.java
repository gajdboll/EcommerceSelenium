package PhpTravelsTest;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManagement.DriverManager;
import DriverManagement.TestBase;
import PageObjects.RegistrationPage;
import utilities.Log;
import utilities.Constants;
import PageObjects.AfterLoginPage;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
 

public class RegistrationTest extends TestBase {
/*
	@Test//(enabled=false)
	public void DataDrivenRegistrationTest() throws InterruptedException, IOException {
		//Expected result
		String expected = "Hi, Tensa Zangetsu";

		HomePage hp = new HomePage( );
		RegistrationPage rp= hp.SignUpProcess();
		AfterLoginPage alp = rp.LoginProcess();
		//alp.VerifyProcess();
		//Actual result
		Thread.sleep(2000);
		String actual = alp.Verify().getText();
		//Assertion text
		Assert.assertEquals(actual, expected);
		Log.info("RegistrationTest ran");


	}
		 */



	// The same test with manually passing values

	@Test
	public void ManualPassingValuesRegistrationTest() throws InterruptedException, IOException {
	
		String ExpectedURL = "http://automationpractice.com/index.php?controller=my-account";
		
		HomePage homePage = new HomePage();
		Thread.sleep(2000);
		CreateAccountPage createAccount= homePage.SignUpProcess();
		//createAccount.enterEmail("t0sjksdttt@asdE.we");
		createAccount.enterEmail(Constants.EMAIL_ADDRESS_GENERATED);
		RegistrationPage registrationPage = createAccount.ClickSubmit();
		registrationPage.enterFirstName(Constants.FIRST_NAME).
						enterSecName(Constants.SEC_NAME).
						enterPassword(Constants.PASSWORD).
						enterAddress(Constants.ADDRESS).
						enterCity(Constants.CITY).
						enterState(Constants.STATE).
						enterZip(Constants.POSTCODE).
						enterCountry(Constants.COUNTRY).
						enterContactNumber(Constants.PHONE_NUMBER);
		AfterLoginPage afterRegistration = 	registrationPage.ClickSignUp();
		
		String actualResults = DriverManager.getWebDriver().getCurrentUrl();
		
		Assert.assertEquals(actualResults, ExpectedURL);
		
		Thread.sleep(2000);
		
		// assertion - url
	}

	
	/*Test 3 
	 * 
	 * Create Test for invalid email on registration page 
	 * -> verify that correct error message occurs on the top of the page
	 * 
	 * 
	 *********************************************
	 * Test 4
	 * 
	 * Create Test for blank email on registration page 
	 * -> verify that correct error message occurs on the top of the page
	 * 
	 * ******************************************************************
	 * 
	 * Test 5
	 * 
	 * Create Test for password doesnt match  confirmation password on registration page 
	 * -> verify that correct error message occurs on the top of the page
	 * 
	 * *-**************************************************
	 * Test 6
	 * 
	 * Create Test for less than 6 character password on registration page 
	 * -> verify that correct error message occurs on the top of the page
	 * 
	 * 
	 * 
	 * 
	 * */
}
