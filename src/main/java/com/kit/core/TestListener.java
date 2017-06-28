package com.kit.core;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by Nata on 6/23/2017.
 */
public class TestListener implements ITestListener{
    private WebDriverUtil webDriverUtil;
    private WebDriver  driver;
    public void onTestStart(ITestResult iTestResult) {


    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        driver = ((WebDriverTestBase)iTestResult.getInstance()).webDriver;
        webDriverUtil = new WebDriverUtil(driver);
        webDriverUtil.saveScreenshot(iTestResult.getMethod().getMethodName());

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
