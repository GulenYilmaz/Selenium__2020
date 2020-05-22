package com.syntax.seleniumclass07__WindowHandle__Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
 * 1: Verify element is clickable
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It's back!” text is displayed   
Close the browser 

 */
public class HW1 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
	Thread.sleep(5000);
	
	WebElement Itisback=driver.findElement(By.xpath("//p[@id='message']"));
	Thread.sleep(2000);
	
	
	if (Itisback.isDisplayed()) {
		System.out.println("It is back is displayed test case PASS ");
	}else {
		System.out.println("It is back is displayed test case PASS ");
	}
}
}
