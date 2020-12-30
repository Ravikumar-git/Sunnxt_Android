package stepdefs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.Activity;
import io.github.bonigarcia.wdm.WebDriverManager;
import sunnxtMobileLocators.SunNxtLocators.Allow;
import sunnxtMobileLocators.SunNxtLocators.Devices;
import sunnxtMobileLocators.SunNxtLocators.Login;
import sunnxtMobileLocators.SunNxtLocators.Logout;
import utilities.MobileKeywords;

public class BizComps extends MobileKeywords {
	public void navigateToHomeScreen() {
		try {
			if (getMDriver().findElement(Allow.allowBtn).isDisplayed()) {
				click(Allow.allowBtn, "user click allow button");
			}

			if (getMDriver().findElement(Allow.allowBtn).isDisplayed()) {
				click(Allow.allowBtn, "user click allow button");
			}
		} catch (NoSuchElementException | TimeoutException e) {
		}
		// delay(3000);
		click(Allow.click_Tamillanguage, "User select's the Tamil language");
		delay(400);
		click(Allow.click_telugulanguage, "User select's the Telugu language");
		delay(400);
		click(Allow.click_Malyalamlanguage, "User select's the malayalam language");
		delay(400);
		click(Allow.click_kannadalanguage, "User select's the  kannada language");
		delay(400);
		click(Allow.click_Bengalilanguage, "User select's the  kannada language");
		delay(400);
		click(Allow.next, "User tap on next button");
		try {
			click(Allow.acceptBtn, "user click Accept button");
		} catch (NoSuchElementException | TimeoutException e) {
		}
		delay(1000);
		click(Allow.coachmark, "user click coachmark");
		delay(400);
		click(Allow.coachmark, "user click coachmark");
		delay(400);
		click(Allow.coachmark, "user click coachmark");
		delay(400);
	}

	public void openHomeScreen() {
		getADriver()
				.startActivity(new Activity("com.suntv.sunnxt", "com.android.myplex.ui.sun.activities.MainActivity"));
	}

	public void deactivateDevices() {
		click(Logout.afterLoginProfileBtn, "user click profile image");
		delay(3000);
		try {
			click(Allow.coachmark, "user click coachmark");
			delay(1000);
			click(Allow.coachmark, "user click coachmark");
			delay(1000);
			click(Allow.coachmark, "user click coachmark");
			delay(1000);
		} catch (NoSuchElementException | TimeoutException e) {
		}
		click(Devices.deviceBtn, "user click devices button and observe devices");
		delay(5000);
		deactivateDevices(Devices.deviceDeactivateBtn, Devices.deactivateOKBtn);
	}

	public void deactivateDevicesUsingWebPortal() {
		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless", "--disable-gpu",
		// "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to(new URL("https://sunnxt.com"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#show_sign>a[href='#']"))).click();
		new WebDriverWait(driver, 3)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign In']"))).click();
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email-up")))
				.sendKeys("auto@g.com");
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")))
				.sendKeys("1234");
		delay(1000);
		new WebDriverWait(driver, 1)
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#signin_form_section .btn-red[type='submit']")))
				.click();

		delay(5000);
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#showuser_profile>a[href='#']")))
				.click();
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/device/']"))).click();
		List<WebElement> deactivateBtns = driver.findElements(By.cssSelector(".disactivate-device"));
		click(Login.loginBtn, "user click login button");
		for (int i = 0; i < deactivateBtns.size() - 1; i++) {
			deactivateBtns.get(i).click();
			delay(3000);
		}
		driver.close();
	}

	public void launchHomePage() {
		execCommand("adb shell am start -n com.suntv.sunnxt/com.android.myplex.ui.sun.activities.MainActivity");
	}

	public void deactivateDevicesUsingWebPortalunsub() {
		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless", "--disable-gpu",
		// "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to(new URL("https://sunnxt.com"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#show_sign>a[href='#']"))).click();
		new WebDriverWait(driver, 3)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign In']"))).click();
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email-up")))
				.sendKeys("ss@g.com");
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")))
				.sendKeys("1234");
		delay(1000);
		new WebDriverWait(driver, 1)
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#signin_form_section .btn-red[type='submit']")))
				.click();

		delay(5000);
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#showuser_profile>a[href='#']")))
				.click();
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		delay(1000);
		click(Login.loginBtn, "user click login button");
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/device/']"))).click();
		List<WebElement> deactivateBtns = driver.findElements(By.cssSelector(".disactivate-device"));
		click(Login.loginBtn, "user click login button");
		for (int i = 0; i < deactivateBtns.size() - 1; i++) {
			deactivateBtns.get(i).click();
			delay(3000);
		}
		driver.close();

	}

}
