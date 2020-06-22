package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
	@FindBy(name="user_name")
	private WebElement username;
	 
	@FindBy( name="user_password")
	private WebElement  passowd;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'Powered by vtiger CRM - 5.4.0')]")
	private WebElement powerBytext;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getPassword()
	{
		return  passowd;
	}
	public WebElement getLoginBtn()
	{
		return  loginBtn;
	}
	public WebElement getPowerbyText()
	{
		return  powerBytext;
	}
	
	//Business logic for common action
	
	public void loginToApp(String un, String pwd) {
		username.sendKeys(un);
		passowd.sendKeys(pwd);
		loginBtn.click();
	}
	
}
