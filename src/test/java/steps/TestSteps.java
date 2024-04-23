package steps;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.PageCursos;
import pages.PageCursosFundamentosTesting;

public class TestSteps {
    HomePage landingPage = new HomePage();
    PageCursos cursosPage = new PageCursos();
    PageCursosFundamentosTesting fundamentosPage = new PageCursosFundamentosTesting();

    @Given("I navigate to www.feerangetesters.com")
    public void navigateToPage() {
        landingPage.navigateToHomePage();
    }
    @When("I go to {word} using the navigation bar")
    public void navigateToSubSeccions(String section) {
        landingPage.clickOnSectionNavBar(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickElegirPlanButton();
    }

    @And("select Introduction al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickIntroTestingLink();
    }
}
