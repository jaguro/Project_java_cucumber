package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class TestSteps {
    HomePage landingPage = new HomePage();

    @Given("Puedo navegar a la siguiente web www.zooplus.es")
    public void navigateToPage() {
        landingPage.navigateToHomePage();
    }
}
