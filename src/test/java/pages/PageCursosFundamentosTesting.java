package pages;

public class PageCursosFundamentosTesting extends BasePage {

    private String introTestingLink = "//a[contains(normalize-space(), 'al Testing de Software') and @href]";


    public PageCursosFundamentosTesting() {
        super(driver);
    }

    public void clickIntroTestingLink() {
        clickElement(introTestingLink);
    }
}
