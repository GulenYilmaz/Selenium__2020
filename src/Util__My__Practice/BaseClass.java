package Util__My__Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {//main goal is initialize the webdriver
	
	// we develope the functions
	
	public static WebDriver driver;
	public  static WebDriver setUp(String browser, String url) {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		// to initialize the our webdriver 
        // first we can read the file class.method.filepath
		//simdi dosyanin icinde ki browserin degerine gore driver i initialize edicez
	
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			
		}else if (browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
			
			
		}else {System.err.println("Browser not supported");}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME,TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		driver.get(url);
		return driver;

	}
	
	
	
	
	
	
	
	
	
	
	public static void teardown() {
	
		if(driver!=null) {
			driver.quit();
		}	
	}
	
	
	
	public static void wait(int number)  {
		try {
			Thread.sleep(1000*number);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	

}
