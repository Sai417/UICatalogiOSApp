package com.mobile.testscripts.alertViews;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.AlertViewsEvents;
import com.mobile.pageEvents.HomePageEvents;

public class OtherAlertView extends CommonAppiumUtils{
	private AlertViewsEvents alertViewObj;
	private HomePageEvents HomePageEventsObj;
	
	@Test(description = "click on Option Two in alert and verify alert is closed or not")
	public void clickOnOptionTwo() {
		HomePageEventsObj = new HomePageEvents();
		alertViewObj = new AlertViewsEvents();
		HomePageEventsObj.clickOnAlertView();
		alertViewObj.clickOnOtherAlerts();
		AssertJUnit.assertTrue(alertViewObj.selectOptionOnAlert());
	}

}
