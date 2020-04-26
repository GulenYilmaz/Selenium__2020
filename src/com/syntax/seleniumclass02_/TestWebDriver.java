package com.syntax.seleniumclass02_;

public class TestWebDriver {

	public static void main(String[] args) {

		
		System.out.println("-------ChromeDriver--------");
		SWebDriver driver=new SChromeDriver();

		//we call the method using upcasting from SWebDriver 
		driver.get("https://www.google.com");//--->Lunching the url:: https://www.google.com

		driver.close();//--->Closing the current window
		
		
		
		System.out.println("-------FirefoxDriver--------");
		SWebDriver driver2=new SFirefoxDriver();
		
		//we call the method using upcasting from SWebDriver 
		driver2.get("https://www.google.com");
		
	}

}