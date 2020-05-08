package com.syntax.seleniumclass05__DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



/*
 *  *  Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department 
Select Computers
Quit browser
 */
public class HW1 {
public static String url="http://amazon.com/";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement clickAll=driver.findElement(By.id("searchDropdownBox"));
		clickAll.click();
		Thread.sleep(3000);
		
		Select selectAll=new Select(clickAll);
		List<WebElement> options=selectAll.getOptions();
		
		for (WebElement option : options) {
			String text=option.getText();
			System.out.println(text);
			selectAll.selectByValue("search-alias=computers"+text);
		}
	driver.quit();
}
}