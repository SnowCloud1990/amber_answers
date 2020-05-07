package radioButtons;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import static java.lang.Thread.sleep;

public class radioButtonsTest {
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    @Test
    public void radioButtons() throws InterruptedException {
        driver.get("https://antycaptcha.amberteam.pl/exercises/exercise4?seed=97605f08-f93c-4908-9f8c-a72bbd0174f9");
        driver.manage().window().setSize(new Dimension(1440, 797));
        //sleeps are not perfect but do the trick
        driver.findElement(By.xpath(("//input.........;4hj[@value='v80']"))).click();
        sleep(1000);
        driver.findElement(By.xpath(("//input[@value='v61']"))).click();
        sleep(1000);
        driver.findElement(By.xpath(("//input[@value='v42']"))).click();
        sleep(1000);
        driver.findElement(By.xpath(("//input[@value='v53']"))).click();
        sleep(2000);
        driver.findElement(By.id("solution")).click();
    }
}
