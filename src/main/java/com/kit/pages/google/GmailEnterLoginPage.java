package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nata on 6/9/2017.
 */
public class GmailEnterLoginPage {
    private WebDriver webDriver;

    @FindBy(className = "aXBtI")
    private WebElement loginField;

    //private By searchLocator;

    public GmailEnterLoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void enterLogin(String login){

        loginField.sendKeys(login);
        loginField.submit();

    }



}
