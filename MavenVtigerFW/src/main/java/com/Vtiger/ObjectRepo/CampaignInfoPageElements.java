package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class CampaignInfoPageElements  {
	@FindBy(xpath="//span[contains(text(),'Campaign Information')]")
	private WebElement successMgs;
	
	public WebElement getSuccessMsg() {
		return successMgs;
		
	}

}
