package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.RegisterPageDetails;

public class RegisterPage extends BasePage{

	private static final Logger logger = LogManager.getLogger(RegisterPage.class);

	ElementActions elementActions;
	RegisterPageDetails registerPageUserDetails;

	// By Locators - Landing Page
	private By SigninButtonElement = By.xpath("//div/a[contains(text(),'Sign in')]");
	
	// Locators - SingIn Page
	private By emailIdInputFieldElement = By.xpath("//input[@id='email_create']");
	private By createAnAccountButtonElement = By.xpath("//button[@id='SubmitCreate']");
	
	// By Locators - Register Page
	private By maleGenderRadioButtonElement = By.id("id_gender1");
	private By userFirstNameTextboxElement = By.id("customer_firstname");
	private By userLastNameTextboxElement = By.id("customer_lastname");
	private By userPasswordTextboxElement = By.id("passwd");
	private By userDOBDayDropDownElement = By.id("days");
	private By userDOBMonthDropDownElement = By.id("months");
	private By userDOBYearDropDownElement = By.id("years");
	private By signUpForNewsLetterCheckBoxElement = By.id("newsletter");
	private By specialOfferEmailRecCheckBoxElement = By.id("optin");
	private By AddressComanyNameTextBoxElement = By.id("company");
	private By AddressLine1TextBoxElement = By.id("address1");
	private By AddressLine2TextBoxElement = By.id("address2");
	private By AddressCityTextBoxElement = By.id("city");
	private By AddressStateDropDownElement = By.id("id_state");
	private By AddressZipCodeTextBoxElement = By.id("postcode");
	//private By AddressCountryDropDownElement = By.id("id_country");
	private By AddressAdditionalInfoTextBoxElement = By.id("other");
	private By AddressHomePhoneTextBoxElement = By.id("phone");
	private By AddressMobilePhoneTextBoxElement = By.id("phone_mobile");
	private By AdddressAliasAddressTextBoxElement = By.id("alias");
	private By registerFormButtonElement = By.id("submitAccount");

	// Locators - After Registration Page
	private By registeredUserNameDisplayElement = By.xpath("//a[@title='View my customer account']/span");

	// Constructor of the page:
	public RegisterPage(WebDriver driver) {
		elementActions = new ElementActions(driver);
		registerPageUserDetails = new RegisterPageDetails();
	}

