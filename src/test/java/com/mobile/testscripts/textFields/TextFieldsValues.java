package com.mobile.testscripts.textFields;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.pageEvents.HomePageEvents;
import com.mobile.pageEvents.TextFieldEvents;

public class TextFieldsValues extends CommonAppiumUtils{
	HomePageEvents HomePageEventsObj;
	TextFieldEvents TextFieldEventsObj;
	
	@Test(description = "Enter the values in the Text Fields and verify the values")
	public void verifyTextFieldsValues() {
		
	HomePageEventsObj = new HomePageEvents();
	TextFieldEventsObj = new TextFieldEvents();
	HomePageEventsObj.clickOnTextFields();
	AssertJUnit.assertTrue(TextFieldEventsObj.enterValueTextFields());
	}
}
