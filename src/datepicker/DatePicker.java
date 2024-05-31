package datepicker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class DatePicker extends Utility {
    String baseUrl = "https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void selectDate() {
        String year = "2025";
        String month = "May";
        String date = "25";

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
