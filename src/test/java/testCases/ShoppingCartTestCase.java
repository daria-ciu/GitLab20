package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ProductDetail;
import pages.ShoppingCart;

public class ShoppingCartTestCase extends BasePage {

    private ShoppingCart shoppingCart;
    private ProductDetail productDetail;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        shoppingCart = new ShoppingCart(driver);
        productDetail = new ProductDetail(driver);
}

@Test (priority = 1)

    public void testCartQty (){
        productDetail.clickShopByCategory();
        productDetail.clickPhoneTabletsAndIpod();
        shoppingCart.clickOnPamlTreoPro();
        shoppingCart.clickOnAddToCart();
        shoppingCart.clickOnIncreaseQty();
        shoppingCart.clickOnAddToCart();


        boolean isQtyCorrect = shoppingCart.isQtyCorrect();
    Assert.assertTrue(isQtyCorrect, "3");
}

@Test(priority = 2)

    public void testEditCart(){
    productDetail.clickShopByCategory();
    productDetail.clickPhoneTabletsAndIpod();
    shoppingCart.clickOnPamlTreoPro();
    shoppingCart.clickOnAddToCart();
        shoppingCart.clickOnCartIcon();
        shoppingCart.clearSearchField();
        shoppingCart.editQtyField();
        shoppingCart.clickUpdateButton();

        boolean showSuccessMessage = shoppingCart.showSuccessMessage();
        Assert.assertTrue(showSuccessMessage, " Success: You have modified your shopping cart!");




    }


}
