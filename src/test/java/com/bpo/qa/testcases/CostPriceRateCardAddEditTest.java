package com.bpo.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.pages.CostPriceRateCard;
import com.bpo.qa.pages.CostPriceRateCardAddEdit;
import com.bpo.qa.pages.HomePage;
import com.bpo.qa.pages.LoginPage;
import com.bpo.qa.pages.Navigation_CostPriceRateCard;

public class CostPriceRateCardAddEditTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Navigation_CostPriceRateCard navigatecostprice;
	CostPriceRateCard costpriceratecard;
	CostPriceRateCardAddEdit costpriceratecardaddedit;
	
	public CostPriceRateCardAddEditTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(10000);
//		driver.get("http://oca-mel-test:8300/RateCardsMngt/Rate/AddEditRate.aspx?rateId=0&i=1&pn=Cost%20Price%20Rate%20Cards&j=414&prn=Easy%20Print%20Manager&cstPg=1&type=CP");
		
		
		navigatecostprice = new Navigation_CostPriceRateCard();
		navigatecostprice.validateclkEPMLink();
		navigatecostprice.validateclkManageRateCardsLink();
		navigatecostprice.validateclkCostPriceRateCardLink();
		costpriceratecard = new CostPriceRateCard();
		costpriceratecard.validateAddButton();
		Thread.sleep(5000);
		costpriceratecardaddedit = new CostPriceRateCardAddEdit();
		
	}
	
	@Test
	public void verifyBasicTab() throws InterruptedException{
		Thread.sleep(10000);
		costpriceratecardaddedit.selectValProvider();
		Thread.sleep(5000);
		costpriceratecardaddedit.selectValProviderProduct();
		
		costpriceratecardaddedit.enterTextProviderCode();
		costpriceratecardaddedit.selectValCurrencyCombo();
	}

}
