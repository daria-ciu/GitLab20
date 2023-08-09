package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


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



    }