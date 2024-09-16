import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase12AddProductsInCart {
    private SHAFT.GUI.WebDriver driver ;

    private SHAFT.TestData.JSON testData;

    @BeforeClass
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/TestsData.Json");
    }

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Verify the added Products prices, quantity and total price")
    private void validateLogin(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .verifyingAutomationExerciseIcon()
                .clickOnProductsButton();
        new ProductsAndProductDetailPage(driver).clickOnAddToCartButton1()
                .clickOnContinueShoppingButton()
                .clickOnAddToCartButton2()
                .clickOnViewCartButton();
        new CartPage(driver).verifyingProduct_1Name()
                .verifyingProduct_2Name()
                .verifyingProduct_1Price()
                .verifyingProduct_1Quantity()
                .verifyingProduct_1TotalPrice()
                .verifyingProduct_2Price()
                .verifyingProduct_2Quantity()
                .verifyingProduct_2TotalPrice();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
