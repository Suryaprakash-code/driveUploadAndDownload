package download;

import home.HomePage;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utility.ActionsUtility.*;
import static utility.WaitUtility.waitForElementTobeVisible;

public class MyDrivePage extends HomePage {

    private By myDriveTitle = By.xpath("//div[text()=\"My Drive\"]");
    public boolean isMyDriveTitleDisplayed(){
        waitForElementTobeVisible(myDriveTitle,10);
        return find(myDriveTitle).isDisplayed();
    }

    private By wantedFile = By.xpath("//div[@id=\":20\"]//div[@role=\"gridcell\"]//div[@aria-label=\"2021-05-07 (7).png Image\"]");
    public void clickMoreOptionsInUploadedFile(){
        waitForElementTobeVisible(wantedFile,15);
        moveToElementNotClick(find(wantedFile));
        rightClick(find(wantedFile));


    }

    private By downloadButton = By.xpath("//div[text()=\"Download\"]");
    public void clickDownloadButton(){

            arrowDown();

        pressEnter();
        try {
            Robot robot = new Robot();
            robot.delay(8000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void clickSave(){

    }
    private boolean dialogAppears(){
        return true;
    }


}
