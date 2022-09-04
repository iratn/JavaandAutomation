package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("the store main page is displayed")
    public void the_store_main_page_is_displayed() {
        System.out.println("the store main page is displayed");
    }
    @When("the user choose brand \"Shadi\"")
    public void the_user_choose_brand_Shadi(){
        System.out.println("the user choose brand \"Shadi\"");
    }
    @Then("results are shown")
    public void results_are_shown(){
        System.out.println("results are shown");
    }

}
