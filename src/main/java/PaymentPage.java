import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class PaymentPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public PaymentPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By nameOnCardField = By.xpath("//input[@name=\"name_on_card\"]");
    private By cardNumberField = By.xpath("//input[@data-qa=\"card-number\"]");
    private By cvcField = By.xpath("//input[@data-qa=\"cvc\"]");
    private By expirationMonthField = By.xpath("//input[@class=\"form-control card-expiry-month\"]");
    private By expirationYearField = By.xpath("//input[@name=\"expiry_year\"]");
    private By payAndConfirmOrderButton = By.xpath("//button[@class=\"form-control btn btn-primary submit-button\"]");
    private By successMessage = By.xpath("//p[@style=\"font-size: 20px; font-family: garamond;\"]");
    private By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]");
    private By accountDeletedIcon = By.xpath("//h2[@data-qa=\"account-deleted\"]");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By downloadInvoiceButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");


    //Actions
    public PaymentPage fillNameOnCardField(String Input) {
        driver.element().type(nameOnCardField, Input);
        return this;
    }
    public PaymentPage fillCardNumberField(String Input) {
        driver.element().type(cardNumberField, Input);
        return this;
    }
    public PaymentPage fillCvcField(String Input) {
        driver.element().type(cvcField, Input);
        return this;
    }
    public PaymentPage fillExpirationMonthField(String Input) {
        driver.element().type(expirationMonthField, Input);
        return this;
    }
    public PaymentPage fillExpirationYearField(String Input) {
        driver.element().type(expirationYearField, Input);
        return this;
    }
    public PaymentPage clickOnPayAndConfirmOrderButton() {
        driver.element().click(payAndConfirmOrderButton);
        return this;
    }
    public PaymentPage verifyingSuccessMessage() {
        driver.element().verifyThat(successMessage).isVisible().perform();
        return this;
    }
    public PaymentPage clickOnDeleteAccountButton() {
        driver.element().click(deleteAccountButton);
        return this;
    }
    public PaymentPage clickOnContinueButton() {
        driver.element().click(continueButton);
        return this;
    }
    public PaymentPage clickOnDownloadInvoiceButton() {
        driver.element().click(downloadInvoiceButton);
        return this;
    }


    //Assertions
    @Step("ACCOUNT DELETED!")
    public PaymentPage verifyingAccountDeletedIcon() {
        driver.element().verifyThat(accountDeletedIcon).isVisible().perform();
        return this;
    }

}
