package providers;

import io.github.bonigarcia.wdm.WebDriverManager;
import models.browsers.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.EDGE;

public class EdgeDriverManager implements Factory {
    public WebDriver createDriver() {
        WebDriverManager.getInstance(EDGE).setup();

        return new FirefoxDriver();
    }
}