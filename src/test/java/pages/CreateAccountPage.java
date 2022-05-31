package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class CreateAccountPage {
    String mailAdress="testlcwmail@gmail.com";
    By emailInput = By.id("email_create");
    By createAccountButton = By.id("SubmitCreate");
    By genderRadioButton = By.id("uniform-id_gender1");
    By firstnameInput = By.id("customer_firstname");
    By lastnameInput = By.id("customer_lastname");
    By passwordInput = By.id("passwd");
    By addressdInput = By.id("address1");
    By cityInput = By.id("city");
    By stateSelect = By.id("id_state");
    By postalCodeInput = By.id("postcode");
    By countrySelect = By.id("id_country");
    By phoneNumberInput = By.id("phone_mobile");
    By submitRegister = By.id("submitAccount");
    By accountSection = By.id("account");

    WebDriver driver;
    ElementHelper helper;
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }
    public void typeEmail() {
        helper.sendKey(emailInput,mailAdress);
    }
    public void clickCreateAccountButton() {
        helper.click(createAccountButton);
    }
    public void clickGender() {
        helper.click(genderRadioButton);
    }
    public void typeFirstName() {
        helper.sendKey(firstnameInput,"Test");
    }
    public void typeLastName() {
        helper.sendKey(lastnameInput,"TestLast");
    }
    public void typePassword() {
        helper.sendKey(passwordInput,"TestPass");
    }
    public void typeAddress() {
        helper.sendKey(addressdInput,"TestPass");
    }
    public void typeCity() {
        helper.sendKey(cityInput,"TestPass");
    }
    public void selectState() {
        helper.selectValueOption(stateSelect,"1");
    }
    public void typePostalCode() {
        helper.sendKey(postalCodeInput,"TestPass");
    }
    public void selectCountry() {
        helper.selectValueOption(countrySelect,"21");
    }
    public void typePhoneNumber() {
        helper.sendKey(phoneNumberInput,"5060655855");
    }
    public void submitRegister() {
        helper.click(submitRegister);
    }
    public void assertAccountCreated() {
        helper.checkElementVisible(accountSection);
    }

}
