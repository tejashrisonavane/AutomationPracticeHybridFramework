package com.visionit.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.base.BasePage;
import com.visionit.automation.utils.ElementActions;

public class cartpage extends BasePage {
	private static final Logger logger = LogManager.getLogger(cartpage.class);
    

	ElementActions elementActions;
	
	// Constructor of the page:
	public cartpage(WebDriver driver) {
		elementActions = new ElementActions(driver);
	}
	
	//Locators- click on dresses
	private By ClickOnFadedsleeveT_Shirt=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
	private By ClickOnBlouse=By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img");
	private By ClickOnPrintedDress=By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img");
	
	//Locators-AddToCart
	private By AddToCart1=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
	private By AddToCart2=By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span");
	private By AddToCart3=By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span");
	
	//Locators-Continue shopping
	private By Continueshopping1=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
	private By Continueshopping2=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
	private By Continueshopping3=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
	
	private By CheckCountofCart=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");
	
	//locators-Check all three product added in cart
	
	private By fadedsleeveT_Shirt=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/div/div[1]/a");
	private By Blouse=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[2]/div/div[1]/a");
	private By Printeddress=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[3]/div/div[1]/a");
    
	
	private By checkTotalCount=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/div/div[2]");
	private By removeOneproduct=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/span/a");

	private By NowCheckCountofcart=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");

	//Page Action-updating Cart
	
	//17
	public  String CartUpdatingTest() {
		logger.info("waiting for Faded T_Shirt landing page");
		elementActions.waitForElementClickable(ClickOnFadedsleeveT_Shirt);
		elementActions.doClick(ClickOnFadedsleeveT_Shirt);
		logger.info("Clicked on Faded T_Shirt from landing page");
		elementActions.doClick(AddToCart1);
		logger.info("Clicked on Add To Cart1 button");
		elementActions.doClick(Continueshopping1);
		logger.info("Clicked on Continue shopping1 button");
		
		logger.info("waiting for Blouse landing page");
		elementActions.waitForElementClickable(ClickOnBlouse);
		elementActions.doClick(ClickOnBlouse);
		logger.info("Clicked on  Blouse landing page");
		elementActions.doClick(AddToCart2);
		logger.info("Clicked on Add To Cart1 button");
		elementActions.doClick(Continueshopping2);
		logger.info("Clicked on Continue shopping2 button");
		
		logger.info("waiting for Printed dress landing page");
		elementActions.waitForElementClickable(ClickOnPrintedDress);
		elementActions.doClick(ClickOnPrintedDress);
		logger.info("Clicked on Printed dress  landing page");
		elementActions.doClick(AddToCart3);
		logger.info("Clicked on Add To Cart3 button");
		elementActions.doClick(Continueshopping3);
		logger.info("Clicked on Continue shopping3 button");
		
		elementActions.doClick(CheckCountofCart);
		logger.info("Clicked on total cart no");
		
		return CartUpdatingTest();
			
	}
	//18
	public String ValidateAllcartAdded() {
		
		elementActions.doClick(fadedsleeveT_Shirt);
		logger.info("Clicked on fadedsleeveT_Shirt  from landing page");
		
		elementActions.doClick(Blouse);
		logger.info("Clicked on Blouse  from landing page");
		
		elementActions.doClick(Printeddress);
		logger.info("Clicked on Printed dress  from landing page");
		
		return ValidateAllcartAdded();
		
	}

	//19
	public String ValidateToatCount() {
		
        elementActions.doMoveToElement(checkTotalCount);
		logger.info("Clicked on check Total Count  from landing page");
		
		String TotalCount=elementActions.doGetText(checkTotalCount);
		return TotalCount;
	}
	//20
	
     public String validateproductIsRemoved() {
       
    elementActions.doClick(removeOneproduct);
	logger.info("Clicked on remove One product  from landing page");

	String removeCartValue=elementActions.doGetText(NowCheckCountofcart);
	logger.info("Clicked on Now Check Count of cart  from landing page");
	return removeCartValue;


     }

	
}

