package com.qa.cuke.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleTest {

	private static WebDriver driver;
	private static WebElement targ;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/selenium/webdrivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		driver = new ChromeDriver(chromeCfg());
	}
	
	//========================================
	// General/Shared/Recycled Method
	//========================================
	
	@Given("^we can open google$")
	public void we_can_open_google() throws Throwable {
		driver.get("https://google.com");

		assertEquals("Google", driver.getTitle());
	}
	
	//========================================
	// Animals
	//========================================
	
	@When("^we search for \"([^\"]*)\"$")
	public void we_search_for(String arg1) throws Throwable {
		System.out.println("search term: " + arg1);
	}

	@Then("^google will return us image of \"([^\"]*)\"$")
	public void google_will_return_us_image_of(String arg1) throws Throwable {
		System.out.println("Animal images of: " + arg1);
		
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
