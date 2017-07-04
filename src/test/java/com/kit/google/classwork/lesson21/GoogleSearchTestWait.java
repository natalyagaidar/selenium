package com.kit.google.classwork.lesson21;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.GoogleSearchPage;
import org.testng.annotations.Test;

/**
 * Created by Nata on 6/16/2017.
 */
public class GoogleSearchTestWait extends WebDriverTestBase{
    private String googleSearch = "https://www.google.com.ua/";

    @Test(enabled = false)
    public void googleSearchTest(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(webDriver);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData("hello");

    }

}
