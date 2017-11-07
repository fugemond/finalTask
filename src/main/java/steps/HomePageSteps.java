package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HomePageSteps {
    private HomePage homePage;

    @Step
    public void signIn() {
        homePage.open();
        getDriver().manage().window().maximize();
        homePage.clickSignInButton();
    }
}
