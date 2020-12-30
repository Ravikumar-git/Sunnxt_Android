package stepdefs;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sunnxtMobileLocators.SunNxtLocators.AboutUs;
import sunnxtMobileLocators.SunNxtLocators.Actors;
import sunnxtMobileLocators.SunNxtLocators.Addwatchlist;
import sunnxtMobileLocators.SunNxtLocators.Allow;
import sunnxtMobileLocators.SunNxtLocators.CCDCPAYTM;
import sunnxtMobileLocators.SunNxtLocators.Carouselviewall;
import sunnxtMobileLocators.SunNxtLocators.ChangeAppLanguage;
import sunnxtMobileLocators.SunNxtLocators.ChangeContentLanguage;
import sunnxtMobileLocators.SunNxtLocators.ComedyCarousel;
import sunnxtMobileLocators.SunNxtLocators.ContinueWatching;
import sunnxtMobileLocators.SunNxtLocators.Couponcode;
import sunnxtMobileLocators.SunNxtLocators.Devices;
import sunnxtMobileLocators.SunNxtLocators.Discover;
import sunnxtMobileLocators.SunNxtLocators.DownloadContent;
import sunnxtMobileLocators.SunNxtLocators.EditProfile;
import sunnxtMobileLocators.SunNxtLocators.FAQs;
import sunnxtMobileLocators.SunNxtLocators.FeedBack;
import sunnxtMobileLocators.SunNxtLocators.Filters;
import sunnxtMobileLocators.SunNxtLocators.ForgotPasswordEmail;
import sunnxtMobileLocators.SunNxtLocators.Freecontent;
import sunnxtMobileLocators.SunNxtLocators.Genres;
import sunnxtMobileLocators.SunNxtLocators.Headercontaint;
import sunnxtMobileLocators.SunNxtLocators.HomeCarousel;
import sunnxtMobileLocators.SunNxtLocators.LanguageFilter;
import sunnxtMobileLocators.SunNxtLocators.Livetv;
import sunnxtMobileLocators.SunNxtLocators.Login;
import sunnxtMobileLocators.SunNxtLocators.Logout;
import sunnxtMobileLocators.SunNxtLocators.MovieCarousel;
import sunnxtMobileLocators.SunNxtLocators.MusicVideosCarousel;
import sunnxtMobileLocators.SunNxtLocators.NonSubscribedUser;
import sunnxtMobileLocators.SunNxtLocators.ProfilePicChange;
import sunnxtMobileLocators.SunNxtLocators.Rating;
import sunnxtMobileLocators.SunNxtLocators.Recommended;
import sunnxtMobileLocators.SunNxtLocators.Searching;
import sunnxtMobileLocators.SunNxtLocators.Share;
import sunnxtMobileLocators.SunNxtLocators.Sharecontent;
import sunnxtMobileLocators.SunNxtLocators.SigUp;
import sunnxtMobileLocators.SunNxtLocators.SignUp;
import sunnxtMobileLocators.SunNxtLocators.Subscriptions;
import sunnxtMobileLocators.SunNxtLocators.SwitchProfile;
import sunnxtMobileLocators.SunNxtLocators.TVShowsGenres;
import sunnxtMobileLocators.SunNxtLocators.TVShowsTVChannels;
import sunnxtMobileLocators.SunNxtLocators.ThreeD;
import sunnxtMobileLocators.SunNxtLocators.TvShowsCarousel;
import sunnxtMobileLocators.SunNxtLocators.Tvshow;
import sunnxtMobileLocators.SunNxtLocators.VideoQuality;
import sunnxtMobileLocators.SunNxtLocators.Wifi;
import sunnxtMobileLocators.SunNxtLocators.Year;
import sunnxtMobileLocators.SunNxtLocators.playerevents;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utils.ExtTest;

