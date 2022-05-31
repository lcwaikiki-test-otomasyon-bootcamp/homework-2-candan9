package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.JsonReader;

public class HomePage {
    By logo = By.cssSelector("a.main-header-logo");
    By searchBox = By.id("search-form__input-field__search-input");
    By searchButton = By.cssSelector(".search-form__input-field__btn-search.false");
    By signInButton = By.cssSelector(".login");
    By continueShoppingButton = By.className("continue");
    By goToCartButton = By.className("button_order_cart");

    By proceedToCheckoutButton = By.className("standard-checkout");
    By secondProceedToCheckoutButton = By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] span");
    By termsAndConditions= By.id("cgv");
    By bankPaymentType = By.className("bankwire");
    By finisOrder= By.className("button-medium");
    WebDriver driver;
    ElementHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void checkLogo() {
        helper.checkElementVisible(logo);
    }

    public void clickSearchButton() {
        helper.click(searchButton);
    }

    public void clickSignInButton() {
        helper.click(signInButton);
    }
    public void clickContinueButton() {
        helper.click(continueShoppingButton);
    }
    public void clickGoToCart(){helper.click(goToCartButton);}


}
