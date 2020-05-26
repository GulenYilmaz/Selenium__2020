package com.syntax.seleniumText__Asel__Saturday;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;



public class PersonalDetailsPageElements__saturdayAsel {

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	public PersonalDetailsPageElements__saturdayAsel() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