public class SunNxtFunctions extends BizComps {
	@Given("^user click free content video$")
	public void user_click_free_content_video() {

		delay(1000);

		delay(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(1000);
		// swipeUp(2);
		click(MusicVideosCarousel.Viewallsongs, "user click view all comedy scenes button");
	}

	@Then("^user observe video playing or not$")
	public void user_observe_video_playing_or_not() {
		delay(1000);
		click(NonSubscribedUser.NonSubMovie_Img, "user click one free content video");
		delay(5000);

	}

	@Given("^user click any movie item$")
	public void user_click_any_movie_item() {
		click(Headercontaint.MusicVideos_Btn, " user click music videos button");
		delay(1000);
		swipeUp(2);
		delay(3000);
		click(NonSubscribedUser.NonSubMovie2_Img, "user click one premium content movie");
	}

	@Then("^user observe subscription popup displayed or not$")
	public void user_observe_subscription_popup_displayed_or_not() {
		delay(3000);
		String signIn = getElementText(SignUp.SubscribeNow_Btn, "Sign IN page is displayed");
		System.out.println(signIn);
		if (signIn.equalsIgnoreCase("Sign In")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}

	}

	@Given("^Read the test data \"([^\"]*)\" and \"([^\"]*)\" from Excel file$")

	public void given_Read_the_test_data_from_Excel_file(String arg1, String arg2) {
		try {
			GlobalUtil.dataMap =new ExcelDataUtil().getTestDataWithTestCaseID(arg1, arg2);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^user login sunnxt portal by using Mobile number$")
	public void user_login_sunnxt_portal_by_using_Mobile_number() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(5000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}

	}

	@Then("^play any movie content$")
	public void play_any_movie_content() {

		delay(1000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie_Btn, "user click one movie");
		delay(3000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(2000);

		click(Login.SelectMoviePlay_Btn, "user click play button");
	}

	@When("^click existing user button$")
	public void click_existing_user_button() {

		click(Login.ExistingUser_Btn, "user click existing user button");

	}

	@And("^enter valid credentials$")
	public void enter_valid_credentials() {
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered mobile number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
	}

	@And("^observe user login or not$")
	public void observe_user_login_or_not() {
		click(Login.loginBtn, "user click login button");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}

		delay(5000);
		Back();
	}

	@When("^user click subscribe now button$")
	public void user_click_subscribe_now_button() {
		delay(2000);
		launchHomePage();
		delay(2000);

		click(Headercontaint.Movies_Btn, "user click movies button");
		click(SignUp.SelectMovie2_Btn, "user click one movie icon");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		/*
		 * clickUsingCoordinates(632, 1182); delay(1000); clickUsingCoordinates(382,
		 * 1467); delay(1000);
		 */
		click(SignUp.SelectMovie2Play_Btn, "user click play button");
		click(SignUp.SubscribeNow_Btn, "user click subscribe Now button");

	}

	@Then("^fill all required details in mobilesignup$")
	public void fill_all_required_details_in_mobilesignup() {
		setValue(SignUp.SigUpMobile_Txt, generateRandomMobile(), "Entered Mobile number");
		// setValue(SignUp.SigUpMobile_Txt,
		// GlobalUtil.dataMap.get("SignUpMobileNumber"), "Entered mobile number");
		setValue(SignUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created  password");
		setValue(SignUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SignUp.SigUpAge_Btn, "user click age drop down button");
		click(SignUp.SigUpAgeRange_Btn, "user click one age range");
		click(SignUp.SigUpGender_Btn, "user click one gender button");
		click(SignUp.SignUpCountry_Btn, "user click country drop down button");
		click(SignUp.SignUpSelectCountry_Btn, "user click one country");
		click(SignUp.SignUpState_Btn, "user click state drop down button");
		click(SignUp.SignUpSelectState_Btn, "user click one state");

	}

	@And("^click Submit button$")
	public void click_Submit_button() {
		click(SignUp.SignUpSubmit_Btn, "user click submit button");
		// click(SignUp.MobileNumberExist_Btn, "user click number exist OK button");
		delay(5000);
	}

	@When("^user click login page button$")
	public void user_click_login_page_button() {
		delay(5000);

		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		delay(1000);
		click(Login.Profile2_Btn, "user click LOG IN button");

	}

	@Then("^user click SignUp button$")
	public void user_click_SignUp_button() {
		click(Login.SignUp_Btn, "user click signup button");
	}

	@Given("^user enter sunnxt app by a guest and click profile icon then observe Edit profile option should not be displayed for guest user$")
	public void user_enter_sunnxt_app_by_a_guest_and_click_profile_icon_then_observe_Edit_profile_option_should_not_be_displayed_for_guestuser() {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		delay(1000);
		isElementDisplayed(Wifi.HamburgerList, "Edit profile option should not be displayed for guest user");
		delay(3000);
		Back();

	}

	@When("^user sigup by entering nine digit phone number$")
	public void user_sigup_by_entering_nine_digit_phone_number() throws Exception {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");

		click(Login.Profile2_Btn, "user click LOG IN button");

		click(Login.SignUp_Btn, "user click signup button");

		setValue(SigUp.SigUpMobile_Txt, GlobalUtil.dataMap.get("ninedigitNumber"), "Entered nine digit mobile number");
		setValue(SigUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created password");
		setValue(SigUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SigUp.SigUpAge_Btn, "user click age drop down button");
		click(SigUp.SigUpAgeRange_Btn, "user select one age range");
		click(SigUp.SigUpGender_Btn, "user select one gender button");
		click(SigUp.SignUpCountry_Btn, "user click country drop down button");
		click(SigUp.SignUpSelectCountry_Btn, "user select one country");
		Thread.sleep(2000);
		click(SigUp.SignUpState_Btn, "user click state drop down button");
		Thread.sleep(2000);
		click(SigUp.SignUpSelectState_Btn, "user select one state");
		click(SigUp.SignUpSubmit_Btn, "user click submit button");
		Thread.sleep(2000);
		String signIn = getElementText(SigUp.PlsEnter_Txt, "please enter 10 digit number");
		System.out.println(signIn);

		Thread.sleep(10000);
		Back();
	}

	@And("^enter all required details in Signup page$")
	public void enter_all_required_details_in_Signup_page() {

		setValue(SignUp.SigUpMobile_Txt, GlobalUtil.dataMap.get("SignUpMobileNumber"), "Entered mobile number");
		setValue(SignUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created password");
		setValue(SignUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SignUp.SigUpAge_Btn, "user click age drop down button");
		click(SignUp.SigUpAgeRange_Btn, "user select one age range");
		click(SignUp.SigUpGender_Btn, "user select one gender button");
		click(SignUp.SignUpCountry_Btn, "user click country drop down button");
		click(SignUp.SignUpSelectCountry_Btn, "user select one country");
		click(SignUp.SignUpState_Btn, "user click state drop down button");
		click(SignUp.SignUpSelectState_Btn, "user select one state");
		click(SignUp.SignUpSubmit_Btn, "user click submit button");
		click(SignUp.MobileNumberExist_Btn, "user click exist number ok button");
		delay(5000);

	}

	@When("^user Enter valid Email ID in text field$")
	public void user_Enter_valid_Email_ID_in_text_field() {
		delay(5000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		delay(2000);

		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("ForgotPasswordEmailID"), "Entered Email ID");
	}

	@Then("^user observe link receive to Email ID$")
	public void user_observe_link_receive_to_Email_ID() {
		click(ForgotPasswordEmail.ForgotPwd_Btn, "user click forgot password button");
		click(ForgotPasswordEmail.ForgotPwdSubmit_Btn, "user click submitbutton");
		delay(5000);
		// Back();
	}

	@Given("^user Enter valid mobile number in text field$")
	public void user_Enter_valid_mobile_number_in_text_field() {
		delay(5000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("ForgotPasswordMobileNumber"), "Entered Mobile number");
		delay(2000);
	}

	@Then("^user observe OTP receive to the register mobiile number$")
	public void user_observe_OTP_receive_to_the_register_mobiile_number() {

		click(ForgotPasswordEmail.ForgotPwd_Btn, "user click forgot password button");
		delay(2000);
		click(ForgotPasswordEmail.ForgotPwdSendOTP_Btn, "user click request OTP button");
		delay(2000);
		String OTP = getElementText(ForgotPasswordEmail.ForgotPhoneOTP_Btn, "ENTER OTP TEXT box is displayed");
		System.out.println(OTP);
		if (OTP.equalsIgnoreCase("Enter OTP")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}
		delay(2000);
		setValue(ForgotPasswordEmail.ForgotPhoneOTP_Btn, GlobalUtil.dataMap.get("OTP"), "Entered OTP number");
		delay(2000);
		click(ForgotPasswordEmail.ForgotPwdSubmit_Btn, "user click submit button");
		Back();

	}

	@When("^user click login button$")
	public void user_click_login_button() {
		delay(3000);
		launchHomePage();
		delay(1000);
		click(Headercontaint.Homepage_Btn, "user click music videos button");
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		delay(1000);
		click(Login.Profile2_Btn, "user click LOG IN button");
		delay(1000);
		click(SignUp.signupBtn, "user click subscribe Now button");
		delay(1000);

	}

	@Then("^fill all required details in Emailsignup$")
	public void fill_all_required_details_in_Emailsignup() {
		setValue(SignUp.SigUpMobile_Txt, generateRandomEmail(), "Entered Email");
		// setValue(SignUp.SigUpMobile_Txt,
		// GlobalUtil.dataMap.get("SignUpMobileNumber"), "Entered mobile number");
		setValue(SignUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created  password");
		setValue(SignUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
		click(SignUp.SigUpAge_Btn, "user click age drop down button");
		click(SignUp.SigUpAgeRange_Btn, "user click one age range");
		click(SignUp.SigUpGender_Btn, "user click one gender button");
		click(SignUp.SignUpCountry_Btn, "user click country drop down button");
		click(SignUp.SignUpSelectCountry_Btn, "user click one country");
		click(SignUp.SignUpState_Btn, "user click state drop down button");
		click(SignUp.SignUpSelectState_Btn, "user click one state");

	}

	@Then("^user login to sunnxt portal by using guest credentials and play free content$")
	public void user_login_to_sunnxt_portal_by_using_guest_credentials_and_play_free_content() {

		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		click(Login.loginBtn, "user click login button");
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(1000);
		click(MusicVideosCarousel.Viewallsongs, "user click view all comedy scenes button");
		delay(2000);
		click(NonSubscribedUser.NonSubMovie_Img, "user click one free content video");
		delay(5000);

	}

	@Given("^user login sunnxt portal and user perform logout opertion$")
	public void user_login_sunnxt_portal_and_user_perform_logout_opertion() {
		delay(5000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered guest user mobile number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered guest user password");
		click(Login.loginBtn, "user click login button");
		delay(2000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Logout.logOutBtn, "user click logout button");
		delay(1000);
		click(Logout.logoutOkBtn, "user click logout OK button");
		delay(5000);
	}

	@Given("^user login sunnxt portal by using EMAIL$")
	public void user_login_sunnxt_portal_by_using_EMAIL() {
		delay(2000);
		launchHomePage();
		delay(5000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(5000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		swipeUp(1);
		click(Logout.logOutBtn, "user click logout button");
		click(Logout.logoutOkBtn, "user click logout OK button");
		delay(5000);

	}

	@Given("^user login sunnxt portal by using EMAIL wrong inputs$")
	public void user_login_sunnxt_portal_by_using_EMAIL_wrong_inputs() {
		delay(2000);
		launchHomePage();
		delay(5000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		delay(2000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("WrongEmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("Password"), "Entered password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(5000);
		Back();
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("EmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("WrongPassword"), "Entered password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		Back();
		click(Login.Profile2_Btn, "user click LOG IN button");
		delay(1000);
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("WrongEmailID"), "Entered EmailID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("WrongPassword"), "Entered password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(5000);
		Back();
	}

	@Given("^user observe swipe bottom in side of movies$")
	public void user_observe_swipe_bottom_in_side_of_movies() {
		click(Headercontaint.Movies_Btn, "user click movies button");
		// delay(2000);
		swipeUp(5, "swipe up");
		// swipeUp_FindElementClick(8, Headercontaint.Movies_Swipe_Btn);
	}

	@Then("^user observe swipe bottom in side of TVShows$")
	public void user_observe_swipe_bottom_in_side_of_TVShows() {
		click(Headercontaint.TVShow_Btn, "user click TVShow button");
		// delay(2000);
		swipeUp(4, "swipe up");
		// swipeUp_FindElementClick(10, Headercontaint.TVShow_Swipe_Btn);

	}

	@When("^user observe swipe bottom in side of music videos$")
	public void user_observe_swipe_bottom_in_side_of_music_videos() {
		// delay(5000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		// delay(2000);
		swipeUp(3, "swipe up");
		// swipeUp_FindElementClick(8, Headercontaint.MusicVideos_Swipe_Btn);

	}

	@And("^user observe swipe bottom in side of comdies$")
	public void user_observe_swipe_bottom_in_side_of_comdies() {
		// delay(5000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		// delay(2000);
		swipeUp(1, "swipe up");
		delay(3000);
	}

	@Given("^user click edit profile button$")
	public void user_click_edit_profile_button() {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 */
		click(EditProfile.editBtn, "user click edit profile button");
		// click(EditProfile.editBtn, "user click edit profile button");
	}

	@Then("^user select age range$")
	public void user_select_age_range() {
		click(EditProfile.EditCompleteProfile_Btn, "user click edit complete profile button");
		delay(5000);
		setValue(EditProfile.EditName_Txt, GlobalUtil.dataMap.get("EditProfileFirstName"), "Entered first name");
		click(EditProfile.EditAge_Btn, "user click age button");
		click(EditProfile.EditSelectAge_Btn, "user select one age range");
		delay(1000);
		swipeUp(1);
		// swipeUp(1, "swipe up");
		delay(2000);

	}

	@When("^user select country and state$")
	public void user_select_country_and_state() {
		swipeUpWithPercentages(1, 0.8, 0.4, "Performing swipe to see the Country and State.");
		delay(1000);
		click(EditProfile.editCountryBtn, "user click country button");
		delay(3000);
		swipeUpWithPercentages(1, 0.8, 0.4, "Performing swipe to see the Country and State.");
		delay(1000);
		click(EditProfile.EditSelectCountry_Btn, "user select one country");
		delay(2000);
		click(EditProfile.EditState_Btn, "user click state button");
		delay(3000);
		click(EditProfile.EditSelectState_Btn, "user select one state");
	}

	@And("^user observe edit profile change or not$")
	public void user_observe_edit_profile_change_or_not() {
		delay(1000);
		swipeUp(1, "swipe up");
		delay(1000);
		click(EditProfile.doneBtn, "user click done button");
		delay(1000);
		click(EditProfile.saveBtn, "user click save button");
		delay(5000);
		openHomeScreen();
	}

	@Given("^user click on profile photo$")
	public void user_click_on_profile_photo() {
		delay(3000);
		launchHomePage();
		delay(3000);

		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		click(EditProfile.editBtn, "user click edit profile button");
		delay(3000);
		click(ProfilePicChange.profilePic, "user click profile photo image");
		delay(3000);
	}

	@Then("^user select one image of the library$")
	public void user_select_one_image_of_the_library() {

		click(ProfilePicChange.ChooseFromLibrary_Btn, "user click choose from library button");
		Back();
		// click(ProfilePicChange.ChooseOnePic_Btn, "user select one pic from the
		// library");

	}

	@When("^user observe the profile photo is update or not$")
	public void user_observe_the_profile_photo_is_update_or_not() {
		// click(EditProfile.editBtn, "user click edit profile image");
		click(ProfilePicChange.profilePic, "user click profile photo image");
		click(ProfilePicChange.RemoveOhoto_Btn, "user click remove upload photo button");

		delay(3000);
	}

	@Given("^user click subscrption button$")
	public void user_click_subscrption_button() {
		launchHomePage();
		delay(1000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(1000);
		swipeUp(1);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
		delay(1000);
		click(Subscriptions.invoiceBtn, "user click invoice button");
	}

	@Then("^user observe the customer state$")
	public void user_observe_the_customer_state() {
		delay(1000);
		String state = getElementText(Subscriptions.CustomerState_Txt, "customer state is displayed");
		System.out.println(state);
		if (state.equalsIgnoreCase("Telangana")) {
			System.out.println("customer state is displayed");
		}
		delay(3000);

	}

	@Given("^user login by unsubscription credentials and click subscription button$")
	public void user_login_by_unsubscription_credentials_and_click_subscription_button() {

		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
	}

	@Given("^user login by unsubscription credentials$")
	public void user_login_by_unsubscription_credentials() {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("Unsubscriberusername"), "Entered Unsubscriber username");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("Unsubscriberpassword"), "Entered Unsubscriber password");
		click(Login.loginBtn, "user click login button");
		delay(2000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}
		delay(2000);

	}

	@Then("^user Play premium content$")
	public void user_Play_premium_content() {
		delay(1000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie_Btn, "user click one movie");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(5000);
		click(SignUp.skipBtn, "user click an skip content");
		delay(5000);
		Back();

	}

	@Then("^user select payment mode through credit card$")
	public void user_select_payment_mode_through_credit_card() {
		delay(1000);
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		delay(1000);
		click(CCDCPAYTM.DebitCard_Btn, "user click debit card button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");

		delay(3000);
		Back();

	}

	@And("^user select payment mode through debit card$")
	public void user_select_payment_mode_through_debit_card() {
		delay(1000);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
		delay(1000);
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		click(CCDCPAYTM.CreditCard_Btn, "user click credit card button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");

		delay(3000);
		Back();
	}

	@Then("^user select payment mode through paytm$")
	public void user_select_payment_mode_through_paytm() {
		delay(1000);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
		delay(1000);
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		click(CCDCPAYTM.Paytm_Btn, "user click paytm button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");

		delay(3000);
		Back();
	}

	@Given("^user observe the subscription plan switching$")
	public void user_observe_the_subscription_plan_switching() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
		delay(3000);
		clickUsingCoordinates(408, 1167);
		// delay(3000);

		String renew = getElementText(Subscriptions.reNewPlanBtn, "RENEW/UPGRADE PLAN text button is displayed");
		System.out.println(renew);
		if (renew.equalsIgnoreCase("Renew / Upgrade Plan")) {
			System.out.println("Renew / Upgrade Plan text button is displayed");
		}
		delay(5000);

	}

	@Given("^user click comedy button and select view all button$")
	public void user_click_comedy_button_and_select_view_all_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		// click(Login.loginBtn, "user click login button");
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music video button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		click(Genres.ViewAllComedyScenesbtn, "user click view All movies button in comedy");

	}

	@When("^user click movie button and select on one category$")
	public void user_click_movie_button_and_select_on_one_category() {
		// delay(5000);
		click(Genres.GenGenres_Btn, "user click genres Button");
		click(Genres.GenSelectCategory_Btn, "user select one category in movies");
		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in movies$")
	public void user_play_one_video_on_that_select_category_in_movie() {

		click(Genres.GenMovieSelect_Img, "user select and play one movie in movie");
		delay(5000);
		Back();
		delay(1000);
		Back();
		delay(1000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Devices.deviceBtn, "user click devices button and observe devices");
		delay(5000);
		deactivateDevices(Devices.deviceDeactivateBtn, Devices.deactivateOKBtn);

		// isWebElementPresent(Devices.deviceDeactivateBtn);
		// delay(5000);
		delay(5000);
		// delay(millis, nanos);
		// click(llow.coachmark, "user click coachmark");
		// delay(1000);
		// click(Allow.coachmark, "user click coachmark");
		// delay(1000);
		// click(Genres.GenMoviePlay_Btn, "user click play button");
		// delay(5000);

	}

	@Given("^user click comedy button and select viewall button$")
	public void user_click_comedy_button_and_select_viewall_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music video button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(1000);
		// swipeDown(10);
		// HorizontalSwipe(2);
		// horizontalSwipeWRTOelment(Genres.GenSwipeHorizontal_Btn, 800, 100);
		// delay(5000);
		// horizontalSwipeWRTOelment("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]",
		// 80, 30);
		// delay(3000);
		click(Genres.ViewAllComedyScenesbtn, "user click view All comedy button in comedy");

	}

	@When("^user click comedians button and select on one category$")
	public void user_click_comedians_button_and_select_on_one_category() {
		// delay(5000);
		click(Actors.ActActors_Btn, "user click comedians button in comedy");

		click(Genres.GenSelectCategory_Btn, "user select one category in comedians");

		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in comedians$")
	public void user_play_one_video_on_that_select_category_in_comedians() {

		click(Genres.GenMovieSelect_Img, "user select and play one video in comedians");
		// delay(2000);
		// click(Allow.coachmark, "user click coachmark");
		// delay(1000);
		// click(Allow.coachmark, "user click coachmark");
		// delay(1000);
		// click(Genres.GenMoviePlay_Btn, "user click play button");
		delay(5000);

	}

	@Given("^user click movie and select view all button$")
	public void user_click_movie_and_select_view_all_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(1000);
		swipeDown(5, "Swipe down");
		delay(1000);
		click(Headercontaint.TVShow_Btn, "user click movies button");
		delay(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(1000);
		// swipeDown(10);
		// HorizontalSwipe(2);
		// horizontalSwipeWRTOelment(Genres.GenSwipeHorizontal_Btn, 800, 100);
		// delay(5000);
		// horizontalSwipeWRTOelment("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]",
		// 80, 30);
		// delay(3000);
		click(Genres.ViewAllMoviesBtn, "user click view All movies button");
		delay(3000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); Back();
		 */

	}

	@When("^user click geners button and select on one category$")
	public void user_click_geners_button_and_select_on_one_category() {
		// delay(5000);
		click(Genres.GenGenres_Btn, "user click genres button");

		click(Genres.GenSelectCategory_Btn, "user select one category");

		click(Genres.GenOk_Btn, "user click ok button");
	}

	@Then("^user play one video on that select category in geners$")
	public void user_play_one_video_on_that_select_category_in_geners() {

		click(Genres.GenMovieSelect_Img, "user select one movie");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Genres.GenMoviePlay_Btn, "user click play button");
		delay(5000);
		// Back();
		click(Rating.starcastBtn, "user click play button");
		delay(5000);
		Back();

	}

	@Given("^user select  Movie in discovery section at homepage$")
	public void user_select_Movie_in_discovery_section_at_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeDown(5, "swipe down");
		delay(2000);
		swipeUp_FindElementClick(20, Discover.Discover_Txt, "vertical swipe");
		delay(2000);
		swipeUp(1);
		click(Discover.DiscoverGenre_Btn, "user select genres for discover");
		delay(2000);
		isElementDisplayed(Discover.Movies_Img, "selected genres movies displayed");
		delay(5000);

	}

	@Given("^user click actors button and select on one category$")
	public void user_click_actors_button_and_select_on_one_category() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(400);
		click(Genres.ViewAllMoviesBtn, "user click view All movies button");
		delay(400);
		click(Actors.ActActors_Btn, "user click actors button");
		delay(400);
		click(Actors.ActSelectCategort_Btn, "user select one category");
		delay(400);
		click(Actors.ActOk_Btn, "user click ok button");

	}

	@Then("^user play one video on that select category in actors$")
	public void user_play_one_video_on_that_select_category_in_actors() {

		click(Actors.ActMovieSelect_Img, "user select one movie");
		delay(2000);
		clickUsingCoordinates(627, 1177);
		delay(1000);
		clickUsingCoordinates(377, 1467);
		delay(1000);
		click(Actors.ActMoviePlay_Btn, "user click  play button");
		delay(5000);
		Back();

	}

	@Given("^user click movie button and select view all button$")
	public void user_click_movie_button_and_select_view_all_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		swipeDown(10, "Swipe down");
		click(Headercontaint.Movies_Btn, "user click Movies button");
		delay(2000);
		click(Genres.ViewAllMoviesBtn, "user click view all movies button");
		delay(2000);
	}

	@Given("^user click TVShow and select view all button$")
	public void user_click_TVShow_and_select_view_all_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(2000);
		swipeDown(10, "swipe down");
		delay(2000);
		click(TVShowsGenres.viewallTvshows, "user click view all shows button");
		delay(2000);
	}

	@When("^user click geners button in TVShow and select on one category$")
	public void user_click_geners_button_in_TVShow_and_select_on_one_category() {

		click(TVShowsGenres.GenGenres_Btn, "user click genres button");
		delay(2000);
		click(TVShowsGenres.GenSelectCategory_Btn, "user click one category button");
		delay(2000);
		click(TVShowsGenres.GenOk_Btn, "user click ok button");
		delay(2000);
	}

	@Then("^user play one video on TVShows and select category in geners$")
	public void user_play_one_video_on_TVShows_and_select_category_in_geners() throws InterruptedException {

		click(TVShowsGenres.GenMovieSelect_Img, "user click one movie");
		delay(5000);
		// Back();
		// delay(1000);
		// Back();
	}

	@Given("^user click TVChannel button in TVShow and select on one category$")
	public void user_click_TVChannel_button_in_TVShow_and_select_on_one__category() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		click(TVShowsGenres.viewallTvshows, "user click view all shows button");
		click(TVShowsTVChannels.TVChannels_Btn, "user click tvchannel button");
		delay(1000);
		click(TVShowsTVChannels.TVChannelsSelectCategory_Btn, "user click one category");

	}

	@Then("^user play one video on TVShow and select category in TVChannels$")
	public void user_play_one_video_on_TVShow_and_select_category_in_TVChannels() {
		delay(1000);
		click(TVShowsTVChannels.TVChannelsOk_Btn, "user click ok button");
		delay(1000);
		click(TVShowsTVChannels.TVChannelsMovieSelect_Img, "user click one movie");
		delay(5000);
		// Back();
		// delay(5000);
		// Back();
	}

	@Given("^user click change content language$")
	public void user_click_change_content_language() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(ChangeContentLanguage.ChangeContentLanguage_Btn, "user click change content language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageMalayalam_Btn, "user click malayalam language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageTamil_Btn, "user click tamil language button");

	}

	@Given("^user click change content languages$")
	public void user_click_change_content_languages() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(ChangeContentLanguage.ChangeContentLanguage_Btn, "user click change content language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageMalayalam_Btn, "user click malayalam language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageTamil_Btn, "user click tamil language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageKannada_Btn, "user click malayalam language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageBengali_Btn, "user click tamil language button");
		delay(1000);
	}

	@Then("user unselect all languages observe alerts are coming or not")
	public void user_unselect_all_languages_observe_alerts_are_coming_or_not() {

		click(ChangeContentLanguage.ChangeLanguageBengali_Btn, "user click Bengali language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageKannada_Btn, "user click kannada language button");
		delay(5000);
		click(ChangeContentLanguage.ChangeLanguageTelugu_Btn, "user click Telugu language button");
		delay(1000);
		click(ChangeContentLanguage.SaveBtn, "user click save button");
		delay(5000);
		click(DownloadContent.Okbtn, "user click Alert ok button");
		delay(2000);
		Back();
	}

	@Then("^user observe the selected language content displayed or not$")
	public void user_observe_the_selected_language_content_displayed_or_not() {

		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(1000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(5000);
		/*
		 * click(ThreeD.selectmovie, "user select movie"); delay(2000);
		 */
		click(ThreeD.ThreeD_play, "user click Movies 3D play button");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(ThreeD.selectmovie, "user select movie");
		delay(2000);
		click(Login.Playbtn, "user click Movies 3D play button");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
		Back();
	}

	@Given("^user click change app language$")
	public void user_click_change_app_language() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(ChangeAppLanguage.ChangeAppLanguage_Btn, "user click change app language button");
		delay(1000);
	}

	@Then("^user observe the headers showing selected language content$")
	public void user_observe_the_headers_showing_selected_language_content() {
		delay(3000);
		click(ChangeAppLanguage.ChangeAppTelugu_Btn, "user click telugu language button");
		delay(1000);
		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(1000);

		String text = getElementText(ChangeAppLanguage.ChangeAppHeaderTxt_Btn,
				"user observe the changed language TEXT is displayed");
		System.out.println(text);
		if (text.equalsIgnoreCase("//*[@text='à°¤à±†à°²à±�à°—à±�']\"")) {
			System.out.println("user observe the changed language TEXT is displayed");
		}
		// getElementText(ChangeAppLanguage.ChangeAppHeaderTxt_Btn, "user observe the
		// TEXT of element");
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile button");

		click(ChangeAppLanguage.ChangeAppLanguage_Btn, "user click change app language button");

		click(ChangeAppLanguage.ChangeAppEnglish_Btn, "user click telugu language button");

		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(3000);
		// click(Logout.afterLoginProfileBtn, "user click profile image");
		// delay(5000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 */
		/*
		 * swipeUp(2); delay(3000); click(Devices.deviceBtn,
		 * "user click devices button and observe devices"); delay(5000);
		 * deactivate_Devices(Devices.deviceDeactivateBtn, Devices.deactivateOKBtn);
		 * 
		 * //isWebElementPresent(Devices.deviceDeactivateBtn); // delay(5000);
		 * delay(5000);
		 */
	}

	@Given("^user click settings button$")
	public void user_click_settings_button() {
		delay(3000);
		launchHomePage();
		delay(3000);
		click(Wifi.hamburger_icon, "user click vertical dots button");
		delay(2000);
		click(Wifi.WifiSettings_Btn, "user click settings button");
		delay(2000);
	}

	@Then("^user observe wifi on and off button working$")
	public void user_observe_wifi_on_and_off_button_working() {

		click(Wifi.WifiDownloadOnWIFI_Btn, "user on  wifi");
		delay(5000);
		/*
		 * click(Wifi.WifiDownloadOnWIFI_Btn, "user off wifi"); delay(5000);
		 */
		Back();
		/*
		 * click(Headercontaint.Movies_Btn, "user click movies button"); delay(3000);
		 * click(MovieCarousel.SelectFirstMovie_Img,
		 * "user select one movie in first carousel");
		 * 
		 * try { if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
		 * click(Allow.coachmark, "user click allow button"); }
		 * 
		 * if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
		 * click(Allow.coachmark, "user click allow button"); } } catch
		 * (NoSuchElementException | TimeoutException e) { }
		 * click(MovieCarousel.MoviePlay_Btn, "user click play button"); delay(8000);
		 * click(DownloadContent.Download_Btn,
		 * "user download selected content in homepage"); delay(2000);
		 * click(DownloadContent.DownloadBest_Btn,
		 * "user select the download quality of the content homepage"); delay(8000);
		 * Back(); click(Wifi.hamburger_icon, "user click vertical dots button");
		 * delay(2000); click(Wifi.WifiSettings_Btn, "user click settings button");
		 * delay(2000); click(Wifi.WifiDownloadOnWIFI_Btn, "user off wifi");
		 * delay(5000);
		 */
		// click(Wifi.WifiSettingsBack_Btn, "user click settings back button");
	}

	@Then("^user observe Enable wifi on and off button working$")
	public void user_observe_Enable_wifi_on_and_off_button_working() {

		click(Wifi.WifiDownloadOnWIFI_Btn, "user on  wifi");
		delay(5000);
		Back();
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");

		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(8000);
		click(DownloadContent.Download_Btn, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content homepage");
		delay(8000);
		Back();
		click(Wifi.hamburger_icon, "user click vertical dots button");
		delay(2000);
		click(Wifi.WifiSettings_Btn, "user click settings button");
		delay(2000);
		click(Wifi.WifiDownloadOnWIFI_Btn, "user off wifi");
		delay(5000);
		// click(Wifi.WifiSettingsBack_Btn, "user click settings back button");
	}

	@Given("^user click video quality button$")
	public void user_click_video_quality_button() {
		delay(3000);
		launchHomePage();
		delay(3000);
		click(Wifi.hamburger_icon, "user click vertical dots button");

		click(Wifi.WifiSettings_Btn, "user click settings button");

		click(VideoQuality.VideoQuality_btn, "user click video Quality button");

		click(VideoQuality.VideoAuto_Btn, "user DE-select Automatic quality button");
	}

	@Then("^user observe video quality changeing operation and play one content$")
	public void user_observe_video_quality_changeing_operation_and_play_one_content() {

		click(VideoQuality.VideoMedium_Btn, "user click medium quality button");

		click(VideoQuality.VideoSave_Btn, "user click video Save button");
		delay(2000);
		Back();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2, "swipe up");
		// swipeUp(2);
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in Movies");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); click(Allow.coachmark,
		 * "user click coachmark");
		 */
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(3000);
		Back();

	}

	@Given("^user click FeedBack button$")
	public void user_click_FeedBack_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Wifi.hamburger_icon, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(FeedBack.FeedBack_Btn, "user click FeedBack button");

	}

	@Then("^user observe feedback submition$")
	public void user_observe_feedback_submition() {

		setValue(FeedBack.FeedBackWrite_Txt, GlobalUtil.dataMap.get("Text"), "Entered text in write field");
		click(FeedBack.Submit_Btn, "user click submit button");
		delay(5000);
	}

	@Given("^user click AboutUs button and observe the information of SunNxt App$")
	public void user_click_AboutUs_button_and_observe_the_information_of_SunNxt_App() {
		delay(2000);
		launchHomePage();
		delay(5000);
		click(Wifi.hamburger_icon, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(AboutUs.AboutUS_Btn, "user click About US button");
		delay(8000);
		swipeUp(2, "swipe up");
		Back();
	}

	@Given("^user click FAQs button and observe the FAQs information in SunNxt App$")
	public void user_click_FAQs_button_and_observe_the_FAQs_information_in_SunNxt_App() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Wifi.hamburger_icon, "user click vertical dots button");
		click(Wifi.WifiSettings_Btn, "user click settings button");
		click(FAQs.FAQs_Btn, "user click FAQ's button");
		delay(2000);
		swipeUp(6);
		delay(2000);

		Back();
		delay(2000);

	}

	@Then("^user click terms and conditions button and observe the terms and conditions in SunNxt App$")
	public void user_click_terms_and_conditions_button_and_observe_the_terms_and_conditions_in_SunNxt_App() {

		delay(2000);
		click(FAQs.TermsAndConditions_Btn, "user click Terms And Conditions button");
		delay(2000);
		swipeUp(10);
		// swipeUp(10, "swipe up in terms and conditions");
		delay(2000);
		Back();
		// delay(5000);
		// click(Wifi.WifiSettingsBack_Btn, "user click settings back button");

	}

	@Given("^user click Switch profile button$")
	public void user_click_Switch_profile_button() {
		delay(2000);
		launchHomePage();
		delay(2000);

		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(2000);
		 */
		swipeDown(1, "visible profile icon");
		delay(2000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch proflile image");

	}

	@When("^user create one new profile$")
	public void user_create_one_new_profile() {
		try {
			if (getMDriver().findElement(SwitchProfile.deleteicon).isDisplayed()) {
				click(SwitchProfile.deleteicon, "user click delete profile button");
				if (getMDriver().findElement(SwitchProfile.DeleteConform_Brn).isDisplayed()) {
					click(SwitchProfile.DeleteConform_Brn, "user click delete confirm button");
				}

			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(SwitchProfile.AddPlus_Btn, "user click add profle button");
		delay(1000);
		setValue(SwitchProfile.AddUserName_Txt, GlobalUtil.dataMap.get("SwitchUsersecondprofile"),
				"Entered user name in new profile");
		delay(1000);
		click(SwitchProfile.AddLanguage_Btn, "user click preferred language button");
		delay(5000);
		click(SwitchProfile.Selectlanguage_Btn, "user select one language button");
		delay(5000);
		click(SwitchProfile.AddSave_Btn, "user click save button");
		delay(5000);
		click(SwitchProfile.Add_Btn, "user click language button");
	}

	@When("^user create one newprofile$")
	public void user_create_one_newprofile() {

		click(SwitchProfile.AddPlus_Btn, "user click add profle button");
		delay(1000);
		setValue(SwitchProfile.AddUserName_Txt, GlobalUtil.dataMap.get("SwitchUserName"),
				"Entered user name in new profile");
		delay(1000);
		click(SwitchProfile.AddLanguage_Btn, "user click preferred language button");
		delay(5000);
		click(SwitchProfile.Selectlanguage_Btn, "user select one language button");
		delay(5000);
		click(SwitchProfile.AddSave_Btn, "user click save button");
		delay(5000);
		click(SwitchProfile.Add_Btn, "user click language button");
	}

	@Then("^user observe the swithing operation$")
	public void user_observe_the_swithing_operation() {
		delay(5000);
		click(SwitchProfile.SelectNewProfile_Btn, "user click new profile");
		delay(5000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(5000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch profle image");
		delay(5000);
		click(SwitchProfile.SelectOldProfile_Btn, "user click previous profile");

	}

	@Then("^user observe the swithing profile$")
	public void user_observe_the_swithing_profile() {
		launchHomePage();
		delay(5000);
		/*
		 * click(Logout.afterLoginProfileBtn, "user click profile image"); delay(2000);
		 * click(SwitchProfile.SelectNewProfile_Btn, "user click new profile");
		 * delay(5000);
		 */
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(5000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch profle image");
		delay(5000);
		click(SwitchProfile.SelectOldProfile_Btn, "user click previous profile");

	}

	@Then("^user observe the secondary profile$")
	public void user_observe_the_secondary_profile() {
		delay(5000);
		click(SwitchProfile.SelectNewProfile_Btn, "user click new profile");
		delay(5000);
		/*
		 * click(Logout.afterLoginProfileBtn, "user click profile image"); delay(5000);
		 */
		click(Headercontaint.Movies_Btn, "user click Movies button");
		delay(2000);
		click(Login.SelectMovie_Btn, "user click one movie");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(5000);
		Back();

	}

	@And("^user delete the create profile$")
	public void user_delete_the_create_profile() {
		launchHomePage();
		delay(5000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(5000);
		click(SwitchProfile.SwithProfile_Brn, "user click switch profle image");
		delay(5000);
		click(SwitchProfile.ProfileDelete_Btn, "user click new profile delete button");
		delay(3000);
		click(SwitchProfile.DeleteConform_Brn, "user click new profile delete button");
		delay(3000);
		Back();
		delay(3000);
		/*
		 * swipeUp(1); delay(3000); click(Devices.deviceBtn,
		 * "user click devices button and observe devices"); delay(5000);
		 * deactivate_Devices(Devices.deviceDeactivateBtn, Devices.deactivateOKBtn);
		 */

	}

	@When("^user play one movie content in each carousel at homepage$")
	public void user_play_one_movie_content_in_each_carousel_at_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click Homepage button");
		delay(1000);
		swipeUp(10);
		delay(1000);
		swipeDown(15, "swipe down");
		delay(5000);
		click(HomeCarousel.FirstCarouselMovie, "user click first carousel movie play");
		delay(8000);
		Back();
		delay(2000);
		swipeUp(2);
		delay(2000);
		click(HomeCarousel.SecondCarouselMovie, "user click second carousel movie play");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
		Back();

	}

	@When("^user play one movie content in each carousel at Movie page$")
	public void user_play_one_movie_content_in_each_carousel_at_Movie_page() {
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");

		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(2000);
		Back();
		delay(4000);
		swipeUp_FindElementClick(20, MovieCarousel.SecondCarousel, "vertical swipe");
		delay(4000);
		click(MovieCarousel.SelectsecondMovie_Img, "user select one movie in second carousel");
		delay(3000);
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(2000);
		Back();

	}

	@When("^user play one TVshow content in each carousel at TVShows page$")
	public void user_play_one_TVshow_content_in_each_carousel_at_TVShows_page() throws Exception {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(4000);
		swipeUp(4);
		// swipeUp_FindElementClick(20, TvShowsCarousel.FirstCarousel, "swipeing for
		// perticular selected carousel");
		delay(4000);
		click(TvShowsCarousel.SelectFirstMovie_Img, "user select one TVShow in first selected carousel");
		delay(8000);
		Back();
		/*
		 * delay(3000); swipeUp_FindElementClick(20, TvShowsCarousel.SecondCarousel,
		 * "swipeing for perticular selected carousel"); delay(3000);
		 * click(TvShowsCarousel.SelectSecondMovie_Img,
		 * "user select one TVSHOW in second selected carousel");
		 */
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(8000);
		Back();

	}

	@When("^user play one musicvideo content in each carousel at music video page$")
	public void user_play_one_musicvideo_content_in_each_carousel_at_music_video_page() throws Exception {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Comedy_Btn, "user click music videos button");
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
		swipeUp_FindElementClick(20, MusicVideosCarousel.FirstCarousel, "swipeing for perticular selected carousel");
		delay(3000);
		click(MusicVideosCarousel.SelectFirstMovie_Img, "user play one music video in first selected carousel");
		delay(5000);
		Back();
		delay(2000);
		click(MusicVideosCarousel.SelectSecondMovie_Img, "user select one music video in second carousel");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(4000);
		Back();

	}

	@When("^user play one musicvideo content in each carousel at comedy page$")
	public void user_play_one_musicvideo_content_in_each_carousel_at_comedy_page() throws Exception {
		delay(2000);
		launchHomePage();

		delay(2000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(2000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(2000);
		swipeUp_FindElementClick(20, ComedyCarousel.FirstCarousel, "swipeing for perticular selected carousel");
		delay(3000);
		click(ComedyCarousel.SelectFirstMovie_Img, "user select one music video in first selected carousel");
		delay(5000);
		// click(Allow.click_coachmark, "user click coachmark");
		// click(Allow.click_coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		delay(2000);

		// delay(2000);
		click(ComedyCarousel.SelectSecondMovie_Img, "user select one music video in second selected carousel");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(2000);
		Back();

	}

	@When("^user select one movie and add selected movie to watch list$")
	public void user_select_one_movie_and_add_selected_movie_to_watch_list() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2, "swipe up");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); click(Allow.coachmark,
		 * "user click coachmark");
		 */

		click(Addwatchlist.AddWatchList_Btn, "user add content to watch list");
		delay(2000);
		Back();
		delay(2000);
		Back();

	}

	@Then("^user observe added movie is Displayed in watchlist and Remove Content In WatchList$")
	public void user_observe_added_movie_is_displayed_in_watchlist_and_Remove_Content_In_WatchList() {
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 */
		click(Addwatchlist.WatchList_Btn, "user click on watch list button");
		delay(2000);
		click(Addwatchlist.WatchListdots_Btn, "user click on hamburger menu");
		delay(2000);
		click(Addwatchlist.RemoveWatchList_Btn, "user click on remove from watchlist button");
		delay(2000);
		click(Addwatchlist.Ok_Btn, "user click on ok button");
		delay(3000);
		Back();

	}

	@Given("^user click subscription button and observe subscription plan$")
	public void user_click_subscription_button_and_observe_subscription_plan() {
		delay(1000);
		launchHomePage();
		delay(1000);
		/*
		 * click(Login.Profile_Btn, "user click profile image");
		 * click(Login.Profile2_Btn, "user click LOG IN button");
		 * setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"),
		 * "Entered guest user mobile number"); setValue(Login.Password_Txt,
		 * GlobalUtil.dataMap.get("GuestUserPassword"), "Entered guest user password");
		 * click(Login.loginBtn, "user click login button"); delay(2000); if
		 * (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
		 * deactivateDevicesUsingWebPortal(); click(Login.loginBtn,
		 * "user click login button"); } delay(2000);
		 */
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button and observe subscriptions plan");
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Subscriptions.subscriptionplan));
		delay(3000);
	}

	@Given("^user click devices button and observe the list of devices$")
	public void user_click_devices_button_and_observe_the_list_of_devices() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		swipeUp(1);
		click(Devices.DeviceBtn, "user click devices button and observe devices");
		delay(5000);

	}

	@Given("^user click on movie and cick view all movies$")
	public void user_click_on_movie_and_cick_view_all_movies() {
		delay(2000);
		launchHomePage();
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(2000);
		click(Genres.ViewAllMoviesBtn, "user click movies button");
		delay(2000);

	}

	@Then("^search movie content$")
	public void search_movie_content() {
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchingMovie"),
				"Entered movie in searching field");
		delay(2000);
		Back();
		delay(2000);
		click(Searching.Searchingmovie_Btn, "user click searching movie");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Login.Playbtn, "user played  Content");

		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);

		Back();

	}

