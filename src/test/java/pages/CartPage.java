package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "shopping_cart_container")
    private WebElement cart;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement backpackName;

    public void checkThatWeHaveBackpack(){
        Assert.assertTrue(backpackName.isDisplayed());
    }
    public void clickOnCart() {
        cart.click();
    }
}
