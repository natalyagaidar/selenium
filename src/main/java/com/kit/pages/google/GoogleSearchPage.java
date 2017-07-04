package com.kit.pages.google;

import com.kit.core.GoogleBasePage;
import com.kit.util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.rmi.server.ExportException;

/**
 * Created by Nata on 6/9/2017.
 */
public class GoogleSearchPage extends GoogleBasePage{
    private WebElement searchField;
    private By searchLocator = By.name("q");


    public GoogleSearchPage(WebDriver webDriver) {
       super(webDriver);
    }

    public void open(String url){
        webDriver.get(url);
    }

    @Attachment(value = "{0}", type = "text/plain")
    @Step("Fill search text {0} and press Enter")
    public void fillAndSubmitSearchData(String searchText){
        //webDriverUtil.waitForExpectedCondition(ExpectedConditions.elementToBeClickable(searchLocator));
        searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();

    }
}
