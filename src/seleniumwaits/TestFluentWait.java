package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utilities.Utility;

import java.time.Duration;
import java.util.function.Function;

/**
 * Created by Jay Vaghani
 */
public class TestFluentWait extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/waits-demo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void fluentWaitExample() {
        // Click on Consent Button
        clickOnElement(By.xpath("//button[@aria-label='Consent']"));

        // Click on AddTextBox1 Button
        clickOnElement(By.id("btn2"));

        //Use Fluent wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement textBox2Field = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("txt2"));
            }
        });

        textBox2Field.sendKeys("Prime");

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
