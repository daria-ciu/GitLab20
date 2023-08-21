package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchPage;

public class SearchFunctionalityTest extends BasePage {
    private SearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        searchPage = new SearchPage(driver);
    }

    @Test(priority = 1)
    public void testSearchFunctionality()throws InterruptedException {

        String searchText = "apple";
        searchPage.performSearch(searchText);


        String expectedSearchResultsUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=apple";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedSearchResultsUrl, "Search option does not work");


    }

  @Test (priority = 2)
    public void noResultTest()throws InterruptedException{
        searchPage.clearSearchField();
        String searchText2 = "varza";
        searchPage.performSearch(searchText2);
      boolean isNoResultMessageDisplayed = searchPage.isNoResultMessageDisplayed();
      Assert.assertTrue(isNoResultMessageDisplayed, "The Message 'There is no product that matches the search criteria.' is not displayed.");
  }


  @Test (priority = 3)

  public void testEmptySearch() throws InterruptedException {
      searchPage.performSearch("");

      String expectedSearchResultsUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=product%2Fsearch&search=";
      String currentUrl = driver.getCurrentUrl();
      Assert.assertEquals(currentUrl, expectedSearchResultsUrl, "Search option does not work for empty search.");
  }











}
