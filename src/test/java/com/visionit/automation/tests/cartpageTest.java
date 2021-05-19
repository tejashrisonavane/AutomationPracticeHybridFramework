package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;


public class cartpageTest extends BaseTest{
private static final Logger logger = LogManager.getLogger(cartpageTest.class);

	//17
	@Test
	public void tc_17_verify_Cart_Value_Is_Updating() {
       logger.info("Test case started : tc_17_Cart_Value_Is_Updating");
		
		String CartTest=CartPage.CartUpdatingTest();
	    logger.info("Landing page of cart is : " + CartTest);
		logger.info("Test case ended : tc_17_Cart_Value_Is_Updating");
	}
 //18
	@Test
	public void tc_18_verify_Same_Product_Added_In_Cart() {
       logger.info("Test case started: tc_18_Same_Product_Added_In_Cart");
       
       CartPage .CartUpdatingTest();
       CartPage.ValidateAllcartAdded();
	    logger.info("Added productin  cart is : ");

		logger.info("Test case ended: tc_18_Same_Product_Added_In_Cart");
	}
	
	//19
	@Test
	public void tc_19_verify_Total_Is_Correct_In_Cart() {
        logger.info("Test case started: tc_19_Total_Is_Correct_In_Cart");
		
        CartPage.CartUpdatingTest();
        String gettotalCount=CartPage.ValidateToatCount();
		logger.info("Total is correct in cart : " + gettotalCount);

		logger.info("Test case ended: tc_19_Total_Is_Correct_In_Cart");
	}

	//20
	@Test
	public void tc_20_verify_Product_Removed_From_Cart() {
         logger.info("Test case started: tc_20_Product_Removed_From_Cart()");
		 CartPage.CartUpdatingTest();
		String getRemainingTwoproduct=CartPage.validateproductIsRemoved();
		logger.info("remaining two product is  : " + getRemainingTwoproduct);
		
		logger.info("Test case ended: tc_20_Product_Removed_From_Cart()");
	}
	}
