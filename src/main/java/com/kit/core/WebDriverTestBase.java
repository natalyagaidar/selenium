package com.kit.core;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import com.kit.util.PropertiesCache;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Nata on 6/9/2017.
 */
public class WebDriverTestBase {
    protected WebDriver webDriver;
    //How to pass System variable to Selenium Framework
    //mvn -Dbrowser = CHROME or FF clean test - to run tests on diff browsers
    private String browser = System.getProperty("browser");
    //Loads setting from test.properties file
    long implicitWait = Long.parseLong(PropertiesCache.getProrerty("wait.implicit"));
    long pageLoadTimeout = Long.parseLong(PropertiesCache.getProrerty("wait.page"));
    long setScript = Long.parseLong(PropertiesCache.getProrerty("wait.setscript"));

    @BeforeClass
    public void setUp() {
        setBrowser();
        setWebDriverSettings();

    }

    private void setWebDriverSettings() {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(setScript, TimeUnit.SECONDS);
    }

    public void setBrowser() {
        Browser runBrowser = EnumUtils.isValidEnum(Browser.class, browser) ? Browser.valueOf(browser.toUpperCase()) : Browser.CHROME;

        switch (runBrowser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                webDriver = new ChromeDriver();
                break;
            case FF:
                FirefoxDriverManager.getInstance().setup();
                webDriver = new FirefoxDriver();
                break;
        }
    }

    @AfterClass
    public void tearDown() {
        webDriver.close(); // closes a browser
        //webDriver.quit(); // closes browser tab
    }

}
