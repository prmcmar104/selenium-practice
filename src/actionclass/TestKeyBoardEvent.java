package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestKeyBoardEvent extends Utility {

    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void keyBoardExample() throws InterruptedException {
        Actions actions = new Actions(driver);
        //Without action class performing Control + a Key
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
//        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        Thread.sleep(3000);

        //Press control key and send c (Copy everything) and release control key
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        clickOnElement(By.id("name")); // Click on name input field
        //Press control key and send v then release control key
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
