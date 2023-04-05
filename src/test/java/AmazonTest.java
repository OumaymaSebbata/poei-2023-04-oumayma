import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.GamesAndConsolesPage;
import pageobjects.HomePage;

public class AmazonTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
    }

    /*@AfterMethod
    public void teardown() {
        driver.quit();
    }*/

    @Test
    public void testAmazon1() {
        String keyword = "iPhone 13";
        HomePage homePage = new HomePage(driver);
        homePage.cookieButtonPopUp();
        //homePage.searchAmazon(keyword);
        homePage.gotoGamesandconsolesPage();
        GamesAndConsolesPage gamesAndConsolesPage = new GamesAndConsolesPage();
       ///gamesAndConsolesPage.OpenBestSeller(1);

    }
}