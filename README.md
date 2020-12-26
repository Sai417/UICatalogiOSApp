# UICatalogiOSApp
 
## Problem Statement :
Please access https://github.com/appium/ios-uicatalog URL
and open the project over Xcode.
Write an automation framework to cover below scenarios:
1. Go to text fields and then
a> Enter your name + text box label in below fields
 Default ,Tinted ,Secure (Example “John Default”, “John Tinted”)
2. Go to Alert views
a> Select the option “Okay/Cancel” and click “Cancel” on the alert that comes ,
b> Go to option “Other” and select “Choice two”
3. Go to Stack views
a> Click on “+” icon ,Validate “Further Detail” option comes and then after this
click on “-” and Validate “Further Detail” option is not present on the screen.
 b> Click on “+” icon displayed next to “Add/remove views” three times and
validate “+” icon is getting disabled
 4. Go to segmented controls
a> Toggle between “Check” “search” “tools” under “TINTED” section
b> Toggle between the three icons present under “CUSTOM SEGMENTS”

### Approach:
Created a Basic Framework which has a Three packages - Appium Utils, Page Objects and Page Events

#### Appium Utils :
Here we are using all the common utils for the framework, Like Base class, Loggers , Page Constants (Static data will be kept here, like properties file) and TestNG Retry Analyzer.

Base class - CommomAppiumUtils.java - Here we will be defineing the Driver and Utlis files(Like Scroll, getText,SwitchToAlert and Some Utils)

Loggers : Log.java - console logs

PageConstants : Some Static texts are kept here for validations

RetryAnalyzer : RetryAnlayzer.java - helps to rerun the failed test cases for N number of times

#### Page Objects:
Using Page Factory to init the elements, if we are using Android and iOS in the same framework,Pagefactory will help to identify the elements based on the Device.
For Example:

@iOSXCUITFindBy(accessibility  = "Other")

@AndroidFindBY(id ="Other")

public MobileElement other;
 
#### Page Events:
Here we are defining the actions of the Page object like , Click , EnterText and Some validations

### Test Cases:
src/test/java - Test cases kept in the this folder, Each Screen has different package and respective test cases will be kept in that.

#### Build : 
iOS/Android build can be kept here for installation.

#### ScreenShots:
Failed test cases or any screenshts will be kept here.

pom.xml : Helps to get the all the required dependencies to the framework


## Prerequisites To Start:
1. Make sure Appium setup is done in your Mac. Downoad the code from the git.

2. Start the Appium Server

3. Create a Simulator (iPhone 11 Pro Max -13.3) or change the device details in the src/main/java/com/mobile/appiumUtils/CommonAppiumUtils.java

## Running the tests
To run your tests simply you need to execute the following command from inside the project directory.

1. mvn clean

2. mvn test


## Note: Things haventdone
1. Go to Stack views. - i couldn't find the Stack Views in the app.
2. Go to text fields and then
a> Enter your name + text box label in below fields
 Default ,Tinted ,Secure (Example “John Default”, “John Tinted”). - I have automated to get the Name + Label, But sendkeys is not working in the UICatalog tool, Same is working in other app , Safari and Native app. I guess issue with the UIcatalog app.
