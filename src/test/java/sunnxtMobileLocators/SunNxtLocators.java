package sunnxtMobileLocators;

import org.openqa.selenium.By;

public class SunNxtLocators {
	public static class TopNavMenu {
		public static By musicVideo = By.xpath("//*[@text='MUSIC VIDEOS']");
	}

	public static class Allow {
		public static By coachmark = By.xpath("//*[@text='Thanks! Got It']");
		// public static By allowBtn =
		// By.id("com.android.packageinstaller:id/permission_allow_button");

		public static By allowBtn = By.id("com.android.permissioncontroller:id/permission_allow_button");
		public static By LanguageSelect_Btn = By.xpath("//*[@class='android.widget.RelativeLayout'][2]");
		public static By Next_Btn = By.xpath("//*[@class='android.widget.Button']");
		public static By acceptBtn = By.xpath("//*[@class='android.widget.Button'][2]");
		public static By profile_Btn = By.xpath("//*[@class='android.widget.ImageView'][3]");

		public static By selectFirstLanguege = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/bg1'])[2]");
		public static By next = By.id("com.suntv.sunnxt:id/but");

		public static By ScreenPor_Img = By
				.xpath("//android.widget.FrameLayout[@resource-id='com.suntv.sunnxt:id/adContainer']");

		public static By click_Tamillanguage = By.xpath("//*[@text='TAMIL']");
		public static By click_telugulanguage = By.xpath("//*[@text='TELUGU']");
		public static By click_Malyalamlanguage = By.xpath("//*[@text='MALAYALAM']");
		public static By click_kannadalanguage = By.xpath("//*[@text='KANNADA']");
		public static By click_Bengalilanguage = By.xpath("//*[@text='BENGALI']");
	}

	public static class playerevents {
		public static By fullscreen =By.id("ll_PlayFullScreen");
		public static By fullscreenimage =By.id("playerfullscreenimage");
		
		
		//public static By forward =By.id("seekRight");
		public static By forward =By.id("app_video_fastForward_box");
		public static By backward =By.id("seekLeft");
		
		public static By loadmore =By.id("loadMore");
		
		public static By videosettings =By.id("video_settings");
		
		
		public static By qwalitysetting =By.id("quality_selection_grid");
		
		public static By subtitles =By.id("sub_titles");
		
		public static By bottomswipeup =By.id("bottomSwipeUp");
		public static By playpausebtn =By.id("playpause_btn");
		public static By click =By.id("com.suntv.sunnxt:id/live_tv_list");
		
		
		public static By brightness =By.id("app_video_brightness_box");
		public static By landscape =By.id("imageDummyForLandscape");
		public static By Volumeicon =By.id("app_video_volume_icon");
		
		public static By low = By.xpath("//*[@text='LOW']");
		
	}

	public static class ForgotPasswordEmail {
		public static By ForgotPwdEmailId_Txt = By.xpath("(//*[@class='android.widget.EditText'])[1]");
		public static By ForgotPwd_Btn = By.id("com.suntv.sunnxt:id/forgotPwd");
		// public static By
		// ForgotPwdEmail_Txt=By.id("com.suntv.sunnxt:id/emailEditTextEmailForgotPwd");
		public static By ForgotPwdSubmit_Btn = By.id("com.suntv.sunnxt:id/buttonSubmitEmailForgotPwd");
		//com.suntv.sunnxt:id/phoneOtpPassword
		//RESEND OTP
		//SUBMIT
		public static By ForgotPwdSendOTP_Btn = By.id("com.suntv.sunnxt:id/buttonSubmitResetPassword");
		public static By ForgotPhoneOTP_Btn = By.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/phoneOtpPassword']");
	}

	public static class ThreeD {
		public static By selectmovie = By.xpath("(//*[@class='android.view.View'])[4]");
		public static By ThreeD_play = By.id("com.suntv.sunnxt:id/play");
		public static By swipeThreeD = By.id("com.suntv.sunnxt:id/imageView");
				//By.xpath("(//*[@id='com.suntv.sunnxt:id/imageView'])[2]");
				
	
	}
	public static class ChangeContentLanguage {
		public static By ChangeContentLanguage_Btn = By.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[2]");
		public static By ChangeLanguageTamil_Btn = By.xpath("//android.widget.CheckedTextView[@text='TAMIL']");
		public static By ChangeLanguageTelugu_Btn = By.xpath("//android.widget.CheckedTextView[@text='TELUGU']");
		public static By ChangeLanguageMalayalam_Btn = By.xpath("//android.widget.CheckedTextView[@text='MALAYALAM']");
		public static By ChangeLanguageKannada_Btn = By.xpath("//android.widget.CheckedTextView[@text='KANNADA']");
		public static By ChangeLanguageBengali_Btn = By.xpath("//android.widget.CheckedTextView[@text='BENGALI']");
		public static By SaveBtn= By.xpath("//android.widget.TextView[@text='Save']");
		public static By ChangeLanguageSave_Btn = By.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[9]");
	}

