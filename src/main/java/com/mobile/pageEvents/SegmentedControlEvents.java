package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.SegmentedControlsPageObjects;

public class SegmentedControlEvents extends CommonAppiumUtils{
	SegmentedControlsPageObjects SegmentedControlsPageObjects = new SegmentedControlsPageObjects(driver);
	
	public void clickOnTintedCheck() {
		Log.info("Verifying Check is selectable or not");
		click(SegmentedControlsPageObjects.tintedCheckButton);
	}
	public void clickOnTintedTools() {
		Log.info("Verifying Tools is selectable or not");
		click(SegmentedControlsPageObjects.tintedTools);
	}
	
	public void clickOnTintedSearch() {
		Log.info("Verifying Search is selectable or not");
		click(SegmentedControlsPageObjects.tintedSearch);
	}
	
	public boolean isSearchTintedSelectedDefault() {
		Log.info("Verify Search in tinted section is selected default or not");
		if(isSelected(SegmentedControlsPageObjects.tintedSearch)) {
			
			Log.info("Tinted Search is seleted Default");
			return true;
		}
		return false;
		
	}

	public boolean isCheckSelected() {
		Log.info("Verify Check in tinted section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.tintedCheckButton) &&!(isSelected(SegmentedControlsPageObjects.tintedSearch) 
				|| isSelected(SegmentedControlsPageObjects.tintedTools))) {
			Log.info("Check is Highlighted ");
			return true;
		}
		return false;
	}
	public boolean isToolsSelected() {
		Log.info("Verify Tool in tinted section is selected or not");
		
		if(isSelected(SegmentedControlsPageObjects.tintedTools) &&!(isSelected(SegmentedControlsPageObjects.tintedSearch)
				|| isSelected(SegmentedControlsPageObjects.tintedCheckButton))) {
			Log.info(" Tool is seleted ");
			return true;
		}
		return false;
	}
	public void clickOnSegSearch() {
		Log.info("Verifying Search is selectable or not");
		click(SegmentedControlsPageObjects.customSegSearch);
	}
	
	public void clickOnSegSettings() {
		Log.info("Verifying Settings is selectable or not");
		click(SegmentedControlsPageObjects.customSegSettings);
	}
	public void clickOnSegDone() {
		Log.info("Verifying Done is selectable or not");
		click(SegmentedControlsPageObjects.customSegDoneButton);
	}
	public boolean isDoneSelectedDefaut() {
		Log.info("Verify Done in Custom segment is selected defaut");
		if(isSelected(SegmentedControlsPageObjects.customSegDoneButton)) {
			Log.info("Tinted Search is seleted Default");
			return true;
		}
		return false;
	}
	public boolean isSearchSelected() {
		Log.info("Verify Search in Custom Segment section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.customSegSearch)) {
			Log.info("Search is seleted");
			return true;
		}
		return false;
	}
	public boolean isSettingsSelected() {
		Log.info("Verify Settings in custom segment section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.customSegSettings)) {
			Log.info("Settings is selected");
			return true;
		}
		return false;
	}

}
