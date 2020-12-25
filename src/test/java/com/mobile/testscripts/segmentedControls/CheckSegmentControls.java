package com.mobile.testscripts.segmentedControls;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class CheckSegmentControls extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test
	public void VerifySegmentControlsCheck() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnTintedCheck();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isCheckSelected());

}
}