import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class logon_StepDefs {

    @Given("^I have following users:$")
    public void i_have_following_users(List<String> entries) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        System.out.println(entries.get(3));


    }

    @When("^I submit the credentials$")
    public void i_submit_the_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should be able to logon$")
    public void i_should_be_able_to_logon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
