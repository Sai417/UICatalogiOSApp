package com.mobile.pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AlertViewsPageObjects {
	IOSDriver<MobileElement> driver;
	public AlertViewsPageObjects(IOSDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility  = "Okay / Cancel")
	public MobileElement okayCancel;
	
	@iOSXCUITFindBy(accessibility  = "Other")
	public MobileElement other;
	
	
	@iOSXCUITFindBy(accessibility  = "Choice Two")
	public MobileElement choiceTwo;
	
	@iOSXCUITFindBy(accessibility  = "Choice One")
	public MobileElement choiceOne;
	
	
	

	
}
