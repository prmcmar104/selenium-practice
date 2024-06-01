package javascriptexecutor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class JavaScriptExecutorTest extends Utility {
    String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void executeJavaScriptFunction() throws InterruptedException {
        //Accept the cookies
        clickOnElement(By.id("accept-choices"));
        //Switch to the frame
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        // Define the JavaScriptExecutor object reference
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Execute the function (On click function)
        js.executeScript("myFunction()");
        //Execute the script (How to Highlight the element)
        js.executeScript("arguments[0].style.border='6px solid blue'", driver.findElement(By.id("mySubmit")));
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
