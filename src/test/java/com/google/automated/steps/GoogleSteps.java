package com.google.automated.steps;

import com.google.automated.steps.serenity.GoogleTestSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSteps {

    @Steps
    GoogleTestSteps googleTestSteps;

    @Given("^I can access to google Homepage$")
    public void iAmOnGoogleHomePage() throws Throwable {
        googleTestSteps.goToHomePage();
        assertThat(googleTestSteps.isHomePageDisplayed()).isTrue();
    }

    @When("^I search \"([^\"]*)\" in the search bar$")
    public void iSearchKeywordInTheSearchBar(String keyword) throws Throwable {
        googleTestSteps.searchKeyword(keyword);
    }

    @Then("^I click on first result$")
    public void iClickOnFirstResult() throws Throwable {
        googleTestSteps.clickOnFirstResult();
    }

}