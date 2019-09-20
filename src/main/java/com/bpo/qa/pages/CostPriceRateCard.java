package com.bpo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bpo.qa.base.TestBase;

public class CostPriceRateCard extends TestBase{

//	@FindBy(xpath="//a[@id='btnAddRate']")
	@FindBy(xpath="//span[@class='icon_add x3']")
	
	WebElement clkAddButton;
	
	@FindBy(xpath="//a[@id='btnDupRate']")
	WebElement clkDuplicateBtn;
	
	@FindBy(xpath="//a[@id='btnManageRate']")
	WebElement clkRatesButton;
	
	@FindBy(xpath="//a[@id='btnEditRate']")
	WebElement clkEditButton;
	
	@FindBy(xpath="//a[@id='btnDeleteRate']")
	WebElement clkDeleteButton;

	public CostPriceRateCard(){
		PageFactory.initElements(driver, this);
	}
	
	public CostPriceRateCardAddEdit validateAddButton() throws InterruptedException{
		Thread.sleep(15000);
		clkAddButton.click();
		return new CostPriceRateCardAddEdit();
	}
	
	public void validateDuplicateButton(){
		clkDuplicateBtn.click();
	}
	
	public void validateRatesButton(){
		clkRatesButton.click();
	}
	
	public CostPriceRateCardAddEdit validateEditButton(){
		clkEditButton.click();
		return new CostPriceRateCardAddEdit();
	}
	
	public void validateDeleteButton(){
		clkDeleteButton.click();
	}

}
