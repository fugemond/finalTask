package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MyWaiter {
    private static WebDriverWait wait = new WebDriverWait(getDriver(), 20);

    public static WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForElementIsPresent(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
