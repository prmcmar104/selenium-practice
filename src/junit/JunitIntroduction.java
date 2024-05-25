package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JunitIntroduction {

    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeDBConnection(){
        System.out.println("close DB connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Opening the browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing the Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login Page");
        Assert.assertTrue(true);
    }

    @Test
    public void test(){
        System.out.println("Test Method");
        Assert.assertEquals("Prime", "prime");
    }
}
