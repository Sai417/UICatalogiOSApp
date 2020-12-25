package com.mobile.testscripts.alertViews;

import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.AlertViewsEvents;
import com.mobile.pageEvents.HomePageEvents;

public class VerifyAlertTitle extends CommonAppiumUtils {
	private AlertViewsEvents alertViewObj;
	private HomePageEvents HomePageEventsObj;
	
	@Test
	public void verifyAlertTitle() {
		HomePageEventsObj = new HomePageEvents();
		alertViewObj = new AlertViewsEvents();
		HomePageEventsObj.clickOnAlertView();
		alertViewObj.clickOnOKCancelAlerts();
		alertViewObj.okCancelAlertMessage();
	}

}
