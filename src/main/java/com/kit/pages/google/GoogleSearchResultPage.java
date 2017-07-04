package com.kit.pages.google;

import com.kit.core.GoogleBasePage;
import com.kit.util.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Nata on 6/9/2017.
 */
public class GoogleSearchResultPage extends GoogleBasePage {
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]");
    private WebElement link;

    public GoogleSearchResultPage(WebDriver webDriver) {
      super(webDriver);
    }

    public String getLinkText(){
       /* link  = webDriverUtil.waitForExpectedCondition(
                ExpectedConditions.elementToBeClickable(linkLocator));

        return link.getText(); */
       return webDriver.findElement(linkLocator).getText();
      // elementTobeClickable
    }
    public void clickLink(){
        webDriverUtil.jsClick("gb_70", "id");
    }

}
