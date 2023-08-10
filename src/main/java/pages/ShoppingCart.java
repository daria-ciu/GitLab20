package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart extends BasePage {

    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    By PalmTreoPro = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[2]/div/div[1]/div[1]/a/div/div[1]/img");
    By AddToCart = By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[4]/div/div[2]/button");
    By IncreaseQtyButton = By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[4]/div/div[1]/div/div[2]/button");
    By CartIcon = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a");
    By QtyNo = By.xpath("/html/body/div[1]/div[9]/header/div[2]/div[1]/div[5]/a/div[1]/span");

    By QtyField = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/div/table/tbody/tr/td[4]/div/input");
    By updateButton = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/div/table/tbody/tr/td[4]/div/div/button[1]");
    By successMessage = By.xpath("/html/body/div[1]/div[5]/div[1]/div[1]");


    public void clickOnPamlTreoPro() {
        driver.findElement(PalmTreoPro).click();
    }

    public void clickOnAddToCart() {
        driver.findElement(AddToCart).click();
    }

    public void clickOnIncreaseQty() {
        driver.findElement(IncreaseQtyButton).click();
    }

    public void waitForClickOnCartIcon() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CartIcon));
    }

    public void clickOnCartIcon() {
        waitForClickOnCartIcon();
        driver.findElement(CartIcon).click();
    }

    public void editQtyField() {
        driver.findElement(QtyField).sendKeys("3");
    }

    public void clearSearchField() {
        driver.findElement(QtyField).clear();
    }

    public void clickUpdateButton() {
        driver.findElement(updateButton).click();
    }


    public boolean isQtyCorrect() {
        return driver.findElement(QtyNo).isDisplayed();
    }

    public boolean showSuccessMessage() {
        return driver.findElement(successMessage).isDisplayed();
    }

}
