package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find the login link element and click on login link element
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));
        String expectedText = "Welcome, Please Sign In!";
        /*WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();*/
        String actualText = getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        //Find the Login Link and Click on login link element
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));
        //Find the Email Field Element and Type the Email address to email field
        /*WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@gmail.com");*/
        sendTextToElement(By.id("Email"), "Prime123@gmail.com");
        // Find the password field and Type the password into password field
//        driver.findElement(By.name("Password")).sendKeys("Prime123");
        sendTextToElement(By.name("Password"), "Prime123");
        // Find Login btn Element and click
        //driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        clickOnElement(By.xpath("//button[text() = 'Log in']"));

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class = 'message-error validation-summary-errors']"));
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
