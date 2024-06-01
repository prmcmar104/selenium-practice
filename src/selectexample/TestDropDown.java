package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample() {
        WebElement dropDown = driver.findElement(By.name("country"));
        // Create the object of Select class
        Select select = new Select(dropDown);
        // Select by visible Text
        select.selectByVisibleText("Australia");
        //Select by Value
        select.selectByValue("Ghana");
        // Select By Index
        select.selectByIndex(5);

//        selectByValueFromDropDown(By.name("country"),"Ghana");

        // Get all options
        List<WebElement> allOptions = select.getOptions();
        System.out.println("Total country : " + allOptions.size());
        for (WebElement option : allOptions){
            System.out.println(option.getText());
        }



    }

    @After
    public void tearDown() {

    }
}
