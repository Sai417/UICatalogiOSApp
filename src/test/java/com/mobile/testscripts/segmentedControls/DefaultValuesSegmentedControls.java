package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;



public class DefaultValuesSegmentedControls extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify the defaut selection( search and done selected by default) in the segment controls")
	public void VerifyDefaultsInSegmentedControls() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isSearchTintedSelectedDefault());
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isDoneSelectedDefaut());
	}

}
