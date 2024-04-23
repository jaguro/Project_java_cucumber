package pages;

public class HomePage extends BasePage{

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public HomePage() {
        super(driver);
    }
    //Navegamos a la web
    public void navigateToHomePage() {
        navigateTo("https://www.freerangetesters.com/");
    }
    public void clickOnSectionNavBar(String section) {
        //Reemplazamos marcador posicion => %s  (SectionLink) por el nommbre
        String xpathSections = String.format(sectionLink, section);
        clickElement(xpathSections);
    }

    public void clickElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }
}
