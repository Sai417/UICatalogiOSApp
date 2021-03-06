package com.mobile.testscripts.alertViews;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.PageConstants;
import com.mobile.pageEvents.AlertViewsEvents;
import com.mobile.pageEvents.HomePageEvents;

public class AlertTitle extends CommonAppiumUtils {
	private AlertViewsEvents alertViewObj;
	private HomePageEvents HomePageEventsObj;
	
	@Test(description = "Verify the alert Title & Description")
	public void verifyAlertTitle() {
		HomePageEventsObj = new HomePageEvents();
		alertViewObj = new AlertViewsEvents();
		HomePageEventsObj.clickOnAlertView();
		alertViewObj.clickOnOKCancelAlerts();
		//alertViewObj.okCancelAlertMessage();
		AssertJUnit.assertEquals(PageConstants.alertMessage, alertViewObj.okCancelAlertMessage());
	}

}
