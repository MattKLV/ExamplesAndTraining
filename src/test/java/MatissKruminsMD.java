import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MatissKruminsMD {

    @Test
    public void aliExpress() {
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        driver.findElement(By.id("search-key")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//input[@placeholder='min']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");

        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");

        driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();



    }

}
