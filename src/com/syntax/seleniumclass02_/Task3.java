package com.syntax.seleniumclass02_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 2  Syntax Page URL Verification: 
 * 1.Open chrome browser
 * 2.Navigate to “https://www.zillow.com/”
 * 3.Navigate to “https://www.google.com/”
 * 4.Navigate back to Zillow Page
 * 5.Refresh current page6.Verify url contains “Zillow”
 */
public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zillow.com");
		
		
		
	}
}