	// Page Actions:
	public boolean registerUserInApp(boolean IsSignUpForNewsLetter, boolean IsspecialOfferEmailRegister)
	{
		String newUserEmailId = registerPageUserDetails.getUserNewEmailId();
		String newUserFirstName = registerPageUserDetails.getUserFirstName();
		String newUserNameName = registerPageUserDetails.getUserLastName();
		// SignIn Page 
		logger.info("waiting for Signin button on landing page");
		elementActions.waitForElementClickable(SigninButtonElement);
		elementActions.doClick(SigninButtonElement);
		logger.info("Clicked on Signin button from landing page");
		elementActions.doSendKeys(emailIdInputFieldElement, newUserEmailId);
		logger.info("Sending new user email id as : " + newUserEmailId);
		elementActions.doClick(createAnAccountButtonElement);
		logger.info("Clicked on create an account button from login page");
		
		// User registration page
		elementActions.doClick(maleGenderRadioButtonElement);
		logger.info("Clicked on male gender radio button");
		elementActions.doActionsSendKeys(userFirstNameTextboxElement, newUserFirstName);
		logger.info("Sent text for user first name as : " + newUserFirstName);
		elementActions.doActionsSendKeys(userLastNameTextboxElement, newUserNameName);
		logger.info("Sent text for user last name as : " + newUserNameName);
		elementActions.doActionsSendKeys(userPasswordTextboxElement, RegisterPageDetails.userPassword);
		logger.info("Sent text for user password as : " + RegisterPageDetails.userPassword);
		elementActions.selectByValueFromDropDown(userDOBDayDropDownElement, RegisterPageDetails.DOBDayValue);
		logger.info("Selected value from drop down Birth Day for user as : " + RegisterPageDetails.DOBDayValue);
		elementActions.selectByValueFromDropDown(userDOBMonthDropDownElement, RegisterPageDetails.DOBMonthValue);
		logger.info("Selected value from drop down Birth Month for user as : " + RegisterPageDetails.DOBMonthValue);
		elementActions.selectByValueFromDropDown(userDOBYearDropDownElement, RegisterPageDetails.DOBYearValue);
		logger.info("Selected value from drop down Birth Year for user as : " + RegisterPageDetails.DOBYearValue);
		if(IsSignUpForNewsLetter) 
		{
			elementActions.doClick(signUpForNewsLetterCheckBoxElement);
			logger.info("Clicked on sign Up For News Letter Check Box option");
		}
		if (IsspecialOfferEmailRegister) 
		{
			elementActions.doClick(specialOfferEmailRecCheckBoxElement);
			logger.info("Clicked on special Offer Email RecCheck Box option");
		}
		
		elementActions.doActionsSendKeys(AddressComanyNameTextBoxElement, RegisterPageDetails.getAddresscomanyname());
		logger.info("Sending user Company address name as : " + RegisterPageDetails.getAddresscomanyname());
		elementActions.doActionsSendKeys(AddressLine1TextBoxElement, RegisterPageDetails.AddressLine1Name);
		logger.info("Sending user Company address line 1 as : " + RegisterPageDetails.getAddresscomanyname());
		elementActions.doActionsSendKeys(AddressLine2TextBoxElement, RegisterPageDetails.AddressLine2Name);
		logger.info("Sending user Company address line 2 as : " + RegisterPageDetails.AddressLine2Name);
		elementActions.doActionsSendKeys(AddressCityTextBoxElement, RegisterPageDetails.AddressCity);
		logger.info("Sending user city name as : " + RegisterPageDetails.AddressCity);
		elementActions.selectByVisibleTextFromDropDown(AddressStateDropDownElement, RegisterPageDetails.AddressState);
		logger.info("Selecting user state from drop down as : " + RegisterPageDetails.AddressState);
		elementActions.doActionsSendKeys(AddressZipCodeTextBoxElement, RegisterPageDetails.AddressZipCode);
		logger.info("Sending user postal zip code as : " + RegisterPageDetails.AddressZipCode);
		elementActions.doActionsSendKeys(AddressAdditionalInfoTextBoxElement, RegisterPageDetails.AddressAdditionalInfo);
		logger.info("Sending user addition info as : " + RegisterPageDetails.AddressAdditionalInfo);
		elementActions.doActionsSendKeys(AddressHomePhoneTextBoxElement, RegisterPageDetails.AddressHomePhone);
		logger.info("Sending user home phone no as : " + RegisterPageDetails.AddressHomePhone);
		elementActions.doActionsSendKeys(AddressMobilePhoneTextBoxElement, RegisterPageDetails.AddressMobilePhone);
		logger.info("Sending user mobile phone no as : " + RegisterPageDetails.AddressMobilePhone);
		elementActions.doActionsSendKeys(AdddressAliasAddressTextBoxElement, RegisterPageDetails.AdddressAliasAddress);
		logger.info("Sending user alias address as : " + RegisterPageDetails.AdddressAliasAddress);
		elementActions.doClick(registerFormButtonElement);
		logger.info("Clicking on register button after filling all required data");
		
		// After registration page
		logger.info("After clicking on register button waiting for registered user name in application next page");
		elementActions.waitForElementVisible(registeredUserNameDisplayElement);
		String registeredUserFirstNameLastNameText = elementActions.doGetText(registeredUserNameDisplayElement);
		logger.info("Actual registered user first name and last name is displayed as : " + registeredUserFirstNameLastNameText);
		String expectedUserFirstNameLastNameText = newUserFirstName + " " + newUserNameName;  
		logger.info("Expected registered user first name and last name  as : " + expectedUserFirstNameLastNameText);
		logger.info("Comparing registered user Actual Firstname Lastname with Expected one");
		if (registeredUserFirstNameLastNameText.equals(expectedUserFirstNameLastNameText)) {
			return true;
		}
		else
		{
			return false;
		}		
	}

	/*public boolean ChangeImageColour(boolean b, boolean c) {

		return false;
	}*/
;
	}

	

