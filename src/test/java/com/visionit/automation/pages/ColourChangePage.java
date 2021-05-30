package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.FriendFeatureDetails;


public class ColourChangePage extends BasePage{

	private static final Logger logger = LogManager.getLogger(ColourChangePage.class);
    ElementActions elementActions;


	// By Locators - Landing ColourPage

	
	By TshirtBoxElement=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	By clickOnFladedShirt=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
	By colourChangeEle=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[3]/ul/li[2]");
	By clickblueColor = By.xpath("//div[@id='image-block']");
	
    
//Constructor of the page:
	public ColourChangePage(WebDriver driver) {
		elementActions = new ElementActions(driver);
		

	}
	
	
	// Page Actions:
			public boolean changeImgColor() {
			elementActions.doClick(TshirtBoxElement);
			elementActions.doMoveToElement(clickOnFladedShirt);

			elementActions.doClick(colourChangeEle);
			
			
			elementActions.waitForElementVisible(clickblueColor);

		    boolean bluecolourDisplay = elementActions.doIsDisplayed(clickblueColor);
		     return bluecolourDisplay;
				
			}

}
