import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginUserPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public LoginUserPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By loginToYourAccountIcon = By.xpath("//div[@class=\"login-form\"]");
    private By emailAddressField = By.xpath("//input[@data-qa=\"login-email\"]");
    private By passwordField = By.xpath("//input[@type=\"password\"]");
    private By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");
    private By incorrectInput = By.xpath("//p[@style=\"color: red;\"]");


    //Actions
    public LoginUserPage verifyingLoginToYourAccountIcon(){
        driver.element().verifyThat(loginToYourAccountIcon).isVisible().perform();
        return this;
    }
    public LoginUserPage fillEmailAddress(String EmailAddress){
        driver.element().type(emailAddressField, EmailAddress);
        return this;
    }
    public LoginUserPage fillPassword(String Password){
        driver.element().type(passwordField, Password);
        return this;
    }
    public LoginUserPage clickOnLoginButton(){
        driver.element().click(loginButton);
        return this;
    }


    //Assertions
    @Step("Verify error 'Your email or password is incorrect!' is visible")
    public LoginUserPage verifyingIncorrectEmailAddressAndPassword(){
        driver.element().verifyThat(incorrectInput).isVisible().perform();
        return this;
    }
}