package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavScriptUtility extends Utility{
    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView(true)";
        ((JavascriptExecutor)driver).executeScript(jsScript,element);
    }
    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].click()";
        ((JavascriptExecutor)driver).executeScript(jsScript,element);
    }
    public static void visibleJS(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].style.display='block';";
        ((JavascriptExecutor)driver).executeScript(jsScript,element);
    }

}
