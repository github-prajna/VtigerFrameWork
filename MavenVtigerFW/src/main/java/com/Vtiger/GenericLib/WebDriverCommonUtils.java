package com.Vtiger.GenericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Vtiger.GenericLib.BaseClass;

public class WebDriverCommonUtils {
	public void waitForElement(WebElement element) {
		WebDriverWait wait= new WebDriverWait(BaseClass.driver,   20);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void selectItemFromList(WebElement element, String itemToBeSelected) {
		Select s= new Select(element);
		s.selectByVisibleText(itemToBeSelected);
	}
	public Boolean checkMultipleList(WebElement element) {
		Select s= new Select(element);
		return s.isMultiple();
	}
	public void keepMouseOnElement(WebElement element) {
		 Actions act= new Actions(BaseClass.driver);
		 act.moveToElement(element).perform();
	}
	public void moveObjectAtRequiredPlace(WebElement source, WebElement target) {
		Actions act= new Actions(BaseClass.driver);
		act.dragAndDrop(source, target);
		
	}
	public void acceptAlert() {
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.accept();
	}
	public void rejectAlert() {
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
	public void validateAlertMessage(String expectedAlertMsg) {
		Alert alt=BaseClass.driver.switchTo().alert();
		String actualAlertMsg = alt.getText();
		Assert.assertEquals(actualAlertMsg, expectedAlertMsg);
	}
	public void switchToNNewWindow() {
		String  mainID = BaseClass.driver.getWindowHandle();
		Set<String>  allID = BaseClass.driver.getWindowHandles();
		for (String st : allID) {
			if (!st.equals(mainID)) {
				BaseClass.driver.switchTo().window(st);
			}
			
		}
	}
	public void switchToMainWindow() {
		String  mainID = BaseClass.driver.getWindowHandle();
 
			BaseClass.driver.switchTo().window(mainID);
		 
	}
	public void switchToRequiredFrame(WebElement element) {
		BaseClass.driver.switchTo().frame(element);
		
	}
	public void switchToRequiredScreen() {
		BaseClass.driver.switchTo().defaultContent();
		
	}
	public void fileUpLoadToApplication(String filepath) throws AWTException {
		filepath= filepath.replace("\\", "\\\\");
		StringSelection path= new StringSelection(filepath);
		Toolkit  tb = Toolkit.getDefaultToolkit();
		Clipboard  cb = tb.getSystemClipboard();
		cb.setContents( path,  null);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
