package com.kit.google.classwork.lesson23;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.GoogleSearchPage;
import com.kit.pages.google.GoogleSearchResultPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.Assert.assertTrue;

/**
 * Created by Nata on 6/9/2017.
 */
@Title("Google search test - positive scenario")
@Features("Google Search")
@Stories("777")
@Listeners({com.kit.core.TestListener.class})
public class GoogleSearchTest extends WebDriverTestBase {
    private String googleSearch = "https://www.google.com.ua/";
    private String searchText = "Selenium";


    @Test
    public void searchTest(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(webDriver);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData(searchText);
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(webDriver);
        assertTrue(googleSearchResultPage.getLinkText().contains(searchText));
        googleSearchResultPage.clickLink();


    }
}
