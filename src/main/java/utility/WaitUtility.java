package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility {
    public static void waitForElementTobeVisible(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void waitForElementToBeClickable(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void presenceOfElementLocated(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
