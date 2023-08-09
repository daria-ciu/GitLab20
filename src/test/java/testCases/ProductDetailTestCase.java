package testCases;
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
        myAccount=new MyAccount(driver);

    }

    @Test (priority = 1)
    public void testAddToCart()throws InterruptedException {
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.clickAddToCart();



        /*Boolean SuccessMessage = productDetail.getSuccessMessage();
        Assert.assertTrue(SuccessMessage, "Success: You have added HTC Touch HD to your shopping cart!");
    */
    }


    @Test (priority = 2)
    public void testWishlistWhenNotLoggedIn()throws InterruptedException {


        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        productDetail.hoverOverImage();
        productDetail.testWishlistWhenNotLoggedIn();


       /* Boolean actualErrorMessage = productDetail.getErrorMessage();
        Assert.assertTrue(actualErrorMessage,"You must login or create an account to save HTC Touch HD to your wish list!\"");*/


}
@Test (priority = 3)

    public void testWishlistAfterLogin ()throws InterruptedException{
        myAccount.clickOnMyAccount();
    String username = "daria.ciubancan@gmail.com";
    String password = "123456789";
    myAccount.login(username, password);
    productDetail.clickShopByCategory();
    productDetail.clickPhoneTabletsAndIpod();
    productDetail.hoverOverImage();
    productDetail.testWishlistWhenLoggedIn();

}


@Test(priority = 4)

    public void testQuickView ()throws InterruptedException{

    productDetail.clickShopByCategory();
    productDetail.clickPhoneTabletsAndIpod();
    productDetail.hoverOverImage();
    productDetail.clickQuickView();

}
@Test(priority = 5)

    public void testCompare ()throws InterruptedException{
    productDetail.clickShopByCategory();
    productDetail.clickPhoneTabletsAndIpod();
    productDetail.hoverOverImage();
    productDetail.clickCompare();
}



}
