package testflow;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.HomePageSteps;
import steps.LoginPageSteps;
import steps.MailBoxSteps;

public class WhenWriteNewMessage extends SerenityStory {

    @Steps
    private HomePageSteps homePageSteps;
    @Steps
    private LoginPageSteps loginPageSteps;
    @Steps
    private MailBoxSteps mailBoxSteps;

    @Given("a user is logged in with $login and $password")
    public void aUserIsOnTheHomePage(String login, String password) {
        homePageSteps.signIn();
        loginPageSteps.login(login, password);
    }

    @When("user send new email to $recipient with email $body")
    public void writesRecipientAndBody(String recipient, String body) {
        mailBoxSteps.sendMailToRecipient(recipient, body);
    }


    @Then("recipient should get email from this user with same email $body")
    public void userAppearsOnTheSearchPage(String body) {
        mailBoxSteps.verifyThatEmailWasSend(0, body);
    }
}
