package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.BasePage;
import pages.MyAccount;
import pages.ProductDetail;

public class ProductDetailTestCase extends BasePage {
    private ProductDetail productDetail;
    private MyAccount myAccount;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        productDetail = new ProductDetail(driver);
        myAccount = new MyAccount(driver);

    }

    @Test
    public void testAddToCart() throws InterruptedException {
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.clickAddToCart();
        productDetail.clickOnCartIcon();

        WebElement productInCartElement = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[2]/a"));
        String productInCart = productInCartElement.getText();
        String expectedProductInCart = "HTC Touch HD";
        Assert.assertEquals(productInCart, expectedProductInCart, "Product in cart does not match the expected product.");
    }


    @Test
    public void testWishlistWhenNotLoggedIn() throws InterruptedException {


        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.testWishlistWhenNotLoggedIn();


        Boolean actualErrorMessage = productDetail.getErrorMessage();
        Assert.assertTrue(actualErrorMessage, "You must login or create an account to save HTC Touch HD to your wish list!\"");


    }

    @Test

    public void testWishlistAfterLogin() throws InterruptedException {
        myAccount.clickOnMyAccount();
        String username = "daria.ciubancan@gmail.com";
        String password = "123456789";
        myAccount.login(username, password);
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.testWishlistWhenLoggedIn();

        Boolean successMessage = productDetail.GetSuccessMessage();
        Assert.assertTrue(successMessage, "Success: You have added HTC Touch HD to your wish list!");

    }


    @Test

    public void testQuickView() throws InterruptedException {

        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.clickQuickView();

        boolean quickViewPopUp = productDetail.isQuickViewPopUpDisplayed();
        Assert.assertTrue(quickViewPopUp, "HTC Touch HD");
    }

    @Test

    public void testCompare() throws InterruptedException {
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.clickCompare();

        boolean CheckproductCompare = productDetail.getNotification();
        Assert.assertTrue(CheckproductCompare, "Success: You have added HTC Touch HD to your product comparison!");
    }


    @Test

    public void removeFromWishlist() throws InterruptedException {
        myAccount.clickOnMyAccount();
        String username = "daria.ciubancan@gmail.com";
        String password = "123456789";
        myAccount.login(username, password);
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.testWishlistWhenLoggedIn();


        productDetail.clickOnWishlist();


        productDetail.removeFromWishlist();


        boolean isSuccessMessageDisplayed = productDetail.isSuccessMessageDisplayed();

        Assert.assertTrue(isSuccessMessageDisplayed, " Success: You have modified your wish list!");


    }
    @Test

    public void testResetCategory () throws InterruptedException {

        productDetail.clickShopByCategory();
        productDetail.resetCategory();

        boolean isNavigationCategoryDisplayed = productDetail.isNavigationDisplayed();

        Assert.assertTrue(isNavigationCategoryDisplayed, "Navigation bar is not displayed after clicking on reset button.");
    }
}
