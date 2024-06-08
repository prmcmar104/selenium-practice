package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class Test {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.amazon.co.uk/";
        // Launch the Chrome Browser
       driver = new ChromeDriver();
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

        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//li[@aria-label='Dell']//i[@class='a-icon a-icon-checkbox']")).click();
        Thread.sleep(3000);
        /*List<WebElement> productList = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//h2/a/span"));
        System.out.println("Total products " + productList.size());
        for (WebElement e :productList){
            System.out.println(e.getText());
        }  */
        printAllProductName(By.xpath("//div[@data-cy='title-recipe']//h2/a/span"), "");
    }

    public static void printAllProductName(By by, String productName){
        List<WebElement> elementList = driver.findElements(by);
        for (WebElement e :elementList){
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase(productName)){
                e.click();
                break;
            }
        }
    }
}
