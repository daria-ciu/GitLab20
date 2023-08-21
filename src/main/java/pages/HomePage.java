package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public boolean isMessageDisplayed;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By categoryBlog = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[3]/a/div/span");
    By homeButton = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[1]/a/div/span");

    By imageCategory = By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img");

    By homepageIconLocator = By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[1]/figure/a/img");


    By firstBlogImageLocator = By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/a/img");
    By yourNameInput = By.id("input-name");
    By EmailInput = By.id("input-email");
    By yourCommentInput = By.id("input-comment");
    By PostComment = By.id("button-comment");
    By successPostMessage = By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[1]/div[9]/form/div[1]");

    public void clickCategoryBlog() {
        driver.findElement(categoryBlog).click();
    }

    public void clickHomeButton() {
        driver.findElement(homeButton).click();
    }

    public void clickOnImageCategory(){driver.findElement(imageCategory).click();}
    public void clickOnHomepageIcon (){driver.findElement(homepageIconLocator).click();}

    public void clickOnFirstBlogImage (){driver.findElement(firstBlogImageLocator).click();}

    public void postComment(String yourName, String Email, String yourComment) {
        driver.findElement(yourNameInput).sendKeys(yourName);
        driver.findElement(EmailInput).sendKeys(Email);
        driver.findElement(yourCommentInput).sendKeys(yourComment);
        driver.findElement(PostComment).click();

    }

    public boolean isMessageDisplayed(){return driver.findElement(successPostMessage).isDisplayed();}

}