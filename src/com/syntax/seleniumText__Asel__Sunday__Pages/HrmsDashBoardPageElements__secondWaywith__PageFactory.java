package com.syntax.seleniumText__Asel__Sunday__Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HrmsDashBoardPageElements__secondWaywith__PageFactory {

	@FindBy(id="welcome")
	public WebElement welcome;
	
	public HrmsDashBoardPageElements__secondWaywith__PageFactory() {
		PageFactory.initElements(BaseClass.driver, this);//drivers comes from Base class
	}
}
