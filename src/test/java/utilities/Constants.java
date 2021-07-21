package utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class Constants 
{

	//DATA FOR REGISDTRATION PROCESS

	private static String prefix = RandomStringUtils.randomAlphanumeric(8);
	private static String postfix = RandomStringUtils.randomAlphanumeric(8);
	
	public static final String EMAIL_ADDRESS_GENERATED =  prefix +"@test." +postfix ;
	
	
	public static final String FIRST_NAME ="Edzio";
	public static final String SEC_NAME = "Test2";
	public static final String PASSWORD ="test123";
	public static final String CITY = "Dublin";
	public static final String STATE = "Iowa";
	public static final String POSTCODE= "00000";
 	public static final String COUNTRY ="United States";
 	public static final String PHONE_NUMBER ="34500000";
	
 	///////////////////////////////////////
}
