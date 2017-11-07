package pages;

import helpers.MyWaiter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

@DefaultUrl("https://www.google.com/intl/en/gmail/about/")
public class HomePage extends AbstractPage {

    @FindBy(xpath = "//div/a[contains(@class,'sign-in')]")
    private WebElement signInButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton(){
        signInButton.click();
    }
}
