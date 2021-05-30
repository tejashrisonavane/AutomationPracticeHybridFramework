package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.RegisterPage;
import com.visionit.automation.pages.ColourChangePage;
import com.visionit.automation.utils.AppConstants;
import com.visionit.automation.variables.FriendFeatureDetails;

public class ColourChangeTest extends BaseTest  {

	private static final Logger logger = LogManager.getLogger(ColourChangeTest.class);
	private ColourChangePage changeimgcolor;
	
			
	        
	       @Test
			public void _3_Verify_Change_in_the_image_using_Color_Feature()
			{
		    	logger.info("Test case 12 started: Change in the image using Color Feature");
		    
			
				boolean checkImageColorChange = changeimgcolor.changeImgColor();
			  	logger.info(" status of Tshirt color change : " + checkImageColorChange);
			 	Assert.assertEquals(checkImageColorChange, true);
			   logger.info("Test case ended: tc_12_changed_image_using_colour_feature");
			}
	       
}
			