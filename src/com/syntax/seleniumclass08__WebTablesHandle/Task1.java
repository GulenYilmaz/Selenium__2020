package com.syntax.seleniumclass08__WebTablesHandle;
/*
 * 1: Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 5 rows and 4 columns
Print name of all column headers 
Print data of all rows
Quit Browser

 */



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://166.62.36.207/syntaxpractice/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.className("dropdown-menu")).click();
	

	}
	
}
