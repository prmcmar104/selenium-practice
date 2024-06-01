package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDownList extends Utility {

    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExampleWithList() {
        // Click on practice link
        clickOnElement(By.partialLinkText("PRACTI"));
        List<WebElement> listOfElement = driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li/a"));
        for (WebElement e : listOfElement){
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase("Element Practice")){
                e.click();
                break;
            }
        }
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