	@Given("^user search one movie content in search field$")
	public void user_search_one_movie_content_in_search_field() {
		delay(3000);
		launchHomePage();
		delay(3000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchingMovie"),
				"Entered movie in searching field");
		delay(2000);
		Back();
		delay(2000);
		click(Searching.Searchingmovie_Btn, "user click searching movie");
		delay(2000);
		/*
		 * click(Login.Playbtn, "user played  Content"); delay(2000);
		 */
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Login.Playbtn, "user played  Content");
		// delay(2000);
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);

		Back();

	}

	@Then("^user search one TVShow content in search field$")
	public void user_search_one_TVShow_content_in_search_field() {
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchingTVshow"),
				"Entered TVShow in searching field");
		delay(4000);

		// Back();
		delay(2000);

		click(Searching.SearchingTVShow_Btn, "user click searching TVShow");
		delay(10000);
		Back();
	}

	@Then("^user search one Music content in search field$")
	public void user_search_one_Music_content_in_search_field() {
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchMusicVideo"),
				"Entered particular Music Video Song in searching field");
		delay(5000);
		click(Login.SelectMovie_Btn, "user play Dispalyed searching Music Video Content");
		delay(10000);
		Back();
	}

	@Then("^user search one Comedy content in search field$")
	public void user_search_one_Comedy_content_in_search_field() {

		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchcomedyclip"),
				"Entered particular comedy clip in searching field");

		delay(2000);

		click(Login.Searchcomedy, "user play Dispalyed searching Comedy Clip Content");
		/*
		 * delay(2000); click(Login.Playbtn, "user played  Content");
		 */
		delay(10000);
		Back();

	}

	@Then("^user search one Actor in search field$")
	public void user_search_one_Actor_in_search_field() {
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchactor"),
				"Entered particular Actor in searching field");

		delay(2000);
		click(Login.SelectMovie_Btn, "user play Dispalyed searching Actor related movies");
		delay(5000);
		Back();
	}

	@Then("^user search diffrent text and LiveTV content in search field$")
	public void user_search_diffrent_text_content_in_search_field() {
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("spellingMistakecontent"),
				" Search for content by entering spelling mistake");

		delay(5000);
		getData(GlobalUtil.dataMap.get("Searching spelling Mistake content"));
		delay(2000);
		// Back();
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchlivetvchannel"), " Search for Live TV");
		/*
		 * click(Livetv.SunmusicHDChannel,
		 * "user play content related to searching text"); delay(5000);
		 */
		click(Login.SelectMovie_Btn, "user played live tv");
		delay(10000);
		Back();
		delay(2000);
		Back();
	}

	@When("^user click on cast icon symbol$")
	public void user_click_on_cast_icon_symbol() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.casticonbtn, "user click cast icon");
		delay(15000);
		/*
		 * String signIn = getElementText(SignUp.SubscribeNow_Btn,
		 * "Sign IN page is displayed"); System.out.println(signIn);
		 */
		click(Headercontaint.casticoncancelbtn, "user click cast icon cancel button");
		Back();
	}

	@Then("^user clear all search history$")
	public void user_clear_all_search_history() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(5000);
		click(Headercontaint.searchclearall, "user click search clear all button");
		delay(2000);
		Back();
		delay(2000);
		Back();
	}

	@Then("^user Observe Content will update in recent search history$")
	public void user_Observe_Content_will_update_in_recent_search_history() {
		delay(3000);
		click(Login.SelectMovie_Btn, "user play Dispalyed searching Movie Content");
		delay(3000);
		Back();
		delay(3000);
		Back();
	}

	@Given("^user click enter coupon code button in profile page$")
	public void user_click_enter_coupon_code_button_in_profile_page() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(5000);
		swipeUp(1);
		click(Couponcode.Entercode_Btn, "user click enter coupon code button");
		delay(5000);

	}

	@Then("^user subscribe using couponcode$")
	public void user_subscribe_using_couponcode() {

		setValue(Couponcode.Code_Txt, GlobalUtil.dataMap.get("couponcode"), "Entered couponcode");
		delay(1000);
		click(Couponcode.Submit_Btn, "user click submit button");
		delay(2000);
		click(DownloadContent.cancelOKbtn, "user click enter coupon code button");
		delay(5000);
		Back();
	}

	@Given("^user select one movie by using unsubscribed cridentials$")
	public void user_select_one_movie_by_using_unsubscribed_cridentials() {
		delay(3000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		delay(1000);
		click(Login.Profile2_Btn, "user click LOG IN button");
		delay(1000);
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		delay(1000);
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(1000);
		swipeUp(2);
		delay(2000);
		click(Couponcode.SelectMovie_Img, "user click one movie content video");
		delay(3000);
	}

	@Then("^user select one package and enter couponcode and subscribe$")
	public void user_select_one_package_and_enter_couponcode_and_subscribe() {
		Back();
		delay(1000);
		click(Headercontaint.Comedy_Btn, "user click Comedy  button");
		delay(1000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(1000);
		swipeUp(2);
		delay(2000);
		click(Couponcode.SelectMovie_Img, "user click one movie content video");
		delay(3000);
		click(Couponcode.EntercodeInPack_Btn, "user select couponcode pack");
		delay(2000);
		click(Couponcode.Code_Txt, "user click coupon code text field");
		delay(2000);
		setValue(Couponcode.Code_Txt, GlobalUtil.dataMap.get("couponcode"), "Entered coupon code");
		delay(1000);
		click(Couponcode.Submit_Btn, "user click submit button");
		delay(5000);
		Back();
	}

	@Then("^user play content and check subscription plan$")
	public void user_play_content_and_check_subscription_plan() {
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie2_Btn, "user click one movie");
		delay(3000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(2000);
		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(8000);
		Back();
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(2000);
		swipeUp(1);
		click(Subscriptions.Subscriptionbtn, "user download selected content in homepage");
		delay(10000);

	}

	@Given("^user go to profile page and select devices button$")
	public void user_go_to_profile_page_and_select_devices_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Devices.DeviceBtn, "user click devices button and observe devices");
		delay(2000);
	}

	@Then("^user deactivate one device into the list of devices$")
	public void user_deactivate_one_device_into_the_list_of_devices() {
		delay(1000);
		click(Devices.deviceDeactivateBtn, "user Deactivate one device in list");
		delay(2000);
		click(Devices.deactivateOKBtn, "user click ok button");
		delay(2000);
		Back();
	}

	@And("^user enter activate device code and click activate button$")
	public void user_enter_activate_device_code_and_click_activate_button() {
		delay(2000);
		setValue(Devices.enterDeviceCodeTxt, GlobalUtil.dataMap.get("devicecode"), "Entered device code");
		delay(1000);

		click(Devices.ActivateBtn, "user click Activate button");
		delay(5000);
		Back();
		delay(1000);
		Back();
	}

	@Given("^user select one genre in discovery section at homepage$")
	public void user_select_one_genre_in_discovery_section_at_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click movies button");
		delay(3000);
		swipeUp_FindElementClick(20, Discover.Discover_Txt, "vertical swipe");
		delay(2000);
		swipeUp1(1);
		click(Discover.DiscoverGenre_Btn, "user select genres for discover");
		delay(2000);
		isElementDisplayed(Discover.Movies_Img, "selected genres movies displayed");
		delay(5000);

	}

	/*
	 * @Given("^user click viewall for All carousels and observe$") public void
	 * user_click_viewall_for_All_carousels_and_observe() { delay(2000);
	 * launchHomePage(); delay(2000); click(Headercontaint.Movies_Btn,
	 * "user click movies button"); delay(2000); swipeUp_FindElementClick(10,
	 * Carouselviewall.ActionSeries_Txt, "vertical swipe for required carousel");
	 * delay(400);
	 * horizontalSwipeWRTOelment(ComedyCarousel.ComedySecondCarousel_Btn, 5, 800,
	 * 100, "horizontal swipe in first carousel"); delay(2000);
	 * click(Carouselviewall.Viewall_Btn, "user click view all content");
	 * delay(2000); visible(Discover.Movies_Img, "select one movie"); delay(3000);
	 * try { if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
	 * click(Allow.coachmark, "user click allow button"); }
	 * 
	 * if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
	 * click(Allow.coachmark, "user click allow button"); } } catch
	 * (NoSuchElementException | TimeoutException e) { } delay(1000); Back();
	 * delay(2000); Back(); delay(2000); swipeUp_FindElementClick(10,
	 * Carouselviewall.LatestEpic_Txt, "vertical swipe for required carousel");
	 * delay(2000);
	 * horizontalSwipeWRTOelment(ComedyCarousel.ComedySecondCarousel_Btn, 5, 800,
	 * 100, "horizontal swipe in second carousel"); delay(2000);
	 * click(Carouselviewall.Viewall_Btn, "user click view all button");
	 * delay(2000); // click(Allow.coachmark, "user click coachmark"); //
	 * delay(1000); visible(Discover.Movies_Img, "select one movie"); delay(2000); }
	 */

	@Given("^user click viewall for All carousels and observe$")
	public void user_click_viewall_for_All_carousels_and_observe() {
		delay(2000);
		launchHomePage();
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(2000);
		swipeDown(5, "Swipe down");
		delay(2000);
		swipeUp_FindElementClick(10, Carouselviewall.ActionSeries_Txt, "vertical swipe for required carousel");
		delay(2000);
		horizontalSwipeWRTOelment(ComedyCarousel.ComedySecondCarousel_Btn, 5, 800, 100,
				"horizontal swipe in first carousel");
		delay(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all content");
		delay(2000);
		isElementDisplayed(Discover.Movies_Img, "movies list are showing");
		delay(3000);
		Back();
		delay(2000);
		swipeUp_FindElementClick(10, Carouselviewall.LatestEpic_Txt, "vertical swipe for required carousel");
		delay(2000);
		horizontalSwipeWRTOelment(ComedyCarousel.ComedySecondCarousel_Btn, 5, 800, 100,
				"horizontal swipe in second carousel");
		delay(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all button");
		delay(2000);

		isElementDisplayed(Discover.Movies_Img, "movies list are showing");
		delay(3000);
		Back();

	}

	@Given("^user download one content in homepage$")
	public void user_download_one_content_in_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click homepage button");
		delay(2000);
		swipeUp(3);
		// swipeDown(5, "swipe down");

		delay(3000);
		click(DownloadContent.SelectInHomepage, "user play one movie in homepage");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(DownloadContent.Download_Btn, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content homepage");
		delay(2000);
		Back();
		/*
		 * click(Logout.afterLoginProfileBtn, "user click profile image"); delay(2000);
		 * try { if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
		 * click(Allow.coachmark, "user click allow button"); }
		 * 
		 * if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
		 * click(Allow.coachmark, "user click allow button"); } if
		 * (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
		 * click(Allow.coachmark, "user click allow button"); } } catch
		 * (NoSuchElementException | TimeoutException e) { }
		 * click(DownloadContent.downloadbtn,
		 * "user download selected content in homepage"); delay(2000);
		 * click(DownloadContent.DownloadBest_Btn,
		 * "user select the download quality of the content homepage"); delay(2000);
		 * click(DownloadContent.canceldownload,
		 * "user download selected content in homepage"); delay(2000);
		 * click(DownloadContent.cancelOKbtn,
		 * "user download selected content in homepage"); delay(2000); Back();
		 */
	}

	@Then("^user download one content in movies$")
	public void user_download_one_content_in_movies() {
		launchHomePage();
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2);
		// swipeUp(2, "swipe up");
		delay(5000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");
		delay(5000);
		/*
		 * click(DownloadContent.Download_Btn,
		 * "user download selected content in movies"); delay(4000);
		 */
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(DownloadContent.Download_Btn, "user download selected content in movies");
		delay(4000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content movies");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		Back();
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(DownloadContent.downloadbtn, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.canceldownload, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.cancelOKbtn, "user download selected content in homepage");
		delay(2000);
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		delay(2000);
	}

	@Then("^user click on cancel button$")
	public void user_click_on_cancel_button() {
		execCommand("adb shell am start -n com.suntv.sunnxt/com.android.myplex.ui.sun.activities.ProfileActivity");
		// click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(DownloadContent.downloadbtn, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.canceldownload, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.cancelOKbtn, "user download selected content in homepage");
		delay(2000);
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		Back();
		delay(2000);

	}

	@When("^user download one content in TVShows$")
	public void user_download_one_content_in_TVShows() {
		delay(3000);
		launchHomePage();
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeUp(2);
		// swipeUp(2, "swipe up");
		delay(5000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one TVShow in TVShows");
		delay(5000);
		click(DownloadContent.Download_Btn, "user download selected content in TVShow");
		delay(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content TVShow");
		delay(2000);
		Back();
		// delay(2000);
	}

	@And("^user download one content in music videos$")
	public void user_download_one_content_in_music_videos() {
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
		swipeUp(3);
		// swipeUp(2, "swipe up");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in Music videos");
		delay(2000);
		click(DownloadContent.Download_Btn, "user download selected content in music video");
		delay(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content music video");
		delay(2000);
		Back();
		// delay(2000);
	}

	@Then("^user download one content in comedy$")
	public void user_download_one_content_in_comedy() {
		delay(2000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(2000);
		// swipeUp(2, "swipe up");
		swipeUp(4);
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one comedy video in comedys");
		delay(2000);
		click(DownloadContent.Download_Btn, "user download selected content in comedy");
		delay(2000);
		click(DownloadContent.DownloadBest_Btn, "user select the download quality of the content comedy");
		delay(2000);
		Back();
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(DownloadContent.downloadbtn, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.canceldownload, "user download selected content in homepage");
		delay(2000);
		click(DownloadContent.cancelOKbtn, "user download selected content in homepage");
		delay(2000);
		// delay(2000);
	}

	@Given("^user login once again after logout$")
	public void user_login_once_again_after_logout() {
		delay(3000);

		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed user mobile number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed user password");
		click(Login.loginBtn, "user click login button");

		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Logout.logOutBtn, "user click logout button");
		click(Logout.logoutOkBtn, "user click logout OK button");
		delay(5000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed user mobile number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed user password");
		click(Login.loginBtn, "user click login button");
	}

	@Given("^user share one content via facebook$")
	public void user_share_one_content_via_facebook() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2, "swipe up");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		// swipeUp(2);
		delay(1000);
		click(Share.Share_Btn, "user click share button");
		delay(2000);
		swipeUp(2);
		delay(60000);
		click(Share.ShareGmail_Btn, "user click Gmail to share content");
		delay(2000);
		setValue(Share.SenderGmail_Btn, GlobalUtil.dataMap.get("shareGmailId"), "Entered shareing GmailID");
		delay(2000);
		click(Share.SendGmail_Btn, "user click send ");
		delay(5000);

	}

	@Given("^user play one movie content and select one more movie in recommended section$")
	public void user_play_one_movie_content_and_select_one_more_movie_in_recommended_section() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2, "swipe up");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in movies");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); click(Allow.coachmark,
		 * "user click coachmark"); delay(2000);
		 */
		click(SignUp.SelectMovie2Play_Btn, "user play selected movie");
		delay(2000);
		click(Recommended.RecommendedMovie_Img, "user select one recommended section movie");
		delay(2000);
		// click(SignUp.SelectMovie2Play_Btn, "user play selected movie in recommended
		// section");

	}

	@Given("^user perform refresh operation in all pages$")
	public void user_perform_refresh_operation_in_all_pages() {
		delay(2000);
		launchHomePage();
		delay(2000);
		// delay(2000);
		swipeDown(5, "homepage is refresh");
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeDown(5, "moviespage is refresh");
		delay(3000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeDown(5, "TVShows page is refresh");
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
		swipeDown(5, "music videos page is refresh");
		delay(3000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(3000);
		swipeDown(5, "comedy page is refresh");
		delay(3000);
	}

	@Given("^user observe Filters data should be in alphabetical order$")
	public void user_observe_Filters_data_should_be_in_alphabetical_order() {
		delay(2000);
		launchHomePage();
		delay(1000);
		click(Headercontaint.TVShow_Btn, "user click tvshows button");
		delay(1000);
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music video button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(3000);
		swipeDown(5, "swipe down");
		click(Genres.ViewAllComedyScenesbtn, "user click view All movies button in comedy");
		delay(2000);
		click(Genres.GenGenres_Btn, "user click movies button in comedy");
		click(Genres.GenSelectCategory_Btn, "user select one category in movies");

		isElementDisplayed(Filters.FiltersAlpha_Section, "filter showing alphabetical order");
		delay(5000);

	}

	@Given("^user change playing content to landscape in TVShows$")
	public void user_change_playing_content_to_landscape_in_TVShows() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeUp(2, "swipe up");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one TVShow in first carousel");
		delay(8000);
		// click(Allow.coachmark, "user click coachmark");
		// click(Allow.coachmark, "user click coachmark");
		// click(Allow.coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// delay(1000);
		// landscapemode("screen rotate to land scape");
		// delay(9000);
		// Back();
	}

	@Then("^user change playing content to landscape in music videos$")
	public void user_change_playing_content_to_landscape_in_music_videos() {
		// delay(3000);
		// click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		// delay(3000);
		// swipeUp(2, "swipe up");
		// delay(3000);
		// click(MovieCarousel.SelectFirstMovie_Img, "user select one music video in
		// first carousel");
		// delay(2000);
		// click(Allow.coachmark, "user click coachmark");
		// click(Allow.coachmark, "user click coachmark");
		// click(MovieCarousel.MoviePlay_Btn, "user click play button");
		// Back();
	}

	@When("^user change playing content to landscape in comedy clips$")
	public void user_change_playing_content_to_landscape_in_comedy_clips() {

	}

	@And("^user change playing content to landscape in live tv$")
	public void user_change_playing_content_to_landscape_in_live_tv() {

	}

	@Given("^user login portal and play one movie content and go back to homepage$")
	public void user_login_portal_and_play_one_movie_content_and_go_back_to_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);/// delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2);
		delay(3000);
		click(ContinueWatching.Select_Mve, "user play one movie button");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Genres.GenMoviePlay_Btn, "user click play button");
		delay(5000);
		try {

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
		Back();

	}

	@Then("^user observe previous played content added to continue watching section or not and play content in continue watching section$")
	public void user_observe_previous_played_content_added_to_continue_watching_section_or_not_and_play_content_in_continue_watching_section() {
		delay(2000);
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click homepage button");
		delay(2000);
		swipeDown(5, "user refreshing homepage");
		delay(2000);
		click(ContinueWatching.ContinuewatchingSelect_Mve,
				"user select previous watched content movie in continue watching section");
		delay(2000);
		click(Genres.GenMoviePlay_Btn, "user click play button");
		delay(8000);
		Back();
	}

	@Given("^user login to portal and activate international roaming$")
	public void user_login_to_portal_and_activate_international_roaming() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		swipeUp(1);
		click(Headercontaint.Internationroaminbtn, "user click international roaming button");
		delay(1000);
		click(Headercontaint.Activatebtn, "user click activate button");
		delay(5000);
		click(Headercontaint.AlertOKbtn, "user click activate button");
		delay(5000);
	}

	@Then("^content playback in the non home region$")
	public void content_playback_in_the_non_home_region() {

	}

	@When("^user play two free contents$")
	public void user_play_two_free_contents() {
		delay(1000);
		launchHomePage();
		delay(1000);
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music video button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		click(ComedyCarousel.ViewAllcomedyscenes, "user click view All movies button in comedy");
		delay(1000);
		click(Freecontent.FreeContent1_Mve, "user play one free content video");
		delay(10000);
		/*
		 * click(DownloadContent.Download_Btn,
		 * "user download selected content in homepage"); delay(2000);
		 */
		/*
		 * click(DownloadContent.DownloadBest_Btn,
		 * "user select the download quality of the content homepage"); delay(2000);
		 */

		Back();
		delay(1000);
		click(Freecontent.FreeContent2_Mve, "user play second free content video");
		delay(10000);
		Back();
		delay(1000);

	}

	@When("^user play two free contents and skip$")
	public void user_play_two_free_contents_and_skip() {
		delay(1000);
		launchHomePage();
		delay(1000);
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music video button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		click(ComedyCarousel.ViewAllcomedyscenes, "user click view All movies button in comedy");
		delay(1000);
		click(Freecontent.FreeContent1_Mve, "user play one free content video");
		delay(5000);
		Back();
		delay(1000);
		click(Freecontent.FreeContent2_Mve, "user play second free content video");
		delay(5000);
		/*
		 * Back(); delay(1000); click(Freecontent.FreeContent3_Mve,
		 * "user play Third free content video"); delay(5000);
		 */
		click(SignUp.skipBtn, "user click an skip content");
		delay(5000);

	}

	@When("^user click on download content$")
	public void user_click_on_download_content() {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		click(ComedyCarousel.ViewAllcomedyscenes, "user click view All movies button in comedy");
		delay(1000);
		click(Freecontent.FreeContent1_Mve, "user play one free content video");
		delay(5000);
		click(DownloadContent.Download_Btn, "user download selected content in homepage");
		delay(5000);
		Back();
	}

	@Then("^user play one premium content after playing free content observe sigin page displaying$")
	public void user_play_one_premium_content_after_playing_free_content_observe_sigin_page_displaying() {

		click(Freecontent.PremiumContent1_Mve, "user play premium content video");
		delay(5000);
		// delay(3000);
		String signIn = getElementText(SignUp.SubscribeNow_Btn, "Sign IN page is displayed");
		System.out.println(signIn);
		if (signIn.equalsIgnoreCase("Sign In")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}
		click(SignUp.skipBtn, "user download selected content in homepage");
		delay(5000);
	}

	@When("^user observe after every two free content showing sigin page user play third content$")
	public void user_observe_after_every_two_free_content_showing_sigin_page_user_play_third_content() {
		click(Headercontaint.MusicVideos_Btn, "user click music video button");
		delay(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		click(ComedyCarousel.ViewAllcomedyscenes, "user click view All movies button in comedy");
		delay(1000);
		click(Freecontent.FreeContent1_Mve, "user play one free content video");
		delay(5000);
		Back();
		delay(1000);
		delay(1000);
		click(Freecontent.FreeContent2_Mve, "user play second free content video");
		delay(5000);
		Back();
		delay(1000);
		click(Freecontent.FreeContent3_Mve, "user play third free content video");
		delay(5000);

		String signIn = getElementText(SignUp.SubscribeNow_Btn, "Sign IN page is displayed");

		System.out.println(signIn);
		if (signIn.equalsIgnoreCase("Sign In")) {
			System.out.println("Sign IN Page Verified Text Successfully");
		}
	}

	@When("^user enter invalid inputs into login functionalities$")
	public void user_enter_invalid_inputs_into_login_functionalities() {
	}

	@When("^user login to portal by using unsubscribed credetials and play one premium content$")
	public void user_login_to_portal_by_using_unsubscribed_credetials_and_play_one_premium_content() {
		delay(3000);
		launchHomePage();
		delay(1000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed number");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		click(Login.loginBtn, "user click login button");
		delay(3000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie2_Btn, "user click one movie");
		delay(3000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(2000);
		click(Login.SelectMoviePlay_Btn, "user click play button");
		// delay(3000);
	}

	@Then("^user observe the subscription window and select one package$")
	public void user_observe_the_subscription_window_and_select_one_package() {
		delay(3000);
		click(CCDCPAYTM.Scbscribe90_Btn, "user click subscription 90days");
		delay(1000);
		click(CCDCPAYTM.DebitCard_Btn, "user click debit card button");
		click(CCDCPAYTM.ProceedPay_Btn, "user click proceedPay button");

		delay(8000);
		Back();

	}

	@When("^user login to portal by using subscribed credentials and play content at TVShow Section In TVShows$")
	public void user_login_to_portal_by_using_subscribed_credentials_and_play_content_at_TVShow_Section_In_TVShows() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click TVShows button");

		delay(4000);
		swipeUp_FindElementClick(20, Headercontaint.TVShowcarousalBtn, "vertical swipe till TVShow Section");
		delay(3000);
		// swipeUp(1);
		click(Headercontaint.TVShowcarousalBtn, "user Play One Content In TVShows Section");
		delay(20000);
		Back();

	}

	@When("^user login to portal by using subscribed credentials And Play One Content Give Rating For Played Content$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Play_One_Content_Give_Rating_For_Played_Content() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		delay(2000);
		click(Login.SelectMovie_Btn, "user click one movie");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		delay(2000);
		click(Rating.Star_Img, "user given star rating");
		delay(2000);
		try {
			if (getMDriver().findElement(Rating.Star_edit).isDisplayed()) {
				click(Rating.Star_edit, "user click edit  button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Rating.Submit_Btn, "user click submit button");

	}

	@When("^user login to portal by using subscribed credentials And Search Particular TVShow Episode In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Search_Particular_TVShow_Episode_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchTVShow"),
				"Entered particular TVShow Episode in searching field");
		delay(5000);
		click(Login.SelectMovie_Btn, "user play Dispalyed searching content episode");
		delay(5000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials And Search Particular Music Video In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Search_Particular_Music_Video_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchMusicVideo"),
				"Entered particular Music Video Song in searching field");
		delay(5000);
		click(Login.SelectMovie_Btn, "user play Dispalyed searching Music Video Content");
		delay(5000);
		// Back();
	}

	@When("^user login to portal by using subscribed credentials And Search Particular Comedy Clip In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Search_Particular_Comedy_Comedy_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchcomedyclip"),
				"Entered particular Music Video Song in searching field");
		delay(5000);
		Back();
		delay(2000);
		click(Login.SelectMovie3_Btn, "user play Dispalyed searching Comedy Clip Content");
		delay(5000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials And Search Particular LiveTV Channel In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Search_Particular_LiveTV_Channel_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchlivetvchannel"),
				"Entered particular Music Video Song in searching field");

		delay(5000);
		click(Livetv.SunmusicHDChannel, "user play Dispalyed searching LiveTV Channel");
		delay(5000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials And entering spelling mistakes content name In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_entering_spelling_mistakes_content_name_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("spellingMistakecontent"),
				" Search for content by entering spelling mistake");

	}

	@Then("^user Observe The Results Of Searching Content Displayed$")
	public void user_Observe_The_Results_Of_Searching_Content_Displayed() {
		delay(5000);
		getData(GlobalUtil.dataMap.get("Searching spelling Mistake content"));
		delay(2000);
		Back();
		click(Livetv.SunmusicHDChannel, "user play content related to searching text");
		delay(5000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials And Click Edit Profile$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Click_Edit_Profile() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 * click(Allow.coachmark, "user click coachmark"); delay(1000);
		 */
		click(EditProfile.editBtn, "user click edit profile button");
	}

	@Then("^user click Change Password Button And Change Password$")
	public void user_click_Change_Password_Button_And_Change_Password() {
		click(EditProfile.ChangePassword, "user click Change Password button");
		delay(3000);
		setValue(EditProfile.OldPassword, GlobalUtil.dataMap.get("OldPassword"), "Entered Old Password");
		delay(1000);
		setValue(EditProfile.NewPassword, GlobalUtil.dataMap.get("NewPassword"), "Entered New Password");
		delay(1000);
		setValue(EditProfile.ReEnterNewPassword, GlobalUtil.dataMap.get("ReEnterNewPassword"), "RE-Enter New Password");
		delay(2000);
		click(EditProfile.PwdsaveBtn, "user click Save Button");
		delay(3000);
		click(EditProfile.ChangePassword, "user click Change Password button");
		delay(3000);
		setValue(EditProfile.OldPassword, GlobalUtil.dataMap.get("NewPassword"), "Entered Old Password");
		delay(1000);
		setValue(EditProfile.NewPassword, GlobalUtil.dataMap.get("OldPassword"), "Entered New Password");
		delay(1000);
		setValue(EditProfile.ReEnterNewPassword, GlobalUtil.dataMap.get("OldPassword"), "RE-Enter New Password");
		delay(1000);
		click(EditProfile.PwdsaveBtn, "user click Save Button");
		delay(3000);
	}

	@When("^user login to portal by using subscribed credentials and Go To Profile Page$")
	public void user_login_to_portal_by_using_subscribed_credentials_and_Go_To_Profile_Page() {
		delay(8000);
		launchHomePage();
		delay(5000);
		// execCommand("adb shell am start -n
		// com.suntv.sunnxt/com.android.myplex.ui.sun.activities.ProfileActivity");
	}

	@Then("^user click Watched List Button And Play One COntent In Watch List$")
	public void user_click_Watched_List_Button_And_Play_One_COntent_In_Watch_List() {
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(Addwatchlist.WatchList_Btn, "user click on watch list button");
		delay(2000);
		click(Addwatchlist.WatchListContent, "User Play One Content In WatchList");
		delay(1000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Login.SelectMoviePlay_Btn, "user Play Selected Content");
		delay(5000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
	}

	@When("^user login to portal by using subscribed credentials And click View All Movies In Movies$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_click_View_All_Movies_In_Movies() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		click(Genres.ViewAllMoviesBtn, "user click view All movies button in Movies");
	}

	@Then("^user Select Comedy Genres And View All Should Show List Of Contents With Proper Thumbnails$")
	public void user_Select_Comedy_Genres_And_View_All_Should_Show_List_Of_Contents_With_Proper_Thumbnails() {
		// click(Genres.GenViewAllMovies_Btn, "user click view All movies button in
		// comedy");
		click(Genres.GenGenres_Btn, "user click genres Button");
		click(Genres.GenSelectCategory_Btn, "user select Comedy Category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "selected Comedy Category movies displayed");
		delay(5000);

	}

	@When("^user login to portal by using subscribed credential And click View All Movies In Movies$")
	public void user_login_to_portal_by_using_subscribed_credential_And_click_View_All_Movies_In_Movies() {
		delay(3000);
		launchHomePage();
		delay(2000);
		swipeDown(6, "swipe down");
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		click(Genres.ViewAllMoviesBtn, "user click view All movies button in Movies");
	}

	@Then("^user click Year Button And Select 90's Movies And View All Should Show List Of Contents With Proper Thumbnails$")
	public void user_click_Year_Button_And_Select_90_s_Movies_And_View_All_Should_Show_List_Of_Contents_With_Proper_Thumbnails() {
		delay(3000);
		click(Actors.Year_Btn, "user click Year Button");
		click(Actors.NintyMovies, "user Select 90's Movies Category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "selected 90's Movies Category movies displayed");
		delay(5000);
		click(Genres.GenMovieSelect_Img, "user select movie");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Genres.GenMoviePlay_Btn, "user played  movie");
		delay(5000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		// click(Genres.GenMoviePlay_Btn, "user played movie");
		delay(10000);
		Back();

	}

	@Then("^user click on 3D grid view button$")
	public void user_click_on_3D_grid_view_button() {

		click(Tvshow.Gridview, "user click on grid view button");
		delay(2000);
		swipeUp(4);

		delay(2000);
		click(Tvshow.Gridview, "user click on grid view button");
		swipeUp(4);
		delay(2000);
		Back();

	}

	@When("^user login to portal by using subscribed credentials And Click In First Carousel$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Click_In_First_Carousel() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeHorizontal_FindElementClick(5, TvShowsCarousel.Carousel,
				"Swipe Horizontally Till View All COntent Visible");
		delay(3000);
		click(Carouselviewall.Viewall_Btn, "user click View All Content");
		// click(NonSubscribedUser.NonSubMovie2_Img, "user click View All Content");
		delay(3000);
	}

	@Then("^user click Genres Button And Select Kids Category And Obseve The How Many Contents In List$")
	public void user_click_Genres_Button_And_Select_Kids_Category_And_Obseve_The_How_Many_Contents_In_List() {
		click(Genres.GenGenres_Btn, "user click genres Button");
		click(Genres.KidsCategory_Btn, "user select Kids Category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "selected Kids Category Contents displayed");
		delay(5000);
	}

	@When("^user login to portal by using subscribed credentials And Search One Movie In Search Field$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Search_One_Movie_In_Search_Field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchMovie"),
				"Entered particular Music Video Song in searching field");
	}

	@When("^user login to portal by using subscribed credentials And Click On Hamburger Icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Click_On_Hamburger_Icon() {
		delay(2000);
		launchHomePage();
		delay(2000);

	}

	@Then("^user Click Settings Button And Observe App Version$")
	public void user_Click_Settings_Button_And_Observe_App_Version() {
		/*
		 * click(Wifi.hamburger_icon, "user click Hamburger Icon");
		 * click(Wifi.WifiSettings_Btn, "user click settings button");
		 */
		delay(5000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.Version));
		delay(3000);
	}

	@When("^user login to portal by using subscribed credentials And Click on Hamburger Icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_And_Click_on_Hamburger_Icon() {
		delay(2000);
		launchHomePage();
		delay(2000);
	}

	@Then("^user Click Settings Button And Click Privacy Policy$")
	public void user_Click_Settings_Button_And_Click_Privacy_Policy() {
		delay(3000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
		delay(1000);
		click(Wifi.PrivacyPolicy, "user click Privacy Policy button");
		delay(1000);
		swipeUp(4);
		delay(3000);
	}

	@When("^user Click on Hamburger Icon$")
	public void user_Click_on_Hamburger_Icon() {
		delay(1000);
		launchHomePage();
		delay(1000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Observe My Account Button In Hamburger Section For Guest User$")
	public void user_Observe_My_Account_Button_In_Hamburger_Section_For_Guest_User() {
		delay(1000);
		isElementDisplayed(Wifi.HamburgerList, "My Account option should not be displayed for guest user");
		delay(1000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials Click on Hamburger Icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_Click_on_Hamburger_Icon() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Click My Account Button And Click My Content History Button$")
	public void user_Click_My_Account_Button_And_Click_My_Content_History_Button() {
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(1000);
		click(Wifi.MyContentHistory, "user click My Content History Button");
		delay(1000);

	}

	@And("^User Observe list of TEN recently played contents should be displayed or Not$")
	public void User_Observe_list_of_TEN_recently_played_contents_should_be_displayed_or_Not() {
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.RecentPlayedList));
		delay(3000);
		Back();
	}

	@When("^user login to portal by using subscribed credentials Click on Hamburger icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_Click_on_Hamburger_icon() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Click My Account Button And Click My Info Button$")
	public void user_Click_My_Account_Button_And_Click_My_Info_Button() {
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(3000);
		click(Wifi.MyInfo, "user click My Info Button");
		delay(3000);
		Back();
	}

	@And("^Observe User Information And List Of Devices Connected$")
	public void Observe_User_Information_And_List_Of_Devices_Connected() {
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.MySubscriptionstext));
		delay(3000);
		// Back();
	}

	@When("^user login to portal by using subscribed credentials Click on hamburger icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_Click_on_hamburger_icon() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Click My Account Button And Click My Subscriptions Button$")
	public void user_Click_My_Account_Button_And_Click_My_Subscriptions_Button() {
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(1000);
		click(Wifi.MySubscriptions, "user click My Subscriptions Button");
	}

	@And("^Observe users subscription status pack name And Expiry date and cost$")
	public void Observe_users_subscription_status_pack_name_And_Expiry_date_and_cost() {
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.SubscriptionsDetails));
		delay(3000);
	}

	@When("^user login to portal by using unsubscribed credentials Click on hamburger icon$")
	public void user_login_to_portal_by_using_unsubscribed_credentials_Click_on_hamburger_icon() {

		delay(2000);
		launchHomePage();
		delay(2000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("GuestUserName"), "Entered unsubscribed UserID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("GuestUserPassword"), "Entered unsubscribed password");
		click(Login.loginBtn, "user click login button");

		delay(3000);
		if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
			deactivateDevicesUsingWebPortal();
			click(Login.loginBtn, "user click login button");
		}
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Click My Account Button And Click My Subscriptions button$")
	public void user_Click_My_Account_Button_And_Click_My_Subscriptions_button() {
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(5000);
		click(Wifi.MySubscriptions, "user click My Subscriptions Button");
		delay(5000);
	}

	@And("^User Observe Should display user not subscribed Text$")
	public void User_Observe_Should_display_user_not_subscribed_Text() {
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.SubscriptionsDetails));
		delay(3000);
	}

	@When("^user login to portal by using subscribed credentials click on hamburger icon$")
	public void user_login_to_portal_by_using_subscribed_credentials_click_on_hamburger_icon() {
		launchHomePage();
		delay(1000);
		swipeDown(1, "refresh page");
		delay(1000);
		isElementDisplayed(ContinueWatching.ContinuewatchingSection, "Continue Watching Section Displayed");
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");
	}

	@Then("^user Click My Account Button And Click Clear My Watch Historycatch$")
	public void user_Click_My_Account_Button_And_Click_Clear_My_Watch_Historycatch() {
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(1000);
		click(Wifi.ClearMyWatchHistory, "user click Clear My Watch History/catch Button");
	}

	@And("^User Delete the Data And Observe The Continue Watching Section Displayed Or Not$")
	public void User_Delete_the_Data_And_Observe_The_Continue_Watching_Section_Displayed_Or_Not() {
		delay(1000);
		click(Wifi.ClearHistoryYes_Btn, "user click Yes Button To Clear Previous Played Data");
		delay(5000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.SuccessClearData_Txt));
		delay(1000);
		Back();
		/*
		 * delay(1000); swipeDown(1, "refresh page"); delay(1000);
		 * if(isWebElementPresent(ContinueWatching.ContinuewatchingSection)) {
		 * visible(ContinueWatching.ContinuewatchingSection,
		 * "Continue Watching Section Displayed"); } else {
		 * visible(ContinueWatching.ContinuewatchingSection,
		 * "Continue Watching Section Is Not Displayed because we are clear privious date"
		 * );
		 * 
		 * }
		 */

	}

	/*
	 * @When("^user login to portal by using subscribed credentials click on hamburger icon$"
	 * ) public void
	 * user_login_to_portal_by_using_subscribed_credentials_click_on_hamburger_icon(
	 * ) { delay(2000); launchHomePage(); delay(2000); swipeDown(1, "refresh page");
	 * delay(1000); visible(ContinueWatching.ContinuewatchingSection,
	 * "Continue Watching Section Displayed"); delay(2000);
	 * click(Wifi.hamburger_icon, "user click Hamburger Icon"); }
	 * 
	 * 
	 * @Then("^user Click My Account Button And Click Clear My Watch Historycatch$")
	 * public void
	 * user_Click_My_Account_Button_And_Click_Clear_My_Watch_Historycatch() {
	 * delay(1000); click(Wifi.MyAccount_Btn, "user click My Account Button");
	 * delay(1000); click(Wifi.ClearMyWatchHistory,
	 * "user click Clear My Watch History/catch Button"); }
	 * 
	 * @And("^User Delete the Data And Observe The Continue Watching Section Displayed Or Not$"
	 * ) public void
	 * User_Delete_the_Data_And_Observe_The_Continue_Watching_Section_Displayed_Or_Not
	 * () { delay(1000); click(Wifi.ClearHistoryYes_Btn,
	 * "user click Yes Button To Clear Previous Played Data"); delay(1000);
	 * ElementText(Wifi.SuccessClearData_Txt); delay(1000); Back(); delay(1000);
	 * refresh("Homepage Is Refreshing"); delay(1000); if
	 * (isWebElementPresent(ContinueWatching.ContinuewatchingSection)) {
	 * visible(ContinueWatching.ContinuewatchingSection,
	 * "Continue Watching Section Displayed"); } else {
	 * visible(ContinueWatching.ContinuewatchingSection,
	 * "Continue Watching Section Is Not Displayed");
	 * 
	 * }
	 * 
	 * }
	 */
	@When("^user login to portal by using Subscribed credentials click on hamburger icon$")
	public void user_login_to_portal_by_using_Subscribed_credentials_click_on_hamburger_icon() {
		delay(2000);
		launchHomePage();
		delay(2000);
		swipeDown(1, "refresh page");
		delay(1000);
		isElementDisplayed(ContinueWatching.ContinuewatchingSection, "Continue Watching Section Displayed");
		delay(2000);
		click(Wifi.hamburger_icon, "user click Hamburger Icon");

	}

	@Then("^user Click My Account Button And Observe Clear Watch History Button Is Dispayed Or Not$")
	public void user_Click_My_Account_Button_And_Observe_Clear_Watch_History_Button_Is_Dispayed_Or_Not() {
		delay(1000);
		click(Wifi.MyAccount_Btn, "user click My Account Button");
		delay(1000);
		click(Wifi.ClearMyWatchHistory, "user click Clear My Watch History/catch Button");
		delay(5000);
		click(Wifi.ClearHistoryYes_Btn, "user click Yes Button To Clear Previous Played Data");
		delay(3000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Wifi.SuccessClearData_Txt));
		delay(1000);
		// isElementDisplayed(Wifi.SuccessClearData_Txt, "successfully cleared
		// history");
		// ElementText(Wifi.SuccessClearData_Txt);
		delay(1000);
		/*
		 * if (isWebElementPresent(Wifi.ClearMyWatchHistory)) {
		 * visible(Wifi.ClearMyWatchHistory, "Clear my watch history buton Displayed");
		 * } else { visible(Wifi.ClearMyWatchHistory,
		 * "Clear My Watch History Is Not Displayed After Clearing Data");
		 * 
		 * }
		 */
		// visible(Wifi.ClearMyWatchHistory, "Clear My Watch History Is Not Displayed
		// After Clearing Data");
	}

	@When("^user login to portal by using Subscribed credentials and click music video button$")
	public void user_login_to_portal_by_using_Subscribed_credentials_and_click_music_video_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Comedy_Btn, "user click music videos button");
		delay(3000);

		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
		swipeDown(10, "swipe down");

	}

	@Then("^user click view all songs and observe the data contents and observe filters should be working or not$")
	public void user_click_view_all_songs_and_observe_the_data_contents_and_observe_filters_should_be_working_or_not() {
		click(MusicVideosCarousel.Viewallsongs, "user click view all songs button");
		delay(3000);
		isElementDisplayed(Genres.ContentList, "content date are visible");
		click(TVShowsGenres.GenGenres_Btn, "Movies filter is showing the list of movies");
		delay(1000);
		click(MusicVideosCarousel.Filtercancel_Btn, "user click filter cancel button");
		delay(1000);
		click(TVShowsTVChannels.TVChannels_Btn, "Musicians filter showing the list of Musicians");
		delay(1000);
		click(MusicVideosCarousel.Filtercancel_Btn, "user click filter cancel button");
		delay(2000);
	}

	@When("^user login to portal by using Subscribed credentials and click Music video button$")
	public void user_login_to_portal_by_using_Subscribed_credentials_and_click_Music_video_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
	}

	@Then("^user click viewall screen on carousel and observe filters and data of contents$")
	public void user_click_viewall_screen_on_carousel_and_observe_filters_and_data_of_contents() {
		swipeUp(1);
		delay(2000);
		horizontalSwipeWRTOelment(MusicVideosCarousel.MusicvideofirstCarousel, 5, 800, 100,
				"horizontal swipe in first carousel");
		delay(2000);
		click(MusicVideosCarousel.ViewAll, "user click View All content");
		delay(1000);
		isElementDisplayed(Genres.ContentList, "content date are visible");
		delay(2000);
	}

	@When("^user login to portal by using Subscribed credentials and click comedy button$")
	public void user_login_to_portal_by_using_Subscribed_credentials_and_click_comedy_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		/*
		 * click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		 * delay(1000);
		 */
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(3000);
	}

	@Then("^user click view all comedy scenes and observe the data contents and observe filters should be working or not$")
	public void user_click_view_all_comedy_scenes_and_observe_the_data_contents_and_observe_filters_should_be_working_or_not() {
		click(ComedyCarousel.ViewAllcomedyscenes, "user click view all comedy scenes button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "content date are visible");
		delay(2000);
		click(TVShowsGenres.GenGenres_Btn, "Movies filter is showing the list of movies");
		delay(1000);
		click(MusicVideosCarousel.Filtercancel_Btn, "user click filter cancel button");
		delay(1000);
		click(TVShowsTVChannels.TVChannels_Btn, "Musicians filter showing the list of Musicians");
		delay(1000);
		click(MusicVideosCarousel.Filtercancel_Btn, "user click filter cancel button");
		delay(2000);
	}

	@When("^user login to portal by using Subscribed credentials and click Comedy button$")
	public void user_login_to_portal_by_using_Subscribed_credentials_and_click_Comedy_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(1000);
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(2000);
	}

	@Then("^user click viewall screen on carousel and observe filters and data of contents on comedy$")
	public void user_click_viewall_screen_on_carousel_and_observe_filters_and_data_of_contents_on_comedy() {
		swipeUp(1);
		delay(1000);
		horizontalSwipeWRTOelment(HomeCarousel.HomeSecondCarouse1_Btn, 5, 800, 100,
				"horizontal swipe in carousel for identify the view all content");
		delay(2000);
		click(MusicVideosCarousel.ViewAll, "user click View All content");
		delay(1000);
		isElementDisplayed(Genres.ContentList, "content date are visible");
		delay(2000);
	}

	@When("^user login to portal by using Subscribed credentials and search one actor in search field$")
	public void user_login_to_portal_by_using_Subscribed_credentials_and_search_one_actor_in_search_field() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("searchactor"),
				"Searching Actor in searching field");
		delay(2000);
		Back();
		delay(4000);
		click(Recommended.RecommendedMovie_Img, "user click selected artist icon");
		delay(2000);
	}

	@Then("^user click searched artist icon and click view all content and observe the list of songs in selected artist$")
	public void user_click_searched_artist_icon_and_click_view_all_content_and_observe_the_list_of_songs_in_selected_artist() {
		swipeUp(1);
		delay(1000);
		horizontalSwipeWRTOelment(Searching.Artistcarousel, 5, 800, 100,
				"horizontal swipe on selected artist carousel till end ");
		delay(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all content");
		delay(2000);
		click(Login.movieimg, "user click view all content");
		delay(2000);
		click(Login.Playbtn, "user click view all content");
		delay(10000);

		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		/*
		 * visible(Genres.ContentList, "content date are visible"); delay(2000);
		 */
		// click(Login.Playbtn, "user click view all content");
		delay(10000);
		Back();
		delay(2000);
		Back();
		delay(2000);
		Back();

	}

	@When("^user login to portal by using Sun Direct credentials and play one content$")
	public void user_login_to_portal_by_using_Sun_Direct_credentials_and_play_one_content() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		delay(2000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("sundirectuserID"), "Entered Sun Direct User ID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("sundirectuserPASSWORD"),
				"Entered Sun Direct User password");
		click(Login.loginBtn, "user click login button");
		delay(1000);
		/*
		 * if (isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
		 * deactivateDevicesUsingWebPortal(); click(Login.loginBtn,
		 * "user click login button"); } //delay(3000);
		 */ click(Devices.SunDirectOk_Btn, "user click ok button in SunDirect user");
	}

	@When("^user login to portal by using previllaged user credentials and play one content$")
	public void user_login_to_portal_by_using_previllaged_user_credentials_and_play_one_content() {
		delay(2000);
		launchHomePage();
		click(Headercontaint.Movies_Btn, "user click header movies button");
		delay(2000);
		click(Login.Profile_Btn, "user click profile image");
		click(Login.Profile2_Btn, "user click LOG IN button");
		setValue(Login.EmailId_Txt, GlobalUtil.dataMap.get("Previllageduserid"), "Entered previllage  User ID");
		setValue(Login.Password_Txt, GlobalUtil.dataMap.get("Previllagedpassword"), "Entered previllage User password");
		click(Login.loginBtn, "user click login button");
		delay(1000);
		// click(Devices.SunDirectOk_Btn, "user click ok button in SunDirect user");
	}

	@Then("^user go to profile page and navigate to subscriptions and observe user sign in Sun Direct$")
	public void user_go_to_profile_page_and_navigate_to_subscriptions_and_observe_user_sign_in_Sun_Direct() {
		delay(1000);
		click(Headercontaint.Movies_Btn, "user click header movies button");
		click(Login.SelectMovie_Btn, "user click one movie");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(5000);

		Back();
		delay(2000);

		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(1000);
		click(Subscriptions.subscriptionsBtn, "user click subscriptions button");
		delay(5000);
		// ElementText(Login.SunDirect);

		Back();

	}

	/*
	 * @Then("^user Logout from device$") public void user_Logout_from_device() {
	 * 
	 * //Back(); delay(3000);
	 * 
	 * for(int i=1; i<=5; i++) { System.out.println("aaaa"); if
	 * (isWebElementPresent(Logout.afterLoginProfileBtn)) {
	 * 
	 * } else { Back(); } }
	 * 
	 * delay(2000); click(Logout.afterLoginProfileBtn, "user click profile image");
	 * delay(2000); click(Allow.coachmark, "user click coachmark"); delay(1000);
	 * click(Allow.coachmark, "user click coachmark"); delay(1000);
	 * click(Allow.coachmark, "user click coachmark"); delay(1000);
	 * click(Logout.Logout_Btn, "user click logout button");
	 * click(Logout.Logout2_Btn, "user click logout OK button"); delay(5000);
	 * 
	 * }
	 */
	@When("^user add different section contents to watch list$")
	public void user_add_different_section_contents_to_watch_list() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2);
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");
		delay(2000);
		/*
		 * click(Allow.coachmark, "user click coachmark"); click(Allow.coachmark,
		 * "user click coachmark");
		 */
		click(Addwatchlist.AddWatchList_Btn, "user add  movie content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeUp(3);
		delay(5000);
		click(MovieCarousel.SelectFirstMovie2_Img, "user select one TVShow in TVShows");
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add TVShow content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(2000);
		swipeUp(2);
		delay(3000);
		click(MusicVideosCarousel.SelectFirstMovie_Img, "user play one music video in first selected carousel");
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add TVShow content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(2000);
		swipeUp(3);
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one comedy video in comedys");
		delay(2000);
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add TVShow content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();

	}

	@When("^sigin with valid user and user click viewall in movies and select multiple filters and observe the relevent data$")
	public void sigin_with_valid_user_and_user_click_viewall_in_movies_and_select_multiple_filters_and_observe_the_relevent_data() {
		Back();
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(2000);
		swipeDown(5, "Swipe down");
		click(Genres.ViewAllMoviesBtn, "user click view All movies button");
		delay(1000);

		click(Genres.GenGenres_Btn, "user click genres button");
		delay(1000);
		click(Genres.KidsCategory_Btn, "user select 1st Category");
		click(Genres.GenSelectCategory_Btn, "user select 2nd category");
		click(Actors.ActSelectCategort_Btn, "user select 3rd category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "selected category Contents displayed");
		delay(5000);
		click(Actors.ActActors_Btn, "user click actors button");
		delay(1000);
		click(Genres.KidsCategory_Btn, "user select 1st Category");
		click(Genres.GenSelectCategory_Btn, "user select 2nd category");
		click(Actors.ActSelectCategort_Btn, "user select 3rd category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		/*
		 * visible(Genres.ContentList, "selected category Contents displayed");
		 * delay(5000);
		 */
		click(Actors.Year_Btn, "user click Year Button");
		delay(1000);
		click(Year.Category1, "user select 1st Category");
		click(Year.Category2, "user select 2nd category");
		click(Year.Category3, "user select 3rd category");
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		isElementDisplayed(Genres.ContentList, "selected category Contents displayed");
		delay(5000);
		/*
		 * //click(Genres.KidsCategory_Btn, "user select 1st Category");
		 * click(Genres.GenSelectCategory_Btn, "user select 2nd category");
		 * click(Actors.ActSelectCategort_Btn, "user select 3rd category");
		 * click(Genres.GenOk_Btn, "user click ok button"); delay(2000);
		 * visible(Genres.ContentList, "selected category Contents displayed");
		 * delay(5000);
		 */

	}

	@When("^user share the movie contents from each carousel at Movie page$")
	public void user_share_the_movie_contents_from_each_carousel_at_Movie_page() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		click(MovieCarousel.SelectFirstMovie_Img, "user select one movie in first carousel");
		delay(3000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(1000);
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.fbicon, "user click fb icon");
		delay(2000);
		click(Sharecontent.fbpost, "user click fb post button");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.Gmail, "user click Gmail button");
		delay(2000);
		setValue(Sharecontent.Gmailto, GlobalUtil.dataMap.get("GmailToaddress"), "Entered To address");
		delay(2000);
		click(Sharecontent.Gmailsend, "user click Gmail send button");
		delay(5000);
		Back();

		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(4000);
		swipeUp_FindElementClick(20, TvShowsCarousel.FirstCarousel, "swipeing for perticular selected carousel");
		delay(4000);
		click(TvShowsCarousel.SelectFirstMovie_Img, "user select one TVShow in first selected carousel");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.fbicon, "user click fb icon");
		delay(2000);
		click(Sharecontent.fbpost, "user click fb post button");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.Gmail, "user click Gmail button");
		delay(2000);
		setValue(Sharecontent.Gmailto, GlobalUtil.dataMap.get("GmailToaddress"), "Entered To address");
		delay(2000);
		click(Sharecontent.Gmailsend, "user click Gmail send button");
		delay(5000);
		Back();

		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		delay(3000);
		swipeUp_FindElementClick(20, MusicVideosCarousel.FirstCarousel, "swipeing for perticular selected carousel");
		delay(3000);
		click(MusicVideosCarousel.SelectFirstMovie_Img, "user play one music video in first selected carousel");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.fbicon, "user click fb icon");
		delay(2000);
		click(Sharecontent.fbpost, "user click fb post button");
		delay(5000);
		click(Sharecontent.shareicon, "user click share button");
		delay(2000);
		click(Sharecontent.Gmail, "user click Gmail button");
		delay(2000);
		setValue(Sharecontent.Gmailto, GlobalUtil.dataMap.get("GmailToaddress"), "Entered To address");
		delay(2000);
		click(Sharecontent.Gmailsend, "user click Gmail send button");
		delay(5000);
		Back();
	}

	@Then("^user Logout from device$")
	public void user_Logout_from_device() {
		execCommand("adb shell am start -n com.suntv.sunnxt/com.android.myplex.ui.sun.activities.ProfileActivity");
		for (int i = 1; i <= 3; i++) {
			try {
				if (isWebElementPresent(Allow.coachmark)) {
					click(Allow.coachmark, "user click coachmark");
					delay(500);
				}
			} catch (TimeoutException | NoSuchElementException e) {
			}
		}
		delay(1000);
		swipeUp(1);
		// scrollTillMobileElementDisplayed(Logout.logOutBtn, 1);
		click(Logout.logOutBtn, "user click logout button");
		click(Logout.logoutOkBtn, "user click logout OK button");
		delay(3000);
	}

	@When("^user sigup by entering eleven digit phone number$")
	public void user_sigup_by_entering_eleven_digit_phone_number() {
		{
			Back();
			click(Login.Profile2_Btn, "user click LOG IN button");
			click(Login.SignUp_Btn, "user click signup button");

			setValue(SigUp.SigUpMobile_Txt, GlobalUtil.dataMap.get("elevendigitNumber"),
					"Entered eleven digit mobile number");
			setValue(SigUp.SigUpPassword_Txt, GlobalUtil.dataMap.get("SignUpPassword"), "created password");
			setValue(SigUp.SigUpName_Txt, GlobalUtil.dataMap.get("SignUpName"), "Entered Name");
			click(SigUp.SigUpAge_Btn, "user click age drop down button");
			click(SigUp.SigUpAgeRange_Btn, "user select one age range");
			click(SigUp.SigUpGender_Btn, "user select one gender button");
			click(SigUp.SignUpCountry_Btn, "user click country drop down button");
			click(SigUp.SignUpSelectCountry_Btn, "user select one country");
			delay(2000);
			click(SigUp.SignUpState_Btn, "user click state drop down button");
			delay(2000);
			click(SigUp.SignUpSelectState_Btn, "user select one state");
			click(SigUp.SignUpSubmit_Btn, "user click submit button");
			delay(2000);
			String signIn = getElementText(SigUp.PlsEnter_Txt, "please enter 10 digit number");
			ExtTest.getTest().log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(signIn));
			delay(5000);
			// Thread.sleep(5000);
		}
	}

	@When("^user login to portal by using subscribed credentials and search one movie content$")
	public void user_login_to_portal_by_using_subscribed_credentials_and_search_one_movie_content() {
		delay(3000);
		launchHomePage();
		delay(3000);
		click(Searching.Searching_Icon, "user click search icon");
		delay(2000);
		click(Searching.SearchingField_Txt, "user click search field");
		delay(2000);
		setValue(Searching.SearchingField_Txt, GlobalUtil.dataMap.get("moviefilters"),
				"Entered movie in searching field");
		delay(5000);
		Back();
		delay(2000);

	}

	@Then("^observer Able to select multiple filters and able to show data based on the selected languages and contents should play$")
	public void observer_Able_to_select_multiple_filters_and_able_to_show_data_based_on_the_selected_languages_and_contents_should_play() {
		click(Headercontaint.LanguageFilter_Btn, "user click languages button");
		delay(2000);
		click(LanguageFilter.TamilFilter_Radio, "user select Tamil language in filter");
		delay(2000);
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		click(MusicVideosCarousel.SelectMusicwatch1, "user play searched movie in tamil");
		delay(5000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(10000);
		Back();

		click(Headercontaint.LanguageFilter_Btn, "user click languages button");
		delay(2000);
		click(LanguageFilter.TeluguFilter_Radio, "user select Telugu language in filter");
		delay(2000);
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		click(MusicVideosCarousel.SelectMusicwatch1, "user play searched movie in telugu");
		delay(2000);
		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(10000);
		Back();

		click(Headercontaint.LanguageFilter_Btn, "user click languages button");
		delay(2000);
		click(LanguageFilter.MalayalamFilter_Radio, "user select Malayalam language in filter");
		delay(2000);
		click(Genres.GenOk_Btn, "user click ok button");
		delay(2000);
		click(MusicVideosCarousel.SelectMusicwatch1, "user play searched movie in malayalam");
		delay(2000);
		click(Login.SelectMoviePlay_Btn, "user click play button");
		delay(10000);
		Back();
		delay(2000);
		Back();

	}

	@When("^user login to portal by using subscribed credentials and play one HD and one SD content in live tv$")
	public void user_login_to_portal_by_using_subscribed_credentials_and_play_one_HD_and_one_SD_content_in_live_tv() {
		delay(1000);
		launchHomePage();
		delay(1000);
		swipeDown(5, "homepage is refresh");
		delay(3000);
		click(HomeCarousel.FirstCarouselMovie, "user play HD content in LIVE TV");
		delay(5000);
		Back();
		delay(1000);
		click(HomeCarousel.SecondMovieInSD, "user play SD content in LIVE TV");
		delay(5000);

	}

	@When("^user login to portal by using subscribed and change app and content language in profile page and observe app should show date as per selection$")
	public void user_login_to_portal_by_using_subscribed_and_change_app_and_content_language_in_profile_page_and_observe_app_should_show_date_as_per_selection()

	{
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(ChangeContentLanguage.ChangeContentLanguage_Btn, "user click change content language button");
		delay(2000);
		click(ChangeContentLanguage.ChangeLanguageMalayalam_Btn, "user click malayalam language button");
		click(ChangeContentLanguage.ChangeLanguageTamil_Btn, "user click tamil language button");
		delay(2000);
		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		click(ChangeAppLanguage.ChangeAppLanguage_Btn, "user click change app language button");
		delay(1000);
		click(ChangeAppLanguage.ChangeAppTelugu_Btn, "user click telugu language button");
		delay(1000);
		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(1000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Headercontaint.ChangecontentTXT));
		delay(1000);

	}

	@When("^user Select a lower pack from switch plan and subscribe$")
	public void user_Select_a_lower_pack_from_switch_plan_and_subscribe() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		swipeUp(1);
		click(Subscriptions.Subscriptionbtn, "user click malayalam language button");
		delay(1000);
		String subscription = getElementText(Subscriptions.subscriptionplan, "Lowerpacks not showing");
		System.out.println(subscription);

	}

	@Then("^user change app and content language in hamburger menu and observe app should show date as per selection$")
	public void user_change_app_and_content_language_in_hamburger_menu_and_observe_app_should_show_date_as_per_selection() {
		click(Wifi.hamburger_icon, "user click hamburger Icon");
		delay(1000);
		click(Wifi.Hamburgercontentlanguage, "user click content language button");
		delay(1000);
		click(ChangeContentLanguage.ChangeLanguageMalayalam_Btn, "user click malayalam language button");
		click(ChangeContentLanguage.ChangeLanguageTamil_Btn, "user click tamil language button");
		delay(2000);
		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(2000);
		click(Wifi.hamburger_icon, "user click hamburger Icon");
		delay(1000);
		click(Wifi.Hamburgerapplanguage, "user click app language button");
		delay(1000);
		click(ChangeAppLanguage.ChangeAppEnglish_Btn, "user select language as english");
		delay(2000);
		click(VideoQuality.VideoSave_Btn, "user click save button");
		delay(2000);
		ExtTest.getTest().log(LogStatus.INFO, getText(Headercontaint.ChangecontentTXT));
		delay(2000);

	}

	@Given("^user add different section contents to watch list and click on profile and observe in watch list section added or not$")
	public void user_add_different_section_contents_to_watch_list_and_click_on_profile_and_observe_in_watch_list_section_added_or_not() {
		delay(3000);
		launchHomePage();
		delay(3000);
		click(Headercontaint.Movies_Btn, "user click movies button");
		delay(3000);
		swipeUp(2);
		delay(3000);
		click(MovieCarousel.selectmoviewatch, "user select one movie in first carousel");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Addwatchlist.AddWatchList_Btn, "user add  movie content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(3000);
		swipeUp(2);
		delay(5000);
		click(MovieCarousel.selecttvshowwatch, "user select one TVShow in TVShows");
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add TVShow content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		delay(3000);
		click(Headercontaint.MusicVideos_Btn, "user click music videos button");
		swipeUp(3);
		delay(3000);
		click(MusicVideosCarousel.SelectMusicwatch, "user play one music video in first selected carousel");
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add music video content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		click(Headercontaint.Comedy_Btn, "user click comedy button");
		delay(2000);
		swipeUp(4);
		delay(3000);
		click(MovieCarousel.Selectcomedywatch, "user select one comedy video in comedys");
		delay(2000);
		delay(5000);
		click(Addwatchlist.AddWatchList_Btn, "user add TVShow content to watch list");
		delay(4000);
		Back();
		delay(2000);
		Back();
		delay(2000);
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}

		click(Addwatchlist.WatchList_Btn, "user click on watch list button");
		delay(10000);
		/*
		 * visible(Discover.Movies_Img, "added contents are visible in displayed");
		 * delay(5000);
		 */
		Back();
	}

	@Given("^user click Movies 3d view play button$") //
	public void user_click_Movies_3d_view_play_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Movies_Btn, "user click Movies button");
		delay(2000);

		click(ThreeD.ThreeD_play, "user click Movies 3D play button");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(ThreeD.selectmovie, "user click Movies button");
		delay(2000);
		click(Login.Playbtn, "user click Movies 3D play button");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
		Back();
		// click(TVShowsGenres.viewallTvshows, "user click view all shows button");

	}

	@Given("^user click Tvshows 3d view play button$") //
	public void user_click_Tvshows_3d_view_play_button() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click TVShows button");
		delay(2000);
		swipeHorizontal_FindElementClick(5, ThreeD.swipeThreeD, "Swipe Horizontally Till View All COntent Visible");
		delay(2000);
		delay(2000);
		click(ThreeD.ThreeD_play, "user click Movies 3D play button");
		// swipeDown(10, "swipe down");
		delay(10000);
		Back();
		// click(TVShowsGenres.viewallTvshows, "user click view all shows button");

	}

	@When("^user play one movie content in Recomandedforyou carousel at homepage$")
	public void user_play_one_movie_content_in_Recomandedforyou_carousel_at_homepage() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.TVShow_Btn, "user click Home button");
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click Home button");
		delay(2000);
		swipeUp_FindElementClick(20, Headercontaint.Recommendedforyouc, "vertical swipe");
		delay(4000);
		click(Headercontaint.Recomandedforyoucarousal, "user select one movie in second carousel");
		delay(4000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		// click(Login.Playbtn, "user click Movies 3D play button");
		delay(2000);

		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click coachmark button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Login.Playbtn, "user click Movies 3D play button");
		delay(10000);
		Back();

		horizontalSwipeWRTOelment(Headercontaint.Recomandedforyoucarousals, 5, 800, 100,
				"horizontal swipe on selected artist carousel till end ");
		delay(2000);
		click(Carouselviewall.Viewall_Btn, "user click view all content");
		delay(2000);
		click(Login.movieimg, "user click view all content");
		delay(2000);
		click(Login.Playbtn, "user click view all content");
		delay(5000);
	}

	@When("^user play one movie and observe player controls$")
	public void user_play_one_movie_and_observe_player_controls() {
		delay(2000);
		launchHomePage();
		delay(2000);
		click(Headercontaint.Homepage_Btn, "user click Homepage button");
		delay(2000);
		click(HomeCarousel.FirstCarouselMovie, "user click first carousel movie play");
		delay(8000);
		clickUsingCoordinates(350, 300);
		click(playerevents.fullscreen, "user click full screen");
		delay(8000);
		clickUsingCoordinates(350, 300);
		delay(400);
		clickUsingCoordinates(350, 300);
		click(playerevents.fullscreen, "user click full screen");
		delay(2000);
		/*
		 * click(Livetv.EPGlist, "user clicked on epg list"); delay(8000);
		 */
		Back();
		delay(2000);
		swipeUp(2);
		delay(2000);
		click(HomeCarousel.SecondCarouselMovie, "user click second carousel movie play");
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(MovieCarousel.MoviePlay_Btn, "user click play button");
		delay(2000);
		try {
			if (getMDriver().findElement(Allow.coachmark).isDisplayed()) {
				click(Allow.coachmark, "user click allow button");
			}

		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(10000);
		clickUsingCoordinates(350, 300);
		delay(400);
		click(playerevents.playpausebtn, "user click full screen");
		delay(200);
		clickUsingCoordinates(350, 300);
		click(playerevents.videosettings, "user click full screen");
		delay(2000);
		click(playerevents.low, "user click full screen");
		delay(2000);
		clickUsingCoordinates(350, 300);
		click(playerevents.forward, "user click full screen");
		delay(200);
		click(playerevents.fullscreen, "user click full screen");
		delay(2000);
		Back();
		// click(playerevents.Volumeicon, "user click full screen");
		delay(2000);
		clickUsingCoordinates(350, 300);
		delay(400);
		click(playerevents.playpausebtn, "user click full screen");
		delay(400);
		click(playerevents.forward, "user click full screen");
		delay(400);
		click(playerevents.landscape, "user click full screen");
		delay(2000);
		Back();

	}

	@Then("^user click airplane mode$")
	public void user_click_airplane_mode() {
		getADriver().toggleAirplaneMode();
	}

}