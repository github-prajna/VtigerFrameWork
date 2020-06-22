package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class CampaignPageElements   {

 
@FindBy(xpath="//img[@title='Create Campaign...']")
private WebElement createCampaign;

@FindBy(name="search_text")
private WebElement searchCampaignNameTB;
@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select")
private WebElement inListBox;

@FindBy(xpath="//a[text()='Washing Machine']/../..//input[contains(@name,'selected_id')]")
private WebElement washingMachine;

@FindBy(xpath="//input[@value='Delete']")
private WebElement downDeleteBtn;

@FindBy(xpath="//span[contains(text(),'No Campaign Found')]")
private WebElement noCampaignFound;

public WebElement getCreateCampaign()
{
	return createCampaign;
	}

public WebElement getSearchCampaignNameTB() {
	return searchCampaignNameTB;
}

public WebElement getInListBox() {
	return inListBox;
}

public WebElement getWashingMachine() {
	return washingMachine;
}
 
public WebElement getNoCampaignFound() {
	return noCampaignFound;
}
public WebElement getDownDeleteBtn() {
	return downDeleteBtn;
}

}
