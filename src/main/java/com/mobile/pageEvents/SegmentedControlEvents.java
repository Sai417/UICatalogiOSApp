package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.pageObjects.SegmentedControlsPageObjects;

public class SegmentedControlEvents extends CommonAppiumUtils{
	SegmentedControlsPageObjects SegmentedControlsPageObjects = new SegmentedControlsPageObjects(driver);
	
	/**
	 * click on Tinted - Check icon in segmented Controls
	 */
	public void clickOnTintedCheck() {
		Log.info("Verifying Check is selectable or not");
		click(SegmentedControlsPageObjects.tintedCheckButton);
	}
	/**
	 * click on Tinted - Tools icon in segmented Controls
	 */
	public void clickOnTintedTools() {
		Log.info("Verifying Tools is selectable or not");
		click(SegmentedControlsPageObjects.tintedTools);
	}
	/**
	 * click on Tinted - Search icon in segmented Controls
	 */
	public void clickOnTintedSearch() {
		Log.info("Verifying Search is selectable or not");
		click(SegmentedControlsPageObjects.tintedSearch);
	}
	
	/**
	 * verify Search icon in the Tinted Section is selected by default or not?
	 * @return : Boolean
	 */
	public boolean isSearchTintedSelectedDefault() {
		Log.info("Verify Search in tinted section is selected default or not");
		if(isSelected(SegmentedControlsPageObjects.tintedSearch)) {
			
			Log.info("Tinted Search icon is seleted Default");
			return true;
		}
		return false;
		
	}
	/**
	 * verify Check icon in the Tinted Section is selected or not?
	 * @return : Boolean
	 */
	public boolean isCheckSelected() {
		Log.info("Verify Check in tinted section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.tintedCheckButton) &&!(isSelected(SegmentedControlsPageObjects.tintedSearch) 
				|| isSelected(SegmentedControlsPageObjects.tintedTools))) {
			Log.info("Check icon is Highlighted ");
			return true;
		}
		return false;
	}
	
	/**
	 * verify Tools icon in the Tinted Section is selected or not?
	 * @return : Boolean
	 */
	public boolean isToolsSelected() {
		Log.info("Verify Tool in tinted section is selected or not");
		
		if(isSelected(SegmentedControlsPageObjects.tintedTools) &&!(isSelected(SegmentedControlsPageObjects.tintedSearch)
				|| isSelected(SegmentedControlsPageObjects.tintedCheckButton))) {
			Log.info(" Tool icon is seleted ");
			return true;
		}
		return false;
	}
	
	/**
	 * click on Custom Segment - search icon in segmented Controls
	 */
	public void clickOnSegSearch() {
		Log.info("Verifying Search is selectable or not");
		click(SegmentedControlsPageObjects.customSegSearch);
	}
	
	/**
	 * click on Custom Segment - Settings icon in segmented Controls
	 */
	public void clickOnSegSettings() {
		Log.info("Verifying Settings is selectable or not");
		click(SegmentedControlsPageObjects.customSegSettings);
	}
	/**
	 * click on CustomSegment - Done icon in segmented Controls
	 */
	public void clickOnSegDone() {
		Log.info("Verifying Done is selectable or not");
		click(SegmentedControlsPageObjects.customSegDoneButton);
	}
	/**
	 * verify Done icon in the Custom segment Section is selected default or not?
	 * @return : Boolean
	 */
	public boolean isDoneSelectedDefaut() {
		Log.info("Verify Done in Custom segment is selected defaut");
		if(isSelected(SegmentedControlsPageObjects.customSegDoneButton)) {
			Log.info("Tinted Search icon is seleted Default");
			return true;
		}
		return false;
	}
	/**
	 * verify Search icon in the Custom segment Section is selected or not?
	 * @return : Boolean
	 */
	public boolean isSearchSelected() {
		Log.info("Verify Search in Custom Segment section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.customSegSearch)) {
			Log.info("Search icon is seleted");
			return true;
		}
		return false;
	}
	/**
	 * verify Settings icon in the Custom segment Section is selected or not?
	 * @return : Boolean
	 */
	public boolean isSettingsSelected() {
		Log.info("Verify Settings in custom segment section is selected or not");
		if(isSelected(SegmentedControlsPageObjects.customSegSettings)) {
			Log.info("Settings icon is selected");
			return true;
		}
		return false;
	}

}
