package com.kit.thomascook;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.thomascook.Homepage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by Nata on 6/30/2017.
 */
public class DurationTest extends WebDriverTestBase{
    private String thomasCookUrl = "https://www.thomascook.com/";

    @Test
    public void oneNightDurationTest(){
        Homepage homepage = new Homepage(webDriver);
        homepage.open(thomasCookUrl);
        homepage.closePopUp();
        homepage.getDurationDropdown().selectByVisibleText("1 Night");
        assertEquals( homepage.getDurationDropdown().getFirstSelectedOption().getText(), "1 Night");

    }
    @Test
    public void sevenNightsDurationTest() {
        Homepage homepage = new Homepage(webDriver);
        homepage.open(thomasCookUrl);
        homepage.closePopUp();
        homepage.getDurationDropdown().selectByIndex(1);
        assertEquals(homepage.getDurationDropdown().getFirstSelectedOption().getText(), "7 Nights");
    }

    @Test
    public void lessThanSevenNightsDurationTest() {
        Homepage homepage = new Homepage(webDriver);
        homepage.open(thomasCookUrl);
        homepage.closePopUp();
        homepage.getDurationDropdown().selectByValue("string:1-6");
        System.out.println("ACTUAL: "+ homepage.getDurationDropdown().getFirstSelectedOption().getText());
        assertEquals(homepage.getDurationDropdown().getFirstSelectedOption().getText(), "Less than 7 Nights");
    }


}
