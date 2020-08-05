package cuke.stepdefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleTest {
	
	WebDriver driver;
	
	@Given("^we can open google$")
	public void we_can_open_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^we search for kittens$")
	public void we_search_for_kittens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^google will return us images of kittens$")
	public void google_will_return_us_images_of_kittens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
