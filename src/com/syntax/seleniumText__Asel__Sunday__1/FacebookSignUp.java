package com.syntax.seleniumText__Asel__Sunday__1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods{
/*
 * Using functions ONLY sign up to Facebook account
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		//WebElement sigUp=driver.findElement(By.name("websubmit"));
		
		WebElement monthDD=driver.findElement(By.id("month"));
		Select obj=new Select(monthDD);
		obj.selectByIndex(13);
		
		Thread.sleep(3000);

		tearDown();
	}

}