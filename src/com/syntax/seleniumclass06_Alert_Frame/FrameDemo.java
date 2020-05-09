package com.syntax.seleniumclass06_Alert_Frame;
/*
 * Scenario 1: two independent frames : switch to frame 1 --> perform action --> 
 * switch to default content --> switch to frame 2 --> perform action 
 * --> switch to default content
Scenario 2: two frames (one inside another, nested frames): switch to parent frame  --> 
perform action --> switch to child frame --> perform action 
--> switch to parent--> switch to default content
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();//please uncomment uitestpractice.com url.
		
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		/*
		 * We can switch to a frame using three different methods
		 * 1. By Index. 
		 * 2. By NameOrID
		 * 3. By WebElement
		 */
		
		//By index
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		driver.switchTo().defaultContent();//switch back to main window/page/default content
		Thread.sleep(2000);
		
		
		//By NameOrID
		driver.switchTo().frame("iframe_a");//switch method is used to switch to a frame
		name.clear();
		name.sendKeys("Sermed");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		//By WebElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();//switch back to main window/page/default content
		
		
		Thread.sleep(3000);
		tearDown();
	}

}