	public static class ProfilePicChange {
		public static By profilePic = By.id("com.suntv.sunnxt:id/imageViewEditProfile");
		public static By ChooseFromLibrary_Btn = By.xpath("//android.widget.TextView[@text='Choose from Library']");
		public static By ChooseOnePic_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.android.documentsui:id/icon_thumb'])[4]");
		public static By RemoveOhoto_Btn = By.xpath("//android.widget.TextView[@text='Remove Photo']");
	}

	public static class ChangeAppLanguage {
		public static By ChangeAppLanguage_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[3]");

		public static By ChangeAppTelugu_Btn = By.xpath("//*[@text='తెలుగు']");
		public static By ChangeAppEnglish_Btn = By.id("com.suntv.sunnxt:id/english");
		public static By ChangeAppHeaderTxt_Btn = By.xpath("(//*[@class='android.widget.TextView'])[5]");
		public static By ChangeAppSave_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[9]");
	}

	public static class EditProfile {
		public static By EditAge_Btn = By.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/ageSpinner']");
		public static By EditSelectAge_Btn = By.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[3]");
		public static By EditGender_Btn = By.id("com.suntv.sunnxt:id/femaleIcon");
		public static By editCountryBtn = By.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/countrySpinner']");
		public static By EditSelectCountry_Btn = By.xpath("//android.widget.CheckedTextView[@text='Australia']");
		public static By EditState_Btn = By.id("com.suntv.sunnxt:id/stateSpinner");
		public static By EditSelectState_Btn = By.id("android:id/text1");
		public static By doneBtn = By.xpath("//android.widget.Button[@text='DONE']");
		public static By EditName_Txt = By
				.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/firstName']");
		public static By EditCompleteProfile_Btn = By
				.xpath("//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/completeEditProfile']");
		public static By editBtn = By.xpath("//*[@text='Edit Profile' and @resource-id='com.suntv.sunnxt:id/txt']");
		public static By saveBtn = By.id("com.suntv.sunnxt:id/btnSaveEditProfile");
		// public static By PwdsaveBtn =
		// By.xpath("(//*[@class='android.widget.ImageView'])[18]");//
		public static By PwdsaveBtn = By.xpath("//*[@text='SAVE']");
		public static By ChangePassword = By.id("com.suntv.sunnxt:id/changePasswordEditProfile1");
		public static By OldPassword = By.id("com.suntv.sunnxt:id/oldPasswordfield");
		public static By NewPassword = By.id("com.suntv.sunnxt:id/newPasswordfield");
		public static By ReEnterNewPassword = By.id("com.suntv.sunnxt:id/confirmNewPasswordfield");
		public static By SuccessFull_Msg = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[10]");
	}

	public static class Subscriptions {
		
		public static By SubscriptionBack_Btn = By.xpath("//android.view.View[@text='subscription?close=Yes']");
		public static By InvoiceBack_Btn = By.xpath("(//*[@class='android.view.View'])[4]");
		public static By CustomerState_Txt = By.xpath("(//*[@class='android.view.View'])[44]");
		// public static By invoiceBtn =
		// By.xpath("//android.widget.TextView[@text='Invoice']");
		public static By anualplan = By.xpath("//*[@text='365 Days (No Ads) Annual Subscription Plan INR 480']");
		
		public static By Subscriptionbtn = By.xpath("//*[@text='Subscriptions']");
		public static By invoiceBtn = By.xpath("//*[@text='Invoice']");
		public static By reNewPlanBtn = By.xpath("(//*[@class='android.view.View'])[17]");
		public static By reNewPlanBackBtn = By.xpath("(//*[@class='android.view.View'])[5]");
		// public static By subscriptionsBtn =
		// By.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[7]");
		public static By subscriptionsBtn = By.xpath("(//*[@text='Subscriptions'])");
		public static By subscriptionplan = By.xpath("(//*[@class='android.widget.TextView'])[4]");
	}

	public static class Device {
		public static By Device_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[10]");
	}

