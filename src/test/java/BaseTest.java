import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import login.BasePage;
import login.LoginPage;
import utility.Utility;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;

    public String URL = "https://drive.google.com/drive";

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void load() {
        driver.get(URL);


        basePage = new BasePage();
        basePage.setDriver(driver);
        Utility.setUtilityDriver();
        loginPage = new LoginPage();


    }





//        @AfterClass
//    public void tearUp(){
//        if(driver!=null) {
//            driver.quit();
//        }
//    }

}
