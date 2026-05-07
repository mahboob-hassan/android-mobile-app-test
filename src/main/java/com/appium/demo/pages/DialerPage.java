package com.appium.demo.pages;

import org.openqa.selenium.WebElement;

import com.appium.demo.base.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DialerPage extends BasePage {

	
    // FIX: Initialize PageFactory so @AndroidFindBy annotations are processed
    public DialerPage(AppiumDriver driver) {
    	super(driver); 	
    }

    @AndroidFindBy(id = "com.google.android.dialer:id/one")
    private WebElement dialPad1;

    @AndroidFindBy(id = "com.google.android.dialer:id/two")
    private WebElement dialPad2;

    @AndroidFindBy(id = "com.google.android.dialer:id/three")
    private WebElement dialPad3;

    @AndroidFindBy(id = "com.google.android.dialer:id/four")
    private WebElement dialPad4;

    @AndroidFindBy(id = "com.google.android.dialer:id/five")
    private WebElement dialPad5;

    @AndroidFindBy(id = "com.google.android.dialer:id/six")
    private WebElement dialPad6;

    @AndroidFindBy(id = "com.google.android.dialer:id/seven")
    private WebElement dialPad7;

    @AndroidFindBy(id = "com.google.android.dialer:id/eight")
    private WebElement dialPad8;

    @AndroidFindBy(id = "com.google.android.dialer:id/nine")
    private WebElement dialPad9;

    @AndroidFindBy(id = "com.google.android.dialer:id/dialpad_voice_call_button")
    private WebElement callButton;

    // FIX: Add action methods so the page object can actually be used in tests
    public void tapDigit1() { dialPad1.click(); }
    public void tapDigit2() { dialPad2.click(); }
    public void tapDigit3() { dialPad3.click(); }
    public void tapDigit4() { dialPad4.click(); }
    public void tapDigit5() { dialPad5.click(); }
    public void tapDigit6() { dialPad6.click(); }
    public void tapDigit7() { dialPad7.click(); }
    public void tapDigit8() { dialPad8.click(); }
    public void tapDigit9() { dialPad9.click(); }
    public void tapCallButton() { callButton.click(); }
}