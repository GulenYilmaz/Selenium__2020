package com.syntax.seleniumclass05__DropDown__CreateJarFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



/*

TC 2: Select and Deselect values
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Select Dropdown List” links
Select value from “Select List Demo” section
Verify value has been selected
Select 4 options from “Multi Select List Demo”
Deselect 1 of the option from the dd
Quit browser

 */
public class Hw2 {
public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);

		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[1]")).click();
		Thread.sleep(3000);
		
		WebElement selectDD=driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		selectDD.click();
		
		Select select=new Select(selectDD);
		select.selectByValue("Wednesday");
	
//		Select 4 options from “Multi Select List Demo”		
		WebElement multiSelect=driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		
		Select select2=new Select(multiSelect);
		select2.selectByVisibleText("California");
		select2.selectByVisibleText("New Jersey");
		select2.selectByVisibleText("Florida");
		select2.selectByVisibleText("Texas");
		
		Thread.sleep(2000);
		
		System.out.println("Is multi Select Demo multiple?:::"+select2.isMultiple());
		select2.deselectByVisibleText("Texas");

		Thread.sleep(5000);
		driver.quit();
		

	}
}