package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/ul/li[1]")
    private WebElement mainPageBtn;

    @FindBy(css = "#menu-item-137")
    private WebElement shopBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[2]")
    private WebElement eventsBtn;

    @FindBy(css = ".glyphicon")
    private WebElement cartBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[4]")
    private WebElement registerBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[3]")
    private WebElement loginBtn;

    public ShopPage goToShopClick() {
        click(shopBtn);
        return new ShopPage(driver);
    }

    public MainPage goToMainPageClick() {
        click(mainPageBtn);
        return this;
    }

    public MainPage goToCartClick() {
        cartBtn.click();
        return this;
    }

    public MainPage goToLoginClick() {
        click(loginBtn);
        return this;
    }
}
