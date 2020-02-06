package selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumSetup {

    public static final String URL = "http://localhost/index.html";


    private WebDriver driver;

    @FindBy(id ="book")
    private WebElement bookButton;

    public void navToSelectService() {
        bookButton.click();
    }
}
