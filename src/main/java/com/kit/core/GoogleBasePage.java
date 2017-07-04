package com.kit.core;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nata on 6/16/2017.
 */
public class GoogleBasePage {
    protected WebDriver webDriver;
    protected WebDriverUtil webDriverUtil;

    public GoogleBasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);

    }


 /*   public void takeScreenShot(String attachName){
        webDriverUtil.saveScreenshot(attachName);
    } */

    public GoogleBasePage(){}
    public void open(String url){
        webDriver.get(url);
    }
}
