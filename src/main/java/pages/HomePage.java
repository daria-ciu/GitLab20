package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By categoryBlog = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[3]/a/div/span");
    By homeButton = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[1]/a/div/span");

    By imageCategory = By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img");

    public void clickCategoryBlog() {
        driver.findElement(categoryBlog).click();
    }

    public void clickHomeButton() {
        driver.findElement(homeButton).click();
    }

    public void clickOnImageCategory(){driver.findElement(imageCategory).click();}


}