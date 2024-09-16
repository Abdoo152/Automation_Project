import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase19ViewAndCartBrands {
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

    @Test(description = "Verify that user is navigated to that brand page and can see products")
    private void verifyingMadameBrandIcon(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .clickOnProductsButton();
        new ProductsAndProductDetailPage(driver).verifyingBrandsBar()
                .clickOnPoloBrandButton();
        new BrandPage(driver).verifyingPoloBrandIcon()
                .clickOnMadameBrandButton()
                .verifyingMadameBrandIcon();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
