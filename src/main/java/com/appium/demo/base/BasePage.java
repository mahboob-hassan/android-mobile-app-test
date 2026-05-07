package com.appium.demo.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }
}