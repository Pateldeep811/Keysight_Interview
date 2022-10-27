package com.keysight.steps;

import com.keysight.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^I am on home page\\.$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Contact Us button\\.$")
    public void iClickOnContactUsButton() {
       new HomePage().clickOnContactUsbutton();
    }

    @Then("^I am navigated on Contact Keysight Page\\.$")
    public void iAmNavigatedOnContactKeysightPage() {
    }

    @When("^I click on top menu \"([^\"]*)\"$")
    public void iClickOnTopMenu(String Menu) throws InterruptedException {
        new HomePage().clickOnTopmenu(Menu);
    }

    @And("^I am navigated on menu page\\.$")
    public void iAmNavigatedOnMenuPage() {
    }

    @Then("^I will be able to see the Message \"([^\"]*)\" on the page$")
    public void iWillBeAbleToSeeTheMessageOnThePage(String msg) {
        Assert.assertEquals(msg,new HomePage().setVerifyText());
    }

    @When("^i click on Agree and Proceed$")
    public void iClickOnAgreeAndProceed() {
        new HomePage().setClickOnAlert();
    }
}
