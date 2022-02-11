package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperLib {

    public static void waitHelper(By locator, int timeseconds, WebDriver driver) {
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(timeseconds));
        myWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
