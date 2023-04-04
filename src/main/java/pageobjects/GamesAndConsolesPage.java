package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GamesAndConsolesPage {

    WebDriver driver;
    By searchBarLocator = By.id("nav-hamburger-menu");
    By gamesAndConsoleButton =  By.cssSelector("ul.hmenu.hmenu-visible.hmenu-translateX > li a[class='hmenu-item']");


    WebElement proposalItem = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] span.a-list-item"))); // [data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] > div div ul li span.a-list-item
    String firstItemActual = proposalItem.getText();

}
