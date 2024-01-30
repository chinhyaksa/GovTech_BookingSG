package pages;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.List;

public class BookingPage extends BasePage {
    public BookingPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//h1[@data-testid=\"service-title\"]")
    private WebElement serviceTitle;
    @FindBy(xpath = "//div[@data-testid=\"available-time\"]")
    private List<WebElement> availableTimeSlot;
    @FindBy(xpath = "//button[@data-testid=\"submit-button\"]")
    private WebElement confirmButton;
    @FindBy(xpath = "//h1[contains(text(),'Personal details')]")
    private WebElement personalDetailsTitle;
    @FindBy(xpath = "//button[@data-testid=\"submit-button\"]")
    private WebElement nextButton;
    @FindBy(xpath = "//h1[@data-testid=\"review-title\"]")
    private WebElement reviewTitle;
    @FindBy(xpath = "//button[@data-testid=\"submit-button\"]")
    private WebElement submitButton;
    @FindBy(xpath = "//h1[@data-testid=\"header-text\"]")
    private WebElement confirmedMessage;

    public void isServiceTitleDisplay(String value){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(serviceTitle)).isDisplayed();
        String title = serviceTitle.getText();
        Assert.assertEquals(title, value);
    }

    public void clickOnAvailableTimeSlot(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(serviceTitle)).isDisplayed();
        for (WebElement timeSlot : availableTimeSlot) {
            if (!timeSlot.isEnabled()){
                continue;
            }
            timeSlot.click();
            break;
        }
    }

    public void clickOnConfirmButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(confirmButton));
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", confirmButton);
        confirmButton.click();
    }

    public void clickOnNextButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(personalDetailsTitle));
        getWebDriverWait().until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void clickOnSubmitButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(reviewTitle));
        getWebDriverWait().until(ExpectedConditions.visibilityOf(submitButton));
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
    }

    public void isConfirmedMessageDisplayed(String message){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(confirmedMessage)).isDisplayed();
        String messageText = confirmedMessage.getText();
        Assert.assertEquals(messageText, message);
    }

}
