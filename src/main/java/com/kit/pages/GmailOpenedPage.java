package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Nata on 6/9/2017.
 */
public class GmailOpenedPage {
    private WebDriver webDriver;
    private WebElement gmailLabel;
    private By gmailLabelLocator = By.id(":i");

    public GmailOpenedPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public WebElement getGmailLabelLocator(){
        return webDriver.findElement(gmailLabelLocator);
    }
}
