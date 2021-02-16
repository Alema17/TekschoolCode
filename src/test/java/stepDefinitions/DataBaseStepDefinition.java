package stepDefinitions;


import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DataBaseUtility;

public class DataBaseStepDefinition extends Base {
	
	@Given("^User connects to PostgreSql Database$")
	public void user_connects_to_postgreSQL_database() {
		DataBaseUtility.setupConnection();
		logger.info("Connection is established between JDBC and DB");
	}
	
	@When("^User sends querry '(.+)'$")
	public void user_sends_query(String query) {
		DataBaseUtility.runQuery(query);
		logger.info(query + ": has been executed");
	}
	
	@Then("^User should get all information from that table$")
	public void user_should_get_all_information_from_that_table() {
		DataBaseUtility.returnResult();
		logger.info("ResultSet is stored in a csv file in outcome folder");
		DataBaseUtility.closeDBConnection();
		logger.info("DataBase connection has been closed");
	}
}