package com.mobile.appiumUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CommonAppiumUtils {
	public static IOSDriver<MobileElement> driver;
	
	//com.example.apple-samplecode.UICatalog

	/*
	 * creating the IOS Driver 
	 */
    @BeforeSuite
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
		String appiumURL= "http://127.0.0.1:4723/wd/hub";
		driver = new IOSDriver<MobileElement>(new URL(appiumURL), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.startTestCase("IOS Driver Launched Sucessfully");
	}
	
    /*
     * closing the driver, if it is not closed already
     */
    @AfterSuite
    public void tearDown() {
    	if(driver!=null) {
    		driver.close();
    		Log.endTestCase("IOS Driver closed Sucessfully");
    	}
    	
    }
    /*
     * this method is used to capture screenshot
     * 
     * return type String :Image name
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
 /*
  * wait & verify for the mobile element is displayed 
  * 
  * params : mobileElement
  * return type: boolean
  */
	public boolean isMobileElementDisplayed(MobileElement ele) {
		boolean isElementPresent;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			MobileElement screenWait = (MobileElement) wait.until(ExpectedConditions.visibilityOf(ele));
			isElementPresent = screenWait.isDisplayed();
			Log.info("MobileElement "+ele+" is displayed");
			return isElementPresent;	
		}catch(Exception e){
			isElementPresent = false;
			Log.error(e.getMessage());
			captureScreenShot();
			return isElementPresent;
		} 
	}
	/*
	 * Click on the element
	 * 
	 * Params : MobileElement
	 */
	
	public void click(MobileElement ele) throws Exception {
		
		try {
			if(isMobileElementDisplayed(ele))
			{
				ele.click();
				Log.info("Successfully clicked on element "+ele);
			} else {
				Log.error("Unable to identify MobileElement");
				captureScreenShot();
				
			}
		} catch (Exception e) {
				captureScreenShot();
				Log.error(e.getMessage());
		}
	}
	/*
	 * Send keys to the particular element
	 * 
	 * Params : MobileElement & Keys
	 * Return : String
	 */
	
	public String sendKeys(MobileElement ele, String keysToSend) {
		
		try {
			if(isMobileElementDisplayed(ele)) {
				ele.clear();
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
	
	/*
	 * get the Text from the element
	 * 
	 * Params : MobileElement
	 * Return : String 
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
	
	/*
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
	

}
