package stepDefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObjects;
import utilities.WebDriverUtility;

public class RetailPageLoginTestStepDefinition {

	RetailPageObjects retailPageObjects = new RetailPageObjects();

	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		retailPageObjects.clickOnAccount();
	}

	@When("^User click on‘Register for an Affiliate Account’link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		retailPageObjects.registerAffiliateAccount();
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable arg1) throws Throwable {
		retailPageObjects.company();
		retailPageObjects.website();
		retailPageObjects.taxID();
		retailPageObjects.paymentMethod();
		retailPageObjects.chequePayeeName();
		WebDriverUtility.screenShot();
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		// retailPageObjects.checkBox();
		WebDriverUtility.screenShot();

	}

	@When("^User click on‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		retailPageObjects.editAffiliateInformation();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		retailPageObjects.bankTransfareRadioButton();
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable tableList) throws Throwable {
		List<Map<String, String>> dataValue = tableList.asMaps(String.class, String.class);
		retailPageObjects.bankName(dataValue.get(0).get("bankName"));
		retailPageObjects.abaNumber(dataValue.get(0).get("abaNumber"));
		retailPageObjects.swiftCode(dataValue.get(0).get("swiftCode"));
		retailPageObjects.accountName(dataValue.get(0).get("accountName"));
		retailPageObjects.bankAccountNumberAffiliate(dataValue.get(0).get("accountNumber"));
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		WebDriverUtility.screenShot();
	}

	@And("^User click on Continue AffiliateButton$")
	public void user_click_on_continue_affiliatebutton() {
		retailPageObjects.continueButtonAffiliate();
	}

	@When("^User click on‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		retailPageObjects.editYourAccountInformation();
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable accountInfo) throws Throwable {
		List<Map<String, String>> dataValue = accountInfo.asMaps(String.class, String.class);
		retailPageObjects.firstName(dataValue.get(0).get("firstname"));
		retailPageObjects.lastName(dataValue.get(0).get("lastname"));
		retailPageObjects.email(dataValue.get(0).get("email"));
		retailPageObjects.telephone(dataValue.get(0).get("telephone"));
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		retailPageObjects.continueButtonEditAccount();

	}

	@Then("^User should seea message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_seea_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		WebDriverUtility.screenShot();
	}

}