package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InputControls extends BasePage {
    public InputControls (WebDriver driver) {
        super(driver);}



    By inStockBox = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div[2]/div/div[1]/div");
    By preOrderBox = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div");
    By blueCheckbox = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div[2]/div/div[1]/div/label/img");

    By colorClearButton = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div[1]/a/i");
    By appleSelector = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/label");
    By notActivePreOrderBox = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div");
    By firstRadio = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div[1]/div");
    By sizeSelection = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div/div[2]/div[6]/div[2]/div/div[1]/div/label");

    By mainImageLocator = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img");
    By mainImageLocatorAfter = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[2]/img");
    By smallImageLocator = By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/ul/li[2]/img");

    public void clickInStockBox (){driver.findElement(inStockBox).click();}
    public  void clickPreOrderBox (){driver.findElement(preOrderBox).click();}
    public void selectBlueCheckbox (){driver.findElement(blueCheckbox).click();}
    public void waitForColorClear (){


    WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(colorClearButton));}
    public void clickColorClear (){/*waitForColorClear();*/driver.findElement(colorClearButton).click();}
    public void clickAppleSelector (){driver.findElement(appleSelector).click();}
    public void clickNotActivePreOrderButton (){driver.findElement(notActivePreOrderBox).click();}
    public void clickFirstradio (){driver.findElement(firstRadio).click();}

    public void selectSize (){driver.findElement(sizeSelection).click();}

    public void hoverOverImage() {
        Actions actions = new Actions(driver);
        WebElement imageElement = driver.findElement(mainImageLocator);
        actions.moveToElement(imageElement).perform();
    }



    public String getMainImageBeforeSelection() {
        return driver.findElement(mainImageLocator).getAttribute("src");
    }
    public String getMainImageAfterSelection () {
        return driver.findElement(mainImageLocatorAfter).getAttribute("src");
    }
    public void selectSmallImage(int index) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement smallImage = wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(smallImageLocator).get(index - 1)));
        smallImage.click();
    }



    public boolean AppleSelector (){return driver.findElement(appleSelector).isEnabled();}
    public boolean ColorBlue (){return  driver.findElement(blueCheckbox).isEnabled();}
    public boolean ColorClear (){return  driver.findElement(colorClearButton).isEnabled();}
    public boolean selectFirstCheckbox (){return  driver.findElement(inStockBox).isEnabled();}
    public boolean selectInactiveCheckbox (){return  driver.findElement(preOrderBox).isSelected();}
    public boolean selectSecondCheckbox () {return  driver.findElement(preOrderBox).isEnabled();}
    public boolean SelectSize (){return  driver.findElement(sizeSelection).isEnabled();}
    public boolean selectRadio (){return driver.findElement(firstRadio).isSelected();}






}