	public static class Login {
		public static By Profile_Btn = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
		public static By Profile2_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[10]");
		public static By EmailId_Txt = By.xpath("(//*[@class='android.widget.EditText'])[1]");
		public static By Password_Txt = By.xpath("(//*[@class='android.widget.EditText'])[2]");
		public static By loginBtn = By.xpath("(//*[@class='android.widget.Button'])[1]");
		public static By SelectMovie_Btn = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By SelectMovie2_Btn = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[4]");
		public static By SelectMovie3_Btn = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By Searchcomedy = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[6]");
        public static By SelectMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By ExistingUser_Btn = By.id("com.suntv.sunnxt:id/signIn_Button");
		public static By SignUp_Btn = By.id("com.suntv.sunnxt:id/signUpText");
		public static By ChangeMovies_Btn = By.xpath("(//*[@class='android.widget.TextView'])[4]");
		public static By Playbtn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SunDirect = By.xpath("(//*[@class='android.view.View'])[12]");
		public static By movieimg =By.xpath("(//*[@class='android.view.View'])[4]");
	}
	public static class Rating
	{
		public static By Star_Img=By.id("com.suntv.sunnxt:id/ratingStars");
		public static By Submit_Btn=By.id("com.suntv.sunnxt:id/submitButton");
		public static By Star_edit=By.id("com.suntv.sunnxt:id/editImage");
		public static By starcastBtn = By.xpath("(//*[@text='STAR CAST'])");
		public static By starrating =By.xpath("(//*[@class='android.widget.ImageView'])[6]");
		public static By ratingOK =By.xpath("(//*[@text='OK'])");
		public static By ratingLater =By.xpath("(//*[@text='LATER'])");
		
				
		
		
	}
	public static class NonSubscribedUser {
		public static By NonSubMovie_Btn = By.xpath("//android.widget.TextView[@text='MOVIES']");
		public static By NonSubMovie_Img = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[3]");
		public static By NonSubMovie2Play_Icon = By.id("com.suntv.sunnxt:id/playButton");
		public static By NonSubMovie2_Img = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[3]");
		public static By NonSubSkip_Btn = By.id("com.suntv.sunnxt:id/skip_signin");
	}

	public static class SignUp {
		public static By SelectMovie2_Btn = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By SelectMovie2Play_Btn = By.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/playButton']");
		public static By SubscribeNow_Btn = By.id("com.suntv.sunnxt:id/signUp_Button");
		
		public static By signupBtn = By.xpath("(//*[@text='SIGN UP'])");
		
		public static By skipBtn = By.xpath("(//*[@text='SKIP'])");
		public static By SigUpMobile_Txt = By.id("com.suntv.sunnxt:id/userIDEditTextLoginPage");
		public static By SigUpPassword_Txt = By.id("com.suntv.sunnxt:id/passwordField");
		public static By SigUpName_Txt = By.id("com.suntv.sunnxt:id/fullName");
		public static By SigUpAge_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/ageSpinner']");
		public static By SigUpAgeRange_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[4]");
		public static By SigUpGender_Btn = By.id("com.suntv.sunnxt:id/femaleIcon");
		public static By SignUpCountry_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/countrySpinner']");
		public static By SignUpSelectCountry_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[2]");
		public static By SignUpState_Btn = By.id("com.suntv.sunnxt:id/stateSpinner");
		public static By SignUpSelectState_Btn = By.xpath("//android.widget.CheckedTextView[@text='Andhra Pradesh']");
		public static By SignUpSubmit_Btn = By.xpath("//android.widget.Button[@text='SUBMIT']");
		public static By MobileNumberExist_Btn = By.xpath("//android.widget.Button[@text='OK']");
	}
	

	public static class SigUp {
		public static By PlsEnter_Txt = By
				.xpath("//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/alert_message']");
		public static By SelectMovie2_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By SelectMovie2Play_Btn = By
				.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/playButton']");
		public static By SubscribeNow_Btn = By.id("com.suntv.sunnxt:id/signUp_Button");
		public static By SigUpMobile_Txt = By.id("com.suntv.sunnxt:id/userIDEditTextLoginPage");
		public static By SigUpPassword_Txt = By.id("com.suntv.sunnxt:id/passwordField");
		public static By SigUpName_Txt = By.id("com.suntv.sunnxt:id/fullName");
		public static By SigUpAge_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/ageSpinner']");
		public static By SigUpAgeRange_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[4]");
		public static By SigUpGender_Btn = By.id("com.suntv.sunnxt:id/femaleIcon");
		public static By SignUpCountry_Btn = By
				.xpath("//android.widget.Spinner[@resource-id='com.suntv.sunnxt:id/countrySpinner']");
		public static By SignUpSelectCountry_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[2]");
		public static By SignUpState_Btn = By.id("com.suntv.sunnxt:id/stateSpinner");
		public static By SignUpSelectState_Btn = By
				.xpath("(//android.widget.CheckedTextView[@resource-id='android:id/text1'])[3]");
		public static By SignUpSubmit_Btn = By.xpath("//android.widget.Button[@text='SUBMIT']");
		public static By MobileNumberExist_Btn = By.xpath("//android.widget.Button[@text='OK']");
	}

