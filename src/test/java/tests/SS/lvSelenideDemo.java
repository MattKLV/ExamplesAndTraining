package tests.SS;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CatsPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class lvSelenideDemo {

    CatsPage catsPage =  new CatsPage();

    @Test
    public void kakeni(){
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.lv");
        $(By.id("mtd_301")).click();
        catsPage.fillMinAndMaxAge("1", "2");
        catsPage.fillMinAndMaxPrice("10", "500");
        catsPage.pressSearchButton();

    }
}
