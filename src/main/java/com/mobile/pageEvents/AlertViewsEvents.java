package com.mobile.pageEvents;

import org.openqa.selenium.support.PageFactory;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.AlertViewsPageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlertViewsEvents extends CommonAppiumUtils {
	
	public AlertViewsPageObjects alertViewsPageObject = new AlertViewsPageObjects(driver);
	
//	public AlertViewsEvents() {
//		
//		alertViewsPageObject= new AlertViewsPageObjects();
//		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
//		
//	}
	
	
	   public void clickOnOKCancelAlerts() {

		   click(alertViewsPageObject.okayCancel);
		   Log.info("Sucessfully clicked on okay cancel alertview");
		   
		   
	   }
	   public void clickOnOtherAlerts() {

		   click(alertViewsPageObject.other);
		   Log.info("Sucessfully clicked on other alert view");
		   
		   
	   }
	  

	   public String okCancelAlertMessage() {
		   if(isAlertPresent()) {
			  
			   String desc=getAlertDescription();
			   Log.info(" Alert description : "+desc);
			   return desc;
		   }
		   return null;
		   
	   }
	   
	   public boolean closeAlert() {
		   if(isAlertPresent()) {
			   clickOnAlertDismissBtn();
			   if(!isAlertPresent()) {
				   Log.info("Sucessfully closed the alert");
				   return true;
			   }
			   
		   }
		   return false;
	   }
	   
	   public boolean selectOptionOnAlert() {
		   if(isAlertPresent()) {
			  click(alertViewsPageObject.choiceTwo);
			   if(!isAlertPresent()) {
				   Log.info("Sucessfully closed the alert");
				   return true;
			   }
		   
	   }
		   return false;
	   }
//	public void printalltext() {
//		Log.info("Hellooo...");
//		click(alertViewsPageObject.okayCancel);
//	
//	Log.info("Okcancel alert"+	getAlertDescription());
//		click(alertViewsPageObject.cancel);
//	click(alertViewsPageObject.other);
//
//	Log.info("others alert"+	getAlertDescription());
//
//	
//	}
}

