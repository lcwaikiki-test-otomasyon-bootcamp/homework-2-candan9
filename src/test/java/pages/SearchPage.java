package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class SearchPage {

    By searchInput = By.id("search_query_top");
    By searchButton = By.className("button-search");
    WebDriver driver;
    ElementHelper helper;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    public void typeTextToSearch(){
        helper.sendKey(searchInput,"Summer");
    }
}
