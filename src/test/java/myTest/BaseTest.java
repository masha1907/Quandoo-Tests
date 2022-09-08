package myTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RestaurantsColognePage;

public class BaseTest {

    protected WebDriver driver;
    protected RestaurantsColognePage restaurantsColognePage;


    @Before
    public void initialSetUp(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        restaurantsColognePage = new RestaurantsColognePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
