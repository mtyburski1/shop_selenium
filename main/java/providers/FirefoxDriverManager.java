package providers;

import io.github.bonigarcia.wdm.WebDriverManager;
import models.browsers.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class FirefoxDriverManager implements Factory {
    public WebDriver createDriver() {
        WebDriverManager.getInstance(FIREFOX).setup();

        return new FirefoxDriver();
    }
}