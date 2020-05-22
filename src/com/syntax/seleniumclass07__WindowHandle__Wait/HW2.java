package com.syntax.seleniumclass07__WindowHandle__Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
 * 2: Verify element is enabled
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Click on enable button
Enter “Hello” and verify text is entered successfully
Close the browser 

 */
public class HW2 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	Thread.sleep(4000);
	WebElement Textbox=driver.findElement(By.xpath("//input[@type='text']"));
	Textbox.sendKeys("hello");
	if (Textbox.isEnabled()) {
		System.out.println("text case PASS");
	}else {
		System.out.println("text case FAIL");
	}
	
	Thread.sleep(4000);
	driver.close();
	
	Thread.sleep(2000);
	
	
}
}
