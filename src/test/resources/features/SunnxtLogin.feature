Feature: SunNxt Mobile Automation

@MobileTest @changeContentLanguage @sravan
Scenario Outline: TCN-19-Verify Change content language and see whether the content for that particular language is displayed or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click change content languages
Then user observe the selected language content displayed or not
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @changeAppLanguage @sravan
Scenario Outline: TCN-20-Verify Change App language and observe the content names and headers in the app are shown in that particular change app language operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click change app language
Then user observe the headers showing selected language content
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
  
  
@MobileTest @changeappandcontentlanguageinprofileandhamburger @sravan
Scenario Outline: TCN-21- Verify content language and app language from Profile and hamburger menu operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed and change app and content language in profile page and observe app should show date as per selection
Then user change app and content language in hamburger menu and observe app should show date as per selection
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @lowerpackforswitchplan @sravan
Scenario Outline: TCN-29-Verify the subscription flow
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user Select a lower pack from switch plan and subscribe

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @homePageCarouselPlay 
Scenario Outline: TCN-36&37&40 Verify In Home page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one movie content in each carousel at homepage
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @MobileTest @playContinueWatchingMovie 
Scenario Outline: TCN-39-Watch some content and observe continue watching section is getting updated or not and content should resume playing from that point.
resume playing from that point operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user login portal and play one movie content and go back to homepage
Then user observe previous played content added to continue watching section or not and play content in continue watching section
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
  
@MobileTest  @playcontentInTVShowSection 
Scenario Outline: TCN-41-Verify play contents in Tvshow at TVShow Section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials and play content at TVShow Section In TVShows
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @selectgenresInDiscoverySection 
Scenario Outline: TCN-42-In discover section in Home page - select any genre and observe the results for the selected genre operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user select one genre in discovery section at homepage
 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @MoviesandTVShows3Dview 
Scenario Outline: TCN-43-51 -Movies and TV Shows 3D view
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click Movies 3d view play button
Given user click Tvshows 3d view play button

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 @Moviesection3Dview 
Scenario Outline: TCN-43-Home Shows 3D view
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click movie button and select view all button
Then user click on 3D grid view button
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @filterForGenresInMovies 
Scenario Outline: TCN-44&45-Verify Movies page and Select View all Movies and Apply filter for genre and observe the results play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click movie and select view all button
When user click geners button and select on one category
Then user play one video on that select category in geners
Given user click actors button and select on one category
Then user play one video on that select category in actors

Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 


 @moviesPageCarouselPlay 
Scenario Outline: Verify In movies page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one movie content in each carousel at Movie page
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @MobileTest @viewallInAllCarousels  
Scenario Outline: TCN-46-Click on View all for all carousels and observe user is taken to view all screen operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click viewall for All carousels and observe
 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

 @MobileTest  @listOfCOntentsShowingIn90'sMovies  
Scenario Outline: TCN-47-Verify Action Movies in HD/Super Hits/90's Hits operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credential And click View All Movies In Movies
Then user click Year Button And Select 90's Movies And View All Should Show List Of Contents With Proper Thumbnails
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @selectMoviesInDiscoverySection  
Scenario Outline: TCN-48-In discover section in Home page - select any genre and observe the results for the selected genre operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user select  Movie in discovery section at homepage
 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @TVShows3Dview 
Scenario Outline: TCN-51-TV Shows 3D view
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click TVShow and select view all button
Then user click on 3D grid view button
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 @MobileTest @tvShowsCarouselPlay 
Scenario Outline: TCN-52 Verify In Tv shows page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one TVshow content in each carousel at TVShows page
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @filterForGenresInTVShow 
Scenario Outline: TCN-54&55-Verify TV shows page and Select View all for Tv shows and Apply filter for Genre and observe the results and play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click TVShow and select view all button
When user click geners button in TVShow and select on one category
Then user play one video on TVShows and select category in geners
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
@MobileTest  @playHDandSDcontentinLIVETV 
Scenario Outline: TCN-63-Verify Live TV channels playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials and play one HD and one SD content in live tv
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest  @ratingOfSelectedContent 
Scenario Outline: TCN-69-Verify content rating operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials And Play One Content Give Rating For Played Content
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @searchrelated 
Scenario Outline: TCN-70-76Observe Search icon on the header and click on search and search for any type of content and observe the search results in that particular section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user search one movie content in search field
Then user search one TVShow content in search field
Then user search one Music content in search field
Then user search one Comedy content in search field
Then user search one Actor in search field
Then user search diffrent text and LiveTV content in search field
Then user clear all search history

#Then user Observe Content will update in recent search history
 Examples: 
 | TestData     | TestData1           |
 | SunNxt       | SunNxtMobileApplication|
 
 @MobileTest @searchclearall 
Scenario Outline: TCN-77&80 Verify clear search history
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click on movie and cick view all movies
Then search movie content 
Then user clear all search history

 Examples: 
 | TestData     | TestData1           |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @downloadcontent 
Scenario Outline: TCN-82&84&85&86&87-Download all type of content from different sections when user is in online mode operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file   
Given user download one content in homepage
Then user download one content in movies
When user download one content in TVShows
And user download one content in music videos
Then user download one content in comedy
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 

