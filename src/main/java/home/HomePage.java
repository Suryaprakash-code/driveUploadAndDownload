package home;

import login.LoginPage;
import org.openqa.selenium.By;
import download.MyDrivePage;
import upload.NewIconPage;

import static utility.WaitUtility.waitForElementTobeVisible;

public class HomePage extends LoginPage {
    private By titlecard = By.xpath("//img//following::span[text()=\"Drive\"]");
    public boolean isTitleCardDisplayed(){
        waitForElementTobeVisible(titlecard,15);
        return find(titlecard).isDisplayed();
    }

    private By newButton = By.xpath("//button[@guidedhelpid=\"new_menu_button\"]");
    public NewIconPage clickNewButton(){
        waitForElementTobeVisible(newButton,15);
        click(newButton);
        return new NewIconPage();
    }

    private By myDriveSection = By.xpath("//span[text()=\"My Drive\"]");
    public MyDrivePage clickMyDriveSection(){
        waitForElementTobeVisible(myDriveSection,10);
        click(myDriveSection);
        return new MyDrivePage();
    }

}
