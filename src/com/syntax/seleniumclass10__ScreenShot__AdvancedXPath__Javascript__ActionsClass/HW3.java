package com.syntax.seleniumclass10__ScreenShot__AdvancedXPath__Javascript__ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
 * TC 3: HRMS Login
Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”

 */
public class HW3 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	driver.close();
}
}
