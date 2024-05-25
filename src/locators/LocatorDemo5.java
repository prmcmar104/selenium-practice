package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo4() {
        // Relative Xpath
        //tagName[@attribute='value']
//        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        // xpath with or
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Mobile");

        // xpath with and
        driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']"))
                .sendKeys("Mobile");

        // xpath with starts-with
        //tagName[starts-with(@attribute, 'value')]
        driver.findElement(By.xpath("//input[starts-with(@id, 'sma')]")).sendKeys("Mobile");

        // xpath with contains()
        //tagName[contains(@attribute, 'value')]
        //input[contains(@id, 'terms')]

        //xpath with text()
        //tagName[text() = 'Value']
        driver.findElement(By.xpath("//a[text() = 'Log in']")).click();

        // xpath with chained
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();


    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
