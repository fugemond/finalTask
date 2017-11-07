package steps;

import net.thucydides.core.annotations.Step;
import pages.MailBox;

import static org.junit.Assert.assertTrue;

public class MailBoxSteps {
    MailBox mailBox;

    @Step
    public void sendMailToRecipient(String recipient, String body) {
        mailBox.clickCreateMail();
        mailBox.enterRecipient(recipient);
        mailBox.enterMailBody(body);
        mailBox.sendMail();
    }

    @Step
    public void verifyThatEmailWasSend(int emailIndex, String body) {
        mailBox.clickInboxButton();
        assertTrue(mailBox.getTheMailByIndex(emailIndex).getText().contains(body));
    }

}
