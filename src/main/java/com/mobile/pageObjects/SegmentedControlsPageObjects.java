package com.mobile.pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SegmentedControlsPageObjects {
	IOSDriver<MobileElement> driver;
	public SegmentedControlsPageObjects(IOSDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility  = "Alert Views")
	public MobileElement alertViews;
	
	//XCUIElementTypeButton[@name="Done"]
	
	@iOSXCUITFindBy(xpath   = "//XCUIElementTypeButton[@name=\"Done\"]")
	public MobileElement customSegDoneButton;
	
	@iOSXCUITFindBy(accessibility  = "Settings")
	public MobileElement customSegSettings;
	
	@iOSXCUITFindBy(xpath  = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
	public MobileElement customSegSearch;
	
	@iOSXCUITFindBy(xpath   = "(//XCUIElementTypeButton[@name=\"Check\"])[2]")
	public MobileElement tintedCheckButton;
	
	@iOSXCUITFindBy(xpath  = "(//XCUIElementTypeButton[@name=\"Search\"])[2]")
	public MobileElement tintedSearch;
//	(//XCUIElementTypeButton[@name="Tools"])[2]
	@iOSXCUITFindBy(xpath  = "((//XCUIElementTypeButton[@name=\"Tools\"])[2]")
	public MobileElement tintedTools;

}
