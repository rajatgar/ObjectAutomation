package com.bpo.qa.util;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.bpo.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 100;
	public static long IMPLICIT_WAIT = 100;
	
	// Here we will create common method which will used in through out the application.
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	// To get the value from combo
	public void getDropDownValue(List<WebElement> listele,String actVal){
		for(WebElement ele:listele){
			String Val = ele.getText().trim();
			
			if(Val.equalsIgnoreCase(actVal)){
				ele.click();
			}
		}
	}
	
	public void getDropDowninnerhtml(List<WebElement> listele,String actVal) throws InterruptedException{
		for(WebElement ele1:listele){
			String Val1=ele1.getAttribute("innerHTML").trim();
			Thread.sleep(2000);
			if(Val1.equalsIgnoreCase(actVal)){
				ele1.click();
				System.out.println("donew");			
				return;
			}
	}
	}
	
	// 
	

}
