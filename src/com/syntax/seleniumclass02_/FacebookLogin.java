package com.syntax.seleniumclass02_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");// we can give our email address
		
		driver.findElement(By.id("pass")).sendKeys("syntax123");// we can give our password
		
		driver.findElement(By.id("u_0_b")).click();// it work first time but click ID will change thats why second time it does not work
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();// locator is linkTest--> it always start with a, a means=anchor

	}

}