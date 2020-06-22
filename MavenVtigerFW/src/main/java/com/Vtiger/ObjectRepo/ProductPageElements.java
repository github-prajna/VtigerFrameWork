package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElements {
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;
	
	public WebElement getCreateProduct() {
		return createProduct;
	}

}
