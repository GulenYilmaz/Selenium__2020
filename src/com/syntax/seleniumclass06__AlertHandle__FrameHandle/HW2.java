package com.syntax.seleniumclass06__AlertHandle__FrameHandle;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

/*
 * Homework -- Create account
Go to facebook.com
Verify “Create a new account” is Displayed
Fill out First name, lastname, email, new password
Select your birthday from given dropdowns
Select gender
Click sign up
 */
public class HW2 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@role='button']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nora");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Fraday");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("norafaraday@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("147852mnvb");
	
	WebElement ddM=driver.findElement(By.xpath("//select[@id='month']"));
	Select selectM=new Select(ddM);
	List <WebElement> allMonths=selectM.getOptions();
	for (WebElement month : allMonths) {
		String monthText=month.getText();
		if(monthText.equals("Jun")) {
			month.click();
		}
	}
	
	Thread.sleep(3000);
	
	//select.selectByValue("6");
	
	WebElement ddD=driver.findElement(By.xpath("//select[@id='day']"));
	Select selectD=new Select(ddM);
	List <WebElement> allDays=selectD.getOptions();
	for (WebElement day : allDays) {
		String dayText=day.getText();
		if(dayText.equals("6")) {
			day.click();
		}
	}Thread.sleep(3000);
	
	WebElement ddY=driver.findElement(By.xpath("//select[@id='year']"));
	Select selectY=new Select(ddY);
	List <WebElement> allYears=selectY.getOptions();
	for (WebElement year : allYears) {
		String yearText=year.getText();
		if(yearText.equals("1983")) {
			year.click();
		}
	}Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	
	Thread.sleep(3000);
	driver.close();
	
	
}
}
