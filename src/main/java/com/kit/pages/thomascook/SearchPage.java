package com.kit.pages.thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Nata on 6/26/2017.
 */
public class SearchPage extends ThomasCookBasePage{
    private WebElement pagination;
    private By paginationLocator =By.id("paginationSearchResultsPanel");

    private WebElement nextBtn;
    private By nextBtnLocator = By.xpath("html/body/div[1]/search-results-page/div[4]/*[@class=\"col-xs-24 col-sm-18 col-sm-offset-6\"]/div/div/div[3]");

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getPagination(){
        return webDriver.findElement(paginationLocator);
    }

    public WebElement getNextBtn(){
        return webDriver.findElement(nextBtnLocator);

    }
}
