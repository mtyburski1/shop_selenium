import base.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest extends Pages {

    @Test
    public void shouldBuy() {
        mainPage.goToShopClick()
                .ClickOnProduct(8);
        scHelper.takeScreenshot();

        Assert.assertEquals(shopPage.getProductName(), "KOSZULKA WEST HAM UNITED");
        Assert.assertEquals(shopPage.getPrice(), "90,00");
        Assert.assertEquals(shopPage.getQuantity(), 1);

        shopPage.addToCart();
        System.out.println(shopPage.getAddedProductMessage());

        Assert.assertEquals(shopPage.getAddedProductMessage(), "“Koszulka West Ham United” został dodany do koszyka.");

        shopPage.checkCartClick();

        scHelper.takeScreenshot();

        Assert.assertEquals(cartPage.getCartTitle(), "Koszyk – Selenium Shop Automatyzacja Testów");
        Assert.assertTrue(cartPage.freeDeliveryIsSelected());
        cartPage.goToCheckout();
        System.out.println(checkoutPage.getCheckoutTitle());
        Assert.assertEquals(checkoutPage.getCheckoutTitle(), "Zamówienie – Selenium Shop Automatyzacja Testów");

        scHelper.takeScreenshot();

        Assert.assertEquals(checkoutPage.getItemName(), "Koszulka West Ham United");
        Assert.assertEquals(checkoutPage.getProductPrice(), "90,00");
        Assert.assertTrue(checkoutPage.isFreeShippingSelected());
        Assert.assertEquals(checkoutPage.getTotalPrice(), "90,00");


    }


}
