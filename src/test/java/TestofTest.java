import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestofTest {

        @Test
        public void loginForum(){
            String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverpath);
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.forumcinemas.lv/");

            //login
            driver.findElement(By.xpath("//a[@class='btn btn-user btn-default']")).click();
            // driver.findElement(By.linkText("btn btn-user btn-default")).click();

            // JavascriptExecutor jse = (JavascriptExecutor)driver;
            // jse.executeScript("window.scrollBy(0,1000)");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // driver.findElement(By.linkText("Apstiprināt")).click();
            driver.findElement(By.xpath("//button[@type='submit']")).click();

        }
    }




