
// Test Case :- Here we are verifying Add,duplicate,rates,edit and delete button existance on cost rate card screen

package com.bpo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.pages.CostPriceRateCard;
import com.bpo.qa.pages.HomePage;
import com.bpo.qa.pages.LoginPage;
import com.bpo.qa.pages.Navigation_CostPriceRateCard;

public class CostPriceRateCardTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Navigation_CostPriceRateCard navigatecostprice;
	CostPriceRateCard costpriceratecard;
	
	public CostPriceRateCardTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		navigatecostprice = new Navigation_CostPriceRateCard();
		navigatecostprice.validateclkEPMLink();
		navigatecostprice.validateclkManageRateCardsLink();
		navigatecostprice.validateclkCostPriceRateCardLink();
		costpriceratecard = new CostPriceRateCard();
		
	}
	
	@Test(priority=1)
	public void verifyAddButton() throws InterruptedException{
		costpriceratecard.validateAddButton();
	}
	
	@Test(priority=2)
	public void verifyDuplicateButton(){
		costpriceratecard.validateDuplicateButton();
		
	}
	
	@Test(priority=3)
	public void verifyRatesButton(){
		costpriceratecard.validateRatesButton();
	}
	
	@Test(priority=4)
	public void verifyEditButton(){
		costpriceratecard.validateEditButton();
	}
	
	@Test(priority=5)
	public void verifyDeleteButton(){
		costpriceratecard.validateDeleteButton();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}
