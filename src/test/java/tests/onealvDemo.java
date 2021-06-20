package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class onealvDemo {

    @Test
    public void oneaLapa() {
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");
        driver.manage().window().maximize();
        driver.findElement(By.id("q")).sendKeys("Lenovo");
    }
}