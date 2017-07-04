package com.kit.thomascook;


import com.kit.core.WebDriverTestBase;
import com.kit.pages.thomascook.Homepage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by Nata on 7/2/2017.
 */
public class SearchCriteriaTest extends WebDriverTestBase {
    private String thomasCookUrl = "https://www.thomascook.com/";
    @Test(enabled = false)
    public void SearchCriteriaTest(){
        Homepage homepage = new Homepage(webDriver);
        homepage.open(thomasCookUrl);
        homepage.closeChanceToWinDialog();
        homepage.closePopUp();
        homepage.flyingFromField().click();
        homepage.flyingFromField().sendKeys("Any London");
        assertEquals(homepage.flyingFromField().getText(), "Any London");

    }

}
