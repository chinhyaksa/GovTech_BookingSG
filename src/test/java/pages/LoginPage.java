package pages;

import core.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id=\"submit_btn\"]")
    private WebElement mockLoginButton;

    public void openBrowser(String value){
        switch (value) {
            case "Service 1" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/xYy8abAG/availability?");
            case "Service 2" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/3LywG3yZ/availability?");
            case "Service 3" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/wgyb9Qke/availability?");
            case "Service 4" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/8ayQDNko/availability?");
            case "Service 5" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/MgyXW0kr/availability?");
            case "Service 6" -> getWebDriver().get("https://www.tst.bookingsg.io/public/services/KmkZMapa/availability?");
        }
    }

    public void clickOnLoginButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(mockLoginButton)).isDisplayed();
        mockLoginButton.click();
    }

}
