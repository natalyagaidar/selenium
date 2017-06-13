package com.kit.pages;

import com.kit.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nata on 6/9/2017.
 */
public class GmailLoginPage {
    private WebDriver webDriver;
    private WebElement loginButton;
    By loginButtonLoctor = By.xpath("html/body/nav/div/a[2]");

    //@FindBy(className = "aXBtI")
    private WebElement loginField;

    public GmailLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String url){
        webDriver.get(url);
    }
    public void logInButtonClick(){
        if(webDriver.findElements(loginButtonLoctor).size()>0) {
            loginButton = webDriver.findElement(loginButtonLoctor);
            loginButton.click();
        }
    }
    public void enterLogin(String login){
        loginField = webDriver.findElement(By.id("identifierId"));
        loginField.sendKeys(login);

       WebElement nextBtn = webDriver.findElement(By.id("identifierNext"));
       nextBtn.click();

    }




}
