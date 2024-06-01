package alertexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlertExample extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/alertsdemo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    // Simple Alert
    @Test
    public void simpleAlertExample() {
        clickOnElement(By.xpath("//button[@aria-label='Consent']")); // Click on consent button
        clickOnElement(By.id("alertBox"));  // Click on click me Button
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and Switch to alert
        System.out.println(alert.getText()); // Getting the text from alert
        alert.accept(); // Accepting the alert (Clicking on OK button)
    }

    // Confirmation Alert
    @Test
    public void conformationAlertExample()  {
        clickOnElement(By.xpath("//button[@aria-label='Consent']")); // Click on consent button
        clickOnElement(By.id("confirmBox"));  // Click on click me Button
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and Switch to alert
        System.out.println(alert.getText()); // Getting the text from alert
        alert.dismiss(); // Dismiss the alert
        System.out.println(getTextFromElement(By.id("output"))); // Print the message
    }

    // Prompt Alert
    @Test
    public void promptAlertExample()  {
        clickOnElement(By.xpath("//button[@aria-label='Consent']")); // Click on consent button
        clickOnElement(By.id("promptBox"));  // Click on click me Button
        Alert alert = driver.switchTo().alert(); // Creating alert object reference and Switch to alert
        System.out.println(alert.getText()); // Getting the text from alert
        alert.sendKeys("Prime");
        alert.accept(); // Accept the alert
        System.out.println(getTextFromElement(By.id("output"))); // Print the message

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}