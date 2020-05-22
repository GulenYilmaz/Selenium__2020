package com.syntax.seleniumclass10__ScreenShot__AdvancedXPath__Javascript__ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

/*
 * TC 1: Drag and Drop verification
Open chrome browser
Go to “http://www.uitestpractice.com/”
Click on “Droppable” link
Using mouse drag “Drag me to my target” to the “Drop Here”
Close the browser
 */
public class HW1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//locate both elements to drag and drop.
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		driver.close();
	}
	
}
