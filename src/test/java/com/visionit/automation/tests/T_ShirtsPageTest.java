package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.T_ShirtPage;
import com.visionit.automation.utils.AppConstants;
import com.visionit.automation.variables.FriendFeatureDetails;

public class T_ShirtsPageTest extends BaseTest  {

	private static final Logger logger = LogManager.getLogger(T_ShirtsPageTest.class);
	
	@Test
	public void tc_11_verify_Friend_feature_Test() {

       logger.info("Test case started: tc_11_Friend_feature_Test");
       
       boolean isUserGotRegistered =  T_ShirtPage.clickOnTshirtButton();
		Assert.assertEquals(isUserGotRegistered,FriendFeatureDetails.Friend_Name );
		
	       logger.info("Test case ended: tc_11_Friend_feature_Test");
	}
	@Test
	public void tc_12_verify_changed_image_using_colour_feature() {
		

	       logger.info("Test case started: tc_12_changed_image_using_colour_feature");
		
	      // boolean isUserGotRegistered =  T_ShirtPage.FadedTShirtEle();
			//Assert.assertEquals(isUserGotRegistered,FriendFeatureDetails.Friend_Email );
	       
	     boolean isUserGotRegistered =  registerPage.FadedTShirtEle(true, true);
			Assert.assertEquals(isUserGotRegistered, true);
	       logger.info("Test case ended: tc_12_changed_image_using_colour_feature");
	}
}
