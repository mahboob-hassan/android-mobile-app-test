package com.appium.demo.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.demo.driver.DriverFactory;
import com.appium.demo.pages.DialerPage;

import io.appium.java_client.AppiumDriver;

public class DialerTest {
	

	AppiumDriver driver;
	DialerPage dialerPage;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
	    driver = DriverFactory.initializeDriver();
	    dialerPage = new DialerPage(driver);
	}

	
	@Test
	public void DialatorTest_01_Demo(){
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
	
	}
	
	@AfterMethod
	public void tearDown() {
	    driver.quit();
	}
	

}