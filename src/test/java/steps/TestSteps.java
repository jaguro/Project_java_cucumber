package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class TestSteps {
    HomePage landingPage = new HomePage();

    @Given("Puedo navegar a la siguiente web www.feerangetesters.com")
    public void navigateToPage() {
        landingPage.navigateToHomePage();
    }
    @When("Puedo entrar en la {word} haciendo click")
    public void navigateToSubSeccions(String section) {
        landingPage.clickOnSectionNavBar(section);
    }
}
