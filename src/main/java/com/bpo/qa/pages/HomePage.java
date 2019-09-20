package com.bpo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bpo.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[text()='Logout']")
	@CacheLookup
	WebElement LogoutText;
	
	@FindBy(xpath="//span[text()='Support']")
	@CacheLookup
	WebElement SupportText;
	
	@FindBy(xpath="//span[text()='Profile']")
	WebElement ProfileText;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLogoutText() throws InterruptedException{
		Thread.sleep(20000);
		return LogoutText.getText();
	}
	
	public String validateSupportText() throws InterruptedException{
		Thread.sleep(20000);
		return SupportText.getText();
	}
	
	public String validateProfileText() throws InterruptedException{
		Thread.sleep(20000);
		return ProfileText.getText();
	}
	
	
	
}
