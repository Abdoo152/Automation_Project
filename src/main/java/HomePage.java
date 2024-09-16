import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage {
    private SHAFT.GUI.WebDriver driver ;


    //Constructor
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By signupLoginButton = By.xpath("//a[@href=\"/login\"]//i[@class=\"fa fa-lock\"]");
    private By loggedInAsUserNameIcon = By.xpath("//i[@class=\"fa fa-user\"]");
    private By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]//i[@class=\"fa fa-trash-o\"]");
    private By accountDeletedIcon = By.xpath("//h2[@class=\"title text-center\"][@data-qa=\"account-deleted\"]");
    private By automationExerciseIcon = By.xpath("//img[@src=\"/static/images/home/logo.png\"][@alt=\"Website for automation practice\"]");
    private By logoutButton = By.xpath("//a[@href=\"/logout\"][@style=\"color:brown;\"]");
    private By loggedInUserNameIcon = By.xpath("//i[@class=\"fa fa-user\"]");
    private By contactUsButton = By.xpath("//a[@href=\"/contact_us\"]//i[@class=\"fa fa-envelope\"]");
    private By testCasesButton = By.xpath("//a[@href=\"/test_cases\"]//i[@class=\"fa fa-list\"]");
    private By productsButton = By.xpath("//a[@href=\"/products\"]//i[@class=\"material-icons card_travel\"]");
    private By subscriptionIcon = By.xpath("//div[@class=\"single-widget\"]");
    private By subscriptionBar = By.xpath("//input[@id=\"susbscribe_email\"]");
    private By arrowButton = By.xpath("//button[@type=\"submit\"]");
    private By successMessage = By.xpath("//div[@class=\"alert-success alert\"]");
    private By cartButton = By.xpath("//a[@href=\"/view_cart\"]//i[@class=\"fa fa-shopping-cart\"]");
    private By viewProductButton = By.xpath("//ul[@class=\"nav nav-pills nav-justified\"]//a[@href=\"/product_details/1\"]");
    private By categoryBar = By.xpath("//div[@class=\"left-sidebar\"]");
    private By womenButton = By.xpath("//a[@href=\"#Women\"]");
    private By dressButton = By.xpath("//a[@href=\"/category_products/1\"]");
    private By recommendedItemsIcon = By.xpath("//div[@class=\"recommended_items\"]//h2[@class=\"title text-center\"]");
    private By addRecommendedProductToCart = By.xpath("//div[@class=\"recommended_items\"]//a[@data-product-id=\"4\"]");
    private By viewCartButton = By.xpath("//p[@class=\"text-center\"]//a[@href=\"/view_cart\"]");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By upwardArrowButton = By.xpath("//i[@class=\"fa fa-angle-up\"]");
    private By homeButton = By.xpath("//a[@style=\"color: orange;\"]");
    private By verifyingText = By.xpath("//section[@id=\"slider\"]");



    //Actions
    public HomePage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this;
    }
    public HomePage verifyingAutomationExerciseIcon() {
        driver.element().verifyThat(automationExerciseIcon).isVisible().perform();
        return this;
    }
    public HomePage clickOnSignupLoginButton() {
        driver.element().click(signupLoginButton);
        return this;
    }
    public HomePage verifyingLoggedInAsUserNameIcon(){
        driver.element().verifyThat(loggedInAsUserNameIcon).isVisible().perform();
        return this;
    }
    public HomePage clickOnDeleteAccount() {
        driver.element().click(deleteAccountButton);
        return this;
    }
    public HomePage clickOnLogoutButton() {
        driver.element().click(logoutButton);
        return this;
    }
    public HomePage verifyingLoggedInUserNameIcon() {
        driver.element().verifyThat(loggedInUserNameIcon).isVisible().perform();
        return this;
    }
    public HomePage clickOnContactUsButton() {
        driver.element().click(contactUsButton);
        return this;
    }
    public HomePage clickOnTestCasesButton() {
        driver.element().click(testCasesButton);
        return this;
    }
    public HomePage clickOnProductsButton() {
        driver.element().click(productsButton);
        return this;
    }
    public HomePage verifyingSubscriptionIcon() {
        driver.element().verifyThat(subscriptionIcon).isVisible().perform();
        return this;
    }
    public HomePage fillSubscriptionBar(String email) {
        driver.element().type(subscriptionBar, email);
        return this;
    }
    public HomePage clickOnArrowButton() {
        driver.element().click(arrowButton);
        return this;
    }
    public HomePage clickOnCartButton() {
        driver.element().click(cartButton);
        return this;
    }
    public HomePage clickOnViewProductButton() {
        driver.element().click(viewProductButton);
        return this;
    }
    public HomePage verifyingCategoryBar() {
        driver.element().verifyThat(categoryBar).isVisible().perform();
        return this;
    }
    public HomePage clickOnWomenButton() {
        driver.element().click(womenButton);
        return this;
    }
    public HomePage clickOnDressButton() {
        driver.element().click(dressButton);
        return this;
    }
    public HomePage verifyingRecommendedItemsIcon() {
        driver.element().verifyThat(recommendedItemsIcon).isVisible().perform();
        return this;
    }
    public HomePage clickOnAddRecommendedProductToCart() {
        driver.element().click(addRecommendedProductToCart);
        return this;
    }
    public HomePage clickOnViewCartButton() {
        driver.element().click(viewCartButton);
        return this;
    }
    public HomePage clickOnContinueButton() {
        driver.element().click(continueButton);
        return this;
    }
    public HomePage clickOnUpwardArrowButton() {
        driver.element().click(upwardArrowButton);
        return this;
    }
    public HomePage verifyingHomeButton() {
        driver.element().verifyThat(homeButton).isVisible().perform();
        return this;
    }




    //Assertions
    @Step("Verify that 'ACCOUNT DELETED!' is visible")
    public HomePage verifyingAccountDeletedIcon() {
        driver.element().verifyThat(accountDeletedIcon).isVisible().perform();
        return this;
    }

    @Step("Verify success message 'You have been successfully subscribed!' is visible")
    public HomePage verifyingSuccessMessage() {
        driver.element().verifyThat(successMessage).isVisible().perform();
        return this;
    }

    @Step("Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen")
    public HomePage verifyingText() {
        driver.element().verifyThat(verifyingText).exists().withCustomReportMessage("Full-Fledged practice website for Automation Engineers").perform();
        return this;
    }



}
