package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.GenericLib.BaseClass;

public class HomePageElements extends BaseClass {
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreDD;
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leads;
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaign;
	@FindBy(linkText="Organizations")
	private WebElement organization;
	@FindBy(linkText="Products")
	private WebElement products;
	@FindBy(linkText="Calendar")
	private WebElement calender;
	@FindBy(linkText="Contacts")
	private WebElement contacts;
	@FindBy(linkText="Opportunities")
	private WebElement opportunities;
	@FindBy(linkText="Documents")
	private WebElement documents;
	@FindBy(linkText="Email")
	private WebElement email;
	@FindBy(linkText="Trouble Tickets")
	private WebElement troubleTickets;
	@FindBy(linkText="Dashboard")
	private WebElement dashboard;
	@FindBy(linkText="Price Books")
	private WebElement priceBooks;
	@FindBy(linkText="Services")
	private WebElement services;
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement signOutDD;
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	public WebElement getmoreDD()
	{
		return moreDD;
	}
	public WebElement getLeads()
	{
		return  leads;
	}
	public WebElement getCampaign()
	{
		return  campaign;
	}
	public WebElement getOrganization()
	{
		return  organization;
	}
	public WebElement getProducts()
	{
		return  products;
	}
	public WebElement getCalender()
	{
		return  calender;
	}
	public WebElement getContacts()
	{
		return  contacts;
	}
	public WebElement getOpportunities()
	{
		return  opportunities;
	}
	public WebElement getEmail()
	{
		return  email;
	}
	public WebElement getDocuments()
	{
		return  documents;
	}
	public WebElement getTroubleTickets()
	{
		return  troubleTickets;
	}
	public WebElement getDashboard()
	{
		return  dashboard;
	}
	public WebElement getPriceBooks()
	{
		return  priceBooks;
	}
	public WebElement getServices()
	{
		return  services;
	}
	public WebElement getSignOutDD()
	{
		return  signOutDD;
	}
	public WebElement getSignOutLink()
	{
		return  signOutLink;
	}
	//business logic for signout
	 public void logoutFromApp()
	 {
	     wdu.keepMouseOnElement(signOutDD);
		 signOutLink.click();
	 }

}
