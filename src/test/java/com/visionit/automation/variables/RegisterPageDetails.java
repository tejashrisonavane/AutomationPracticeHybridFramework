package com.visionit.automation.variables;

import com.visionit.automation.utils.RandomNumberGeneratorUtil;

public class RegisterPageDetails {
	
	public RandomNumberGeneratorUtil randomUtil;
	
	public RegisterPageDetails() {
		randomUtil = new RandomNumberGeneratorUtil();
	}

	// Setter for Variable - SignIn Page
	public String getUserNewEmailId()
	{
		String newUserEmailId = "tejashrisonavane111"+randomUtil.randomStringGenerator()+"@gmail.com";
		return newUserEmailId;
	}
	//public static String NewUserEmailID = "DemoUser111"+randomUtil.randomStringGenerator()+"@gmail.com";
	
	// Setter for Variable - Register User Details FirstName
	public String getUserFirstName()
	{
		String userFirstName = randomUtil.randomStringGenerator();
		return userFirstName;
	}
	//public static String userFirstName = randomUtil.randomStringGenerator();
	
	
	// Setter for Variable - Register User Details LastName
	public String getUserLastName()
	{
		String userLastName = randomUtil.randomStringGenerator();
		return userLastName;
	}
	//public static String userLastName = randomUtil.randomStringGenerator();
	
	public static String getAddresscomanyname() {
		return AddressComanyName;
	}

	// Variables - Register User Details
	public static final String userPassword = "123@Abc";
	public static final String DOBDayValue = "20";
	public static final String DOBMonthValue = "3";
	public static final String DOBYearValue = "1996";
	public static final boolean IsSignUpForNewsLetter = true;
	public static final boolean IsspecialOfferEmailRec = true;
    private static final String AddressComanyName = "pesistent Systems";
	public static final String AddressLine1Name = "Shivaji nagar,pune";
	public static final String AddressLine2Name = "manikchand Road";
	public static final String AddressCity = "pune";
	public static final String AddressState = "Indiana";
	public static final String AddressZipCode = "41540";
	public static final String AddressAdditionalInfo = "Please Send do the proceedings ASAP";
	public static final String AddressHomePhone = "76657895";
	public static final String AddressMobilePhone = "+16465997479";
	public static final String AdddressAliasAddress = "sonavane99@gmail.com";

}
