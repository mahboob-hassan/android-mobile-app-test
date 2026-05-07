package com.appium.demo.driver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverFactory {

    static AppiumDriver driver;

    public static AppiumDriver initializeDriver() throws MalformedURLException {
    	
        URL appiumServerUrl = URI.create("http://127.0.0.1:4723").toURL();
       
    	UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.android.settings")
                .setAppActivity(".Settings")
                .setNoReset(true);

        // FIX 1: Initialize driver BEFORE using it
        driver = new AndroidDriver(appiumServerUrl, options);

        // FIX 3: Set implicit wait AFTER driver is initialized
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}