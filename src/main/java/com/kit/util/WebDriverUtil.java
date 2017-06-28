package com.kit.util;


import org.apache.xpath.operations.Equals;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import static com.google.common.io.Files.toByteArray;

import java.io.File;

/**
 * Created by Nata on 6/16/2017.
 */
public class WebDriverUtil {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    long waitTimeout = Long.parseLong(PropertiesCache.getProrerty("wait.timeout"));
    private JavascriptExecutor executor;

    public WebDriverUtil(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, waitTimeout);
    }

    public WebElement waitForExpectedCondition(ExpectedCondition expectedCondition){
        return (WebElement)webDriverWait.until(expectedCondition);
    }

    public void jsClick(String locator, String type){
        executor = (JavascriptExecutor) webDriver;
        if(type.equals("id")){
            executor.executeScript("document.getElementById(\"" + locator + "\").click()");
        }
        else if(type.equals("name")){
            executor.executeScript("document.getElementsByName(\"" + locator + "\")[0].click()");
        }
       /* switch(type){
            case "id":
                executor.executeScript("document.getElementById(\"" + locator + "\").click()");
                break;
            case "name":
                executor.executeScript("document.getElementsByName(\"" + locator + "\")[0].click()");
                break;
        }*/

    }


    @Attachment(value = "{0}")
    public byte[] saveScreenshot(String attachName) {
        try {
            File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            return toByteArray(scrFile);
        } catch (Exception e) {
            System.out.println("Is not saved screenshot" + e);
        }
        return new byte[0];
    }

}
