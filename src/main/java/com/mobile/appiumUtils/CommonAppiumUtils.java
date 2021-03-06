package com.mobile.appiumUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CommonAppiumUtils {
	
	public static IOSDriver<MobileElement> driver;


	/**
	 * creating the IOS Driver , Selecting IOSDriver instead of  appium driver, since automating only on iOS device
	 * Runs before every test case and Intilaize the driver.
	 */
    @BeforeMethod
	public void iOSSimulatorSetup() throws IOException {
		DesiredCapabilities caps= new DesiredCapabilities();
		File classRootPath = new File(System.getProperty("user.dir"));
		File appDirPath = new File(classRootPath, "/build/iOSAppBuild");
		File app= new File(appDirPath,"UICatalog.zip");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("deviceName", "iPhone 11 Pro Max");
		caps.setCapability("platformVersion", "13.3");
		caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability("fullReset", false);
		caps.setCapability("noReset", true);
		String appiumURL= "http://127.0.0.1:4723/wd/hub";
		driver = new IOSDriver<MobileElement>(new URL(appiumURL), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.startTestCase("IOS Driver Launched Sucessfully");
		
	}
	
    /**
     * closing the driver, if it is not closed already
     */
    @AfterMethod
    public void tearDown() {
    	if(driver!=null) {
    		driver.quit();
    		Log.endTestCase("IOS Driver closed Sucessfully");
    	}
    	
    }
    
    /***
     * this method is used to capture screenshot
     * 
     * @return type String :Image name
     */
	
    public String captureScreenShot() {
		String destFile = null;
		String ScreenshotName = "Screenshots";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
			new File(ScreenshotName).mkdirs();
			destFile = dateFormat.format(new Date())+".png";
			//FileUtils.copyFile(src, new File(ScreenshotName +"/" +destFile));
			FileHandler.copy(src, new File(ScreenshotName +"/" +destFile));
			Log.info("Screenshot captured successfully");
		} catch (IOException e) {
			Log.error(e.getMessage());
		}
		return destFile;
	}
  /***
  * wait & verify for the mobile element is displayed 
  * 
  * @params : mobileElement
  * @return : boolean
  */
	public boolean isMobileElementDisplayed(MobileElement ele) {
		boolean isElementPresent;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			MobileElement screenWait = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
			isElementPresent = screenWait.isDisplayed();
			Log.info("MobileElement  is displayed");
			return isElementPresent;	
		}catch(Exception e){
			isElementPresent = false;
			//Log.error(e.getMessage());
			//captureScreenShot();
			return isElementPresent;
		} 
	}
	/**
	 * Click on the element
	 * 
	 * @params : MobileElement
	 */
	
	public void click(MobileElement ele) {
		
		try {
			if(isMobileElementDisplayed(ele))
			{
				ele.click();
				Log.info("Successfully clicked on element "+ele);
			} else {
				
				Log.error("Unable to identify MobileElement"+ele);
				captureScreenShot();
				
			}
		} catch (Exception e) {
				captureScreenShot();
				Log.error(e.getMessage());
		}
	}
	/**
	 * Send keys to the particular element
	 * 
	 * @params : MobileElement & Keys
	 * @return : String
	 */
	
	public String sendKeys(MobileElement ele, String keysToSend) {
		
		try {
			if(isMobileElementDisplayed(ele)) {
				ele.clear();
				//click(ele);
			
				ele.sendKeys(keysToSend);	
				Log.info("Successfully entered text on textfield using element "+ele);
				//hideKeyboard();
			}
		} catch (Exception e) {
			Log.error(e.getMessage());
			captureScreenShot();
			Assert.fail("Unable to send keys");
		}
		return keysToSend;
	}
	
	/**
	 * get the Text from the element
	 * 
	 * @params : MobileElement
	 * @return : String 
	 */
	
	public String getText(MobileElement ele)
	{
		String text = null;
		try {
			if(isMobileElementDisplayed(ele)) {
			text = ele.getText();
			Log.info(ele.getText());
		}
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			Assert.fail("Unable to get text");
		}
		return text;
	}
	
	/**
	 * Swipe down based on the coordinates
	 */
	
	@SuppressWarnings("rawtypes")
	public void swipeDown() {	
		try {
			Dimension size = driver.manage().window().getSize();
			int startx = size.width/2;
			int starty = (int) (size.height * 0.5);
			int endy = (int) (size.height * 0.2);
			new TouchAction(driver).press(PointOption.point(startx, starty))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(startx,endy)).release().perform();
		} catch (Exception e) {
			Log.error(e.getMessage());
			captureScreenShot();
			Assert.fail("Unable to swipe down using x and y co-odinnates");
		}
	}
	
	/**
	 * scroll until the element find
	 */
	public void scrollUntillElement(MobileElement ele) {
		
			while(!isMobileElementDisplayed(ele)) {
				swipeDown();
				Log.info("Scrolling to find the element");
			}
		
	}
	
	


/**
 * to Verify alert is present or not, if alert is present Switch to alert
 * @return : Boolean
 */
	public boolean isAlertPresent() 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			Log.info("Alert is present , Switched to Alert");
			return true; 
		}   
		catch (NoAlertPresentException e) 
		{ 
			Log.info("Alert is not present");
			return false; 
		}   
	} 
	
	/**
	 * This method is used to get the Alert description
	 * 
	 * @return : String
	 * 
	 */
	public String getAlertDescription() 
	{ 
		try 
		{ 
			return driver.switchTo().alert().getText() ;
			
			  
		}   
		catch (NoAlertPresentException e) 
		{ 
			Log.error("Alert is not present " +e);
			return null; 
		}   
	} 
	
	/**
	 * This method is used to click on Accept on Alert
	 */
	public void clickOnAlertAcceptBtn() {
		driver.switchTo().alert().accept();
		Log.info("Clicked on accept button on alert popup");
	}
	
	/**
	 * This method is used to click on Accept on Alert
	 */
	public void clickOnAlertDismissBtn() {
		driver.switchTo().alert().dismiss();
		Log.info("Clicked on dismiss button on alert popup");
	}
	
	/**
	 * Verify mobile element is selected or not based on value, If value =1. selected or else not selected
	 * @param :Mobile Element
	 * @return : boolean
	 */
	public boolean isSelected(MobileElement ele) {
		try {

		String value=ele.getAttribute("value");
		if(value.contains("1")) {
			return true;
		}else {
			return false;
		}
	}
		catch (Exception e) {
			return false;
		}

}
}