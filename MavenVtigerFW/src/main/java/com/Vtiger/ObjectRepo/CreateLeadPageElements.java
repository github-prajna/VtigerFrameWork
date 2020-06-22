package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class CreateLeadPageElements  {
	@FindBy(name="lastname")
	private WebElement lastNameTB;
	
	@FindBy(name="company")
	private WebElement CompanyNameTB;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	

	
public WebElement getLastNmaeTB()
	
	{
		return lastNameTB;
	}

	
	
	public WebElement getCompanyNameTB()
	
	{
		return  CompanyNameTB;
	}
	
public WebElement getSaveBtn()
	
	{
		return   saveBtn;
	}

}
