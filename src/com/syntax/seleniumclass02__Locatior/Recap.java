package com.syntax.seleniumclass02__Locatior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		
		/*
		 * Commands with Page
		 * getCurrentURL
		 * get()
		 * getTitle();
		 */

		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//window users add .exe

		WebDriver driver=new ChromeDriver();
		
		
		String fbUrl="https://www.facebook.com";
		driver.get(fbUrl);
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
	    
		
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.close();
		//driver.findElement(By.cssSelector("tagname[attribute *^$='attribute value']"))
		//driver.findElement(By.cssSelector("tagname#day"));//---><tagname  id ="day"></tagname>		
		//driver.findElement(By.cssSelector("tagname.today"));//---><tagname  class ="today"></tagname>	
		
	}

}