package com.syntax.seleniumclass02_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Amazon Page Title Verification:
1.Open chrome browser
2.Go to “https://www.amazon.com/”
3.Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
 */
public class Task2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElements(By.id("skippedLink"));
		
		
		
		
		
	}
	
	
	
	
}
