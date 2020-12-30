package runners;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import stepdefs.BizComps;
import sunnxtMobileLocators.SunNxtLocators.Allow;
import sunnxtMobileLocators.SunNxtLocators.Login;
import sunnxtMobileLocators.SunNxtLocators.Logout;
import utilities.ConfigReader;
import utilities.DriverUtil;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.MobileKeywords;
import utils.ExtReport;
import utils.ExtTest;
import utils.GlobalParams;
import utils.ServerManager;

@CucumberOptions(features = "@target/rerunlogin.txt", glue = "stepdefs", plugin = { "pretty",
		"html:target/cucumber-html-report", "json:target/cucumber.json" })

public class RerunLoginRunner extends AbstractTestNGCucumberTests {
	private static final ThreadLocal<TestNGCucumberRunner> testNGCucumberRunner = new ThreadLocal<>();
	public static ConfigReader config = new ConfigReader();
	GlobalParams params = new GlobalParams();

	public static TestNGCucumberRunner getRunner() {
		return testNGCucumberRunner.get();
	}

	protected static void setRunner(TestNGCucumberRunner testNGCucumberRunner1) {
		testNGCucumberRunner.set(testNGCucumberRunner1);
	}

	@BeforeSuite
	public void beforeSuite() {
		ExtReport.setReport(this.getClass().getSimpleName());
	}

	@Parameters({ "platformName", "udid", "deviceName", "systemPort", "chromeDriverPort", "wdaLocalPort",
			"webkitDebugProxyPort", "appiumPort" })
	@BeforeClass
	public void onStart(String platformName, String udid, String deviceName, @Optional("Android") String systemPort,
			@Optional("Android") String chromeDriverPort, @Optional("iOS") String wdaLocalPort,
			@Optional("iOS") String webkitDebugProxyPort, String appiumPort) {
		MobileKeywords mk = new MobileKeywords();
		try {
			params.setPlatformName(platformName);
			params.setUDID(udid);
			params.setDeviceName(deviceName);
			init();
			switch (platformName) {
			case "Android":
				params.setSystemPort(systemPort);
				params.setChromeDriverPort(chromeDriverPort);
				break;
			case "iOS":
				params.setWdaLocalPort(wdaLocalPort);
				params.setWebkitDebugProxyPort(webkitDebugProxyPort);
				break;
			}

			new ServerManager().startServer(Integer.parseInt(appiumPort));
			new DriverUtil().new DriverManager().initializeDriver();
			setRunner(new TestNGCucumberRunner(this.getClass()));
			mk.delay(3000);
			ExtTest.setTest(ExtReport.getReport().startTest("Launch"));
			new BizComps().navigateToHomeScreen();
			mk.delay(2000);
			mk.click(Login.Profile_Btn, "user click profile image");
			mk.click(Login.Profile2_Btn, "user click LOG IN button");
			mk.setValue(Login.EmailId_Txt, config.getTDValue("UserID"), "Entered EmailID");
			mk.setValue(Login.Password_Txt, config.getTDValue("Password"), "Entered password");
			mk.click(Login.loginBtn, "user click login button");
			mk.delay(3000);
			if (mk.isWebElementNotPresent(Logout.afterLoginProfileBtn)) {
				new BizComps().deactivateDevicesUsingWebPortal();
				mk.click(Login.loginBtn, "user click login button");
			}
			mk.click(Logout.afterLoginProfileBtn, "user click profile image");
			mk.delay(2000);
			mk.click(Allow.coachmark, "user click coachmark");
			mk.delay(1000);
			mk.click(Allow.coachmark, "user click coachmark");
			mk.delay(1000);
			mk.click(Allow.coachmark, "user click coachmark");
			mk.delay(1000);
			ExtReport.getReport().endTest(ExtTest.getTest());
		} catch (Exception e) {
			e.printStackTrace();
			LogUtil.errorLog(getClass(), "Common Settings not properly set may not run the scripts properly");
		}
	}

	@AfterClass
	public void onFinish() {
		new DriverUtil().getMDriver().quit();
		new ServerManager().stopServer();
		ExtReport.getReport().flush();
		new KeywordUtil().onExecutionFinish();

		LogUtil.infoLog(getClass(), " suite finished" + " at " + new Date());
		LogUtil.infoLog(getClass(),
				"\n\n+===========================================================================================================+");
		ExtReport.getReport().flush();
		DriverUtil.closeAllDriver();
	}

	@AfterSuite
	public void afterSuite() {
		ExtReport.getReport().close();
	}

	private void init() {
		// Get all the common setting from excel file that are required for
		GlobalUtil.setCommonSettings(new ExcelDataUtil().getCommonSettings());

		String browser = "";
		browser = GlobalUtil.getCommonSettings().getBrowser();

		String executionEnv = "";
		executionEnv = GlobalUtil.getCommonSettings().getExecutionEnv();

		String url = "";
		url = GlobalUtil.getCommonSettings().getUrl();

		if (browser == null)
			browser = config.getValue("defaultBrowser");

		if (executionEnv == null)
			executionEnv = config.getValue("defaultExecutionEnvironment");
		if (url == null) {
			url = config.getValue("BASE_URL");
			GlobalUtil.getCommonSettings().setUrl(url);
		}
	}

}