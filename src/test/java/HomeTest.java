import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    protected String email = "your_email";
    protected String password = "your_password";
    protected String phoneNumber = "your_phoneNumber";
    @Test
    public void titleTest(){
        var homePage = loginPage.setLoginPage(email,password,phoneNumber);
        homePage.isTitleCardDisplayed();
    }
}
