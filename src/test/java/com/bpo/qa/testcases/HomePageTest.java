package com.bpo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bpo.qa.base.TestBase;
import com.bpo.qa.pages.HomePage;
import com.bpo.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void LogoutTextTest() throws InterruptedException{
	   String Lgt = homePage.validateLogoutText();
	   Assert.assertEquals(Lgt,"LOGOUT");
	  
	}
	
	@Test(priority = 2)
	public void SupportTextTest() throws InterruptedException{
	   String St = homePage.validateSupportText();
	   Assert.assertEquals(St,"SUPPORT");
	}
	
	@Test(priority = 3)
	public void ProfileTextTest() throws InterruptedException{
	   String Pf = homePage.validateProfileText();
	   Assert.assertEquals(Pf,"PROFILE");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
