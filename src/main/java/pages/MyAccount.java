package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyAccount extends BasePage{

    public MyAccount (WebDriver driver) {
        super(driver);}

        By ClickOnMyAccount = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[6]/a/div/span");
        public void clickOnMyAccount () {
            driver.findElement(ClickOnMyAccount).click();
        }
    }