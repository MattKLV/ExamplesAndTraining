package tests;

import helpers.Common;
import org.junit.Test;
import pages.DogsPage;
import pages.HomePage;

public class SSlvDemoPOM {

    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();

    @Test
    public void suniUnKuceni() {

        homePage.openHomePage();
        homePage.openSpecificTab("Dogs");
        dogsPage.fillMinAndMaxPrice("1", "1000");
        dogsPage.fillMinAndMaxAge("1", "10");
        dogsPage.pressSearchButton();


    }
}
