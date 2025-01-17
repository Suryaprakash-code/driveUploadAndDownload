package login;

import home.HomePage;
import org.openqa.selenium.By;

import javax.swing.*;

import static utility.JavScriptUtility.clickJS;
import static utility.JavScriptUtility.scrollToElementJS;
import static utility.WaitUtility.waitForElementToBeClickable;
import static utility.WaitUtility.waitForElementTobeVisible;

public class LoginPage extends BasePage {
    private By emailField = By.xpath("//input[@id=\"identifierId\"]");
    private void setEmailField(String email){
        set(emailField,email);
    }

    private By nextButton = By.xpath("//span[text()=\"Next\"]");
    private void clickNextButton(){
        click(nextButton);
    }

    private By passwordField = By.xpath("//input[@type=\"password\"]");
    private void setPasswordField(String password){
        waitForElementTobeVisible(passwordField,10);
        set(passwordField,password);
    }

    private By recoveryInformationTitle = By.xpath("//div[text()=\"Recovery information\"]");
    private boolean isRecoveryInformationTitleDisplayed(){
        waitForElementTobeVisible(recoveryInformationTitle,10);
        return find(recoveryInformationTitle).isDisplayed();
    }
    private By cancelButton = By.xpath("//span[text()=\"Cancel\"]");
    private void clickCancelButton(){
        click(cancelButton);
    }
    private void cancelRecoveryInformation(){
        try {
            if (isRecoveryInformationTitleDisplayed()) {
                clickCancelButton();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    private By verifyTitle = By.xpath("//span[text()=\"Verify it’s you\"]");
    private boolean isVerifyTitleDisplayed(){
        waitForElementTobeVisible(phoneNumberField,10);
        return find(phoneNumberField).isDisplayed();
    }
    private By countryCode = By.xpath("//span[@id=\"c8\"][@role=\"listbox\"]");
    private void clickCountryCode(){
        clickJS(countryCode);
    }
    private By indiaCode = By.xpath("//span[text()=\"India (+91)\"]");
    private void clickIndiaCode(){
        scrollToElementJS(indiaCode);
        waitForElementToBeClickable(indiaCode,10);
        clickJS(indiaCode);
    }
    private By phoneNumberField = By.xpath("//input[@id=\"phoneNumberId\"]");
    public void setPhoneNumberField(String phoneNumber){
        set(phoneNumberField,phoneNumber);
    }
    public void setVerifyPage(String phoneNumber){
        try {
            if (isVerifyTitleDisplayed()) {
                clickCountryCode();
                clickIndiaCode();
                setPhoneNumberField(phoneNumber);
                clickNextButton();
                JOptionPane.showMessageDialog(null,"enter OTP and press enter");
            }else{
                cancelRecoveryInformation();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public HomePage setLoginPage(String email, String password, String phoneNumber){
        setEmailField(email);
        clickNextButton();
        setPasswordField(password);
        clickNextButton();
        setVerifyPage(phoneNumber);
        return new HomePage();
    }




}
