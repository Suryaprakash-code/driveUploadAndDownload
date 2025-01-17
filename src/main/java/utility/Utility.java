package utility;

import org.openqa.selenium.WebDriver;
import login.BasePage;

public class Utility {
    public static WebDriver driver;
    public static void setUtilityDriver(){
        driver= BasePage.driver;
    }
}
