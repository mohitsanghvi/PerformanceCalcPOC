package com.example.PerformanceCalcPOC.steps;

import com.example.PerformanceCalcPOC.businessLayer.SearchBL;
import com.example.PerformanceCalcPOC.businessLayer.HomeBL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchbarSteps {

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        System.out.println("##### USER NAVIGATED TO HOME PAGE #####");
        new HomeBL().navigateTo();
    }

    @When("User searches for {string}")
    public void userSearchesFor(String product) {
        System.out.println("##### USER SEARCHING FOR "+product+" #####");
        new SearchBL().searchFor(product);
    }

    @Then("Options matching to the searched product should be displayed to User")
    public void verifyMatchingOptions() {
        System.out.println("##### VERIFYING PRODUCT AVAILABILITY IN SUGGESTION LIST #####");
        new SearchBL().fetchProductSearchSuggestions();
    }

}
