package com.syntax.seleniumclass05__DropDown__CreateJarFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth	
Quit browser
 */
public class Task1 {

public static String url="https://www.facebook.com";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));

		Select selectM=new Select(month);
		Select selectD= new Select(day);
		Select selectY=new Select(year);
		
		Thread.sleep(3000);
		selectM.selectByValue("Now");
		Thread.sleep(3000);
		selectD.selectByIndex(20);
		Thread.sleep(3000);
		selectY.selectByIndex(1111);
		Thread.sleep(3000);
		System.out.println(selectM.isMultiple());
		

}
}
