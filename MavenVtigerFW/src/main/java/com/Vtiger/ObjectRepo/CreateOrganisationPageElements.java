package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class CreateOrganisationPageElements   {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement accountNameTB;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	public WebElement getAccountNameTB()
	{
		return accountNameTB;
	}
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}

}
