import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.GenericLib.BaseClass;
import com.Vtiger.ObjectRepo.CreateOrganisationPageElements;
import com.Vtiger.ObjectRepo.OrganisationInfoPageElements;
import com.Vtiger.ObjectRepo.OrganisationPageElements;
public class CreateOrganisation extends BaseClass {
	@Test
	 public void createOrganisation() throws EncryptedDocumentException, IOException
	 {
		 String orgName=du.getDataFromExcel(" OrgData",  2,  1);
		 Random r= new Random();
			int num=r.nextInt(9999);
			orgName=orgName+num;  
			com.Vtiger.ObjectRepo.HomePageElements  hp = PageFactory.initElements(driver, com.Vtiger.ObjectRepo.HomePageElements.class);
			 OrganisationPageElements op = PageFactory.initElements(driver,  OrganisationPageElements.class);
			  CreateOrganisationPageElements cop = PageFactory.initElements(driver,   CreateOrganisationPageElements.class);
			 
			 OrganisationInfoPageElements oip=PageFactory.initElements(driver,  OrganisationInfoPageElements.class);
			 hp.getOrganization().click();
			 op.getCreateOrg().click();
			 cop.getAccountNameTB().sendKeys(orgName);
			 cop.getSaveBtn().click();
			String actualMsg= oip.getSuccessMsg().getText();
			Assert.assertTrue(actualMsg.contains(du.getDataFromExcel(" OrgData",  2,  2)));
		
	 }
	
 
}
