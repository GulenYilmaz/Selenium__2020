package com.syntax.seleniumclass09__CalendarHandles;
/*
 
 * TC 1: Calendar headers and rows verification
Open chrome browser
Go to “https://www.aa.com/homePage.do”
Enter From and To
Select departure as July 14 of 2020
Select arrival as November 8 of 2020
Close browser
Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
Next Button Xpath: //a[@title='Next']
Return Month Xpath: //span[@class='ui-datepicker-month']
Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
You can put the logic the way you want.

 */

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HW3 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.aa.com/homePage.do");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	WebElement Frombutton=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
	Frombutton.clear();
	Frombutton.sendKeys("DTW");
	
	WebElement Tobutton=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	Tobutton.clear();
	Tobutton.sendKeys("AIH");
	
	driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).sendKeys("07/23/2020");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).sendKeys("08/23/2020");
	driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();
	driver.close();
}
}