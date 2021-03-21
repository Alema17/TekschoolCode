package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LaptopAndNoteBooksPageObjects;
import utilities.WebDriverUtility;

public class LaptopAndNoteBooksStepDefinition extends Base {

	LaptopAndNoteBooksPageObjects laptopAndNoteBooks = new LaptopAndNoteBooksPageObjects();

	@When("^User click on Laptop & NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		laptopAndNoteBooks.clickOnLaptopAndNoteBookTab();
	}

	@When("^User click on Show all Laptop & NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		laptopAndNoteBooks.clickOnShowAllLaptopAndNoteBook();
	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		laptopAndNoteBooks.clickOnMackBookItem();
	}

	@When("^User clickadd to Cart button$")
	public void user_clickadd_to_Cart_button() throws Throwable {
		laptopAndNoteBooks.clickOnAddToCartMacBookButton();
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		WebDriverUtility.screenShot();
	}

	@Then("^User should see ‘(\\d+)tem\\(s\\)-(\\d+)\\.(\\d+)’showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverUtility.screenShot();
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		laptopAndNoteBooks.clickOnCartOption();
	}

	@Then("^User click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		laptopAndNoteBooks.clickOnRedXButton();
	}

	@Then("^item should be removed and cartshould show ‘(.+) item\\(s\\)’$")
	public void item_should_be_removed_and_cartshould_show_item_s(int arg1) throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
		laptopAndNoteBooks.clickOnComparisonMacBookIcon();
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
		laptopAndNoteBooks.clickOnComparisonMacBookAirIcon();
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()
			throws Throwable {
		WebDriverUtility.screenShot();
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		laptopAndNoteBooks.clickOnProductComparisonLink();
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click on heart icon to add ‘Sony VaIO’laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		laptopAndNoteBooks.clickOnheartIconSonyVaio();
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()
			throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click on ‘MacBook Pro’item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		laptopAndNoteBooks.clickOnmacBookProItem();
	}

	@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverUtility.screenShot();
	}

}