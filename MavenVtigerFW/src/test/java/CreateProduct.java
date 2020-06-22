import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepo.CreateProductPageElements;
import com.Vtiger.ObjectRepo.HomePageElements;
import com.Vtiger.ObjectRepo.ProductPageElements;

import com.Vtiger.GenericLib.BaseClass;
@Test
public class CreateProduct extends com.Vtiger.GenericLib.BaseClass {
	public void createProduct() throws EncryptedDocumentException, IOException
	{
		HomePageElements  hp = PageFactory.initElements(driver, HomePageElements.class);
		ProductPageElements    p = PageFactory.initElements(driver,  ProductPageElements.class);
		CreateProductPageElements cpp = PageFactory.initElements(driver,  CreateProductPageElements.class);
		 hp.getProducts().click();
		 p.getCreateProduct().click();
		 cpp.getProductNameTB().sendKeys(du.getDataFromExcel( " ProdData",  2,  1));
		 cpp.getSaveButton().click();
		 String actualSuccessMsg=driver.findElement(By.xpath("//span[contains(text(),'Product Information')]")).getText();
		 Assert.assertTrue(actualSuccessMsg.contains( du.getDataFromExcel(" ProdData",  2,  2)));
		 
		
	}

}
