package com.syntax.seleniumText__Asel__Sunday__Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HrmsLoginPageElements__secondWay__withPageFactory {

	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	public HrmsLoginPageElements__secondWay__withPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}