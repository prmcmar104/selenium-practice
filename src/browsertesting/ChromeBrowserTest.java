package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the URl into Browser
        driver.get(baseUrl);
        // Maximise the Browser window
        driver.manage().window().maximize();

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("The tile of the page :" + title);

        // Get Current Url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url :" + currentUrl);

        // Get Page Source
        System.out.println("The source :" + driver.getPageSource());

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        // Navigate Back
        driver.navigate().back();
        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        Thread.sleep(5000);

        // Refresh the page
        driver.navigate().refresh();

        // Forward the page
        driver.navigate().forward();
        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        // Close the Browser
//        driver.quit();
    }
}
