import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6ContactUs {
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

    @Test(description = "Verify success message 'Success! Your details have been submitted successfully.' is visible")
    private void verifySuccessMessage(){
        new HomePage(driver).navigateToURL(testData.getTestData("HomePageURL"))
                .clickOnContactUsButton();
        new ContactUsPage(driver).verifyingGetInTouchIcon()
                .fillName(testData.getTestData("contactData['name']"))
                .fillEmail(testData.getTestData("contactData['email']"))
                .fillMessage(testData.getTestData("contactData['message']"))
                .fillSubject(testData.getTestData("contactData['subject']"))
                .clickOnSubmitButton()
                .clickOnButton();
        new ContactUsPage(driver).verifySuccessMessage()
                .clickOnHomeButton();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
