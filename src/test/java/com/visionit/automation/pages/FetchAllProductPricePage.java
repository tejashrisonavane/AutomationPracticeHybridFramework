package com.visionit.automation.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;

public class FetchAllProductPricePage extends BasePage{
	
private static final Logger logger = LogManager.getLogger(FetchAllProductPricePage.class);
ElementActions elementActions;
	
//	Locators;
	
	private By dressButton=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	private By productPrice=By.xpath("div[@class='right-block']/div/descendant::span[@itemprop='price']");

//Constructor of the page:
	public FetchAllProductPricePage(WebDriver driver) {
		elementActions = new ElementActions(driver);
	}
	
	//Page Action:
	public String getLandingTitle()
	{
		String DressesText = elementActions.doGetText(dressButton);
		return DressesText;
	}
	public List<WebElement> FetchingAllProductPrice() {
		
		List<WebElement> Product = elementActions.getElementsList(productPrice);
		return Product;
	}

	public static Logger getLogger() {
		return logger;
	}
	
	}
