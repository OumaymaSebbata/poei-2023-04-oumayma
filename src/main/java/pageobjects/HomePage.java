package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
   WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //closeCookiePopup()
public void  cookieButtonPopUp()
      {
    WebElement cookieButton = driver.findElement(By.cssSelector("input#sp-cc-accept"));
    cookieButton.click();
      }

      // insert search keyword on the search bar then click on the loop(pour le test iphone)
 /*public  void searchAmazon(String keyword)
       {
     driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys( keyword);
     WebElement searchButton = driver.findElement(new By.ByCssSelector("input#nav-search-submit-button"));
     searchButton.click();
               }*/
///-goToGamesAndConsolesPage(): Click Toutes, Click Jeux video et consoles, Click tous
     public void gotoGamesandconsolesPage()
     {
         int timeOut1 = 5;
         int timeOut2 = 10;
         WebElement toutesButton = driver.findElement(By.cssSelector(".hm-icon.nav-sprite"));
         toutesButton.click();
         /// Select Jeux video et consoles
         WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(timeOut1));///juste declaration
         WebElement SelectJeux = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-menu-id='12']")));
         SelectJeux.click();
         //Select Tous les jeux video
         WebDriverWait wait2  = new WebDriverWait(driver, Duration.ofSeconds(timeOut2));///juste declaration
         WebElement SelectTouslesJeux = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.hmenu.hmenu-visible.hmenu-translateX > li a[class='hmenu-item']")));
         SelectTouslesJeux.click();
         /////////////

         /*WebElement bestSeller= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] span.a-list-item")));

         bestSeller.click(); // Open the first article*/

     }



}


