package com.mobile.pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePageObjects{
	IOSDriver<MobileElement> driver;
	public HomePageObjects(IOSDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@iOSXCUITFindBy(accessibility  = "Alert Views")
	public MobileElement alertViews;
	
	
	@iOSXCUITFindBy(accessibility  = "Segmented Controls")
	public MobileElement segmentedControls;
	
	@iOSXCUITFindBy(accessibility  = "Picker View")
	public MobileElement pickerView;
	
	@iOSXCUITFindBy(accessibility  = "Text Fields")
	public MobileElement textFields;
	
	
}
