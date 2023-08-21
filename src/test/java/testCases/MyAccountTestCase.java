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

    @BeforeMethod
    public void setUp() {
        super.setUp();
        myAccount = new MyAccount(driver);
    }


    @Test(priority = 1)
    public void testSuccessfulLogin() throws InterruptedException {

        myAccount.clickOnMyAccount();


        String username = "daria.ciubancan@gmail.com";
        String password = "123456789";
        myAccount.login(username, password);


        String expectedDashboardUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=account/account";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedDashboardUrl, "Login was not successful. User is not on the dashboard page.");
    }


    @Test(priority = 2)
    public void testInvalidLogin() throws InterruptedException {

        myAccount.clickOnMyAccount();


        String username = "invalid-user";
        String password = "invalid-password";
        myAccount.login(username, password);


        boolean isErrorMessageDisplayed = myAccount.isErrorMessageDisplayed();
        Assert.assertTrue(isErrorMessageDisplayed, "No error message displayed for invalid login.");


    }

    @Test(priority = 3)
    public void testEmptyFieldsLogin() throws InterruptedException {
        myAccount.clickOnMyAccount();


        myAccount.pressEnterOnLogin();

        boolean isErrorMessageDisplayed = myAccount.isErrorMessageDisplayed();
        Assert.assertTrue(isErrorMessageDisplayed, "No error message displayed for empty fields login.");
    }


    @Test(priority = 4)

    public void testSuccessfulLogout() throws InterruptedException {

        myAccount.clickOnMyAccount();


        String username = "daria.ciubancan@gmail.com";
        String password = "123456789";
        myAccount.login(username, password);
        myAccount.hoverOverImage();
        myAccount.clickOnLogOut();

        boolean isSuccsesfulLogouMessageDisplayed = myAccount.isLogoutMessageDisplayed();

        Assert.assertTrue(isSuccsesfulLogouMessageDisplayed, "You have been logged off your account. It is now safe to leave the computer.");


    }
}