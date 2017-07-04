package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Nata on 6/9/2017.
 */
public class GmailEnterPasswordPage {
    private WebDriver webDriver;
    private WebElement passwordField;
    private By searchLocator = By.name("password");

    public GmailEnterPasswordPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void enterPassword(String password){
        passwordField = webDriver.findElement(searchLocator);
        passwordField.sendKeys(password);
        WebElement nextBtn = webDriver.findElement(By.id("passwordNext"));
        nextBtn.click();


    }
}
