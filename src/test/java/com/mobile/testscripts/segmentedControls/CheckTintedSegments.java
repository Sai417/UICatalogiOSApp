package com.mobile.testscripts.segmentedControls;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class CheckTintedSegments extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify check icon in Tinted Segmented contrls is selected or not")
	public void VerifyCheckTintedSegments() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnTintedCheck();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isCheckSelected());

}
}