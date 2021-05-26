package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mongodb.diagnostics.logging.Logger;
import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.NewsLetterSubDetails;

public class NewsLetterPage {
	private static final Logger logger = (Logger) LogManager.getLogger(NewsLetterPage.class);

	ElementActions elementActions;
	NewsLetterSubDetails newsubcriptionvariable;

	
	// By Locators - Landing Page
	private By sendEmail = By.id("newsletter-input");
	private By SubmitBtn = By.name("submitNewsletter");
	private By SuccesMsg = By.xpath("//p[@class='alert alert-success']");
	
	// Constructor of the page:
	public NewsLetterPage(WebDriver driver) {
		elementActions = new ElementActions(driver);
	}
	
	
	
	public String newLetterSubscription() {
		String newUserEmailId =NewsLetterSubDetails.getUserNewEmailId();
		elementActions.doSendKeys(sendEmail, newUserEmailId);
        elementActions.doClick(SubmitBtn);
		elementActions.waitForElementVisible(SuccesMsg);
		String NewsmailSuccessful = elementActions.doGetText(SuccesMsg);
		return NewsmailSuccessful;
	}
		
}
