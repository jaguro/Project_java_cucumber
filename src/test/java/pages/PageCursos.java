package pages;


public class PageCursos extends BasePage {
    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PageCursos() {
        super(driver);
    }
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }

}
