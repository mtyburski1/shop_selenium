package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ShopPage extends BasePage {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product")
    private List<WebElement> productsList;

    @FindBy(css = ".product_title")
    private WebElement productNameText;

    @FindBy(xpath = "//*[@id=\"product-33\"]/div[2]/p/span")
    private WebElement priceText;

    @FindBy(css = "input[id^=quantity_]")
    private WebElement quantity;

    @FindBy(css = ".single_add_to_cart_button")
    private WebElement addToCartBtn;

    @FindBy(css = ".woocommerce-message")
    private WebElement addedProductText;

    @FindBy(css = ".button.wc-forward")
    private WebElement checkCartBtn;

    public CartPage checkCartClick() {
        click(checkCartBtn);
        return new CartPage(driver);
    }

    public String getAddedProductMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(addedProductText));
        return addedProductText.getText().substring(14);
    }

    public ShopPage addToCart() {
        click(addToCartBtn);
        return this;
    }

    public int getQuantity() {
        return Integer.parseInt(quantity.getAttribute("value"));
    }

    public String getPrice() {
        return priceText.getText().substring(0, 5);
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.elementToBeClickable(productNameText)).getText();
    }

    public ShopPage ClickOnProduct(int value) {
        click(productsList.get(value));
        return this;
    }
}