	public static class Logout {
		public static By afterLoginProfileBtn = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
		public static By logOutBtn = By.xpath("//*[@text='Log Out']");
		public static By logoutOkBtn = By.xpath("(//*[@class='android.widget.Button'])[2]");
	}

	public static class Tvshow {
		public static By TvshowSection = By.xpath("//*[@text='TV SHOWS']");
		public static By ThirumagalSerial = By.xpath("//*[@text='THIRUMAGAL']");
		public static By Gridview = By.id("com.suntv.sunnxt:id/list_grid_switch");
	}

	public static class Genres {
		
		//public static By GenViewAllMovies_Btn1 = By.xpath("(//*[@class='android.widget.RelativeLayout'])[12]");
		//public static By GenViewAllMovies_Btn = By.id("com.suntv.sunnxt:id/main_text");
		public static By ViewAllMoviesBtn = By.xpath("//*[@text='VIEW ALL MOVIES']");
		public static By Viewallsongs=By.xpath("//*[@text='VIEW ALL SONGS']");

		//public static By ViewAllcomedyscenes=By.xpath("//*[@text='VIEW ALL COMEDY SCENES']");
		
		
		public static By ViewAllComedyScenesbtn = By.xpath("//*[@text='VIEW ALL COMEDY SCENES']");
		public static By GenGenres_Btn = By.xpath("//android.widget.LinearLayout[@resource-id='com.suntv.sunnxt:id/filter1RelativeLayout']");
		public static By GenSelectCategory_Btn = By.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[5]");
		public static By KidsCategory_Btn = By.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[4]");
		public static By ContentList = By.id("com.suntv.sunnxt:id/gridview_movies");
		public static By GenOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By GenMovieSelect_Img = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By GenMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static String GenSwipeHorizontal_Btn = "(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]";
		public static By GenswipeHorizontal_Btn = By.xpath("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
	}

	public static class Year {
		public static By Category1 = By.xpath("//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[1]");
		public static By Category2 = By.xpath("//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[2]");
		public static By Category3 = By.xpath("//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[3]");
	}

	public static class Actors {
		public static By ActActors_Btn = By.id("com.suntv.sunnxt:id/second_filter_layout");
		public static By ActSelectCategort_Btn = By
				.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[4]");
		public static By ActOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By ActMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By ActMoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By Year_Btn = By.id("com.suntv.sunnxt:id/year_filter");
		public static By NintyMovies = By
				.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[3]");

	}

	public static class TVShowsGenres {
		//public static By GenViewAllMovies_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[12]");
		
		public static By viewallTvshows = By.xpath("//*[@text='VIEW ALL SHOWS']");
		public static By GenGenres_Btn = By.id("com.suntv.sunnxt:id/filter1RelativeLayout");
		public static By GenSelectCategory_Btn = By
				.xpath("(//android.widget.CheckBox[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[6]");
		public static By GenOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By GenMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");

	}

	public static class TVShowsTVChannels {
		public static By TVChannels_Btn = By.id("com.suntv.sunnxt:id/actor_filter");
		public static By TVChannelsSelectCategory_Btn = By
				.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[10]");
		public static By TVChannelsOk_Btn = By.id("com.suntv.sunnxt:id/done");
		public static By TVChannelsMovieSelect_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
	}

	public static class Headercontaint {
		
		public static By casticonbtn = By.xpath("//android.view.View[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‎‎‏‏‎‎‎‏‎‏‏‎‎‎‎‏‎‎‏‏‎‎‏‎‎‎‎‎‏‎‎‎‏‎‏‏‏‎‏‏‎‎‏‏‎‏‎‏‏‏‏‏‏‎‏‏‏‏‎‎‎‎‎Cast button. Disconnected‎‏‎‎‏‎\"]");
		public static By casticoncancelbtn = By.id("com.suntv.sunnxt:id/mr_cast_cancel");
		public static By Livetvbtn = By.xpath("//android.widget.TextView[@content-desc=\"live tv\"]");
		public static By Recomandedforyoucarousal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView");
	    public static By searchclearall = By.id("com.suntv.sunnxt:id/textview_clear_all");
	    public static By Internationroaminbtn = By.xpath("//*[@text='International Roaming']");
	    public static By Activatebtn = By.xpath("//*[@text='ACTIVATE']");
	    public static By AlertOKbtn = By.xpath("//*[@text='OK']");
	    public static By dviewcontent =By.xpath("//*[@id='com.suntv.sunnxt:id/play']");
	    public static By viewallbtn = By.xpath("//*[@text='VIEW ALL']");
	    public static By Recommendedforyouc = By.xpath("//*[@text='RECOMMENDED FOR YOU']");
	    public static String Recommendedforyou = ("//*[@text='RECOMMENDED FOR YOU']");
	    
