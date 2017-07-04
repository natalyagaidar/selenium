package com.kit.google.classwork.lesson23;
import com.kit.core.WebDriverTestBase;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;


/**
 * Created by Nata on 6/30/2017.
 */
public class WThree extends WebDriverTestBase{

   private String urlIFrame = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
   private String urlDragNDrop = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop";


@Test
    public void wThreeTest(){


        webDriver.get(urlIFrame);
        webDriver.switchTo().frame("iframeResult");
        Select dropdown = new Select(webDriver.findElement(By.tagName("select")));
        dropdown.selectByValue("audi");
    assertEquals(dropdown.getFirstSelectedOption().getText(), "Audi");

    }

@Test
    public void     dragAndDrop(){
        webDriver.get(urlDragNDrop);
        webDriver.switchTo().frame("iframeResult");
        By dragElementFromLocator = By.id("drag1");
        By dragElementToLocator = By.id("div1");

        By resultedLocator = By.xpath("html/body/div/img");

        WebElement from = webDriver.findElement(dragElementFromLocator);
        WebElement to = webDriver.findElement(dragElementToLocator);

        Actions builder = new Actions(webDriver);
        builder.clickAndHold(from).moveToElement(to).release(to).build().perform();

        WebElement resultElement = webDriver.findElement(dragElementToLocator).findElement(By.id("drag1"));
    System.out.println(resultElement.getAttribute("src"));

        //assertTrue(to.getAttribute("src").equals("img_logo.gif"));



    }


}
