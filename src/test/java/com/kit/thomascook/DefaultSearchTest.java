package com.kit.thomascook;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.thomascook.Homepage;
import com.kit.pages.thomascook.SearchPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


/**
 * Created by Nata on 6/26/2017.
 */
public class DefaultSearchTest extends WebDriverTestBase {
    private String thomasCookUrl = "https://www.thomascook.com/";

    @Test
    public void DefaultSearchTest(){
        Homepage homepage = new Homepage(webDriver);
        homepage.open(thomasCookUrl);
        homepage.closePopUp();
        homepage.clickSearchBtn();
        SearchPage searchPage = new SearchPage(webDriver);
        assertTrue(searchPage.getNextBtn().isEnabled());
        assertTrue(searchPage.getPagination().isDisplayed());

    }
}