	    public static String Recomandedforyoucarousals = ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView");
	   // com.suntv.sunnxt:id/thumbnail_movie
	   // android.view.View
	  //  com.suntv.sunnxt:id/recycler_view_movie
	    public static By Homepage_Btn = By.xpath("//*[@text='HOME']");
	    
	   // public static By Homepage_Btn = By.xpath("(//*[@class='android.widget.TextView'])[4]");
		//	public static By Movies_Btn = By.xpath("(//*[@class='android.widget.TextView'])[5]");
		public static By Movies_Swipe_Btn = By.xpath("(//android.widget.TextView[@text='MOVIE TRAILERS'])[1]");
	//	public static By TVShow_Btn = By.xpath("(//*[@class='android.widget.TextView'])[6]");
		public static By TVShow_Swipe_Btn = By
				.xpath("(//*[@resource-id='com.suntv.sunnxt:id/textview_genre_title'])[3]");
		// public static By
		// TVShow_Swipe_Btn=By.xpath("(//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/textview_genre_title'])[3]");
		//public static By MusicVideos_Btn = By.xpath("(//*[@class='android.widget.TextView'])[7]");
		public static By MusicVideos_Swipe_Btn = By.xpath("(//*[@class='android.widget.TextView'])[20]");
		public static By Comedy_Btn = By.xpath("(//android.widget.TextView[@text='COMEDY'])");
		// public static By
		// Comedy_Swipe_Btn=By.xpath("(//android.widget.TextView[@text='COMEDY'])[1]");

	     public static By Movies_Btn = By.xpath("//android.widget.TextView[@text='MOVIES']");
	     public static By TVShow_Btn = By.xpath("//*[@text='TV SHOWS']");
	     public static By TVShowcarousalBtn = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[4]");
	    
	     public static By MusicVideos_Btn = By.xpath("//*[@text='MUSIC VIDEOS']");
	     public static By hs_comedy = By.xpath("//*[@text='COMEDY']");
	     public static By LanguageFilter_Btn=By.id("com.suntv.sunnxt:id/filter1RelativeLayout");
	     public static By ChangecontentTXT=By.xpath("(//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/textview_genre_title'])[2]");
	}
	public static class Wifi {
		public static By hamburger_icon = By.id("com.suntv.sunnxt:id/action_settings");
		public static By WifiSettings_Btn = By.id("com.suntv.sunnxt:id/settings");
		public static By WifiDownloadOnWIFI_Btn = By.id("com.suntv.sunnxt:id/onlyOnWifi");
		public static By WifiSettingsBack_Btn = By.xpath("//*[@class='android.widget.ImageButton']");
		public static By Version=By.id("com.suntv.sunnxt:id/version_text");
		public static By PrivacyPolicy=By.id("com.suntv.sunnxt:id/privacy_policy");
		public static By HamburgerList=By.xpath("//*[@class='android.widget.LinearLayout']");
		public static By MyAccount_Btn=By.id("com.suntv.sunnxt:id/userInfo");
		public static By MyContentHistory=By.xpath("//*[@text='My Content History']");
		public static By RecentPlayedList=By.xpath("(//*[@class='android.view.View'])[6]");
		public static By MyInfo=By.xpath("//*[@text='My Info']");
		public static By InfoDetails=By.id("bar1");
		public static By MySubscriptionstext=By.xpath("(//*[@class='android.view.View'])[18]");
		
		public static By MySubscriptions=By.xpath("//*[@text='My Subscriptions']");
		public static By SubscriptionsDetails=By.xpath("(//*[@class='android.view.View'])[14]");
		public static By ClearMyWatchHistory=By.xpath("//*[@text='Clear My Watch History/Cache']");
        public static By ClearHistoryYes_Btn=By.xpath("//*[@text='Yes']");
        public static By SuccessClearData_Txt=By.xpath("(//*[@class='android.view.View'])[3]");
        public static By Hamburgercontentlanguage=By.xpath("//android.widget.TextView[@text='కంటెంట్ భాషను మార్చండి']");
        public static By Hamburgerapplanguage=By.xpath("//android.widget.TextView[@text='యాప్ యొక్క భాష మార్చుటకు']");
        
	}


	
	public static class VideoQuality {
	//	public static By VideoQuality_btn = By.xpath("(//*[@class='android.widget.LinearLayout'])[3]");
		
