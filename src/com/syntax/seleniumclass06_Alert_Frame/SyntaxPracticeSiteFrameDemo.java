package com.syntax.seleniumclass06_Alert_Frame;
//http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {

		//lunch this url from properties file. http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/bootstrap-iframe.html");
		
		driver.switchTo().frame("FrameOne");//switch to frameOne by name.
		boolean logIsDis=driver.findElement(By.id("hide")).isDisplayed();//checking presense of logo inside frame
		System.out.println("Logo inside frame one is displayed:: "+logIsDis);
		driver.switchTo().defaultContent();//Switching back to parent content.
		
		
		
		driver.switchTo().frame("FrameTwo");//switch to frameTwo by name.
		boolean enrolBtnIsEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enrol Button inside frame Two is Enabled:: "+enrolBtnIsEnabled);

		driver.quit();
		
		
		
	}

}