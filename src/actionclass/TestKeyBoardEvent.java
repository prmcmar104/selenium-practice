package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
