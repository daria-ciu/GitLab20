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




}
