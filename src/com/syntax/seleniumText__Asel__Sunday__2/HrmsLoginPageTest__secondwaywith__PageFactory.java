package com.syntax.seleniumText__Asel__Sunday__2;



import com.syntax.seleniumText__Asel__Sunday__Pages.HrmsDashBoardPageElements__secondWaywith__PageFactory;
import com.syntax.seleniumText__Asel__Sunday__Pages.HrmsLoginPageElements__secondWaywith__PageFactory;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginPageTest__secondwaywith__PageFactory extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		HrmsLoginPageElements__secondWaywith__PageFactory login=new HrmsLoginPageElements__secondWaywith__PageFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		HrmsDashBoardPageElements__secondWaywith__PageFactory dashboard=new HrmsDashBoardPageElements__secondWaywith__PageFactory();

	}
}
