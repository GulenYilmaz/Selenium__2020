package com.syntax.seleniumclass01_Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWFireFoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
