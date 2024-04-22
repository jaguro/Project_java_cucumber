package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    public HomePage() {
        super(driver);
    }
    //Navegamos a la web
    public void navigateToHomePage() {
        navigateTo("https://www.freerangetesters.com/");
    }
    public void clickOnSectionNavBar(String section) {
        String xpathSections = String.format(sectionLink, section);
        clickElement(xpathSections);
    }
}
