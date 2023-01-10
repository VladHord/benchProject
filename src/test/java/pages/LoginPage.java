package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BasePage {
    String homePage = "https://www.saucedemo.com/inventory.html";
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void enterLogin(String text){
        userName.sendKeys(text);
    }
    public void enterPassword(String text){
        password.sendKeys(text);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void openHomePage() {
        driver.get(homePage);
    }




}
