package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestSlider extends Utility {

    String baseUrl = "https://jqueryui.com/resources/demos/slider/default.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void sliderExample(){

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
