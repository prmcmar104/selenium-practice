package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestDropDownList extends Utility {

    String baseUrl = "https://www.redbus.in/Cancellation";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExampleWithList() {

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
