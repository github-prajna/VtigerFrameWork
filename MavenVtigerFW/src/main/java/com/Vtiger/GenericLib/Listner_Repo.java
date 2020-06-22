package com.Vtiger.GenericLib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Vtiger.GenericLib.BaseClass;

public class Listner_Repo implements ITestListener {

	public void onFinish(ITestContext  context) {
		 
		
	}

	public void onStart(ITestContext context) {
		 
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		
	}

	public void onTestFailure(ITestResult result) {
		String tcName=result.getMethod().getMethodName();
		EventFiringWebDriver efwd= new EventFiringWebDriver(BaseClass.driver);
		File sourcefile=efwd.getScreenshotAs(OutputType.FILE);
		File destinationfile= new File("./screenshot/"+tcName+".png");
		try {
			FileUtils.copyFile(sourcefile, destinationfile);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		
	}

	 
	public void onTestSkipped(ITestResult result ) {
		 
	}

	 
	public void onTestStart(ITestResult  result) {
	 
	}

	 
	public void onTestSuccess(ITestResult arg0) {
		 
		
	}

}
