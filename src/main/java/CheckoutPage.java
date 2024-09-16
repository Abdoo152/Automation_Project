import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CheckoutPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public CheckoutPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By addressDetails = By.xpath("//div[@class=\"checkout-information\"]");
    private By reviewYourOrder = By.xpath("//div[@class=\"table-responsive cart_info\"]");
    private By descriptionField = By.xpath("//textarea[@class=\"form-control\"]");
    private By placeOrderButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private By yourAddressDelivery = By.xpath("//ul[@id=\"address_delivery\"]");
    private By yourBillingAddress = By.xpath("//ul[@id=\"address_invoice\"]");
    private By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]");


    //Actions
    public CheckoutPage verifyingAddressDetails() {
        driver.element().verifyThat(addressDetails).isVisible().perform();
        return this;
    }
    public CheckoutPage verifyingReviewYourOrder() {
        driver.element().verifyThat(reviewYourOrder).isVisible().perform();
        return this;
    }
    public CheckoutPage fillDescriptionField(String Input) {
        driver.element().type(descriptionField, Input);
        return this;
    }
    public CheckoutPage clickOnPlaceOrderButton() {
        driver.element().click(placeOrderButton);
        return this;
    }
    public CheckoutPage verifyingYourAddressDelivery() {
        driver.element().verifyThat(yourAddressDelivery).exists().withCustomReportMessage("Abdelrahman" + "Fares" +
                "Concentrix" + "Bulding no127" +
                "Third Floor" + "Giza" +
                "Dokki" + "98765" +
                "01001625895").perform();
        return this;
    }
    public CheckoutPage verifyingYourBillingAddress() {
        driver.element().verifyThat(yourBillingAddress).exists().withCustomReportMessage("Abdelrahman" + "Fares" +
                "Concentrix" + "address" +
                "address2" + "state" +
                "city" + "zipCode" +
                "mobileNumber").perform();
        return this;
    }
    public CheckoutPage clickOnDeleteAccountButton() {
        driver.element().click(deleteAccountButton);
        return this;
    }

}
