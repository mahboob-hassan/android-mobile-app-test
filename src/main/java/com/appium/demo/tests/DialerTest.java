package com.appium.demo.tests;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.demo.driver.DriverFactory;
import com.appium.demo.pages.DialerPage;

import io.appium.java_client.AppiumDriver;

public class DialerTest {

    AppiumDriver driver;

    DialerPage dialerPage;

    DriverFactory driverFactory;

    @BeforeMethod
    public void setup() throws MalformedURLException {

        driverFactory = new DriverFactory();

        driver = driverFactory.initializeDriver();

        dialerPage = new DialerPage(driver);
    }

    @Test
    public void DialatorTest_01_Demo() {

        dialerPage.tapDigit1();
        dialerPage.tapDigit2();
        dialerPage.tapDigit3();
        dialerPage.tapDigit4();
        dialerPage.tapDigit5();
        dialerPage.tapDigit6();
        dialerPage.tapDigit7();
        dialerPage.tapDigit8();
        dialerPage.tapDigit9();

        dialerPage.tapCallButton();
        dialerPage.tapEndButton();
        
        System.out.println("test succesfully completed....");
        
        
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}