import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    protected String email = "your_email";
    protected String password = "your_password";
    protected String phoneNumber = "your_phoneNumber";
    @Test
    public void loginTest(){
        loginPage.setLoginPage(email,password,phoneNumber);
    }
}
