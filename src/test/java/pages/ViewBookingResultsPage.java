package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ViewBookingResultsPage extends BasePage{
    public ViewBookingResultsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[@data-testid=\"view-bookings\"]")
    private WebElement viewBookingButton;
    @FindBy(xpath = "//a[@data-testid=\"mobile-viewBookings\"]")
    private WebElement viewBookingLinkText;
    @FindBy(xpath = "//div[@data-testid=\"status-pill-6\"]")
    private WebElement bookingStatus;
    @FindBy(xpath = "//button[@data-testid=\"reschedule-button\"]")
    private WebElement rescheduleButton;
    @FindBy(xpath = "//button[@data-testid=\"cancel-button\"]")
    private WebElement cancelButton;

    public void clickOnViewBookingButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(viewBookingButton)).isDisplayed();
        viewBookingButton.click();
    }

    public void verifyBookingStatus(String value){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(bookingStatus)).isDisplayed();
        String status = bookingStatus.getText();
        Assert.assertEquals(status, value);
    }

    public void clickOnViewBookingLinkText(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(viewBookingLinkText)).isDisplayed();
        viewBookingLinkText.click();
    }

    public void isButtonEnable(String value){
        switch (value) {
            case "reschedule" -> {
                getWebDriverWait().until(ExpectedConditions.visibilityOf(rescheduleButton)).isDisplayed();
                rescheduleButton.isEnabled();
            }
            case "cancel" -> {
                getWebDriverWait().until(ExpectedConditions.visibilityOf(cancelButton)).isDisplayed();
                cancelButton.isEnabled();
            }
        }
    }
}
