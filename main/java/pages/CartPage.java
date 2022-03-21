package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#shipping_method_0_free_shipping2")
    private WebElement freeDeliveryRadio;

    @FindBy(css = ".checkout-button")
    private WebElement checkoutBtn;

    public CheckoutPage goToCheckout() {
        click(checkoutBtn);
        return new CheckoutPage(driver);
    }

    public Boolean freeDeliveryIsSelected() {
        return freeDeliveryRadio.isSelected();
    }

    public String getCartTitle() {
        return driver.getTitle();
    }


}
