package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo7 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo7() {
        //Click on consent tab
        driver.findElement(By.xpath("//p[text()='Consent']")).click();
        //Self --- Select the Current Node
        String text = driver.findElement(By.xpath("//a[contains(text(),'DLF Ltd.')]/self::a")).getText();
        System.out.println(text);  // DLF Ltd.

        //Parent  --- Selection the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'DLF Ltd.')]/parent::td")).getText();
        System.out.println(text);  // DLF Ltd.

        //Child --- Select the children of current node (one or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(),'DLF Ltd.')]/ancestor::tr/child::td"));
        System.out.println("Number of children " + children.size()); // 6

        // Ancestor --- Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'DLF Ltd.')]/ancestor::tr")).getText();
        System.out.println(text); // DLF Ltd. A 802.15 816.60 + 1.80 Buy  |  Sell

        //Descendant -- Select all descendants (children, grand children etc)
        //a[contains(text(),'DLF Ltd.')]/ancestor::tr/descendant::*

        // Following  -- Select everything in document after the closing tag of the current node
        //a[contains(text(),'DLF Ltd.')]/ancestor::tr/following::tr

        // Following-Sibling  -- Select all siblings after the current node
        //a[contains(text(),'DLF Ltd.')]/ancestor::tr/following-sibling::tr

        // Preceding -- Select all nodes that appear before the current node in the document
        //a[contains(text(),'DLF Ltd.')]/ancestor::tr/preceding::tr

        // Preceding-sibling -- Select all siblings before the current node

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
