package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;



public class ProductDetail extends BasePage {

    public ProductDetail(WebDriver driver) {
        super(driver);

    }
    By ShopByCategory = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[1]/a");



    By PhoneTabletsAndIpod = By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[3]/a");

    By imageLocator = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img");

     By addToCartButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[2]/button[1]/i\n");


     By notLoggedInWishlistButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[2]/button[2]/i");

By loggedInWishlistButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[2]/button[2]");
     By quickViewButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[2]/button[3]/i");
By errorMessage = By.xpath("/html/body/div[2]/div/div[2]/div[1]/p");
By successMessage = By.xpath("/html/body/div[2]/div/div[2]/div/p");

By quickViewPopUp = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[2]/div[1]/div/div/div[1]/a/img");

     By compareButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[2]/button[4]/i");
    By CartIcon = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a");
    By productCompare = By.xpath("/html/body/div[2]/div/div[2]/div/p");
    public void clickShopByCategory () {
        driver.findElement(ShopByCategory).click();
    }

        public void clickPhoneTabletsAndIpod(){
            driver.findElement(PhoneTabletsAndIpod).click();

    }
    public void hoverOverImage() {
        Actions actions = new Actions(driver);
        WebElement imageElement = driver.findElement(imageLocator);
        actions.moveToElement(imageElement).perform();
    }

    public void waitForAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
    }

    public void clickAddToCart() {
       waitForAddToCartButton();
        driver.findElement(addToCartButton).click();
    }

    public void waitForClickOnCartIcon() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CartIcon));
    }

    public void clickOnCartIcon() {
        waitForClickOnCartIcon();
        driver.findElement(CartIcon).click();
    }







    public void waitForTestWishlistWhenNotLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(notLoggedInWishlistButton));
    }
    public void testWishlistWhenNotLoggedIn() {
        waitForTestWishlistWhenNotLoggedIn();driver.findElement(notLoggedInWishlistButton).click();
    }
    /*By errorMessage = By.id("notification-box-top");
    WebElement getErrorMessageElement = driver.findElement(errorMessage);
    public Boolean getErrorMessage() {driver.findElement(errorMessage);
        return getErrorMessageElement.isDisplayed();}

    }*/


    public void waitForTestWishlistWhenLoggedIn() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInWishlistButton));}
        public void testWishlistWhenLoggedIn() {
            waitForTestWishlistWhenLoggedIn();driver.findElement(loggedInWishlistButton).click();
        }

   public void waitForQuickView (){
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(quickViewButton));
   }
    public void clickQuickView() {
        waitForQuickView();driver.findElement(quickViewButton).click();
    }


    public void waitForCompare(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(compareButton));
    }

    public void clickCompare() {
        driver.findElement(compareButton).click();
    }
public void waitForErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
}

    public boolean getErrorMessage (){waitForErrorMessage();return driver.findElement(errorMessage).isDisplayed();}

    public void waitForSuccessMessage (){
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));}
        public boolean GetSuccessMessage() {waitForSuccessMessage();return driver.findElement(successMessage).isDisplayed();}
    public void waitForQuickViewPopUp(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(quickViewPopUp));
    }
    public boolean isQuickViewPopUpDisplayed (){waitForQuickViewPopUp();return  driver.findElement(quickViewPopUp).isDisplayed();}


    public void checkProductCompare(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(productCompare));
    }

    public boolean getNotification (){checkProductCompare();return driver.findElement(productCompare).isDisplayed();}
    }




