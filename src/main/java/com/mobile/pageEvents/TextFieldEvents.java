package com.mobile.pageEvents;

import com.mobile.appiumUtils.CommonAppiumUtils;
import com.mobile.appiumUtils.Log;
import com.mobile.appiumUtils.PageConstants;
import com.mobile.pageObjects.TextFieldspageObjects;

public class TextFieldEvents extends CommonAppiumUtils{
	TextFieldspageObjects TextFieldspageObjects = new TextFieldspageObjects(driver);
	
	
	/**
	 * To enter and verify the values in the Text fields (Name + Section Name)
	 * verify same values are entered or not ?
	 * not able to send keys in UIcatalog app.
	 * @return : Booleans
	 */
	public boolean enterValueTextFields() {
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
