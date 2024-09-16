import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase13VerifyProductQuantityInCart {
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

    @Test(description = " Verify that product is displayed in cart page with exact quantity")
    private void verifyingProductQuantity(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .verifyingAutomationExerciseIcon()
                .clickOnProductsButton();
        new ProductsAndProductDetailPage(driver).fillSearchBar(testData.getTestData("productData['productName']"))
                .clickOnSearchBarButton()
                .clickOnViewGreenTop()
                .increaseQuantity(testData.getTestData("productData['productQuantity']"))
                .clickOnAddToCartGreenTopInside()
                .clickOnViewCartButton();
        new CartPage(driver).verifyingProductQuantity();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
