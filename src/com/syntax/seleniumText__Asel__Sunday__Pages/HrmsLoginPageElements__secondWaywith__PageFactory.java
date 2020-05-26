package com.syntax.seleniumText__Asel__Sunday__Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HrmsLoginPageElements__secondWaywith__PageFactory {

	@FindBy(id="txtUsername") // we located our element inside the username 
	public WebElement username;// --> driver.findelementBy() yerine @FindBy() annotation kullaniyoruz
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	public HrmsLoginPageElements__secondWaywith__PageFactory() {//---> to initialize  all variables with constructor
		
		PageFactory.initElements(BaseClass.driver, this); //--> object of this page
	}                //this method to initialize all elements
}                    // without main method
