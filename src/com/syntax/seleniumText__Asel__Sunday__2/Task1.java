package com.syntax.seleniumText__Asel__Sunday__2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
/*
 * TC 1: HRMS Logo Validation

Navigate to �http://166.62.36.207/humanresources/symfony/web/index�
Verify Syntax logo is displayed
Close the browser

 */
public class Task1 extends CommonMethods {
 
	@FindBy(id="txtUsername") // we located our element inside the username 
	public WebElement username;// --> driver.findelementBy() yerine @FindBy() annotation kullaniyoruz
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;

public Task1() {//---> to initialize  all variables with constructor
		
		PageFactory.initElements(BaseClass.driver, this); //--> object of this page
	}                //this method to initialize all elements
}// without main method
