package com.syntax.seleniumText__Asel__Sunday__2;


import com.syntax.seleniumText__Asel__Sunday__Pages.HrmsLoginPage__firstWay;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginPageTest__firstWay extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		HrmsLoginPage__firstWay login=new HrmsLoginPage__firstWay();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		wait(5);
		
		tearDown();
		
	}
}
