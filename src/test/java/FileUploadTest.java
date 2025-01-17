import org.testng.annotations.Test;
public class FileUploadTest extends BaseTest{
    protected String email = "your_email";
    protected String password = "your_password";
    protected String phoneNumber = "your_phoneNumber";
    @Test
    public void uploadTest(){
        String image1 = "\"C:\\Users\\ADMIN\\OneDrive\\Pictures\\Screenshots\\2021-05-07 (7).png\"";
        String image2 = "\"C:\\Users\\ADMIN\\OneDrive\\Pictures\\Screenshots\\2021-05-07 (15).png\"";
        var newIconPage = loginPage.setLoginPage(email,password,phoneNumber).clickNewButton();
        newIconPage.clickFileUpload();
        newIconPage.uploadFile(image2);
        newIconPage.clickReplaceExistingFile();
    }
}
