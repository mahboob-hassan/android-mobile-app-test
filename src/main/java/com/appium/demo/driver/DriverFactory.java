package com.appium.demo.driver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import com.appium.demo.constants.Constants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverFactory {

    private AppiumDriver driver;
    
    public DriverFactory() {
    }
    
    public AppiumDriver initializeDriver() throws MalformedURLException {
    	
        URL appiumServerUrl = URI.create(Constants.APPIUM_SERVER_URL).toURL();
       
    	UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(Constants.DEVICE_NAME)
                .setPlatformName(Constants.PLATEFORM_NAME)
                .setAutomationName(Constants.AUTOMATION_NAME)
                .setAppPackage(Constants.APP_PACKAGE)
                .setAppActivity(Constants.APP_ACTIVITY)
                .setNoReset(true);

        // FIX 1: Initialize driver BEFORE using it
        driver = new AndroidDriver(appiumServerUrl, options);

        // FIX 3: Set implicit wait AFTER driver is initialized
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}