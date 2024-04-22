package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage() {
        super(driver);
    }
    //Navegamos a la web
    public void navigateToHomePage() {
        navigateTo("https://www.zooplus.es");
    }
}
