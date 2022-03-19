package providers;


import models.browsers.Browser;
import models.browsers.BrowserNotSupportedException;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver getDriver(String browser) {
        WebDriver driver;
        Browser browserType = Browser.valueOf(browser.toUpperCase());

        switch (browserType) {

            case CHROME:
                driver = new ChromeDriverManager().createDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManager().createDriver();
                break;
            case EDGE:
                driver = new EdgeDriverManager().createDriver();
                break;
            case IE:
                driver = new IEDriverManager().createDriver();
                break;
            default:
                throw new BrowserNotSupportedException(browser);
        }
        return driver;
    }
}