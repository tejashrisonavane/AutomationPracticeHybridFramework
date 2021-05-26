package com.visionit.automation.tests;



import org.apache.logging.log4j.LogManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;
import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.ValidateLogoPage;
import com.visionit.automation.utils.AppConstants;


public class ValidateLogoTest extends BaseTest {

	private static final Logger logger = (Logger) LogManager.getLogger(ValidateLogoTest.class);
	private ValidateLogoPage validateLogo;

	@Test
	public void tc_05_verify_Logo_Height () {
		logger.info("Test case started: tc_05_verify_Logo_Height");	
		    String validateHeight = validateLogo.ValidateLogoHeight();
			logger.info("Logo Height is : " + validateHeight);
			Assert.assertEquals(validateHeight, "99");
         logger.info("Test case ended: tc_05_verify_Logo_Height");
       
	}

	@Test
	public void tc_06_verify_Logo_Width () {
		logger.info("Test case started: tc_05_verify_Logo_Width");	
		    String validateWidth = validateLogo.ValidateLogoWidth();
			logger.info("Logo Width is : " + validateWidth);
			Assert.assertEquals(validateWidth, "350");
         logger.info("Test case ended: tc_05_verify_Logo_Width");
	}
	
	

	@Test
	public void tc_07_verify_landing_SignInpage_url_redirection() {
		logger.info("Test case started: tc_07_verify_landing_SignInpage_url_redirection()");	
		      
			String signTitle = validateLogo.getSignInPageTitle();
		   	logger.info("Landing page actual title is : " + signTitle);
			Assert.assertEquals(signTitle, AppConstants.SIGNIN_PAGE_TITLE);
       logger.info("Test case ended:  tc_07_verify_landing_SignInpage_url_redirection()");
	}
	
}
	
	
