package pages;

import Utils.Condition;
import Utils.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static Utils.ElementClass.$;
import static Utils.ElementClass.open;

public class MyStepdefs implements Locators {
    @Given("^user on homepage$")
    public void userOnHomepage() {
        open(url2);
    }

    @When("^user search \"([^\"]*)\"$")
    public void userSearch(String text)   {

    $(searchInput)
            .shouldBe(Condition.visible)
            .setValue(text)
            .pressEnter();
    }

    @Then("^products should be visible$")
    public void productsShouldBeVisible() {
    $(aboutUs)
            .scrollIntoView()
            .click();
    }

    @And("^close the browser$")
    public void closeTheBrowser() {
        Driver.quitDriver();
    }
}
