import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TestCasesPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public TestCasesPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By textInTestCasesPage = By.xpath("//h2[@class=\"title text-center\"]");


    //Assertions
    @Step("Verify user is navigated to test cases page successfully")
    public TestCasesPage verifyingTextInTestCasesPage() {
        driver.element().verifyThat(textInTestCasesPage).isVisible().perform();
        return this;
    }
}
