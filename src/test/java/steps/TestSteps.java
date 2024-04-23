package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.PageCursos;
import pages.PageCursosFundamentosTesting;
import pages.PageRegistry;

import java.util.Arrays;
import java.util.List;

public class TestSteps {
    HomePage landingPage = new HomePage();
    PageCursos cursosPage = new PageCursos();
    PageCursosFundamentosTesting fundamentosPage = new PageCursosFundamentosTesting();
    PageRegistry registry = new PageRegistry();

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

    @When("I can validate the options in the checkout page")
    public void validateCheckoutPlans() {
        List<String> Lista = registry.returnPlanDropdownValues();
        List<String> ListaEsperada = Arrays.asList(
                "Academia: $16.99 / mes • 12 productos",
                "Academia: $176 / año • 12 productos",
                "Free: Gratis • 3 productos");
        Assert.assertEquals(ListaEsperada, Lista);
    }
}
