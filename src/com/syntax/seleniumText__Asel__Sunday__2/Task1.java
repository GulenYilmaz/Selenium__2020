package com.syntax.seleniumText__Asel__Sunday__2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.seleniumText__Asel__Sunday__Pages.HrmsLoginPage__firstWay;
import com.syntax.utils.CommonMethods;

/*
 * TC 1: HRMS Logo Validation

Navigate to “http://166.62.36.207/humanresources/symfony/web/index”
Verify Syntax logo is displayed
Close the browser



 */
public class Task1 extends CommonMethods {

    
	public static void main(String[] args) {
		
		
		 setUp();
		 
		 HrmsLoginPageElementTest__secondWay login= new HrmsLoginPageElementTest__secondWay();
		 
//		 isDisplayed(login.displayLogo);
	}
	
}
