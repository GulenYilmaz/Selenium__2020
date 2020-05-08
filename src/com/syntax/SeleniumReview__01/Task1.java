package com.syntax.SeleniumReview__01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



/*
 * Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
 */


public class Task1 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	
	
			WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
			Select selectDD = new Select(searchDropDown);
			List<WebElement> ddOptions = selectDD.getOptions();
			
			for(WebElement option:ddOptions) {
				String optionText = option.getText();
				System.out.println(optionText);
			}
			selectDD.selectByVisibleText("Books");	
			
			WebElement searchTextbox = driver.findElement(By.cssSelector("input[id = 'twotabsearchtextbox']"));
			searchTextbox.sendKeys("Harry Potter");
			WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit'][@class = 'nav-input']"));
			searchButton.click();
			
			List<WebElement> bookSeriesCheckboxes = driver.findElements(By.className("a-spacing-micro"));
			for(WebElement bookSeriesCheckbox: bookSeriesCheckboxes) {
				String checkboxText = bookSeriesCheckbox.getText();
				if(!bookSeriesCheckbox.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
					Thread.sleep(2000);
					bookSeriesCheckbox.click();
					break;
				}
			}
			
		}

	}