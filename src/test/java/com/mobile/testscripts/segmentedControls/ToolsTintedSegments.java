package com.mobile.testscripts.segmentedControls;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.SegmentedControlEvents;

public class ToolsTintedSegments extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	SegmentedControlEvents SegmentedControlEventsObj;
	
	@Test(description = "verify Tools icon in Tinted Segmented contrls is selected or not")
	public void VerifyToolsTintedSegments() {
		
		HomePageEventsObj = new HomePageEvents();
		SegmentedControlEventsObj= new SegmentedControlEvents();
		HomePageEventsObj.clickOnSegmentedControls();
		SegmentedControlEventsObj.clickOnTintedTools();
		AssertJUnit.assertTrue(SegmentedControlEventsObj.isToolsSelected());
		

				
}
}
