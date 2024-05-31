package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

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

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
