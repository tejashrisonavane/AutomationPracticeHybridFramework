package com.visionit.automation.tests;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.FetchAllProductPricePage;
import com.visionit.automation.utils.AppConstants;




public class FetchAllProductpriceTest extends BaseTest {
private static final Logger logger = LogManager.getLogger(FetchAllProductpriceTest.class);



@Test
	public void tc_10_verify_All_Product_Price() {
		
	       logger.info("Test case started : tc_10__Fetch_All_Product_Price");
	      


		FetchAllProductPricePage getLandingTitle = null;
		List<WebElement> DressesText= getLandingTitle.FetchingAllProductPrice();
		   Assert.assertEquals(DressesText,"DRESSES");
		    
		   List<WebElement>ListOfPrices= getLandingTitle.FetchingAllProductPrice();
			logger.info("Product price is:"+ListOfPrices.size());
			for(int i=0;i<ListOfPrices.size();i++) {
				logger.info((i+1)+". "+ListOfPrices.get(i).getText());
			

		    logger.info("Test case ended : tc_10__Fetch_All_Product_Price");
			}
			
}	
}