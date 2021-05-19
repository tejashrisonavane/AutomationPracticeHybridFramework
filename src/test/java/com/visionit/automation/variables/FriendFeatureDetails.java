package com.visionit.automation.variables;

import com.visionit.automation.utils.RandomNumberGeneratorUtil;

public class FriendFeatureDetails {
public RandomNumberGeneratorUtil randomUtil;

	// Setter for Variable - Register User Details FirstName
	public String getUserName()
	{
		String userName = randomUtil.randomStringGenerator();
		return userName;
	}
	//public static String userFirstName = randomUtil.randomStringGenerator();
	
	
	// Setter for Variable - Register User Details Email
	public String getUserEmail()
	{
		String userEmail = randomUtil.randomStringGenerator();
		return userEmail;
	}
	
	// Variables - Register User Details
	public static final String Friend_Name = "tejashri";
	public static final String Friend_Email = "tejashrisonavane1@gmail.com";

}


