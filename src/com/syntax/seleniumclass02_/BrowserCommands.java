package com.syntax.seleniumclass02_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
//		driver.get("https://www.facebook.com");//launch the url---> gitmak istedigimiz adresi yaziyoruz
//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();// go to one step back--->ayni sayfada iki tane web stesi acip sonra geri tusu ile geri gitmeyi yapmis oluyoruz
//		driver.navigate().forward();--->refresh the page
		
		driver.get("https://www.facebook.com");//launch the url---> gitmak istedigimiz adresi yaziyoruz
		
		driver.manage().window().maximize();

		Thread.sleep(3000);// how many second times we can close the page
		
		driver.navigate().refresh();//refresh the page
		
		driver.navigate().to("https://www.google.com");//launch the url -->get() ile ayni sadece bir farki var
		                                               //--->gitmek istedigimiz adresi yaizyoruz
		
		driver.navigate().back();// go to one step back
		
		Thread.sleep(3000);
		
		driver.navigate().forward();//bir onceki sayfaya tekrar donuyor
		
		driver.close();
		
	}

}