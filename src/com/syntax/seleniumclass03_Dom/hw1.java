package com.syntax.seleniumclass03_Dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Using xPath ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered*/


public class hw1 {

	
	
	public static String url="http://newtours.demoaut.com";

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");// we will navigated and sent the element 
		
		driver.findElement(By.linkText("Register here")).click();// we click the register botton
		
		driver.findElement(By.name("firstName")).sendKeys("denise");
		
		driver.findElement(By.name("lastName")).sendKeys("green");
		
		driver.findElement(By.name("phone")).sendKeys("34534543");
		
		driver.findElement(By.id("userName")).sendKeys("denise@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("5678 west Road");
		
		driver.findElement(By.name("postalCode")).sendKeys("65322");
		
		driver.findElement(By.name("email")).sendKeys("ali");
		driver.findElement(By.name("password")).sendKeys("12345a");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345a");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
			
}
}
