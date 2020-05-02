package com.syntax.seleniumclass03_Dom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Using Css ONLY
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info (skip dropdowns)
Click Submit
User successfully registered
 */
public class hw2 {
	
	public static String url="http://newtours.demoaut.com";
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get(url);
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	

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
