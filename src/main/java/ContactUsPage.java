import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ContactUsPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public ContactUsPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By getInTouchIcon = By.xpath("//div[@class=\"col-sm-12\"]//h2[@class=\"title text-center\"]");
    private By nameField = By.xpath("//input[@name=\"name\"]");
    private By emailField = By.xpath("//input[@data-qa=\"email\"]");
    private By subjectField = By.xpath("//input[@data-qa=\"subject\"]");
    private By messageField = By.xpath("//textarea[@data-qa=\"message\"]");
    private By submitButton = By.xpath("//input[@data-qa=\"submit-button\"]");
    private By successMessage = By.xpath("//div[@class=\"status alert alert-success\"]");
    private By homeButton = By.xpath("//a[@class=\"btn btn-success\"]");


    //Actions
    public ContactUsPage verifyingGetInTouchIcon() {
        driver.element().verifyThat(getInTouchIcon).isVisible().perform();
        return this;
    }
    public ContactUsPage fillName(String Name) {
        driver.element().type(nameField, Name);
        return this;
    }
    public ContactUsPage fillEmail(String Email) {
        driver.element().type(emailField, Email);
        return this;
    }
    public ContactUsPage fillSubject(String Subject){
        driver.element().type(subjectField, Subject);
        return this;
    }
    public ContactUsPage fillMessage(String Message) {
        driver.element().type(messageField, Message);
        return this;
    }
    public ContactUsPage clickOnSubmitButton() {
        driver.element().click(submitButton);
        return this;
    }
    public void clickOnButton(){
        driver.alert().acceptAlert();
    }
    public ContactUsPage clickOnHomeButton() {
        driver.element().click(homeButton);
        return this;
    }


    //Assertions
    @Step("Verify success message 'Success! Your details have been submitted successfully.' is visible")
    public ContactUsPage verifySuccessMessage() {
        driver.element().verifyThat(successMessage).isVisible().perform();
        return this;
    }
}
