package upload;

import home.HomePage;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static utility.JavScriptUtility.clickJS;
import static utility.WaitUtility.waitForElementToBeClickable;
import static utility.WaitUtility.waitForElementTobeVisible;

public class NewIconPage extends HomePage {
    private By fileUploadButton = By.xpath("//div[text()=\"File upload\"]");
    public void clickFileUpload(){
        waitForElementToBeClickable(fileUploadButton,15);
        click(fileUploadButton);
    }
    public void uploadFile(String filePath){
        try {
            Robot robot = new Robot();
            StringSelection filePathSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }catch (AWTException e){
            e.printStackTrace();
        }
    }

    public boolean isReplaceExistingFileVisible(){
        waitForElementTobeVisible(replaceExistingFile,10);
        return find(replaceExistingFile).isDisplayed();
    }

    private By replaceExistingFile = By.xpath("//label[text()=\"Replace existing file\"]");
    public void clickReplaceExistingFile(){
        try {
            if(isReplaceExistingFileVisible()){
                clickJS(replaceExistingFile);
                clickUploadButton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private By keepBothFiles = By.xpath("//label[text()=\"Keep both files\"]");
    public void clickKeepBothFiles(){
        try {
            if(isReplaceExistingFileVisible()){
                clickJS(keepBothFiles);
                clickUploadButton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private By uploadButton = By.xpath("//span[text()=\"Upload\"]");
    private void clickUploadButton(){
        click(uploadButton);
    }
}
