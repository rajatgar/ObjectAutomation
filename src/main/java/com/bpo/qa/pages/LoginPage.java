package com.bpo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bpo.qa.base.TestBase;

import io.qameta.allure.Step;

public class LoginPage extends TestBase{
	
	// Page Factory OR OR
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//a[@class='btn btn-block btn-login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='signup']")
	WebElement signUPlink;
	
	@FindBy(xpath="//img[@class='img-responsive center-block']")
	WebElement ascentONElogo;
	
	// Initialize the page object
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	// Initialize the method , Actions
	
	@Step("getting login page title...")
	public String validateLoginPageTitle() throws InterruptedException{
//		Thread.sleep(5000);
		String abc=driver.getTitle();
		return driver.getTitle();
	}
	
	
	@Step("verifying logo image...")
	public boolean validateAscentOneImage(){
	//	waitWebDriver(ascentONElogo);
		return ascentONElogo.isDisplayed();
	}
	
	
	@Step("Login with username :{0} : and password {1} ")
	public HomePage login(String un,String pwd){
	//	waitWebDriver(username);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	

}
