package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {

	// In this class we will write Actual Java/Selenium codes associated to each
	// Sceanrio
	// Steps.

	RetailPageObj retailPage = new RetailPageObj();

	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String value) throws Throwable {
		retailPage.enterValueToSearchBar(value);
		logger.info("User entered value in search bar");
		WebDriverUtility.screenShot();

	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		retailPage.clickOnSearchButton();
		logger.info("User clicked on search button");

	}

	@Then("^User should see Iphone image$")
	public void user_should_see_Iphone_image() throws Throwable {
		Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
		WebDriverUtility.screenShot();
		logger.info("iPhone image is displayed");
	
	
	}
	
	@When("^User click on Register option$")
	public void user_click_on_Register_option() throws Throwable {
		retailPage.clickOnRegister();
		logger.info("User clicked on Register option");

	}

	@When("^User fill the Registration form with Below information$")
	public void user_fill_the_Registration_form_with_Below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
		retailPage.enterLastName(dataValues.get(0).get("lastName"));
		retailPage.enterEmail(dataValues.get(0).get("email"));
		retailPage.enterTelephone(dataValues.get(0).get("telephone"));
		retailPage.enterPassword(dataValues.get(0).get("password"));
		retailPage.enterConfirmPassword(dataValues.get(0).get("confirmPassword"));
		retailPage.subscribe(dataValues.get(0).get("subscribe"));
		
		logger.info("User filled the information form");
		WebDriverUtility.screenShot();
		
	   
	}

	@When("^User accept the privacy and policy$")
	public void user_accept_the_privacy_and_policy() throws Throwable {
		
		retailPage.checkPrivacyPolicy();
		logger.info("User check privacy and policy");
		WebDriverUtility.screenShot();
		

	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on Continue button");
	}

	@Then("^User should be registered in Retail Website$")
	public void user_should_be_registered_in_Retail_Website() throws Throwable {
		
		Assert.assertTrue(retailPage.registrationOutcome());
		WebDriverUtility.screenShot();
		logger.info("Account was created Successfully");
	   
	}
	
	
	
	

}
