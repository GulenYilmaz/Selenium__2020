package com.syntax.seleniumclass04__;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {

		String url = "https://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement userName=driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		String text=userName.getAttribute("value");//it will return the value of any attribute you specify.
                                         //we can use "id" or "class"
		System.out.println(text);//-->Admin
		
		

	}

}
