package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class SeleniumTest {

    private SeleniumSetup setup;

    private WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void seleniumTest() throws InterruptedException {
        this.driver.get("http://localhost");

        WebDriverWait wait = new WebDriverWait(driver,30);

        setup.navToSelectService();
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "http://localhost/select-service.html" );

    }

}
