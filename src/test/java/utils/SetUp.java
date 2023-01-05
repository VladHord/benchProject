package utils;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUp {

    private WebDriver driver;
    @BeforeTest
    private void setWebDriver() {
        String browser = "chrome";
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/drivers/chromedriver.exe");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;
        }

    }
    public WebDriver getDriver(){
        if(driver==null){
            setWebDriver();
        }
        return driver;
    }

}
