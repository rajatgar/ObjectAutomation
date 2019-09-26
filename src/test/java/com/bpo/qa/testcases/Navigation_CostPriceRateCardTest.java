package com.bpo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.pages.HomePage;
import com.bpo.qa.pages.LoginPage;
import com.bpo.qa.pages.Navigation_CostPriceRateCard;

public class Navigation_CostPriceRateCardTest extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	Navigation_CostPriceRateCard navigatecostprice;
	
	public Navigation_CostPriceRateCardTest(){
		super(); 
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		navigatecostprice = new Navigation_CostPriceRateCard();
	}
	
	@Test(priority=1)
	public void Navigate_CPRateCardScreen() throws InterruptedException{
		navigatecostprice.validateclkEPMLink();
		navigatecostprice.validateclkManageRateCardsLink();
		navigatecostprice.validateclkCostPriceRateCardLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
