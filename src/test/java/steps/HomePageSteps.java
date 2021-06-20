package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @And("Open Homepage")
    public void openHomepage() {
        homePage.openHomePage();
    }


    @When("^Open (Dogs|Cars) tab$")
    public void openTab(String tabName) { homePage.openSpecificTab(tabName); }
    }

