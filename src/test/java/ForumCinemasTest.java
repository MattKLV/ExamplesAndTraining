import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForumCinemasTest {

    @Test
    public void loginForum(){
        String driverpath = "C:\\Users\\brood\\IdeaProjects\\Lekcija17\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.forumcinemas.lv/");

        //login
        //driver.findElement(By.linkText("Ienākt")).click();
        driver.findElement(By.xpath("//a[@href='/mypage/logon/?returnUrl=%252f']")).click();
        driver.findElement(By.id("input-userName")).sendKeys("nebayi2776@flmcat.com");
        driver.findElement(By.id("input-password")).sendKeys("tester123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        //driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER); btn btn-primary btn-block

        //change settings
        //driver.findElement(By.linkText("Tester")).click(); btn btn-user btn-default btn btn-primary btn-block
        driver.findElement(By.xpath("//a[@class='btn btn-user btn-default']")).click();
        driver.findElement(By.xpath("//a[@href='/mypage/profile/']")).click();
        driver.findElement(By.id("inputFirstName")).clear();
        driver.findElement(By.id("inputLastName")).clear();
        driver.findElement(By.id("inputFirstName")).sendKeys("Tester1");
        driver.findElement(By.id("inputLastName")).sendKeys("Tester2");

        //dropdowns
        // Select date = new Select(driver.findElement(By.id("bdDay")));
        // date.selectByIndex(26);
        //select[@id='bdDay']//option[@value='8']
        driver.findElement(By.xpath("//select[@id='bdDay']//option[@value='8']")).click();
        //Select month = new Select(driver.findElement(By.id("bdMonth")));
        //month.selectByIndex(5);
        driver.findElement(By.xpath("//select[@id='bdMonth']//option[@value='5']")).click();
        //Select year = new Select(driver.findElement(By.id("bdYear")));
        //year.selectByVisibleText("1994");
        driver.findElement(By.xpath("//select[@id='bdYear']//option[@value='1994']")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");

        //driver.findElement(By.linkText("Apstiprināt")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        driver.quit();

    }
}


