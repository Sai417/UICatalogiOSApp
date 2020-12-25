package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.HomePageObjects;

public class HomePageEvents extends CommonAppiumUtils{
	public HomePageObjects homepageobject = new HomePageObjects(driver);


   public void clickOnAlertView() {

	   click(homepageobject.alertViews);
	   Log.info("Sucessfully clicked on alert view");
	   
	   
   }
   public void clickOnSegmentedControls() {

	   click(homepageobject.segmentedControls);
	   Log.info("Sucessfully clicked on Segmented Controlls");
	   
	   
   }
   
}
