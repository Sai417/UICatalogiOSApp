package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.HomePageObjects;

public class HomePageEvents extends CommonAppiumUtils{
	public HomePageObjects homepageobject = new HomePageObjects(driver);

	/**
	 * click on Alert view from the list in home screen
	 */
   public void clickOnAlertView() {

	   click(homepageobject.alertViews);
	   Log.info("Sucessfully clicked on alert view");	   
	   
   }
   
   	 /**
	 * click on Segmented controls from the list in home screen
	 */
   public void clickOnSegmentedControls() {

	   click(homepageobject.segmentedControls);
	   Log.info("Sucessfully clicked on Segmented Controlls");
	   	   
   }
   
   	/**
	 * click on picker view from the list in home screen
	 */
   public void clickOnPickerView() {

	   click(homepageobject.pickerView);
	   Log.info("Sucessfully clicked on Picker view");   
	   
   }
   	/**
	 * click on Text Fields from the list in home screen
	 */
   public void clickOnTextFields() {
	   scrollUntillElement(homepageobject.textFields);
	   click(homepageobject.textFields);
	   Log.info("Sucessfully clicked on text fields");	   
	   
   }
   
}
