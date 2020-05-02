package com.syntax.seleniumclass02_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 2  Syntax Page URL Verification: 
 * 1.Open chrome browser
 * 2.Navigate to “https://www.zillow.com/”
 * 3.Navigate to “https://www.google.com/”
 * 4.Navigate back to Zillow Page
 * 5.Refresh current page
 * 6.Verify url contains “Zillow”--->url i dogrularin
 */
public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.zillow.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
	}
}
