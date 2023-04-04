package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
   WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //closeCookiePopup()
public void  cookieButtonPopUp(WebElement cookieButton)
      {
    cookieButton = driver.findElement(By.cssSelector("input#sp-cc-accept"));
    cookieButton.click();
      }

      // insert search keyword on the search bar then click on the loop(pour le test iphone)
 public  void searchAmazon(String keyword)
       {
     driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys( keyword);
     WebElement searchButton = driver.findElement(new By.ByCssSelector("input#nav-search-submit-button"));
     searchButton.click();
               }
///-goToGamesAndConsolesPage(): Click Toutes, Click Jeux video et consoles, Click tous


}


