package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jay Vaghani
 */
public class TestRelativeLocators extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() {
        // above

        // below

        // near

        // toRightOf

        // toLeftOf

        // Chaining the Relative Locators
        // Example using above and below locator
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}