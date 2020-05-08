package com.syntax.seleniumclass02_Locatior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin_Locators {

	public static void main(String[] args) {

		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";// we can store it as a variable then it will be easy for us
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		
		// we coverd locators id, name, and className 
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");// give our name and sent . on mod this time locators is by.name
		
		driver.findElement(By.id("txtPassword")).sendKeys("Admin123");//
		
		driver.findElement(By.className("button")).click();
		
	}

}
