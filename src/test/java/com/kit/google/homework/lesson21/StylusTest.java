package com.kit.google.homework.lesson21;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Nata on 6/6/2017.
 */
public class StylusTest {
    private WebDriver driver;
    private String urlPath;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Nata\\Kit\\selenium\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
        urlPath = "http://stylus.com.ua/";
        driver.get(urlPath);
        driver.manage().window().maximize();
    }

    @Test(enabled = false)
    public void stylusPageOpenTest() {
        String searchText = "Sony Z2";
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys(searchText);
        searchField.submit();

        WebElement sonyElement = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[1]/div/div/ul/li[5]/a/span"));
        assertTrue((sonyElement.getText().contains("Sony")) && (sonyElement.getText().contains("Z2")));

        sonyElement.click();
        WebElement sonyPage = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[1]/header"));

        assertTrue((sonyPage.getText().contains("Sony")) && (sonyPage.getText().contains("Z2")));


    }
}
