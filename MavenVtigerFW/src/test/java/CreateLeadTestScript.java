import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Vtiger.GenericLib.BaseClass;
import com.Vtiger.ObjectRepo.LeadPageElements;

 
public class CreateLeadTestScript extends BaseClass {


	@Test 
	public void creatLead() throws EncryptedDocumentException, IOException
	{	 com.Vtiger.ObjectRepo.HomePageElements hp= PageFactory.initElements(driver, com.Vtiger.ObjectRepo.HomePageElements.class);
		 LeadPageElements lp=PageFactory.initElements(driver,  LeadPageElements.class);
		 com.Vtiger.ObjectRepo.CreateLeadPageElements clp= PageFactory.initElements(driver, com.Vtiger.ObjectRepo.CreateLeadPageElements.class);
		 com.Vtiger.ObjectRepo.LeadInfoPageElements  lip = PageFactory.initElements(driver, com.Vtiger.ObjectRepo.LeadInfoPageElements.class);
		 hp.getLeads().click();
		 wdu.waitForElement( lp.getCreateLead());	
		 lp.getCreateLead().click();
		 clp.getLastNmaeTB().sendKeys(du.getDataFromExcel( "LeadData",  2,  1));
		 clp.getCompanyNameTB().sendKeys(du.getDataFromExcel("LeadData",  2,  2));
		 clp.getSaveBtn().click();
		 String actMsg=lip.getSuccessMsg().getText();
		 Assert.assertTrue(actMsg.contains( du.getDataFromExcel("LeadData", 2, 3)));
		 Reporter.log("Lead Created successfully" ,true);
}
}
