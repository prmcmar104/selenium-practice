package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
