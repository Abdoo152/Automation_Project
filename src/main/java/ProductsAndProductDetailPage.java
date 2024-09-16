import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductsAndProductDetailPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public ProductsAndProductDetailPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By allProductsIcon = By.xpath("//h2[@class=\"title text-center\"]");
    private By productsList = By.xpath("//div[@class=\"features_items\"]");
    private By viewProductButton1 = By.xpath("//a[@href=\"/product_details/1\"]");
    private By productDetails = By.xpath("//div[@class=\"product-information\"]");
    private By searchBar = By.xpath("//input[@name=\"search\"]");
    private By searchBarButton = By.xpath("//button[@id=\"submit_search\"]");
    private By searchedProducts = By.xpath("//h2[@class=\"title text-center\"]");
    private By viewProductButton2 = By.xpath("//a[@href=\"/product_details/2\"]");
    private By relatedProducts = By.xpath("//div[@class=\"product-image-wrapper\"]");
    private By addToCartButton1 = By.xpath("//div[@class=\"productinfo text-center\"]//a[@data-product-id=\"1\"]");
    private By continueShoppingButton = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
    private By addToCartButton2 = By.xpath("//div[@class=\"productinfo text-center\"]//a[@data-product-id=\"2\"]");
    private By viewCartButton = By.xpath("//p[@class=\"text-center\"]//a[@href=\"/view_cart\"]");
    private By viewGreenTop = By.xpath("//a[@href=\"/product_details/8\"]");
    private By quantityField = By.xpath("//input[@name=\"quantity\"]");
    private By addToCartGreenTopInside = By.xpath("//button[@class=\"btn btn-default cart\"]");
    private By addToCartButton = By.xpath("//div[@class=\"productinfo text-center\"]//a[@data-product-id=\"8\"]");
    private By cartButton = By.xpath("//a[@href=\"/view_cart\"]//i[@class=\"fa fa-shopping-cart\"]");
    private By brandsBar = By.xpath("//div[@class=\"brands_products\"]");
    private By poloBrandButton = By.xpath("//a[@href=\"/brand_products/Polo\"]");
    private By searchProductsIcon = By.xpath("//h2[@class=\"title text-center\"]");
    private By addGreenTopToCart = By.xpath("//div[@class=\"productinfo text-center\"]//a[@data-product-id=\"8\"]");
    private By writeYourReviewIcon = By.xpath("//a[@data-toggle=\"tab\"]");
    private By yourNameField = By.xpath("//input[@id=\"name\"]");
    private By yourEmailAddressField = By.xpath("//input[@id=\"email\"]");
    private By reviewField = By.xpath("//textarea[@name=\"review\"]");
    private By submitButton = By.xpath("//button[@id=\"button-review\"]");
    private By successMessageForReview = By.xpath("//span[@style=\"font-size: 20px;\"]");


    //Actions
    public ProductsAndProductDetailPage verifyingAllProductsIcon() {
        driver.element().verifyThat(allProductsIcon).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage verifyingProductsList() {
        driver.element().verifyThat(productsList).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage clickViewProductButton() {
        driver.element().click(viewProductButton1);
        return this;
    }
    public ProductsAndProductDetailPage fillSearchBar(String productName) {
        driver.element().type(searchBar, productName);
        return this;
    }
    public ProductsAndProductDetailPage clickOnSearchBarButton() {
        driver.element().click(searchBarButton);
        return this;
    }
    public ProductsAndProductDetailPage verifyingSearchedProducts() {
        driver.element().verifyThat(searchedProducts).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage clickViewProductButton2() {
        driver.element().click(viewProductButton2);
        return this;
    }
    public ProductsAndProductDetailPage clickOnAddToCartButton1() {
        driver.element().click(addToCartButton1);
        return this;
    }
    public ProductsAndProductDetailPage clickOnContinueShoppingButton() {
        driver.element().click(continueShoppingButton);
        return this;
    }
    public ProductsAndProductDetailPage clickOnAddToCartButton2() {
        driver.element().click(addToCartButton2);
        return this;
    }
    public ProductsAndProductDetailPage clickOnViewCartButton() {
        driver.element().click(viewCartButton);
        return this;
    }
    public ProductsAndProductDetailPage clickOnViewGreenTop() {
        driver.element().click(viewGreenTop);
        return this;
    }
    public ProductsAndProductDetailPage increaseQuantity(String quantity) {
        driver.element().type(quantityField, quantity);
        return this;
    }
    public ProductsAndProductDetailPage clickOnAddToCartGreenTopInside() {
        driver.element().click(addToCartGreenTopInside);
        return this;
    }
    public ProductsAndProductDetailPage clickOnAddToCartButton() {
        driver.element().click(addToCartButton);
        return this;
    }
    public ProductsAndProductDetailPage clickOnCartButton() {
        driver.element().click(cartButton);
        return this;
    }
    public ProductsAndProductDetailPage verifyingBrandsBar() {
        driver.element().verifyThat(brandsBar).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage clickOnPoloBrandButton() {
        driver.element().click(poloBrandButton);
        return this;
    }
    public ProductsAndProductDetailPage verifyingSearchProductsIcon() {
        driver.element().verifyThat(searchProductsIcon).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage clickAddGreenTopToCart() {
        driver.element().click(addGreenTopToCart);
        return this;
    }
    public ProductsAndProductDetailPage verifyingWriteYourReviewIcon() {
        driver.element().verifyThat(writeYourReviewIcon).isVisible().perform();
        return this;
    }
    public ProductsAndProductDetailPage fillYourNameField(String Name) {
        driver.element().type(yourNameField, Name);
        return this;
    }
    public ProductsAndProductDetailPage fillEmailField(String EmailAddress) {
        driver.element().type(yourEmailAddressField, EmailAddress);
        return this;
    }
    public ProductsAndProductDetailPage fillReviewField(String Review) {
        driver.element().type(reviewField, Review);
        return this;
    }
    public ProductsAndProductDetailPage clickSubmitButton() {
        driver.element().click(submitButton);
        return this;
    }


    //Assertions
    @Step("Verify that Product detail is visible")
    public ProductsAndProductDetailPage verifyingProductDetails() {
        driver.element().verifyThat(productDetails).isVisible().perform();
        return this;
    }
    @Step(" Verify all the products related to search are visible")
    public ProductsAndProductDetailPage verifyingRelatedProducts() {
        driver.element().verifyThat(relatedProducts).isVisible().perform();
        return this;
    }
    @Step("Verify success message 'Thank you for your review")
    public ProductsAndProductDetailPage verifyingSuccessMessageForReview() {
        driver.element().verifyThat(successMessageForReview).isVisible().perform();
        return this;
    }
}
