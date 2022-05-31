package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class ProductPage {
    WebDriver driver;
    ElementHelper helper;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }
    By dressSelector = By.cssSelector("a");
    By productSection = By.className("ajax_block_product");
    By addToCartButton = By.className("ajax_add_to_cart_button");
    public void focusDresses (){
        helper.focusElementWithText(dressSelector,"Dresses");
    }
    public void clickSummerDresses (){
        helper.focusElementWithText(dressSelector,"Summer Dresses");
    }
    public void focusProduct (){
        helper.focusElement(productSection);
    }
    public void addToCart() {
        helper.click(addToCartButton);
    }
}
