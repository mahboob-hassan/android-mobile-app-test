package com.appium.demo;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasicTest {
    public static void main(String[] args) {

        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("emulator-5554")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.android.settings")
                    .setAppActivity(".Settings")
                    .setNoReset(true);

            AndroidDriver driver = new AndroidDriver(
                    new URL("http://192.168.56.1:4723"),
                    options
            );

            driver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

            WebElement element = driver.findElement(
                    AppiumBy.id("com.google.android.dialer:id/one")
            );

            element.click();

            System.out.println("Clicked successfully");

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}