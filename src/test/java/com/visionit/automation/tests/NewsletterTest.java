package com.visionit.automation.tests;



import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.variables.NewsLetterSubDetails;



public class NewsletterTest {
private static final Logger logger = (Logger) LogManager.getLogger(NewsletterTest.class);
private NewsLetterSubDetails newsSubscription;
	
	@Test
	public void tc_10_verify_News_Subscription () {
		logger.info("Test case started: tc_16_verify_News_Subscription ");
		
		String NewsmailSuccessful = newsSubscription.NewsLetterSubDetails();
		Assert.assertEquals(NewsmailSuccessful,NewsLetterSubDetails.NewsSubscriptionSuccessMsg );
		logger.info("Test case ended: tc_16_verify_News_Subscription ");
}
}