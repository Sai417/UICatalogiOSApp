package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;



public class VerifyDefaultsSegmentedControls extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test
	public void VerifyingDefaultsInSegmentedControls() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isSearchTintedSelectedDefault());
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isDoneSelectedDefaut());
	}

}
