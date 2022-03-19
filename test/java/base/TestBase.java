package base;

import helpers.Configurations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import providers.DriverFactory;

public class TestBase {
    protected WebDriver driver;
    SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        Configurations configurations = new Configurations();

        softAssert = new SoftAssert();

        driver = new DriverFactory().getDriver(configurations.loadFile("chromeDriver"));
        driver.get(configurations.loadFile("mainPage"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}