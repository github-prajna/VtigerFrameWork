package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.GenericLib.BaseClass;

public class CreateProductPageElements  {
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productNameTB;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	public WebElement getProductNameTB() {
		return productNameTB;
	}
	
	public WebElement  getSaveButton() {
		return  saveButton;
	}

}
