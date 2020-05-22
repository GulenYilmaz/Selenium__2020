package com.syntax.seleniumclass07__WindowHandle__Wait;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
 * 3: Windows Handling
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Javascript Alerts” link
Click on “Window Popup Modal” link
Click on the “ Follow On Instagram” button
Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
Click on the “Like us On Facebook ” button
Verify title of the page is “Go to Facebook Home” 
Quit the browser
 */
public class HW3 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Alerts & Modals")).click();
	String mainPageIDString = driver.getWindowHandle();
	System.out.println(mainPageIDString);
	
	
	driver.findElement(By.linkText("Window Popup Modal")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']")).click();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	Set <String> childWindowsIDs=driver.getWindowHandles();
	
	Iterator<String> it=childWindowsIDs.iterator();
	while(it.hasNext()){
		String childwindowID=it.next();
		//System.out.println(childwindowID);
		driver.switchTo().window(childwindowID);
		break;
	
	}
	driver.getTitle();
	WebElement logo=driver.findElement(By.name("_6q-tv"));
	String logoText=logo.getText();
	System.out.println(logoText);
	
	
	
	
	
}
}
