import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterUserPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public RegisterUserPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By newUserSignupIcon = By.xpath("//div[@class=\"signup-form\"]");
    private By loginToYourAccountIcon = By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]");
    private By nameField = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By emailAddressField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By enterAccountInformationIcon = By.xpath("//div[@class=\"login-form\"]");
    private By titleField = By.xpath("//input[@value=\"Mr\"]");
    private By passwordField = By.xpath("//input[@type=\"password\"]");
    private By signupForOurNewsletterCheckbox = By.xpath("//input[@name=\"newsletter\"]");
    private By receiveSpecialOffersFromOurPartnersCheckbox = By.xpath("//input[@name=\"optin\"]");
    private By firstNameField = By.xpath("//input[@data-qa=\"first_name\"]");
    private By lastNameField = By.xpath("//input[@data-qa=\"last_name\"]");
    private By companyField = By.xpath("//input[@data-qa=\"company\"]");
    private By addressField = By.xpath("//input[@data-qa=\"address\"]");
    private By address2Field = By.xpath("//input[@data-qa=\"address2\"]");
    private By stateField = By.xpath("//input[@data-qa=\"state\"]");
    private By cityField = By.xpath("//input[@data-qa=\"city\"]");
    private By zipCodeField = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By mobileNumberField = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By createAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By accountCreatedIcon = By.xpath("//h2[@data-qa=\"account-created\"]");
    private By errorMessageIcon = By.xpath("//p[@style=\"color: red;\"]");


    //Actions
    public RegisterUserPage verifyingNewUserSignupIcon() {
        driver.element().verifyThat(newUserSignupIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage verifyingLoginToYourAccountIcon(){
        driver.element().verifyThat(loginToYourAccountIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage fillName(String name) {
        driver.element().type(nameField,name);
        return this;
    }
    public RegisterUserPage fillEmailAddress(String emailAddress) {
        driver.element().type(emailAddressField, emailAddress);
        return this;
    }
    public RegisterUserPage clickOnSignupButton() {
        driver.element().click(signupButton);
        return this;
    }
    public RegisterUserPage verifyingEnterAccountInformationIcon() {
        driver.element().verifyThat(enterAccountInformationIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage fillTitle() {
        driver.element().click(titleField);
        return this;
    }
    public RegisterUserPage fillPassword(String password) {
        driver.element().type(passwordField, password);
        return this;
    }
    public RegisterUserPage clickOnSignupForOurNewsletterCheckbox() {
        driver.element().click(signupForOurNewsletterCheckbox);
        return this;
    }
    public RegisterUserPage clickOnReceiveSpecialOffersFromOurPartnersCheckbox() {
        driver.element().click(receiveSpecialOffersFromOurPartnersCheckbox);
        return this;
    }
    public RegisterUserPage fillFirstName(String firstName) {
        driver.element().type(firstNameField, firstName);
        return this;
    }
    public RegisterUserPage fillLastName(String lastName) {
        driver.element().type(lastNameField, lastName);
        return this;
    }
    public RegisterUserPage fillCompany(String company) {
        driver.element().type(companyField, company );
        return this;
    }
    public RegisterUserPage fillAddress(String address) {
        driver.element().type(addressField, address);
        return this;
    }
    public RegisterUserPage fillAddress2(String address2) {
        driver.element().type(address2Field, address2);
        return this;
    }
    public RegisterUserPage fillState(String state) {
        driver.element().type(stateField, state);
        return this;
    }
    public RegisterUserPage fillCity(String city) {
        driver.element().type(cityField, city);
        return this;
    }
    public RegisterUserPage fillZipCode(String zipCode) {
        driver.element().type(zipCodeField, zipCode);
        return this;
    }
    public RegisterUserPage fillMobileNumber(String mobileNumber) {
        driver.element().type(mobileNumberField, mobileNumber);
        return this;
    }
    public RegisterUserPage clickOnCreateAccountButton() {
        driver.element().click(createAccountButton);
        return this;
    }
    public RegisterUserPage clickOnContinueButton() {
        driver.element().click(continueButton);
        return this;
    }
    public RegisterUserPage verifyingAccountCreatedIcon() {
        driver.element().verifyThat(accountCreatedIcon).isVisible().perform();
        return this;
    }


    //Assertions
    @Step("Verify error 'Email Address already exist!' is visible")
    public RegisterUserPage verifyingErrorMessageIcon() {
        driver.element().verifyThat(errorMessageIcon).isVisible().perform();
        return this;
    }
}