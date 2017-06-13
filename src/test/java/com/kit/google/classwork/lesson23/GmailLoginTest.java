package com.kit.google.classwork.lesson23;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.GmailEnterLoginPage;
import com.kit.pages.GmailEnterPasswordPage;
import com.kit.pages.GmailLoginPage;
import com.kit.pages.GmailOpenedPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Created by Nata on 6/9/2017.
 */
public class GmailLoginTest extends WebDriverTestBase {
    private String gmailUrl = "https://www.google.com/gmail/";
    private String login = "whoami7654321@gmail.com";
    private String password = "Tester123";


    @Test
    public void loginButtonTest(){
        GmailLoginPage gmailLoginPage = new GmailLoginPage(webDriver);
        gmailLoginPage.open(gmailUrl);
        gmailLoginPage.enterLogin(login);
        GmailEnterPasswordPage gmailEnterPasswordPage = new GmailEnterPasswordPage(webDriver);
        gmailEnterPasswordPage.enterPassword(password);
        GmailOpenedPage gmailOpenedPage = new GmailOpenedPage(webDriver);
        System.out.println("ACTUAL: "+ gmailOpenedPage.getGmailLabelLocator().getText());

        assertEquals(gmailOpenedPage.getGmailLabelLocator().getText(), "Gmail");


    }

}
