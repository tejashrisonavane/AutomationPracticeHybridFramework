package com.visionit.automation.tests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.pages.SearchkeywordPage;
import com.visionit.automation.utils.AppConstants;

public class SearchKeywordTest {
private static final Logger logger = LogManager.getLogger(SearchKeywordTest.class);
private static final SearchkeywordPage Searchkeyword = null;


	
	@Test
	public void tc_01_verify_Search_Keyword_Test() {
		
		logger.info("Test case started: tc_01_verify_Search_Keyword_Test");
	boolean status=Searchkeyword.ClickSearchBox();
	
	logger.info("search boxsearchkeyword is enabled:"+status);
	/*Searchkeyword.sendkeysForBox();
	List<WebElement>DressesList= Searchkeyword.getListofSearchBox();
	logger.info("Total no of dresses in list"+DressesList.size());
	for(int i=0; i<DressesList.size();i++) {
		logger.info((i+1) + ". "+DressesList.get(i).getText()); */
		logger.info("Test case ended: tc_01_verify_Search_Keyword_Test");
	}
}


