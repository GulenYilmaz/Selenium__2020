package com.syntax.seleniumclass04__RadioButton__Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.ConfigsReader;

/*
TC 4: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct radio is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser
 
 */
public class hm4 {
public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Radio Buttons Demo')]")).click();
		Thread.sleep(3000);
		
	    WebElement mRadioButton=driver.findElement(By.xpath("//input[@type='radio']"));
		Thread.sleep(3000);

	    mRadioButton.click();
	
	    System.out.println(mRadioButton.isDisplayed());
	    System.out.println(mRadioButton.isEnabled());
	    System.out.println(mRadioButton.isSelected());
	    
	   List<WebElement> allradioButton = driver.findElements(By.xpath("//input[@type='radio']"));
	
	   String actualValue="Female";
	   String actualAgeValue="15 - 50";
	   
	   for(WebElement button :allradioButton ) {
		   
		   if(button.getAttribute("value").equals(actualValue)) {
			   button.click();
			   System.out.println("Female radio button is clicked. Test case is passed.");
		   }
		   if(button.getAttribute("value").equals(actualValue)) {
			  button.click();
			  System.out.println("Age group 15-20 clicked. Test case is passed.");
			  break;
		   }
	   }
	   driver.quit();
}}
