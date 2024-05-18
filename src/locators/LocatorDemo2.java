package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 {

        static String baseUrl = "https://demo.nopcommerce.com/";

        public static void main(String[] args){
            // 1. Setup Browser
            // Launch the Chrome Browser
            WebDriver driver = new ChromeDriver();
            // Open the URl into Browser
            driver.get(baseUrl);
            // Maximise the Browser window
            driver.manage().window().maximize();
            // We give Implicit wait to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Link Text Locator
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();

            //Find Email Field Element
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("Prime123@gmail.com");

            //Find Password Field Element
            WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("Prime123");

        }
}
