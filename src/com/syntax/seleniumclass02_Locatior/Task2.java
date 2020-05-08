package com.syntax.seleniumclass02_Locatior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Amazon Page Title Verification:
1.Open chrome browser
2.Go to “https://www.amazon.com/”
3.Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” 
is displayed
 */
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i[class]")).click();
		
		driver.quit();
		
		
		
	}
	
	
	
	
}
