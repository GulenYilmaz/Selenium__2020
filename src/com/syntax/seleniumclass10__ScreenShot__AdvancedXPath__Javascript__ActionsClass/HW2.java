package com.syntax.seleniumclass10__ScreenShot__AdvancedXPath__Javascript__ActionsClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/*
 * TC 2: Upload file and Take Screenshot
Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot

 */
public class HW2 {
public static void main(String[] args) throws InterruptedException {
	
	

	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//click on File Upload link
	driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']")).click();
	

	//Path of the file to upload
	String filePath="C:\\Users\\gulen";
	
	//We simply use sendkeys() method to upload the file.
	//locate the choose element and send() path of file to it.
	driver.findElement(By.xpath("//input[@class='gwt-FileUpload']")).sendKeys(filePath);
	
	//click on upload button
	driver.findElement(By.xpath("//input[@class='gwt-Button']")).click();
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	alert.accept();
	if(text.equals("File UPloaded!")) {
		
		System.out.println("File was uploaded");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/FileUploaded,png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}else {
		System.err.println("tesx case fail");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/FileUploaded,png"));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
			
			
			
			
	driver.quit();
			
			
}
}
