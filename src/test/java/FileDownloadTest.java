import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest{
    protected String email = "your_email";
    protected String password = "your_password";
    protected String phoneNumber = "your_phoneNumber";

    @Test
    public void testDownload(){
        String filePath = "\"C:\\Users\\ADMIN\\Downloads\"";
        String expectedText = "2021-05-07 (7)";

        var myDrivePage = loginPage.setLoginPage(email,password,phoneNumber).clickMyDriveSection();
        myDrivePage.isMyDriveTitleDisplayed();
        myDrivePage.clickMoreOptionsInUploadedFile();
        myDrivePage.clickDownloadButton();

//        Assert.assertTrue(Files.exists(Paths.get(filePath,expectedText)),
//                "NOT FOUND!");
    }
}
