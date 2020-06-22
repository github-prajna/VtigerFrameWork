package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisationPageElements {
	@FindBy(xpath="//img[@title='Create Organization...']")
	 
	private WebElement ceateOrganization ;
	
	 public WebElement getCreateOrg() {
		 return ceateOrganization ;
	 }


}
