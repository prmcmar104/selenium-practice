package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestDragAndDrop extends Utility {

    String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dragAndDropExample(){

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
