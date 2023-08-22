package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputControls;

public class InputControlsTestCase
        extends BasePage {
    private InputControls inputControls;

    @BeforeClass
    public void setUp() {
        super.setUp();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=28");
    }

    @BeforeMethod
    public void navigateToCategoryPage() {
        inputControls = new InputControls(driver);

    }


    @Test(priority = 3)
    public void testSelectAppleOption() throws InterruptedException{
        inputControls.clickAppleSelector();

boolean appleSelector = inputControls.AppleSelector();

        Assert.assertTrue(appleSelector,"Apple Selector is not enabled." );





    }

    @Test(priority = 2)
    public void testColorSelection() throws InterruptedException{
        inputControls.selectBlueCheckbox();

        boolean isColorBlueSelected = inputControls.ColorBlue();
        Assert.assertTrue(isColorBlueSelected, "Color blue is not selected.");
    }

    @Test (priority = 1)

    public void testClearColorButton () throws InterruptedException{
        inputControls.selectBlueCheckbox();
        inputControls.clickColorClear();

        boolean isColorCleared = inputControls.ColorClear();
        Assert.assertTrue(isColorCleared, "Color is not cleared.");

    }

    @Test(priority = 4)

    public void testFirstCheckbox () throws InterruptedException{
    inputControls.clickInStockBox();

    boolean isFirstCheckboxSelected = inputControls.selectFirstCheckbox();
    Assert.assertTrue(isFirstCheckboxSelected, "The Checkbox is not selected.");}

    @Test (priority = 5)

    public void testMultipleCheckbox () throws InterruptedException{
        inputControls.clickInStockBox();
        inputControls.clickPreOrderBox();

        boolean isInStockSelected = inputControls.selectFirstCheckbox();
        boolean isPreOrderSelected = inputControls.selectSecondCheckbox();

        Assert.assertTrue(isInStockSelected && isPreOrderSelected, "Both checkboxes are selected.");
    }

    @Test (priority = 6)

    public void testSizeSelection () throws  InterruptedException{

        inputControls.selectSize();

        boolean isSizeSelected = inputControls.SelectSize();
        Assert.assertTrue(isSizeSelected, "Size is not selected.");
    }

    @Test(priority = 7)

    public void testInactiveRadioButton() throws InterruptedException{
        inputControls.clickFirstradio();
        boolean isNotActiveSelected = inputControls.selectRadio();
        Assert.assertFalse(isNotActiveSelected, "Radio button should not be selectable.");
    }

    @Test (priority = 8)

    public void testInactiveCheckbox() throws InterruptedException{
        inputControls.clickAppleSelector();
        inputControls.clickNotActivePreOrderButton();

        boolean isInactiveCheckboxSelected = inputControls.selectInactiveCheckbox();
        Assert.assertFalse(isInactiveCheckboxSelected, "Checkbox should not be selectable.");
    }

    @Test (priority = 9)
            public void testSlidingImage () throws InterruptedException{

    String mainImageBefore = inputControls.getMainImageBeforeSelection();
    inputControls.hoverOverImage();
    inputControls.selectSmallImage(1);
    String mainImageAfter = inputControls.getMainImageAfterSelection();
    Assert.assertNotEquals(mainImageAfter, mainImageBefore, "Main image source should change after selecting a small image.");
    }
    }

