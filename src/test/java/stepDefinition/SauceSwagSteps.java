package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;
import utils.SetUp;

public class SauceSwagSteps {

    CartPage cartPage;
    LoginPage loginPage;

    MainPage mainPage;
    private SetUp setup;

    public SauceSwagSteps() {
        var driver = new SetUp().getDriver();
        this.loginPage = new LoginPage(driver);
        this.cartPage = new CartPage(driver);
        this.mainPage = new MainPage(driver);
    }

    @Given("Open login page")
    public void open_login_page() {
        loginPage.openHomePage();

    }

    @When("Enter login and password")
    public void enter_login_and_password() {
        loginPage.enterLogin("standard_user");
        loginPage.enterPassword("secret_sauce");

    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @When("Select backpack")
    public void select_backpack() {
        mainPage.userSelectsBackpack();
    }


    @When("Click on cart button")
    public void click_on_cart_button() {
        cartPage.clickOnCart();

    }

    @Then("Check that we have backpack in the cart")
    public void check_that_we_have_backpack_in_the_cart() {
        cartPage.checkThatWeHaveBackpack();
    }
}
