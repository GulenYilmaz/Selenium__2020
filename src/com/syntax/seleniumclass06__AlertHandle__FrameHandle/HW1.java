package com.syntax.seleniumclass06__AlertHandle__FrameHandle;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
 */
public class HW1 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	
	WebElement allButton=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select select= new Select(allButton);
	Thread.sleep(3000);
	
	String optionBook="Books";
	List<WebElement> options=select.getOptions();
	for(WebElement option:options) {
		Thread.sleep(1000);	
		String optionText=option.getText();
		//System.out.println("All buttons options "+optionText);
		if (optionText.equals(optionBook)) {
			select.selectByValue("search-alias=stripbooks");
			break;
		}
	}
	Thread.sleep(2000);	

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
	Thread.sleep(3000);	

	driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	Thread.sleep(1000);	

	List <WebElement> allbookSeries=driver.findElements(By.id("brandsRefinements"));
	Thread.sleep(1000);	
	
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
	
	Thread.sleep(5000);	
	driver.close();
}
}
