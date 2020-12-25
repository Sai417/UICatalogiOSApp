package com.mobile.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TextFieldspageObjects {

	
	@iOSXCUITFindBy(xpath  = "//XCUIElementTypeOther[@name='DEFAULT'][1]")
	public MobileElement defaultTextBox;
	
	@iOSXCUITFindBy(xpath  = "(//XCUIElementTypeOther[@name='TINTED'])[1]")
	public MobileElement tintedTextBox;
	
	@iOSXCUITFindBy(xpath  = "(//XCUIElementTypeOther[@name='SECURE'])[1]")
	public MobileElement secureTextBox;
}