@MobileTest @editprofile  
Scenario Outline: TCN-94-95-user verify Edit Profile operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click edit profile button
Then user select age range
When user select country and state
And user observe edit profile change or not
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @profilePicChange 
Scenario Outline: TCN-96-user verify Profile page and Update the Profile picture and save the changes operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click on profile photo
Then user select one image of the library
#When user observe the profile photo is update or not
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @MobileTest  @changePwdAfterLogIn 
Scenario Outline: TCN-97-Verify change password operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials And Click Edit Profile
Then user click Change Password Button And Change Password
Examples:
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 


 
@MobileTest  @playWatchListContent 
Scenario Outline: TCN-100-Verify Played Watch List Page Content operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials and Go To Profile Page
Then user click Watched List Button And Play One COntent In Watch List
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|
 
@MobileTest  @removeWatchListContent 
Scenario Outline: TCN-101-Verify Watch List Page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials and Go To Profile Page
Then user observe added movie is Displayed in watchlist and Remove Content In WatchList
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|
 
@MobileTest @subscriptions 
Scenario Outline: TCN-103-User can view his invoice for current plan in Subscription page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click subscrption button
Then user observe the customer state
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
 @MobileTest @Internationalroaming 
Scenario Outline: TCN-104-Verify international roaming
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user login to portal and activate international roaming

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest @entercouponcodeInProfilePage 
Scenario Outline: TCN-105-User can apply different type of coupon codes through enter coupon code page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click enter coupon code button in profile page
Then user subscribe using couponcode
 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
  
@MobileTest @listOfDevices 
Scenario Outline: TCN-107-verift subscriptions plans operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click devices button and observe the list of devices
Then user enter activate device code and click activate button

 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

  
@MobileTest @wifienable 
Scenario Outline: TC-109-110-Verify in Settings page and Observe download only on WiFi check on and off is working or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click settings button
Then user observe wifi on and off button working
When user download one content in TVShows
Then user click on cancel button

Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
  @wifidisable 
Scenario Outline: TC-111-Verify in Settings page and Observe download only on WiFi check on and off is working or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click settings button
Then user observe wifi on and off button working
When user download one content in TVShows
Then user observe Enable wifi on and off button working
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @Settingspage 
Scenario Outline: TC-112-118-Verify In settings page and select Video quality and change the quality and observe the Changes operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click video quality button
Then user observe video quality changeing operation and play one content
Given user click FeedBack button
Then user observe feedback submition
Given user click AboutUs button and observe the information of SunNxt App
Given user click FAQs button and observe the FAQs information in SunNxt App
Then user click terms and conditions button and observe the terms and conditions in SunNxt App
#When user login to portal by using subscribed credentials And Click On Hamburger Icon
Then user Click Settings Button And Observe App Version
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest @PrivacyPolicy 
Scenario Outline: TCN-119-Verify Privacy policy operation 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials And Click on Hamburger Icon
Then user Click Settings Button And Click Privacy Policy 
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|



@MobileTest @MyContentHistory 
Scenario Outline: TCN-121-124 Verify Content History operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials Click on Hamburger Icon
Then user Click My Account Button And Click My Content History Button
And User Observe list of TEN recently played contents should be displayed or Not
Then user Click My Account Button And Click My Info Button
And Observe User Information And List Of Devices Connected
Then user Click My Account Button And Click My Subscriptions Button
And Observe users subscription status pack name And Expiry date and cost
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @clearMyHistory 
Scenario Outline: TCN-125-Verify Clear my Watch history/Cache operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials click on hamburger icon
Then user Click My Account Button And Click Clear My Watch Historycatch
And User Delete the Data And Observe The Continue Watching Section Displayed Or Not
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

 @MobileTest @checkclearMyHistorySection
Scenario Outline: TCN-126-Verify Clear my Watch history/Cache Displayed After Clear Data operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials click on hamburger icon
Then user Click My Account Button And Observe Clear Watch History Button Is Dispayed Or Not
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest  @UnselectallLanguage 
Scenario Outline: TCN-227-Verify alerts showing or not
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click change content language  
Then user unselect all languages observe alerts are coming or not
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest  @casticon 
Scenario Outline: TCN-132-Verify Chrome cast icon
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user click on cast icon symbol

Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

@MobileTest  @multiplefiltersplay 
Scenario Outline: TCN-157&158-Verify multiple language filter in search operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials and search one movie content
Then observer Able to select multiple filters and able to show data based on the selected languages and contents should play
Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 


@MobileTest @actorprofilepage
Scenario Outline: TCN-159-Verify view all actor profile page and filters operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials and search one actor in search field
Then user click searched artist icon and click view all content and observe the list of songs in selected artist
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @sharecontent
Scenario Outline: TCN-170-172-In content detail page -share button is shown below the player screen and Share the content via facebook message gmail etc and observe whether the sharing is done 
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user share one content via facebook
Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
 
