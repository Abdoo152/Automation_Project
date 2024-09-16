import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class BrandPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public BrandPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By poloBrandIcon = By.xpath("//a[@href=\"/brand_products/Polo\"]");
    private By madameBrandButton = By.xpath("//a[@href=\"/brand_products/Madame\"]");
    private By madameBrandIcon = By.xpath("//h2[@class=\"title text-center\"]");


    //Actions
    public BrandPage verifyingPoloBrandIcon() {
        driver.element().verifyThat(poloBrandIcon).isVisible().perform();
        return this;
    }
    public BrandPage clickOnMadameBrandButton() {
        driver.element().click(madameBrandButton);
        return this;
    }


    //Assertions
    @Step("Verify that user is navigated to that brand page and can see products")
    public BrandPage verifyingMadameBrandIcon() {
        driver.element().verifyThat(madameBrandIcon).isVisible().perform();
        return this;
    }

}
