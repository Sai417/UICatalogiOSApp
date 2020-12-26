package com.mobile.pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TextFieldspageObjects {
	IOSDriver<MobileElement> driver;
	public  TextFieldspageObjects(IOSDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeOther")
	public List<MobileElement> textFieldbox;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeOther")
	public List<MobileElement> textFieldName;
}
