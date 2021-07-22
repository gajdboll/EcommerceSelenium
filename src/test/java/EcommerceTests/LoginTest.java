package EcommerceTests;

import org.testng.annotations.DataProvider;

import utilities.Constants;
import utilities.ExcelUtils;

public class LoginTest {
	
	/*Test 1 
	 * Create a test for Logging -> with correct data / happy path 
	 * Start your journey from Home page -> select 
	*use the same data you have used to create a profile in the registration section
	 ***************************
	 *Test 2 
	 * Create a test for Logging -> with correct data / happy path -> Similar as above - but this time use Excel attached to that framework
	 * modify that sec tab / log tab with correct data and pass those values from excel as a parameters in your test
	 * Start your journey from Home page -> select 
	*use the same data you have used to create a profile in the registration section
	*verify that you can successfully Log In (by asserting unique element from AfterLoginPage / or assert correct url on After Login Page)
	*************************************
	*Test 3 
	*Create a test for invalid email address on sec page / Login Page (make sure you start your journey from home page)
	*Assert that correct Error message occur once invalid address is enter in the email address field
	*****************
	**Test 4 
	*Create a test for blank email address on sec page / Login Page (make sure you start your journey from home page)
	*Assert that correct Error message occur once blank address is enter in the email address field
	*****************
	Test 5
	*Create a test for invalid password   on sec page / Login Page (make sure you start your journey from home page)
	*Assert that correct Error message occur once invalid address is enter in the password address field
	*Test 6
	*Create a test for blank password   on sec page / Login Page (make sure you start your journey from home page)
	*Assert that correct Error message occur once blank address is enter in the password address field
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// use that code to connect your test with Excel Sheet / sec tab which is log(and contains data for your test)
	@DataProvider
	public Object[][] log() throws Exception
	{
		String rootDir = System.getProperty("user.dir");
        Object[][] testObjArray = ExcelUtils.getTableArray(rootDir + Constants.EXCEL_DIRECTORY,Constants.EXCEL_SEC_TAB);

        return (testObjArray);

	}


}
