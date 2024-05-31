package alertexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlertExample extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/alertsdemo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // Simple Alert
    @Test
    public void simpleAlertExample() {

    }

    // Confirmation Alert
    @Test
    public void conformationAlertExample()  {

    }

    // Prompt Alert
    @Test
    public void promptAlertExample()  {

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}