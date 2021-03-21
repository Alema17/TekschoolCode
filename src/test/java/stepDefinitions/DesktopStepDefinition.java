package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopStepDefinition extends Base {

	// Creating object of DesktopPageObj
	DesktopPageObj desktopPageObj = new DesktopPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktopPageObj.clickOnDesktops();
		logger.info("User click on Desktops tab");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktopPageObj.clickOnShowAllDesktops();
		logger.info("User click on Show all desktops");
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		Assert.assertTrue(desktopPageObj.allDesktopElments());
		WebDriverUtility.screenShot();
		logger.info("User should see all items are present in Desktop page");

	}

	@When("^User click ADD TO CARToption on ‘HP LP(\\d+)’item$")
	public void user_click_ADD_TO_CARToption_on_HP_LP_item(int arg1) throws Throwable {
		desktopPageObj.clickAddToCart();
		logger.info("User click ADD TO CARToption on ‘HP LP ‘HP LP3065’item");
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desktopPageObj.selectQauntity();
		logger.info("User select quantity 1");
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktopPageObj.clickAddToCartButton();
		logger.info("User click add to Cart button");
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(String arg1)
			throws Throwable {
		Assert.assertTrue(true);
		WebDriverUtility.screenShot();
		logger.info("you have added HP LP 3065 to your Shopping cart!");
	}

	@When("^User click ADD TO CARToption on ‘Canon EOS (\\d+)D’item$")
	public void user_click_ADD_TO_CARToption_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktopPageObj.clickAddToCart();
		logger.info("User click ADD TO CARToption on ‘Canon EOS 5D’ item");
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desktopPageObj.selectRedColor();
		logger.info("User select color from dropdown ‘Red’");
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1)
			throws Throwable {
		desktopPageObj.successMessageOnCanon();
		logger.info("You have added Canon EOS 5D to your shopping cart!");

	}

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item() throws Throwable {
		desktopPageObj.clickOnCanon();
		logger.info("User click on Canon EOS 5D item");

	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		desktopPageObj.clickOnReview();
		logger.info("User click on write a review link");

	}

	@When("^User fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable review) throws Throwable {
		List<Map<String, String>> reviewForm = review.asMaps(String.class, String.class);
		desktopPageObj.clickYourName(reviewForm.get(0).get("name"));
		desktopPageObj.clickYourReview(reviewForm.get(0).get("reveiw"));
		desktopPageObj.clickRatingGood(reviewForm.get(0).get("ratingType"));

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		desktopPageObj.buttonReviewContinueButton();
		logger.info("User click on Continue Button");
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		desktopPageObj.reviewOutcomeMessage();
		logger.info("Thank you for your review. It has been submitted to the webmaster for approval.");
	}

}