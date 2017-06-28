package com.kit.pages.thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Nata on 6/26/2017.
 */
public class Homepage extends ThomasCookBasePage {
    private WebElement searchButton;
    private By searchButtonLocator = By.id("SearchbarForm-submitBtn");
    private  WebElement cookiesCloseBtn;
    private By closeCookiesLocator = By.id("accept-cookies");

    public Homepage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Get rid of bottom Cookies pop-up")
    public void closePopUp(){
        cookiesCloseBtn = webDriver.findElement(closeCookiesLocator);
        cookiesCloseBtn.click();

    }

    @Step("Clicks Search btn")
    public void clickSearchBtn() {
        searchButton = webDriver.findElement(searchButtonLocator);
        searchButton.click();
    }

}
