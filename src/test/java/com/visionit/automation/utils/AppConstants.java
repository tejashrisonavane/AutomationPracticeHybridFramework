package com.visionit.automation.utils;

import java.util.ArrayList;
public class AppConstants {
	
	
	public static final int WEBDRIVER_WAIT_TIMEOUT = 15;
	public static final String LANDING_PAGE_REDIRECTED_URL = "http://automationpractice.com/index.php";
	public static final String LANDING_PAGE_TITLE = "My Store";
	
	public static ArrayList<String> landingPageProdCategoryExpected()
	{
		ArrayList<String> LANDING_PAGE_PROD_CATEGORY_EXPECTED = new ArrayList<>();
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("WOMEN");
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("DRESSES");
		LANDING_PAGE_PROD_CATEGORY_EXPECTED.add("T-SHIRTS");
		
		return LANDING_PAGE_PROD_CATEGORY_EXPECTED;
	}
	
	public static final  String SIGNIN_PAGE_TITLE = "Login - My Store";
	public static final String FRIEND_FEATURE_TEST = "click on Tshirt";
    public static final String REGISTERED_PSSWRD = "123@Abc";
	
	public static final String REGISTERED_EMAIL_lId = "sonavane99@gmail.com";

}
