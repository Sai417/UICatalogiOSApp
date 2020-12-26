package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class DoneCustomSegments extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify Done icon in custom Segment contrls is selected or not")
	public void VerifyDoneCustomSegments() {
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnSegSearch();
		SegmentedControlEventsObj.clickOnSegDone();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isDoneSelectedDefaut());	
		
	}

}
