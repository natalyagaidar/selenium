package com.kit.google.homework.lesson22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Nata on 6/9/2017.
 */
public class GmailLoginTest {

        private WebDriver driver;
        private String urlPath;

        @BeforeClass
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:\\Nata\\Kit\\selenium\\src\\main\\resources\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver();
            urlPath = "https://www.google.com/";
            driver.get(urlPath);
            driver.manage().window().maximize();
        }

        @Test(enabled = false)
        public void stylusPageOpenTest() {

        }

}
