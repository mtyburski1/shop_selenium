package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "title")
    private WebElement paymentTitle;

    @FindBy(css = ".cart_item .product-name")
    private WebElement itemName;

    @FindBy(css = ".product-total .woocommerce-Price-amount")
    private List<WebElement> productPrice;

    @FindBy(css = "#shipping_method_0_free_shipping2")
    private WebElement freeShippingRadio;

    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span")
    private WebElement totalPrice;

    public String getTotalPrice(){
        return totalPrice.getText().substring(0, 5);
    }

    public Boolean isFreeShippingSelected(){
        return freeShippingRadio.isSelected();
    }

    public String getProductPrice(){
        return productPrice.get(0).getText().substring(0, 5);
    }

    public String getItemName(){
        return itemName.getText().substring(0, 23);
    }

    public String getPaymentTitle(){
        return paymentTitle.getText();
    }
}
