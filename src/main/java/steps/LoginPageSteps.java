package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginPageSteps {
    private LoginPage loginPage;

    @Step
    public void login(String login, String password) {
        loginPage.enterLogin(login);
        loginPage.clickNextButton();
        loginPage.enterPassword(password);
        loginPage.clicckSubmitButton();
    }
}
