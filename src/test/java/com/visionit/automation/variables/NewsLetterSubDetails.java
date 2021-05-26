package com.visionit.automation.variables;


import com.visionit.automation.utils.RandomNumberGeneratorUtil;

public class NewsLetterSubDetails {
public static RandomNumberGeneratorUtil randomUtil;
	
	public NewsLetterSubDetails() {
		randomUtil  = new RandomNumberGeneratorUtil();
	}


	// Setter for Variable - SignIn Page
		public static String getUserNewEmailId()
		{
			String newUserEmailId = "111"+randomUtil .randomStringGenerator()+"@gmail.com";
			return newUserEmailId;
		}
		
		
		public static final String NewsSubscriptionSuccessMsg = " Newsletter : You have successfully subscribed to this newsletter.";

		public String NewsLetterSubDetails() {
			// TODO Auto-generated method stub
			return null;
		}

}


