package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;



import pages.BasePage;
import pages.MyAccount;

public class MyAccountTestCase extends BasePage {
    private MyAccount myAccount;

    @BeforeClass
    public void setUp() {
        super.setUp();
        myAccount = new MyAccount(driver);
    }

    @Test
    public void myAccountTestCase() throws InterruptedException {

        myAccount.clickOnMyAccount();
    }


    @Test
    public void testSuccessfulLogin() {

        myAccount.clickOnMyAccount();


        String username = "daria.ciubancan@gmail.com";
        String password = "123456789";
        myAccount.login(username, password);


        String expectedDashboardUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=account/account";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedDashboardUrl, "Login was not successful. User is not on the dashboard page.");
    }


    @Test
    public void testInvalidLogin() {

        myAccount.clickOnMyAccount();


        String username = "invalid-user";
        String password = "invalid-password";
        myAccount.login(username, password);


        boolean isErrorMessageDisplayed = myAccount.isErrorMessageDisplayed();
        Assert.assertTrue(isErrorMessageDisplayed, "No error message displayed for invalid login.");


    }
}