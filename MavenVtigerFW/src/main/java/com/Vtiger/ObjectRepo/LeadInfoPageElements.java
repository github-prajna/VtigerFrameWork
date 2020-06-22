package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.GenericLib.BaseClass;

public class LeadInfoPageElements  {
	@FindBy(xpath="//span[contains(text(),'Lead Information')]")
	private WebElement successMsg;
	
	public WebElement getSuccessMsg()

	{
		return    successMsg;
	}


}
