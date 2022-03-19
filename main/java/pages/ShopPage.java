package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPage extends  BasePage{
    public ShopPage(WebDriver driver){
        super(driver);
    }

    @FindBy (css = ".product")
    public List<WebElement> productsList;

    public ShopPage ClickOnProduct(int value){
        click(productsList.get(value));
        return this;
    }
}