		public static By VideoQuality_btn=By.xpath("//*[@text='Video Quality']");
		public static By VideoAuto_Btn = By.id("com.suntv.sunnxt:id/enableSwitch");
		public static By VideoMedium_Btn = By.id("com.suntv.sunnxt:id/audio_high");
		public static By VideoSave_Btn = By.id("com.suntv.sunnxt:id/save_button");
	}

	public static class FeedBack {
		public static By FeedBack_Btn = By.xpath("//android.widget.TextView[@text='Feedback']");
		public static By FeedBackWrite_Txt = By.id("com.suntv.sunnxt:id/multiAutoCompleteTextView");
		public static By Submit_Btn = By.id("com.suntv.sunnxt:id/submit_button");
		public static By Back_Btn = By.xpath("(//*[@class='android.widget.ImageButton'])[2]");
	}

	public static class AboutUs {
		public static By AboutUS_Btn = By.xpath("//android.widget.TextView[@text='About Us']");
	}

	public static class FAQs {
		public static By FAQs_Btn = By.xpath("//android.widget.TextView[@text='FAQs']");
		public static By TermsAndConditions_Btn = By.xpath("//*[@text='Terms of Use']");
		
	}

	public static class SwitchProfile {
		public static By ProfileDelete_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/deleteIcon'])[1]");
		public static By SwithProfile_Brn = By.id("com.suntv.sunnxt:id/redIconRL");
		public static By deleteicon =By.id("com.suntv.sunnxt:id/deleteIcon");

		public static By DeleteConform_Brn = By.id("com.suntv.sunnxt:id/btnConfirmpwdPopUp");
		public static By AddProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[3]");
		public static By AddUserName_Txt = By.id("com.suntv.sunnxt:id/editProfilename");
		public static By AddLanguage_Btn = By.id("com.suntv.sunnxt:id/RLLanguage");
		public static By Selectlanguage_Btn = By.xpath("//android.widget.CheckedTextView[@text='TELUGU']");
		public static By AddSave_Btn = By.id("com.suntv.sunnxt:id/save_button");
		public static By Add_Btn = By.xpath("//android.widget.Button[@text='ADD']");
		public static By AddPlus_Btn = By.xpath("(//*[@class='android.widget.ImageView'])[4]");
		public static By SelectNewProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[2]");
		public static By SelectOldProfile_Btn = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/circularImageId'])[1]");
	}

	public static class HomeCarousel {

		public static By HomeFirstCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
		public static By FirstCarouselMovie = By.xpath(
				"(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail_voditem'])[1]");
		public static By SecondCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By ThirdCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By FourthCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[8]");
		public static By FifthCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By SixCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[14]");
		public static By SeventhCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By SeventhCarouselMovieSelect = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[1]");
		public static By EightCarouselMovie = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[12]");

		public static String HomeSecondCarouse1_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");

		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By HomeSecondCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[3]");
		public static By HomePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[10]");
		public static By SecondMovieInSD = By.xpath(
				"(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail_voditem'])[2]");
	}
	public static class MovieCarousel {
		public static By selectmoviewatch=By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By Selectcomedywatch=By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[3]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By SelectFirstMovie2_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[7]");
		
		public static By selecttvshowwatch=By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By MoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SecondCarousel=By.xpath("//*[@text='MOVIES WITH SUBTITLES']");

         public static By SelectsecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");

		public static By MovieFirstCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");
		
		
		public static String MovieFirstCarouse1_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
	}
	/*public static class MovieCarousel {
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By MoviePlay_Btn = By.id("com.suntv.sunnxt:id/playButton");
		public static By SecondCarousel = By.xpath("//*[@text='MOVIES WITH SUBTITLES']");

		public static By SelectsecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By selectmoviewatch=By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");

		public static By MovieFirstCarouse_Btn = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");
		public static By SelectFirstMovie2_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[7]");
		public static String MovieFirstCarouse1_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[1]");
	}*/

	public static class LanguageFilter
	{
		public static By TeluguFilter_Radio=By.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[2]");
		public static By TamilFilter_Radio=By.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[1]");
		public static By MalayalamFilter_Radio=By.xpath("(//android.widget.RadioButton[@resource-id='com.suntv.sunnxt:id/dialog_item_checkbox'])[3]");
		
	}
	public static class TvShowsCarousel {
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By FirstCarousel = By.xpath("//*[@text='BANGARU KODALU']");
		public static By SecondCarousel = By.xpath("//*[@text='GIRIJA KALYANAM']");
		public static By Carousel = By.xpath(
				"(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");

	}

	public static class MusicVideosCarousel {
		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[5]");
		public static By FirstCarousel = By.xpath("//*[@text='LYRICIST ANANTHA SRIRAM SONGS']");

		public static By Viewallsongs = By.xpath("//*[@text='VIEW ALL SONGS']");

