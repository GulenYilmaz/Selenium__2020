package com.syntax.seleniumclass04__RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 2: HRMS Application Negative Login: 
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Verify error message with text “Password cannot be empty” is displayed.
 */
public class hm2 {
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
//		WebElement elementPassword=driver.findElement(By.id("txtPassword"));
//		
//		if(elementPassword.getText().isEmpty()) {
//			System.out.println("Password can not be empty");
//		}else {
//			System.err.println("users can login succesfully");
//			
//		}
		
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		boolean message=driver.findElement(By.id("spanMessage")).isDisplayed();
		if (message) {
			System.out.println("Password message is display , test case is passed");
		}else {
			System.err.println("users can login succesfully");
			
		}
	
	
	
	
	}}