package pages;

import com.codeborne.selenide.Configuration;
import helpers.Common;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private final By dogsTab = By.id("mtd_300");
    private final By carsTab = By.id("mtd_97");

    public void openHomePage(){
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        open("https://www.ss.lv");
    }

    public void openSpecificTab(String tabName){
        if ("Dogs".equals(tabName)) {
            $(dogsTab).click();
        } else if ("Cars".equals(tabName)) {
            $(carsTab).click();
        }

    }

}
