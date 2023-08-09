package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By searchField = By.name("search");
    By searchButton = By.xpath("/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[2]/button");



    public void performSearch(String searchText) {
        driver.findElement(searchField).sendKeys(searchText);
        driver.findElement(searchButton).click();
    }
    public void clearSearchField() {
        driver.findElement(searchField).clear();}


    By searchButton2 = By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[2]/div/form/div/div[2]/button");
    public void performSearch2(String searchText2) {
        driver.findElement(searchField).sendKeys(searchText2);
        driver.findElement(searchButton2).click();
    }


    By noResultMessage = By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/p");
    public boolean isNoResultMessageDisplayed() {
        return driver.findElement(noResultMessage).isDisplayed();
    }
}
