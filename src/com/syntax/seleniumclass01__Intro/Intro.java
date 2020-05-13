package com.syntax.seleniumclass01__Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	// making connection to the driver
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	//The path to the driver executable must be set by the ---> our key is-->webdriver.chrome.driver system property
	
	
	//opening the browser by calling the constructor of ChromeDriver class with upcasting
	WebDriver driver=new ChromeDriver();//our object to open the chrome browser
	
	driver.get("https://www.facebook.com");//--->go to google 
	driver.getCurrentUrl();//--->hangi adrese gittigimizi gosteriyor
	
	String actualUrl=driver.getCurrentUrl(); // su anda hangi adrese gittigimize bakamk icin kullaniyoruz
	System.out.println(actualUrl);
	
	
	
//	driver.getTitle();//---> title ogrenmek icin get.Title(); kullaniyoruz , dogru adrese gidip gitmedigimize bakmak icin
//	String title= driver.getTitle();
//	System.out.println(title);
//	
	String expectedUrl="https://www.facebook.com";
	
	if (actualUrl.equalsIgnoreCase(expectedUrl)) {
		String title=driver.getTitle();
		System.out.println(title);
	}else {
		System.out.println("Wrong Url is returned. ");
	}
	
	
	
	Thread.sleep(3000);//add throws declination
	driver.close();
	
}
}
