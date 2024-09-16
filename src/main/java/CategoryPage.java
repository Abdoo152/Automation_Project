import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CategoryPage {
    private SHAFT.GUI.WebDriver driver;


    //Constructor
    public CategoryPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By womenDressProductsIcon = By.xpath("//h2[@class=\"title text-center\"]");
    private By menButton = By.xpath("//a[@href=\"#Men\"]");
    private By tshirtsButton = By.xpath("//a[@href=\"/category_products/3\"]");
    private By menShirtsProductsIcon = By.xpath("//h2[@class=\"title text-center\"]");


    //Actions
    public CategoryPage verifyingWomenDressProductsIcon() {
        driver.element().verifyThat(womenDressProductsIcon).isVisible().perform();
        return this;
    }
    public CategoryPage clickOnMenButton() {
        driver.element().click(menButton);
        return this;
    }
    public CategoryPage clickOnShirtsButton() {
        driver.element().click(tshirtsButton);
        return this;
    }


    //Assertions
    @Step("Verify that user is navigated to that category page")
    public CategoryPage verifyingMenShirtsProductsIcon() {
        driver.element().verifyThat(menShirtsProductsIcon).isVisible().perform();
        return this;
    }
}
