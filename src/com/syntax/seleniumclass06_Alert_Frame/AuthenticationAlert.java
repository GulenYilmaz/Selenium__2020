package com.syntax.seleniumclass06_Alert_Frame;
//http://abcdatabase.com/basicauth
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Actual url=  http://abcdatabase.com/basicauth
		 * userName = test
		 * password = test
		 */
		
		// Making connection to the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		Thread.sleep(2000);
		
		//----> normal url driver.get("http://abcdatabase.com/basicauth");
		// ---> sadece // dan sonra ______test:test@______ekliyoruz ve giris yapiyoruz
		driver.get("http://test:test@abcdatabase.com/basicauth");
	}

}
