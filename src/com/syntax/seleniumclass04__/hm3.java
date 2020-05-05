package com.syntax.seleniumclass04__;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 3: Syntax Demo input boxes count: 
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Simple Form Demo” links
Get all input boxes from the page
Enter “Hello” to each text box
Close browser
 */
public class hm3 {
public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Simple Form Demo')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user-message")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.id("sum1")).sendKeys("hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("hello");
		Thread.sleep(3000);
		driver.close();
		
	}}
	