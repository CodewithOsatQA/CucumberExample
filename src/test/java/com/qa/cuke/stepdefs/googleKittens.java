package com.qa.cuke.stepdefs;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleKittens {

	private static WebDriver driver;
	private static WebElement targ;
	private static String searchTerm = "Kittens";

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/selenium/webdrivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		driver = new ChromeDriver(chromeCfg());
	}

	@When("^we search for kittens$")
	public void we_search_for_kittens() throws Throwable {
		//TODO Implement
	}

	@Then("^google will return us image of kittens$")
	public void google_will_return_us_image_of_kittens() throws Throwable {
		//TODO Implement
	}

	@After
	public void cleanUp() {
		driver.close();
		driver.quit();
	}

	// Designed to return ChromeOptions to configure new ChromeDrivers in Selenium
	public static ChromeOptions chromeCfg() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		ChromeOptions cOptions = new ChromeOptions();

		// Settings
		prefs.put("profile.default_content_setting_values.cookies", 2);
		prefs.put("network.cookie.cookieBehavior", 2);
		prefs.put("profile.block_third_party_cookies", true);

		// Create ChromeOptions to disable Cookies pop-up
		cOptions.setExperimentalOption("prefs", prefs);

		return cOptions;
	}

}
