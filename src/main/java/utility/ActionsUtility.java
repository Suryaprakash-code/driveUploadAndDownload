package utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility{

    private static Actions act(){
        return new Actions(driver);
    }
    public static void moveToElementNotClick(WebElement source){
        act().moveToElement(source).perform();
    }
    public static void sendKeys(WebElement source, CharSequence text){
        act().sendKeys(source,text).perform();
    }
    public static void moveToElement(WebElement source){
        act().moveToElement(source).click().perform();
    }
    public static void rightClick(WebElement source){
        act().contextClick(source).perform();
    }
    public static void arrowDown(){
        act().sendKeys(Keys.ARROW_DOWN).perform();
    }
    public static void pressEnter(){
        act().sendKeys(Keys.RETURN).perform();
    }
}
