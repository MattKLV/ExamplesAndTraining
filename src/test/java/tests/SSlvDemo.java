package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSlvDemo {

    @Test
    public void suniUnKuceni(){
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("100");
        driver.findElement(By.id("f_o_8_max")).sendKeys("200");
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("5");

    }

    @Test
    public void carsTest(){
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");

        driver.findElement(By.id("mtd_97")).click();

        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");

        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");

        Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
        yearMin.selectByVisibleText("2001");

        Select engineMax = new Select(driver.findElement(By.id("f_o_15_max")));
        engineMax.selectByVisibleText("3.0");

        Select carColour = new Select(driver.findElement(By.id("f_o_17")));
        carColour.selectByValue("6118");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();



    }
}
