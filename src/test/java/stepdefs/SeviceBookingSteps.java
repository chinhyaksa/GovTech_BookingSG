package stepdefs;

import core.Waiter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BookingPage;
import pages.LoginPage;
import pages.ViewBookingResultsPage;

import java.time.Duration;

public class SeviceBookingSteps {
    WebDriver driver;
    LoginPage loginPage;
    BookingPage bookingPage;
    ViewBookingResultsPage viewBookingResultsPage;

    @Given("^A user opens web browser navigate to (Service 1|Service 2|Service 3|Service 4|Service 5|Service 6) link$")
    public void aUserOpensWebBrowserNavigateToServiceLink(String value) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.openBrowser(value);
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Given("User clicks on login button")
    public void userClickOnLoginButton() {
        loginPage.clickOnLoginButton();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @When("^User switches to Service Booking modal have title is (Service 1|Service 2|Service 3|Service 4|Service 5|Service 6)$")
    public void userSwitchToServiceBookingModalHaveTitleIsService(String value) {
        bookingPage = new BookingPage(driver);
        bookingPage.isServiceTitleDisplay(value);
        Waiter.waitWithThreadInterrupt(3000);
    }

    @When("User chooses first available time slot and click on Confirm button")
    public void userChoosesFirstAvailableTimeSlotAndClickOnConfirmButton() {
        bookingPage.clickOnAvailableTimeSlot();
        Waiter.waitWithThreadInterrupt(3000);
        bookingPage.clickOnConfirmButton();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @When("User switches to Personal details modal and click on Next button")
    public void userSwitchToPersonalDetailsModalAndClickOnNextButton() {
        bookingPage.clickOnNextButton();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @When("User switches to Review modal and click on Submit button")
    public void userSwitchToReviewModalAndClickOnSubmitButton() {
        bookingPage.clickOnSubmitButton();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @When("^(Your booking has been confirmed) message is displayed$")
    public void yourBookingHasBeenConfirmedMessageIsDisplayed(String message) {
        bookingPage.isConfirmedMessageDisplayed(message);
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Then("User clicks on View your booking button")
    public void userClickOnViewYourBookingButtonAndVerifyBookingStatus() {
        viewBookingResultsPage = new ViewBookingResultsPage(driver);
        viewBookingResultsPage.clickOnViewBookingButton();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Then("^User verifies booking status as (Pending approval|Pending acceptance|Accepted)$")
    public void userVerifiesBookingStatusAsPendingApproval(String value) {
        viewBookingResultsPage.verifyBookingStatus(value);
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Then("User clicks on View your booking on Menu")
    public void userClicksOnViewYourBookingOnMenu() {
        viewBookingResultsPage = new ViewBookingResultsPage(driver);
        viewBookingResultsPage.clickOnViewBookingLinkText();
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Then("^Button (reschedule|cancel) is enabled$")
    public void buttonRescheduleIsEnabled(String value) {
        viewBookingResultsPage.isButtonEnable(value);
        Waiter.waitWithThreadInterrupt(3000);
    }

    @Then("User closes browser")
    public void userCloseBrowser() {
        driver.close();
    }

}
