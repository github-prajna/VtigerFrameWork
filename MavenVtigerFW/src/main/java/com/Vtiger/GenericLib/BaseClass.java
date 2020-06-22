package com.Vtiger.GenericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.GenericLib.DataUtility;
import com.Vtiger.GenericLib.WebDriverCommonUtils;

 

public class BaseClass extends com.Vtiger.GenericLib.WebDriverCommonUtils {
	public static   WebDriver driver;
	public   DataUtility du = new DataUtility();
	public WebDriverCommonUtils wdu=new WebDriverCommonUtils();
	
	
	@BeforeSuite 
	public void configBS()
	{
		System.out.println("----DataBase connection start----");
	}
	
	@BeforeClass 
	public void configBC() throws IOException  
	{
		System.out.println("----Browser Launching Start----");
		String browser=du.getDataFromProperties("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",  "./src/main/resources/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",  "./src/main/resources/geckodriver.exe");
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("----Browser  Lauching ends----");
		
	}
	@BeforeMethod 
	public void configBM() throws IOException
	{
		System.out.println("----Login start----");
		driver.get(du.getDataFromProperties("url"));
		com.Vtiger.ObjectRepo.LoginPageElements login= PageFactory.initElements(driver, com.Vtiger.ObjectRepo.LoginPageElements.class);
		login.loginToApp( du.getDataFromProperties("un"),  du.getDataFromProperties("pwd"));
		System.out.println("-----Login Ends----");
	}
	 @AfterMethod
	public void configAM()
	{
		System.out.println("-----Logout Starts-----");
		 com.Vtiger.ObjectRepo.HomePageElements  hp= PageFactory.initElements(driver, com.Vtiger.ObjectRepo.HomePageElements.class);
		 hp.logoutFromApp();
		System.out.println("-----Logout Ends-----");
		
	}
	@AfterClass 
	public void configAC()
	{
		System.out.println("-----Browser closed-----");
		
	}
	@AfterSuite
	public void  configAS()
	{
		System.out.println("-----Data Base Connection over-----");
	}

}
