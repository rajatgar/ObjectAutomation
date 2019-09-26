package com.bpo.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.util.TestUtil;

public class CostPriceRateCardAddEdit extends TestBase{
	
	TestUtil testutil = new TestUtil();
	
	@FindBy(xpath="(//span[@class='k-dropdown-wrap k-state-default'])[2]")
	WebElement clkProviderCombo;
	List<WebElement> selectValProviderCombo = driver.findElements(By.xpath("//ul[@id='ddlProvider_listbox']/li"));
	
	@FindBy(xpath="(//span[@class='k-dropdown-wrap k-state-default'])[3]")
	WebElement clkProviderProductCombo;
	
//	@FindBy(xpath="//*[@id='ddlProviderPrd_listbox']/li[1]")
//	WebElement selectValProviderProductCombo;
//	List<WebElement> selectValProviderProductCombo = driver.findElements(By.xpath("//ul[@id='ddlProviderPrd_listbox']/li"));
	
	@FindBy(xpath="(//span[@class='k-list-filter'])[2]")
	WebElement enterTextProviderCombo;
	
	@FindBy(xpath="//input[@id='txtProviderCode']")
	WebElement textProviderCode;
	
	@FindBy(xpath="//*[@id='dvBasicCost']/div[1]/div[4]/span[1]/span[1]/span[1]")
	WebElement clkCurrencyCombo;
	List<WebElement> selectValCurrencyCombo = driver.findElements(By.xpath("//*[@id='ddlCurrency_listbox']/li"));

	
	public CostPriceRateCardAddEdit(){
		PageFactory.initElements(driver, this);
	}
	
	public void selectValProvider() throws InterruptedException{ 
		clkProviderCombo.click();
		testutil.getDropDowninnerhtml(selectValProviderCombo, "Australia Post");
	}
	
	public void selectValProviderProduct() throws InterruptedException{
		boolean abc=clkProviderProductCombo.isEnabled();
		if (abc==true)
		clkProviderProductCombo.click();
		Thread.sleep(2000);
//		selectValProviderProductCombo.click();
		List<WebElement> selectValProviderProductCombo = driver.findElements(By.xpath("//ul[@id='ddlProviderPrd_listbox']/li"));
		testutil.getDropDowninnerhtml(selectValProviderProductCombo, "AOne");
	}
	
	public void enterTextProviderCode() throws InterruptedException{
		Thread.sleep(2000);
		textProviderCode.sendKeys("A1010");
	}
	
	public void selectValCurrencyCombo() throws InterruptedException{
		clkCurrencyCombo.click();
		testutil.getDropDowninnerhtml(selectValCurrencyCombo, "Afghanistan, Afghani (AFN)");
		System.out.println("Currency");
	}

}
