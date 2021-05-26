package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.FriendFeatureDetails;


public class T_ShirtPage extends BasePage{

	private static final Logger logger = LogManager.getLogger(T_ShirtPage.class);
	private static final String Friend_Name = "tejashri";
	private static final String Friend_Email = "tejashrisonavane1@gmail.com";
	ElementActions elementActions;

	// By Locators - Landing T_ShirtPage

	private By ClickOnT_ShirtButtonElement= By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]");
	private By ClickOnFadedT_ShirtElement=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
	private By ClickOnMoreElement=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]");
    private By ClickOnSendToFriendElement=By.xpath("//*[@id=\"send_friend_button\"]");
    
    // By Locators - send to friend recipient page
    private By ClickOnNameOfFriendElement=By.xpath("//*[@id=\"friend_name\"]//div");
    private By ClickOnEmailOfFriendElement=By.xpath("//*[@id=\"friend_email\"] ");
    
    //Locator-recipient Page Details
    
    private By NameOfFriendElement=By.id("friend_name");
    private By E_MailOfFriendElement=By.id("friend_email");
	private FriendFeatureDetails FriendFeatureDetails;

	//Locator- Colour  Change
	private By  TshirtBoxElement=By.xpath("//*[@id=\\\"block_top_menu\\\"]/ul/li[3]/a");
     private By clickOnFladedShirt=By.xpath("//*[@id=\\\"center_column\\\"]/ul/li/div/div[1]/div/a[1]/img");
	private By ColourChangeElement=By.xpath("//*[@id=\\\"center_column\\\"]/ul/li/div/div[2]/div[3]/ul/li[2]");
	
    
//Constructor of the page:
	public T_ShirtPage(WebDriver driver) {
		elementActions = new ElementActions(driver);
		FriendFeatureDetails = new FriendFeatureDetails();

	}
	
	
	//// Page Actions:
	public  boolean clickOnTshirtButton(boolean b, boolean c)
	{
		//String newUserFirstName = FriendFeatureDetails.getUserName();
     // newUserEmailId = FriendFeatureDetails.getUserName();
	
		
	
		elementActions.waitForElementClickable(ClickOnT_ShirtButtonElement);
		elementActions.doClick(ClickOnT_ShirtButtonElement);
	
        elementActions.waitForElementClickable(ClickOnFadedT_ShirtElement);
		elementActions.doClick(ClickOnFadedT_ShirtElement);

        elementActions.waitForElementClickable(ClickOnMoreElement);
		elementActions.doClick(ClickOnMoreElement);
		logger.info("Clicked on moreButton");
		
		logger.info("waiting for Send Feature button on landing page");
        elementActions.waitForElementClickable(ClickOnSendToFriendElement);
		elementActions.doClick(ClickOnSendToFriendElement);
		logger.info(" clicked on Send Feature button on landing page");

	//User Recipient Feature	
		elementActions.doClick(ClickOnNameOfFriendElement);
		logger.info("Clicked on Name of friend element button");
		elementActions.doActionsSendKeys(NameOfFriendElement, FriendFeatureDetails.Friend_Name);
		logger.info("Sent text for user  name as : " + Friend_Name);
		
		elementActions.doClick(ClickOnEmailOfFriendElement);
		logger.info("Clicked on email of friend element button");
		elementActions.doActionsSendKeys(E_MailOfFriendElement, FriendFeatureDetails.Friend_Email);
		logger.info("Sent text for user  name as : " + Friend_Email);
		return c;
	
	
}
public void FadedTShirtEle() {
	logger.info("waiting for T_Shirt button on landing page");
	elementActions.waitForElementClickable(TshirtBoxElement);
	elementActions.doClick(TshirtBoxElement);
	logger.info("Clicked on T_Shirt button from landing page");
	
	logger.info("waiting for ClickOnFadedT");
    elementActions.waitForElementClickable(clickOnFladedShirt);
	elementActions.doClick(clickOnFladedShirt);
	logger.info("clicked on ClickOnFadedT");
	
	logger.info("waiting for Colour change");
     elementActions.doClick(ColourChangeElement);
	logger.info("clicked on Colour change Feature");


	
	
}

	public static boolean clickOnTshirtButton() {
		// TODO Auto-generated method stub
		return false;
	}
}