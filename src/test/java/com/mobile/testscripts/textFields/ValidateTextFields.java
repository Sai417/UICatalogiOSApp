package com.mobile.testscripts.textFields;

import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.TextFieldEvents;

public class ValidateTextFields extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	TextFieldEvents TextFieldEventsObj;
	
	@Test
	public void testtt() {
		
	HomePageEventsObj = new HomePageEvents();
	TextFieldEventsObj = new TextFieldEvents();
	HomePageEventsObj.clickOnTextFields();
	TextFieldEventsObj.enterText();
	
	}
}
