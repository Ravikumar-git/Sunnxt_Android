Feature: SunNxt Mobile Automation

@MobileTest @Dummycase 
Scenario Outline: TC-001-007-Verify Coach mark testcases
Given Read the test data "<TestData>" and "<TestData1>" from Excel file	
Then play any movie content
When click existing user button
And enter valid credentials 
And observe user login or not 
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @guestuser @one
Scenario Outline: TCN-12-Verify as guest user
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play two free contents
Then user play one premium content after playing free content observe sigin page displaying
When user play two free contents and skip
When user click on cast icon symbol
When user click on download content

Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  
 
@MobileTest @SigninFunctionality
Scenario Outline: TCN-13-verify the Email Sign In operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user login sunnxt portal by using EMAIL
Then user login sunnxt portal by using Mobile number
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  


@MobileTest @invalidinputs 
Scenario Outline: TCN-14-verify the Sign in with invalid inputs
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user login sunnxt portal by using EMAIL wrong inputs 

Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|  

@MobileTest @playcontentBySignUp 
Scenario Outline: TCN-15-Verify Mobile number Sign up functionality 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click subscribe now button
Then fill all required details in mobilesignup
And click Submit button
Given user click enter coupon code button in profile page
Then user subscribe using couponcode
Then user Click My Account Button And Click My Subscriptions button
#And User Observe Should display user not subscribed Text
#When user play one movie content in each carousel at homepage
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @EmailSignUp
Scenario Outline: TCN-15&23&24&25&27&31&106&108-Verify Email Sign up functionality and unsubscriber subscription and Verify coupon code
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click login button
Then fill all required details in Emailsignup
And click Submit button
Given user login by unsubscription credentials and click subscription button
Then user select payment mode through credit card
And user select payment mode through debit card
Then user select payment mode through paytm
Then user select one package and enter couponcode and subscribe 
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
@MobileTest  @SigUpByvalidations @sravan @one
Scenario Outline: REG-16-check sigup by enter nine digit mobile number operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user sigup by entering nine digit phone number
When user sigup by entering eleven digit phone number
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @forgotPasswordEmailID 
Scenario Outline: TCN-17-Check forget password for valid Email Signed In users operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user Enter valid Email ID in text field
Then user observe link receive to Email ID 
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @forgotPasswordMobileNumber @one
Scenario Outline: TCN-18 Check forget password for valid mobile Number users operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user Enter valid mobile number in text field
Then user observe OTP receive to the register mobiile number
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @playfreeandpremium 
Scenario Outline: TCN-22-Verify by sign in with unsubscribed user
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user login by unsubscription credentials
Then user Play premium content
When user play two free contents
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 

 
  

 
 
 @MobileTest @editprofileforguestuser 
Scenario Outline: TCN-93-user Verify Profile page for guest user operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user enter sunnxt app by a guest and click profile icon then observe Edit profile option should not be displayed for guest user
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @Couponcode
Scenario Outline: TCN-105-Verify coupon code functionality
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click login button
Then fill all required details in Emailsignup
And click Submit button
Given user login by unsubscription credentials and click subscription button
Then user select one package and enter couponcode and subscribe 
Then user play content and check subscription plan
Then user Logout from device
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

 @MobileTest @MyAccountInGuestUser
Scenario Outline: TCN-120-Verify My Account In Guest User operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user Click on Hamburger Icon
Then user Observe My Account Button In Hamburger Section For Guest User
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|





@MobileTest @sundirectuser 
Scenario Outline: TCN-214-Verify content playback using sun direct user operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Sun Direct credentials and play one content
Then user go to profile page and navigate to subscriptions and observe user sign in Sun Direct
Then user Logout from device
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication| 

@MobileTest @previllageduser 
Scenario Outline: TCN-215-Verify content playback using previllaged user operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using previllaged user credentials and play one content
Then user go to profile page and navigate to subscriptions and observe user sign in Sun Direct
Then user Logout from device
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication| 