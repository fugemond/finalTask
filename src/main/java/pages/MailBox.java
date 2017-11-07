package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class MailBox extends AbstractPage {

    @FindBy(xpath = "//div[following-sibling::div[@role='navigation']]//div[@role = 'button']")
    private WebElement createMailButton;
    @FindBy(xpath = " //textarea[@name = 'to']")
    private WebElement recipientField;
    @FindBy(xpath = "//div/div[@role='textbox']")
    private WebElement mailBodyField;
    @FindBy(xpath = "//div/div[contains(@data-tooltip,'Enter')]")
    private WebElement sendMailButton;
    @FindBys(@FindBy(xpath = "//div[@role='tabpanel']//table/tbody/tr\n"))
    private List<WebElement> mailsCollection;
    @FindBy(xpath = "//span/a[contains(@href,'inbox')]")
    private WebElement inboxButton;


    public MailBox(WebDriver driver) {
        super(driver);
    }

    public void clickCreateMail() {
        createMailButton.click();
    }

    public void enterRecipient(String recipient) {
        recipientField.sendKeys(recipient);
    }

    public void enterMailBody(String body) {
        mailBodyField.sendKeys(body);
    }

    public void sendMail() {
        sendMailButton.click();
    }

    public WebElement getTheMailByIndex(int index) {
        return mailsCollection.get(index);
    }

    public void clickInboxButton() {
        inboxButton.click();
    }
}
