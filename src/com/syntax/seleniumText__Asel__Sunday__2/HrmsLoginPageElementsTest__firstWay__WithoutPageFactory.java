package com.syntax.seleniumText__Asel__Sunday__2;

import com.syntax.seleniumText__Asel__Sunday__Pages.HrmmsLoginPageElements__firstWay__WithoutPageFactory;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginPageElementsTest__firstWay__WithoutPageFactory extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		HrmmsLoginPageElements__firstWay__WithoutPageFactory login=new HrmmsLoginPageElements__firstWay__WithoutPageFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		wait(5);
		
		tearDown();
		
	}
}
