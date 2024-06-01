package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestMultipleElementsRelativeLocators extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() {
        List<WebElement> elementList = driver.findElements(RelativeLocator.with(By.tagName("label")).below(By.xpath("//h3[contains(text(),'Dummy Registration Form')]")));
        for ( WebElement e : elementList){
            System.out.println(e.getText());
        }

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
