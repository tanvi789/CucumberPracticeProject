import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class calculation_stepDefs {

    private int sum;

    @Given("^a list of numbers$")
    public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        for(Integer number:numbers)
        {
            System.out.println(number);
            sum +=number;
            System.out.println(sum);

        }



    }

    @When("^I summarize them$")
    public void i_summarize_them() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should get (\\d+)$")
    public void i_should_get(int ExpectedSum) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        assertThat(sum,is(ExpectedSum));
    }

}
