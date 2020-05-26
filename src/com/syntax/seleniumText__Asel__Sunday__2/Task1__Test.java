package com.syntax.seleniumText__Asel__Sunday__2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
/*
 * TC 1: HRMS Logo Validation

Navigate to “http://166.62.36.207/humanresources/symfony/web/index”
Verify Syntax logo is displayed
Close the browser

 */
public class Task1__Test extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		Task1 login=new Task1();
		Thread.sleep(3000);
		sendText(login.username, ConfigsReader.getProperty("username"));
		Thread.sleep(3000);
		sendText(login.password, ConfigsReader.getProperty("password"));
		Thread.sleep(3000);
		click(login.loginBtn);
		
		isDisplayed(login.logo);
		
		Thread.sleep(5000);
		driver.close();
	}
}
