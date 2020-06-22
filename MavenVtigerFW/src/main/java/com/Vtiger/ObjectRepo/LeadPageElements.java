package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElements {
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLead;
	public WebElement getCreateLead()
	{
		return createLead;
	}
	@FindBy(xpath="//img[@title='Leads Settings']")
	private WebElement leadSettings;
	
	public   WebElement  getLeadSettings() {
		 return leadSettings;

	}
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement leadSearchText;
	public WebElement getleadSearchText()
	{
		return leadSearchText;
	}

}