@MobileTest  @addContenttowatchlist 
Scenario Outline: TCN-174-Verify add to watch list operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user select one movie and add selected movie to watch list
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest  @addmultipleContenttowatchlist 
Scenario Outline: TCN-175-Verify add different contents to watch list operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user add different section contents to watch list
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest  @addmultipleContenttowatchlistandobserveprofile 
Scenario Outline: TCN-176-Verify add different contents to watch list operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user add different section contents to watch list and click on profile and observe in watch list section added or not
Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @filterDataAlphabetical 
Scenario Outline: TCN-211-Verify the data in filters is showing in alphabetical order or not operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user observe Filters data should be in alphabetical order
Examples:  
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|


 

  
@MobileTest @refreshInAllSections 
Scenario Outline: TCN-216-Verify App refresh across all the sections in online and offline mode operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user perform refresh operation in all pages
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @Recomandedforyou 
Scenario Outline: TCN-222&223-Verify Recommended for you carousels
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one movie content in Recomandedforyou carousel at homepage
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

  @selectInRecomendedSection 
Scenario Outline: TCN-222-In Content detail page - select any other content from Recommended section and check playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user play one movie content and select one more movie in recommended section
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|

 
  

 
 
@MobileTest @DeactivateDevices 
Scenario Outline: TCN-229-Verify Deactivate device
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click devices button and observe the list of devices
Then user deactivate one device into the list of devices
#And user enter activate device code and click activate button

 Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 @enterActivatedevice 
Scenario Outline: TC-65-User can also Add/delete the devices from devices Option in Profile page operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user go to profile page and select devices button
#Then user deactivate one device into the list of devices
And user enter activate device code and click activate button

 Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @musicVideosCarouselPlay @ss
Scenario Outline: TCN-67 Verify In Music Videos Page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one musicvideo content in each carousel at music video page

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @contentsformusicvideoandfilters @ss
Scenario Outline: TCN-67-Verify contents from music video section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials and click music video button
Then user click view all songs and observe the data contents and observe filters should be working or not

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @contentsformusicvideo @ss
Scenario Outline: TCN-67-Verify contents from music video section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials and click Music video button
Then user click viewall screen on carousel and observe filters and data of contents

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|



@MobileTest @contentsforcomedyandfilters 
Scenario Outline: TCN-68-Verify contents from comedy section operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials and click comedy button
Then user click view all comedy scenes and observe the data contents and observe filters should be working or not

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

@MobileTest @contentsforcomedy 
Scenario Outline: TCN-68-Verify contents from comedy section carousel content play operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using Subscribed credentials and click Comedy button
Then user click viewall screen on carousel and observe filters and data of contents on comedy

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|
 
@MobileTest  @listOfCOntentsShowingComedy 
Scenario Outline: TCN-68-Verify Latest Movies in HD/Comedy Movies in HD/Horror Movies in HD/Romantic Movies in HD operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user login to portal by using subscribed credentials And click View All Movies In Movies
Then user Select Comedy Genres And View All Should Show List Of Contents With Proper Thumbnails

Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|

 @comedyCarouselPlay 
Scenario Outline: TCN-68-Verify In Comedy Page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one musicvideo content in each carousel at comedy page

Examples: 
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 

 


@MobileTest @filterForcomediansInComedy 
Scenario Outline: TCN-68-Verify In Comedy  page - Select View all Comedy scenes and Apply filter for Comedians and observe the results and play any content from the results operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click comedy button and select viewall button
When user click comedians button and select on one category
Then user play one video on that select category in comedians

Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
 
 @offline
Scenario Outline: TCN-90-Verify downloaded contents in offline mode
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user download one content in homepage
Then user click airplane mode
Then user download one content in movies


Examples:
 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
  
@MobileTest @secondaryprofile 
Scenario Outline: TCN-99 &127-Verify In profile Page and Select Switch profile and Add sub profiles and switch to secondary profiles operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click Switch profile button
When user create one new profile
Then user observe the secondary profile
When user login to portal by using subscribed credentials Click on Hamburger Icon
Then user Click My Account Button And Click My Content History Button
And User Observe list of TEN recently played contents should be displayed or Not
Then user Click My Account Button And Click My Info Button
#And Observe User Information And List Of Devices Connected
Then user Click My Account Button And Click My Subscriptions Button
And Observe users subscription status pack name And Expiry date and cost
Then user observe the swithing profile
And user delete the create profile
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @switchProfile 
Scenario Outline: TCN-98-Verify In profile Page and Select Switch profile and Add sub profiles and switch to secondary profiles operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
Given user click Switch profile button
When user create one newprofile
Then user observe the swithing operation
And user delete the create profile
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication|
 
@MobileTest @playercontrols
Scenario Outline: TCN-000 Verify In Home page and Play content from each carousel and check the content playback operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When user play one movie and observe player controls
Examples: 
 | TestData     | TestData1            |
 | SunNxt       | SunNxtMobileApplication| 
   @multiplefiltersapply 
Scenario Outline: TCN-212- Verify view all diffrent section and select different filters by applying operation
Given Read the test data "<TestData>" and "<TestData1>" from Excel file
When sigin with valid user and user click viewall in movies and select multiple filters and observe the relevent data
Examples:
| TestData     | TestData1            |
| SunNxt       | SunNxtMobileApplication|