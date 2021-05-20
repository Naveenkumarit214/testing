package userStepDefintions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.samplePage;
import util.DriverUtil;

public class Steps {
	DriverUtil driverUtil = new DriverUtil();
	samplePage sp= new samplePage();
	
	@Given("^I navigate to google page$")
	public void i_navigate_to_google_page() throws Throwable {
		driverUtil.LaunchBrowser();
		driverUtil.driver.quit();
	}

	@When("^I enter \"([^\"]*)\" on search textbox$")
	public void i_enter_on_search_textbox(String arg1) throws Throwable {
		sp.enterValueInsearchbox();
	}

	@When("^clicks on search button$")
	public void clicks_on_search_button() throws Throwable {
	 sp.ClickOnSearch();
	}

	@Then("^verify user is on searched duck page or not$")
	public void verify_user_is_on_searched_duck_page_or_not() throws Throwable {
		sp.VerifyLinks();
	}
}
