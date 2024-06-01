package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text to Element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

//************************* Alert Methods *****************************************************
    // Total 5 Method Need to create
    //1. switchToAlert
    //2. acceptAlert
    //3. dismissAlert
    //4. sendTextToAlert
    //5. getTextFromAlert

// *************************** Select Class Methods ***************************************//

    // 1. selectByValueFroDropDown(By by, String value)

    public void selectByValueFromDropDown(By by, String value){
        WebElement dropDown = driver.findElement(by);
        // Create the object of Select class
        Select select = new Select(dropDown);
        // Select by visible Text
        select.selectByValue(value);
    }
    // 2. selectByIndexFromDropDown(By by, int index)
    // 3. selectByVisibleTextFromDropDown(By by, String text)

    //*************************** Action Methods ***************************************//

}