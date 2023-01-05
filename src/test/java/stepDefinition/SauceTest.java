//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import pages.LoginPage;
//import pages.CartPage;
//
//public class SauceTest {
//    private static WebDriver driver = null;
//
//    @BeforeTest
//    public void setUp() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void loginToSauceAndByBackpack() {
//        driver.get("https://www.saucedemo.com/");
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.clickOnLoginButton();
//        CartPage cartPage = new CartPage(driver);
//        cartPage.clickOnCart();
//    }
//
//
//    @AfterTest
//    public void tearDown() {
//
//        driver.close();
//        driver.quit();
//        System.out.println("Test completed successfully");
//    }
//
//}