		public static String MusicvideofirstCarousel = "(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/list_horizontal'])[1]";

		public static String MusicvideoFirstCarousel = ("(//*[@class='android.widget.RelativeLayout'])[8]");
		public static By ViewAll = By.xpath("//*[@text='VIEW ALL']");

		public static By Filtercancel_Btn = By.id("com.suntv.sunnxt:id/cancel");
		public static By SelectMusicwatch=By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By SelectMusicwatch1=By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[4]");

	}

	public static class ComedyCarousel {

		public static By SelectSecondMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[9]");
		public static By SelectFirstMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[6]");
		public static String ComedySecondCarousel_Btn = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[3]");
		public static By FirstCarousel = By.xpath("//*[@text='ALI COMEDY SCENES']");

		public static By ViewAllcomedyscenes = By.xpath("//*[@text='VIEW ALL COMEDY SCENES']");

		// VIEW ALL SONGS

		public static String Firstcarousel = ("(//*[@class='androidx.recyclerview.widget.RecyclerView'])[4]");
	}

	public static class CCDCPAYTM {
		public static By Scbscribe90_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]");
		public static By CreditCard_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[1]");
		public static By DebitCard_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[2]");
		public static By Paytm_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/RLBottom'])[3]");
		public static By ProceedPay_Btn = By
				.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/proceedToPay']");

	}

	public static class Addwatchlist {
		public static By AddWatchList_Btn = By.id("com.suntv.sunnxt:id/fav_icon");
		public static By WatchList_Btn = By.xpath("//*[@text='Watch List']");
		public static By Ok_Btn = By.id("com.suntv.sunnxt:id/ok_button");
		public static By RemoveWatchList_Btn = By.id("com.suntv.sunnxt:id/favouriteText");
		public static By WatchListdots_Btn = By.id("com.suntv.sunnxt:id/three_dots_overflow");
		public static By AddedContentText = By
				.xpath("//android.widget.TextView[@resource-id='com.suntv.sunnxt:id/textview_title']");
		public static By WatchListContent = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/layout_thumbnail'])[1]");
	}

	public static class Searching {
		public static By Searching_Icon = By.id("com.suntv.sunnxt:id/action_search");
		public static By SearchingField_Txt = By.id("com.suntv.sunnxt:id/searchTextBox");
		public static By Searchingmovie_Btn = By.xpath("//android.widget.TextView[@text='GURU']");
		public static By SearchingTVShow_Btn = By.xpath("(//android.widget.TextView[@text='BANDHAM'])[1]");

		public static String Artistcarousel = ("(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view_movie'])[2]");
		public static By Viewall = By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail_voditem'])[4]");

	}

	public static class Couponcode {
		public static By CodeInPack_Txt = By.xpath("(//*[@class='android.view.View'])[8]");
		public static By EntercodeInPack_Btn = By.xpath("(//*[@class='android.widget.RelativeLayout'])[4]");
		public static By SelectMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[2]");
		public static By Submit_Btn = By.xpath("//android.widget.Button[@resource-id='couponCodeSubmit']");

		public static By Code2_Txt = By.id("couponcode");

		public static By Code_Txt = By.xpath("//android.widget.EditText[@resource-id='couponcode']");
		public static By Entercode_Btn = By.xpath("//*[@text='Enter Coupon Code']");
		public static By EntercodeBtn = By.xpath("//*[@text='Enter code']");
	}

	public static class Discover {
		public static By Discover_Txt = By.xpath("//android.widget.TextView[@text='DISCOVER']");
		//public static By DiscoverGenre_Btn = By.xpath("//android.widget.TextView[@text='COMEDY']");
		public static By DiscoverGenre_Btn = By.xpath("(//android.widget.TextView[@text='COMEDY'])[2]");
		public static By Movies_Img = By.xpath("//android.widget.GridView[@resource-id='com.suntv.sunnxt:id/gridview_movies']");
	}

	public static class Carouselviewall {
		public static By LatestEpic_Txt = By.xpath("//android.widget.TextView[@text='CRIME MOVIES']");
		public static By ActionSeries_Txt = By.xpath("//android.widget.TextView[@text='TOP TELUGU MOVIES']");
		public static By Viewall_Btn = By.xpath("//android.widget.TextView[@text='VIEW ALL']");
	}

	public static class DownloadContent {
		public static By downloadbtn = By.xpath("//*[@text='Downloads']");
		public static By downloadclearall = By.xpath("//*[@text='Clear All']");
		public static By canceldownload = By.xpath("//*[@text='Cancel Download']");
		
