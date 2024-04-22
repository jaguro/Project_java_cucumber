package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(
            driver,
            Duration.ofSeconds(5)
    );
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
    //Metodo Base para navegar a direccion web
    public static void navigateTo(String url) {
        driver.get(url);
    }
}
