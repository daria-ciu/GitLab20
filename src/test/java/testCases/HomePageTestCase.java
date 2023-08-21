package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;

public class HomePageTestCase extends BasePage {
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        homePage = new HomePage(driver);
    }
    @Test (priority = 1)
    public void testCategory () throws InterruptedException {
        homePage.clickCategoryBlog();

        Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/index.php?route=extension/maza/blog/home");
    }


    @Test (priority = 2)
    public void testHomePage () throws InterruptedException {

        homePage.clickHomeButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
    }


    @Test (priority = 3)

    public void  testHeaderImageClick () throws InterruptedException{
        homePage.clickOnImageCategory();

        Assert.assertEquals(driver.getCurrentUrl(),"https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=18");


    }
    @Test (priority = 4)

    public void testHomepageIcon () throws InterruptedException {
        homePage.clickOnImageCategory();
        homePage.clickOnHomepageIcon();

        Assert.assertEquals(driver.getCurrentUrl(), "https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
    }


    @Test (priority = 5)

    public void testLeaveAcommentOnBlog() throws InterruptedException {
        homePage.clickCategoryBlog();
        homePage.clickOnFirstBlogImage();

        String yourName = "Daria";
        String Email = "daria.ciubancan@gmail.com";
        String yourComment = "This is a very interesting article!";

        homePage.postComment(yourName, Email, yourComment);

        boolean isSuccesMessageDisplayed = homePage.isMessageDisplayed();

        Assert.assertTrue(isSuccesMessageDisplayed, "Thank you for your comment. It has been submitted to the webmaster for approval.\n");
    }






    }






