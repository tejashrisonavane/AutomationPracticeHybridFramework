package com.visionit.automation.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionit.automation.utils.ElementActions;
import com.visionit.automation.variables.sendKeyDetails;

public class SearchkeywordPage {
	private static final Logger logger = LogManager.getLogger(SearchkeywordPage.class);

	ElementActions elementActions;
	//Locators
	private By searchBoxElement=By.xpath("//*[@id=\"search_query_top\"]");
	private By searchButtonElement=By.xpath("//*[@id=\"searchbox\"]/button");
	private By printallDresselement=By.xpath("//div[@class='ac_result']/ul/li");


// Constructor of the page:

public SearchkeywordPage(WebDriver driver) {
	elementActions = new ElementActions(driver);
}
public boolean ClickSearchBox() {
	boolean status=elementActions.waitForElementVisible(searchBoxElement);
	return status;
	
}
public void SendKeyThroughSearchBox() {
	elementActions.doActionsSendKeys(searchButtonElement, sendKeyDetails.sendkeysForBox);
}
public List<WebElement>getListofSearchBox(){
	List<WebElement>DressesList=elementActions.getElementsList(printallDresselement);
	logger.info("Total no of dresses in list"+DressesList.size());
	for(int i=0; i<DressesList.size();i++) {
		logger.info((i+1) + ". "+DressesList.get(i).getText()); 
		if(DressesList.contains("Dress")) {
			break;
		}
	}
	return DressesList;
	
}
}