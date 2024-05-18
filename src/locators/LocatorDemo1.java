package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo1 {
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        // 1. Setup Browser
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URl into Browser
        driver.get(baseUrl);
        // Maximise the Browser window
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2. Find the Element using ID and Name Locator
        WebElement searchBox =  driver.findElement(By.id("small-searchterms"));

        // Name Locators
        WebElement searchBoxWithName = driver.findElement(By.name("Q"));


        //3 Action on Element
        searchBoxWithName.sendKeys("Mobile");


    }
}
