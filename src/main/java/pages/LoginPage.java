package pages;

import helpers.MyWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//div/input[contains(@type,'email')]")
    private WebElement loginField;
    @FindBy(xpath = "//div[@id='identifierNext']")
    private WebElement nextButton;
    @FindBy(xpath = "//div/input[contains(@type,'password')]")
    private WebElement passwordField;
    @FindBy(xpath = "//div[@id='passwordNext']")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterLogin(String login) {
        MyWaiter.waitForElementIsPresent(loginField).sendKeys(login);
    }

    public void clickNextButton() {
        MyWaiter.waitForElementClickable(nextButton).click();
        MyWaiter.waitForElementClickable(submitButton);
    }

    public void enterPassword(String password) {
        MyWaiter.waitForElementClickable(passwordField).sendKeys(password);
    }

    public void clicckSubmitButton() {
        MyWaiter.waitForElementClickable(submitButton).click();
    }
}
