package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class SearchTintedSegments extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify Search icon in Tinted Segmented contrls is selected or not")
	public void VerifySearchTintedSegments() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnTintedTools();
		SegmentedControlEventsObj.clickOnTintedSearch();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isSearchTintedSelectedDefault());
		

}
}