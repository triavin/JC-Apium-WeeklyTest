package com.juaracoding.driver.strategy;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface DriverStrategy {
    AndroidDriver setStrategy() throws MalformedURLException;
}
