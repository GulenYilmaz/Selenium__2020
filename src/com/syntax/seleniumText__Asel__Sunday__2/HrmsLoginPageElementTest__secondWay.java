package com.syntax.seleniumText__Asel__Sunday__2;


import com.syntax.seleniumText__Asel__Sunday__Pages.HrmsLoginPageElements__secondWay__withPageFactory;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginPageElementTest__secondWay extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		HrmsLoginPageElements__secondWay__withPageFactory login=new HrmsLoginPageElements__secondWay__withPageFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		DashBoardPageElements dashboard=new DashBoardPageElements();

	}
}
