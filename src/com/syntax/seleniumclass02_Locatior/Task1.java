package com.syntax.seleniumclass02_Locatior;
/*
 * open chrome browser
 * go to "https://newtours.demoaut.com"
 * click on register link
 * fill out all required info
 * click submit
 * user successfully registered
 * create 2 scripts using different locators
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

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