package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.DogsPage;

public class DogsPageSteps {

    DogsPage dogsPage = new DogsPage();

    @Then("^Change min price (.*) and max price (.*)$")
    public void changeMinPriceAndMaxPrice(String minPrice, String maxPrice) {
        dogsPage.fillMinAndMaxPrice(minPrice, maxPrice);
    }

    @And("^Change min age (.*) and max age (.*)$")
    public void changeMinAgeAndMaxAge(String minAge, String maxAge) {
        dogsPage.fillMinAndMaxAge(minAge, maxAge);
    }

    @And("Press submit button")
    public void pressSubmitButton() {
        dogsPage.pressSearchButton();
    }
}
