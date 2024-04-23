package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(
            driver,
            Duration.ofSeconds(5)
    );
    static {
        //Configuracion del driver chrome 'setUp'
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    //Instanciar navegador
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
    //Método para cerrar el navegador
    public static void closeBrowser() {
        driver.quit();
    }
    //Método Base para navegar a direccion web determinada
    public static void navigateTo(String url) {
        driver.get(url);
    }
    //Método acepta cookies
    public void aceptCookies(String locator) {
        Find(locator).click();
    }
    //Método para Buscar elementos web
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    //Método para hacer click
    public void clickElement(String locator) {
        Find(locator).click();
    }
    //Método para rellenar campos
    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
    //Método para seleccionar 'DropDown' por valor
    public void selectFromDropDown(String locator, String value) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }
    //Método para seleccionar 'DropDown' por Index
    public void selectFromDropDownIndex(String locator, Integer value) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(value);
    }
    //Método para seleccionar DropDown por tamaño y número
    public int dropDownSize(String locator) {
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    public List<String> getDropDownValues(String locator) {
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownoptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownoptions) {
            values.add(option.getText());
        }
        return values;
    }
}
