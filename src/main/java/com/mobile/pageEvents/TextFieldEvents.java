package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.appiumUtils.PageConstants;
import com.mobile.pageObjects.TextFieldspageObjects;

public class TextFieldEvents extends CommonAppiumUtils{
	TextFieldspageObjects TextFieldspageObjects = new TextFieldspageObjects(driver);
	
	public boolean enterText() {
		int noOfElements = TextFieldspageObjects.textFieldbox.size();
		for(int i=0;i<noOfElements;i++) {
			String Header = getText(TextFieldspageObjects.textFieldName.get(i));
			if(Header!=null) {
				String enterText= PageConstants.userName+ " "+Header;
				Log.info(enterText);
//				sendKeys(TextFieldspageObjects.textFieldbox.get(i), enterText);
//				if(!getText(TextFieldspageObjects.textFieldbox.get(i)).equals(enterText)) {
//					return false;
//				}
			}
			
		}return true;
	}
	
	

}
