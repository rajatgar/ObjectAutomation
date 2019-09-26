package com.bpo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bpo.qa.base.TestBase;

public class Navigation_CostPriceRateCard extends TestBase{
	
	@FindBy(xpath="//a[text()='Easy Print Manager']")
	WebElement clkEPM;
	
	@FindBy(xpath="//a[text()='Manage Rate Cards']")
	WebElement clkManageRateCards;
	
	@FindBy(xpath="(//a[text()='Cost Price Rate Cards'])[4]")
	WebElement clkCostPriceRateCard;
	
	
	public Navigation_CostPriceRateCard(){
		PageFactory.initElements(driver, this);
	}
	
	public void validateclkEPMLink() throws InterruptedException
	{
		System.out.println("EPM click");
		Thread.sleep(20000);
		clkEPM.click();
		
	}
	
	public void validateclkManageRateCardsLink() throws InterruptedException{
		Thread.sleep(20000);
		clkManageRateCards.click();
	}
	
	public CostPriceRateCard validateclkCostPriceRateCardLink() throws InterruptedException{
		clkCostPriceRateCard.click();
		return new CostPriceRateCard();
	}

}
