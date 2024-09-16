import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CartPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public CartPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By subscriptionIcon = By.xpath("//div[@class=\"single-widget\"]");
    private By subscriptionBar = By.xpath("//input[@id=\"susbscribe_email\"]");
    private By arrowButton = By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]");
    private By successMessage = By.xpath("//div[@class=\"alert-success alert\"]");
    private By product_1Name = By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_description\"]");
    private By product_2Name = By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_description\"]");
    private By product_1Price = By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_price\"]");
    private By product_1Quantity = By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_quantity\"]");
    private By product_1TotalPrice = By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_total\"]");
    private By product_2Price = By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_price\"]");
    private By product_2Quantity = By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_quantity\"]");
    private By product_2TotalPrice = By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_total\"]");
    private By productQuantity = By.xpath("//tr[@id=\"product-8\"]//td[@class=\"cart_quantity\"]");
    private By proceedToCheckoutButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private By registerLoginButton = By.xpath("//p[@class=\"text-center\"]//a[@href=\"/login\"]");
    private By removeProductButton = By.xpath("//a[@class=\"cart_quantity_delete\"]");
    private By cartEmptyMessage = By.xpath("//p[@class=\"text-center\"]");
    private By productName = By.xpath("//tr[@id=\"product-8\"]//td[@class=\"cart_description\"]");
    private By signUpButton = By.xpath("//a[@href=\"/login\"]");
    private By imgIcon = By.xpath("//img[@src=\"/static/images/home/logo.png\"]");
    private By recommendedProductName = By.xpath("//tr[@id=\"product-4\"]//td[@class=\"cart_description\"]");


    //Actions
    public CartPage verifyingSubscriptionIcon() {
        driver.element().verifyThat(subscriptionIcon).isVisible().perform();
        return this;
    }
    public CartPage fillSubscriptionBar(String email) {
        driver.element().type(subscriptionBar, email);
        return this;
    }
    public CartPage clickOnArrowButton() {
        driver.element().click(arrowButton);
        return this;
    }
    public CartPage verifyingProduct_1Name() {
        driver.element().verifyThat(product_1Name).exists().withCustomReportMessage("Blue Top").perform();
        return this;
    }
    public CartPage verifyingProduct_2Name() {
        driver.element().verifyThat(product_2Name).exists().withCustomReportMessage("Men Tshirt").perform();
        return this;
    }
    public CartPage verifyingProduct_1Price() {
        driver.element().verifyThat(product_1Price).exists().withCustomReportMessage("500").perform();
        return this;
    }
    public CartPage verifyingProduct_1Quantity() {
        driver.element().verifyThat(product_1Quantity).exists().withCustomReportMessage("1").perform();
        return this;
    }
    public CartPage verifyingProduct_1TotalPrice() {
        driver.element().verifyThat(product_1TotalPrice).exists().withCustomReportMessage("500").perform();
        return this;
    }
    public CartPage verifyingProduct_2Price() {
        driver.element().verifyThat(product_2Price).exists().withCustomReportMessage("400").perform();
        return this;
    }
    public CartPage verifyingProduct_2Quantity() {
        driver.element().verifyThat(product_2Quantity).exists().withCustomReportMessage("1").perform();
        return this;
    }
    public CartPage clickOnProceedToCheckoutButton() {
        driver.element().click(proceedToCheckoutButton);
        return this;
    }
    public CartPage clickOnRegisterLoginButton() {
        driver.element().click(registerLoginButton);
        return this;
    }
    public CartPage clickOnRemoveProductButton() {
        driver.element().click(removeProductButton);
        return this;
    }
    public CartPage clickOnSignUpButton() {
        driver.element().click(signUpButton);
        return this;
    }
    public CartPage clickOnImgIcon() {
        driver.element().click(imgIcon);
        return this;
    }




    //Assertions
    @Step("Verify success message 'You have been successfully subscribed!' is visible")
    public CartPage verifyingSuccessMessage() {
        driver.element().verifyThat(successMessage).isVisible().perform();
        return this;
    }
    @Step("Verify the added Products prices, quantity and total price")
    public CartPage verifyingProduct_2TotalPrice() {
        driver.element().verifyThat(product_2TotalPrice).exists().withCustomReportMessage("400").perform();
        return this;
    }
    @Step("Verify that product is displayed in cart page with exact quantity")
    public CartPage verifyingProductQuantity() {
        driver.element().verifyThat(productQuantity).exists().withCustomReportMessage("4").perform();
        return this;
    }
    @Step("Verify that product is removed from the cart")
    public CartPage verifyingCartIsEmptyMessage() {
        driver.element().verifyThat(cartEmptyMessage).isVisible().perform();
        return this;
    }
    @Step("Verify that those products are visible in cart after login as well")
    public CartPage verifyingProductName() {
        driver.element().verifyThat(productName).exists().withCustomReportMessage("Fancy Green Top").perform();
        return this;
    }
    @Step("Verify that product is displayed in cart page")
    public CartPage verifyingRecommendedProductName() {
        driver.element().verifyThat(recommendedProductName).exists().withCustomReportMessage("Stylish Dress").perform();
        return this;
    }

}
