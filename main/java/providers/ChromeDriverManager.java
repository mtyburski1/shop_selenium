package providers;

import io.github.bonigarcia.wdm.WebDriverManager;
import models.browsers.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;


public class ChromeDriverManager implements Factory {
    public WebDriver createDriver() {
        WebDriverManager.getInstance(CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        return new ChromeDriver(options);
    }
}