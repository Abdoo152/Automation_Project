import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase20SearchProductsAndVerifyCartAfterLogin {
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

    @Test(description = "Verify that those products are visible in cart after login as well")
    private void verifyingProductName(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .clickOnProductsButton();
        new ProductsAndProductDetailPage(driver).verifyingAllProductsIcon()
                .fillSearchBar(testData.getTestData("productData['productName']"))
                .clickOnSearchBarButton()
                .verifyingSearchedProducts()
                .verifyingRelatedProducts()
                .clickAddGreenTopToCart()
                .clickOnViewCartButton();
        new CartPage(driver).verifyingProductName()
                .clickOnSignUpButton();
        new RegisterUserPage(driver).verifyingNewUserSignupIcon()
                .fillName(testData.getTestData("userInfo['name']"))
                .fillEmailAddress(testData.getTestData("userInfo['emailAddress']"))
                .clickOnSignupButton()
                .verifyingEnterAccountInformationIcon()
                .fillTitle()
                .fillPassword(testData.getTestData("userInfo['password']"))
                .clickOnSignupForOurNewsletterCheckbox()
                .clickOnReceiveSpecialOffersFromOurPartnersCheckbox()
                .fillFirstName(testData.getTestData("userInfo['firstName']"))
                .fillLastName(testData.getTestData("userInfo['lastName']"))
                .fillCompany(testData.getTestData("userInfo['company']"))
                .fillAddress(testData.getTestData("userInfo['address']"))
                .fillAddress2(testData.getTestData("userInfo['address2']"))
                .fillState(testData.getTestData("userInfo['state']"))
                .fillCity(testData.getTestData("userInfo['city']"))
                .fillZipCode(testData.getTestData("userInfo['zipCode']"))
                .fillMobileNumber(testData.getTestData("userInfo['mobileNumber']"))
                .clickOnCreateAccountButton()
                .verifyingAccountCreatedIcon()
                .clickOnContinueButton();
        new HomePage(driver).clickOnLogoutButton();
        new LoginUserPage(driver).verifyingLoginToYourAccountIcon()
                .fillEmailAddress(testData.getTestData("userInfo['emailAddress']"))
                .fillPassword(testData.getTestData("userInfo['password']"))
                .clickOnLoginButton();
        new HomePage(driver).clickOnCartButton();
        new CartPage(driver).verifyingProductName();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
