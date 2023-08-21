package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MyAccount extends BasePage{

    public MyAccount (WebDriver driver) {
        super(driver);}

        By ClickOnMyAccount = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div/span");
        public void clickOnMyAccount () {
            driver.findElement(ClickOnMyAccount).click();
        }


    By usernameInput = By.id("input-email");
    By passwordInput = By.id("input-password");

    By loginButton = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input[1]");

    By MyAccountHoverLocator = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div/span");


    By logoutButton = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/ul/li[6]/a/div/span");

    By succesfulLogOutMessage = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/p[2]");
    public boolean isLogoutMessageDisplayed (){return driver.findElement(succesfulLogOutMessage).isDisplayed();}
    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    By errorMessage = By.xpath ("/html/body/div[1]/div[5]/div[1]/div[1]");
    public boolean isErrorMessageDisplayed() { return driver.findElement(errorMessage).isDisplayed();
    }

    public void pressEnterOnLogin() {
        driver.findElement(usernameInput).sendKeys(Keys.ENTER);
    }



    public void hoverOverImage() {
        Actions actions = new Actions(driver);
        WebElement imageElement = driver.findElement(MyAccountHoverLocator);
        actions.moveToElement(imageElement).perform();
    }
    public void clickOnLogOut (){
        driver.findElement(logoutButton).click();
    }



    }