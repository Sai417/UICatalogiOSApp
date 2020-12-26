package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.AlertViewsPageObjects;

public class AlertViewsEvents extends CommonAppiumUtils {
	
	public AlertViewsPageObjects alertViewsPageObject = new AlertViewsPageObjects(driver);
	
	/**
	 * click on OK /Cancel in the Alert views section
	 */
	   public void clickOnOKCancelAlerts() {

		   click(alertViewsPageObject.okayCancel);
		   Log.info("Sucessfully clicked on okay cancel alert view");
		   
		   
	   }
	   /**
	    * click on the Others in Alert view section
	    */
	   public void clickOnOtherAlerts() {

		   click(alertViewsPageObject.other);
		   Log.info("Sucessfully clicked on other alert view");
		   
		   
	   }
	  /**
	   * This method will get the Alert Message/ Description
	   * @return : String 
	   */

	   public String okCancelAlertMessage() {
		   if(isAlertPresent()) {
			  
			   String desc=getAlertDescription();
			   Log.info(" Alert description : "+desc);
			   return desc;
		   }
		   return null;
		   
	   }
	   
	   /**
	    * Dismiss the alert and verify alert is present or not.
	    * @return: Boolean
	    */
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
	   /**
	    * Select Option two in the alert and verify alert is getting closed or not.
	    * @return ; boolean
	    */
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

}

