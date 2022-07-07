package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User on Netbanking landing page$")
    public void user_on_netbanking_landing_page() throws Throwable {
    System.out.println("navigated to login url");
    }

    @When("^user login application with username and password$")
    public void user_login_application_with_username_and_password() throws Throwable {
        System.out.println(" logged in url");

    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("validated home page");
        System.out.println("validated home1111 page");
        System.out.println("validated home1114 page");
        System.out.println("validated home11133 page");
        System.out.println("validated home11133 pageeee");
        System.out.println("validated home1113344 page");
    }

    @When("^user login application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
 System.out.println(strArg1);
  System.out.println(strArg1);
    }


    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("validated cards");
        System.out.println("validated cards1");

    }

}
