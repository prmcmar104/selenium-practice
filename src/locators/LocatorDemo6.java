package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo6 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo6() {
        // CSS selector Tag and ID
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");



    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
