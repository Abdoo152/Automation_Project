import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase16PlaceOrder_LoginBeforeCheckout {
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

    @Test(description = "Verify 'ACCOUNT DELETED!' and click 'Continue' button")
    private void verifyingAccountDeletedIcon(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .verifyingAutomationExerciseIcon()
                .clickOnSignupLoginButton();
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
        new HomePage(driver).verifyingLoggedInUserNameIcon()
                .clickOnProductsButton();
        new ProductsAndProductDetailPage(driver).clickOnAddToCartButton1()
                .clickOnViewCartButton();
        new CartPage(driver).verifyingProduct_1Name()
                .clickOnProceedToCheckoutButton();
        new CheckoutPage(driver).verifyingAddressDetails()
                .verifyingReviewYourOrder()
                .fillDescriptionField(testData.getTestData("description"))
                .clickOnPlaceOrderButton();
        new PaymentPage(driver).fillNameOnCardField(testData.getTestData("billingData['nameOnCard']"))
                .fillCardNumberField(testData.getTestData("billingData['cardNumber']"))
                .fillCvcField(testData.getTestData("billingData['cvc']"))
                .fillExpirationMonthField(testData.getTestData("billingData['expirationMonth']"))
                .fillExpirationYearField(testData.getTestData("billingData['expirationYear']"))
                .clickOnPayAndConfirmOrderButton()
                .verifyingSuccessMessage()
                .clickOnDeleteAccountButton()
                .verifyingAccountDeletedIcon();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
