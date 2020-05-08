package com.syntax.seleniumclass04__RadioButton;

/*
 * TC 1: Amazon link count: 
Open chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text

 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static String url="https://www.amazon.com";
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			
	driver.get(url);	
	
	List <WebElement> links= driver.findElements(By.tagName("a"));
			
	int count=0;
	for(WebElement link:links) {
		
		String text=link.getText();
		if(!text.isEmpty()) {
			System.out.println(text);
			count++;
		}
	}
	
	System.out.println(count);
}
}
