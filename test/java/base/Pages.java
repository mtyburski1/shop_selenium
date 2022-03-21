package base;

import helpers.ScreenshotHelper;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CheckoutPage;
import pages.MainPage;
import pages.ShopPage;

public class Pages extends TestBase {
    protected MainPage mainPage;
    protected ShopPage shopPage;
    protected ScreenshotHelper scHelper;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;

    @BeforeMethod
    public void setUpObjects() {
        checkoutPage = new CheckoutPage(driver);
        cartPage = new CartPage(driver);
        mainPage = new MainPage(driver);
        shopPage = new ShopPage(driver);
        scHelper = new ScreenshotHelper(driver);
    }
}