		public static By CancelInhomeConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[1]");
		public static By CancelInmovieConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[2]");
		public static By CancelInTVshowsConent = By.xpath("(//android.widget.TextView[@text='Cancel Download'])[3]");
		public static By CancelInmusicvideosConent = By
				.xpath("(//android.widget.TextView[@text='Cancel Download'])[4]");
		public static By CancelIncomedyConent = By.xpath("");
		public static By cancelOKbtn = By.xpath("//android.widget.Button[@text='OK']");
		//public static By CancelOK_Btn = By.id("com.suntv.sunnxt:id/ok_button");
		public static By Okbtn = By.xpath("//android.widget.Button[@text='Ok']");
		
		public static By DownloadInProfile_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[4]");
		public static By SelectInHomepage = By.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By Download_Btn = By.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/download']");
		public static By DownloadBest_Btn = By
				.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/best_button']");

		public static By HomepageCarousel = By.xpath("//*[@text='ACTION SERIES']");
		public static By MovieCarousel = By.xpath("//*[@text='MOVIES WITH SUBTITLES']");
		public static By TvshowCarousel = By.xpath("//*[@text='BANGARU KODALU']");
		public static By MusicvideoCarousel = By.xpath("//*[@text='LYRICIST ANANTHA SRIRAM SONGS']");
		public static By ComedyCarousel = By.xpath("//*[@text='ALI COMEDY SCENES']");
	}

	public static class Share {
		public static By ShareGmail_Btn = By.xpath("//android.widget.TextView[@text='Gmail']");
		public static By SenderGmail_Btn = By
				.xpath("//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']");
		public static By SendGmail_Btn = By
				.xpath("//android.widget.TextView[@resource-id='com.google.android.gm:id/send']");
		// public static By ShareGmail_Btn=By.xpath("");
		// public static By ShareGmail_Btn=By.xpath("");
		public static By Share_Btn = By.xpath("//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/share']");

	}

	public static class Recommended {
		public static By RecommendedMovie_Img = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");

	}

	public static class Filters {
		public static By FiltersAlpha_Section = By
				.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.suntv.sunnxt:id/recycler_view']");
	}

	public static class ContinueWatching {
		public static By Select_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By ContinuewatchingSelect_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_movie'])[1]");
		public static By ContinuewatchingSection = By.id("com.suntv.sunnxt:id/textview_genre_title");
	}

	public static class Roamingactivate {
		public static By InternationalRoaming_Btn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[8]");
		public static By Activate_Btn = By.xpath("//android.widget.Button[@text='ACTIVATE']");
	}

	public static class Freecontent {
		public static By Songs_Txt = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[1]");
		public static By FreeContent1_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[1]");
		public static By FreeContent2_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[2]");
		public static By FreeContent3_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/thumbnail_free_band'])[3]");
		public static By PremiumContent1_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail'])[2]");
		public static By PremiumContent2_Mve = By
				.xpath("(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageView'])[3]");
	}

	public static class Devices {
		public static By deactivateOKBtn = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
		public static By SunDirectOk_Btn = By.id("android:id/button1");
		//android:id/button1
		public static By deviceDeactivateBtn = By.xpath("//android.widget.TextView[@text='DEACTIVATE']");
		// public static By
		// deviceDeactivateBtn=By.id("com.suntv.sunnxt:id/deactivate_text");
		public static By ActivateBtn = By.xpath("//*[@text='ACTIVATE']");
		//ACTIVATE
		public static By deviceActivateBtn = By.xpath("//android.widget.Button[@resource-id='com.suntv.sunnxt:id/submit_button']");
		public static By enterDeviceCodeTxt = By
				.xpath("//android.widget.EditText[@resource-id='com.suntv.sunnxt:id/activationCodeEditText']");
		public static By DeviceBtn=By.xpath("//*[@text='Devices']");
		public static By deviceBtn = By
				.xpath("(//android.widget.RelativeLayout[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[10]");
	}

	public static class Livetv {
		public static By SunmusicHDChannel = By.xpath(
				"(//android.widget.ImageView[@resource-id='com.suntv.sunnxt:id/imageview_thumbnail_voditem'])[1]");
		public static By EPGlist =By.id("com.suntv.sunnxt:id/live_tv_list");
		
	}

	public static class Sharecontent {
		public static By shareicon = By.id("com.suntv.sunnxt:id/share");
		public static By fbicon = By.xpath("//*[@text='News Feed']");
		public static By fbpost = By.xpath("//android.widget.Button[@content-desc=\"POST\"]");
		public static By Gmail = By.xpath("//*[@text='Gmail']");
		public static By Gmailto = By.id("com.google.android.gm:id/to");
		public static By Gmailsend = By.xpath("//android.widget.TextView[@content-desc=\"Send\"]");
	}

}
