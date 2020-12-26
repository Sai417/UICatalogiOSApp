package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class SettingsCustomSegments extends CommonAppiumUtils {
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify Settings icon in custom Segmented contrls is selected or not")
	public void verifySettingsCustomSegments() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnSegSettings();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isSettingsSelected());
		
		
	}

}
