package threeDots;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class threeDotsTest {
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void threeDotsTest() throws InterruptedException {
        driver.get("https://antycaptcha.amberteam.pl/exercises/exercise1?seed=d78c34d5-b7c1-4da4-a88f-9d8ea4069050");
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.findElement(By.id("btnButton2")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("btnButton2")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("btnButton1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("solution")).click();
    }
}