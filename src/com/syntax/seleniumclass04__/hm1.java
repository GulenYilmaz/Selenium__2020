package com.syntax.seleniumclass04__;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: HRMS Application Login: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password
Click on login button
Then verify Syntax Logo is displayed.
 */
public class hm1 {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		boolean isDisplay=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		
		if (isDisplay) { 
			System.out.println("Task case is succesful");
		
		}else {
			System.out.println("Task case is failed");
		}
		
	
}
}
