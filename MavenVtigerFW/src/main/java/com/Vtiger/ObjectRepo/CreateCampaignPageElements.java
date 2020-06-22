package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class CreateCampaignPageElements {
	@FindBy(name="campaignname")
	private WebElement campaignNameTB;
	
	@FindBy(name="website")
	private WebElement websiteNameTB;
	
	@FindBy(name="tickersymbol")
	private WebElement  tickersymbolTB;
	
	 
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectProduct;
	
	@FindBy(id="search_txt")
	private WebElement searchProductNameTB;
	
	@FindBy(name="search")
	private WebElement prodSearchBtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getCampaignNameTB() {
		return campaignNameTB;
	}
	public WebElement getWebsiteNameTB() {
		return  websiteNameTB;
	}
	public WebElement gettickerSymbol() {
		return tickersymbolTB;
	}
	public WebElement  getSelectProduct()

	{
		return    selectProduct;
	}
	public WebElement getSearchProductNameTB() {
		return searchProductNameTB;
	}
	public WebElement getProdSearchBtn() {
		return prodSearchBtn;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}

}
