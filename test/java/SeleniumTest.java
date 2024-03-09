import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumTest {
    private WebDriver driver;

    @Test
    public void testEasy(){
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        assertEquals(title,"Test Automation University | Applitools");
    }

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
