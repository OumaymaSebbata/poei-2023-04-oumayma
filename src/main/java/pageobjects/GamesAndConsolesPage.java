package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class GamesAndConsolesPage {
    public GamesAndConsolesPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    String firstItemExpected = "The Legend of Zelda : Tears of the Kingdom";
    String expectedPrice = "54.99";
    String expectedMessage = "Cet article paraîtra le 12 mai 2023.";

    int timeOut = 5 ;

    ///- OpenBestSeller(int index): Click nth element in best seller section 0-based


        public void OpenBestSeller ( int index)
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
            WebElement bestSeller = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] span.a-list-item")));
            bestSeller.click(); // Open the first article

        }
    }