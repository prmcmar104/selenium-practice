package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://www.letskodeit.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo3() throws InterruptedException {
        //ID and name locators
        driver.findElement(By.id("email")).sendKeys("Prime123@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Prime123");

        //Link Text Locator
        driver.findElement(By.linkText("Forgot Password?")).click();

        // Partial link Text Locator
        driver.findElement(By.partialLinkText("ign")).click();

    }

    @After
    public void tearDown(){
//        closeBrowser();
    }
}
