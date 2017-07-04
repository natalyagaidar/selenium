package com.kit.pages.thomascook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Nata on 6/26/2017.
 */
public class Homepage extends ThomasCookBasePage {
    private WebElement searchButton;
    private By searchButtonLocator = By.id("SearchbarForm-submitBtn");
    private  WebElement cookiesCloseBtn;
    private By closeCookiesLocator = By.id("accept-cookies");
    private By closeChanceToWinDialogLocator = By.className("deliver-component-CloseButton-times");
    private WebElement duration;
    private By durationLocator = By.id("SearchbarForm-duration");

    private By flyingFromTextfieldLocator = By.cssSelector("input/*[@id=\"SearchbarForm-origin\"]");
    private By flyingToTextfieldLocator = By.xpath("html/body/div[1]/div[3]/searchbar/*[@id=\"searchPanel\"]/form/div/*[@id=\"SearchbarForm-tooltipsButtons\"]/*[@id=\"SearchbarForm-destinationContainer\"]/div/div/div/div[1]");

    private By addNewRoomBtnLocator = By.xpath("html/body/div[1]/div[3]/searchbar/div/form/div/div[4]/ul/li[2]/*[@id=\"SearchbarRooms-add\"]");

    private By searchBarRoomsAdults0Locator = By.id("SearchbarRooms-adults0");

    private By searchBarRoomsAdults1Locator = By.id("SearchbarRooms-adults1");

    public Homepage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Get rid of bottom Cookies pop-up")
    public void closePopUp(){
        try {
            Boolean isVisible = webDriver.findElement(closeCookiesLocator).isDisplayed();
            if (isVisible) {
                cookiesCloseBtn = webDriver.findElement(closeCookiesLocator);
                cookiesCloseBtn.click();
            }
        }
        catch (WebDriverException we){
            System.out.println("WebDriverException ERROR");
        }

    }

    public void closeChanceToWinDialog(){
        try {
            Boolean isVisible = webDriver.findElement(closeChanceToWinDialogLocator).isDisplayed();
            if (isVisible) {
                cookiesCloseBtn = webDriver.findElement(closeChanceToWinDialogLocator);
                cookiesCloseBtn.click();
            }
        }
        catch (WebDriverException we){
            System.out.println("WebDriverException ERROR");
        }
    }

    @Step("Clicks Search btn")
    public void clickSearchBtn() {
        searchButton = webDriver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public Select getDurationDropdown(){
        WebElement dropdownElement =  webDriver.findElement(durationLocator);
        return new Select(dropdownElement);
    }

    public WebElement flyingFromField(){
        return webDriver.findElement(flyingFromTextfieldLocator);
    }

    public WebElement getFlyingToField(){
        return webDriver.findElement(flyingToTextfieldLocator);
    }

    public WebElement getAddNewRoomBtn(){
        return webDriver.findElement(addNewRoomBtnLocator);

    }

    public WebElement getSearchBarRoomsAdults0(){
        return webDriver.findElement(searchBarRoomsAdults0Locator);
    }

    public WebElement getSearchBarRoomsAdults1(){
        return webDriver.findElement(searchBarRoomsAdults1Locator);
    }


}
