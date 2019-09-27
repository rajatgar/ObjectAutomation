package com.bpo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.pages.HomePage;
import com.bpo.qa.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super(); // It is for call the test base class method- prop
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test(priority=1 , description = "verifying login page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description Verify Login Page Title Test on Login Page")
	@Story("Story Name : To Check Login Page Title")
	public void loginPageTitleTest() throws InterruptedException{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ASCENT ONE Login");
	}
	
	
	@Test(priority=2 , description = "verify ascentOne image") 
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description Verify ascentOne Logo")
	@Story("Story Name : To Check AscentOne Logo")
	public void validateAscentOneImageTest(){
		boolean flag = loginPage.validateAscentOneImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3 , description = "Verify Login-SignIn Button")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description Verify Login Successfully")
	@Story("Story Name : To Check Login functionality")
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
