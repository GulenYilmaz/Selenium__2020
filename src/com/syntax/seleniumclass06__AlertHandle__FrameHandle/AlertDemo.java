package com.syntax.seleniumclass06__AlertHandle__FrameHandle;
//http://uitestpractice.com/Students/Switchto

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		Thread.sleep(2000);
		driver.get("http://uitestpractice.com/Students/Switchto");

		driver.findElement(By.xpath("//button[@id='alert']")).click();

		// Handling simple alert/PopUps
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text:: " + simpleAText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);

		// Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAText = confirmAlert.getText();
		System.out.println("This is Confirm alert text:: " + confirmAText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		Thread.sleep(1000);

		// Handling Prompt alerts/confirmation alerts by providing some confirmation
		// message.
		String name="Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("This is Prompt alert text:: " + promptAlert.getText());
		promptAlert.sendKeys(name);
		promptAlert.accept();
		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("Text added to alert box:: "+text);
		
		
		if (text.contains(name)) {
			System.out.println("Text "+name+" was successfully added");
		}else{
			System.err.println("Text "+name+" was not entered");
		}

		BaseClass.tearDown();

	}

}