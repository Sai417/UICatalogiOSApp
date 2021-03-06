package com.mobile.testscripts.alertViews;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.AlertViewsEvents;
import com.mobile.pageEvents.HomePageEvents;

public class CancelAlert extends CommonAppiumUtils{
	private AlertViewsEvents alertViewObj;
	private HomePageEvents HomePageEventsObj;
	
	@Test(description = "Click cancel alert and verify alert is closed or not")
	public void verifyCancelAlert() {
		HomePageEventsObj = new HomePageEvents();
		alertViewObj = new AlertViewsEvents();
		HomePageEventsObj.clickOnAlertView();
		alertViewObj.clickOnOKCancelAlerts();
		AssertJUnit.assertTrue(alertViewObj.closeAlert());
	}


}
