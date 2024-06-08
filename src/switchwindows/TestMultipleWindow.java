package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestMultipleWindow extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchMultipleWindowExample() {
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]"));

        //Get the parent window id
        String parentHandle = driver.getWindowHandle();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        //Convert Set into List
        List<String> hList = new ArrayList<>(handles);
        if (switchToRightWindow("Facebook", hList)) {
            System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
        }
        closeAllWindows(hList, parentHandle);
        switchToParentWindow(parentHandle);
        System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
