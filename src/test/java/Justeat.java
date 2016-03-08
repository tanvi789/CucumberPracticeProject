import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class Justeat {

    private WebDriver driver;


    @Before("@Sc1")
    public void setUp()
    {
        driver = new FirefoxDriver();
    }
    @Given("^I am on Just Eat$")
    public void i_am_on_Just_Eat() throws Throwable {
        driver.navigate().to("https://www.just-eat.co.uk/");
    }

    @When("^I click on just ear logo$")
    public void i_click_on_just_ear_logo() throws Throwable {

        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/a/img")).click();
    }

    @Then("^I should see the expected title$")
    public void i_should_see_the_expected_title() throws Throwable {
        assertTrue(driver.getTitle().contains("Order Takeaway from 20,000+ Food Delivery Restaurants | JUST EAT"));

    }
    @After("Sc2")
    public void tearDown()
    {
        driver.quit();
    }
}
