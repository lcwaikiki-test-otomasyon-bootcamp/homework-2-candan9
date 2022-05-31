import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

        driver.findElement(By.id("user_1_")).click();

        driver.findElement(By.name("email")).sendKeys("yanlismail@gmail.com");

        driver.findElement(By.name("password")).sendKeys("yanlissifre");

        driver.findElement(By.cssSelector(".login-form__button--bg-blue")).click();

        String element = driver.findElement(By.cssSelector(".login-form__header-errors--p")).getText();
        System.out.println("ERROR"+element);

        driver.quit();
    }
}
