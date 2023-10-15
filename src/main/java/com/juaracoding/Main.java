package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // URL
        //URL url = new URL("http://127.0.0.1:4723/wd/hub");

        // instance AndroidDriver
       // AndroidDriver driver = new AndroidDriver<>(url,desiredCapabilities);
        DriverSingleton.getInstance(Constants.ANDROID);
        driver = DriverSingleton.getDriver();
        // Mobile Element
        MobileElement add = (MobileElement) driver.findElement(By.id("com.chad.financialrecord:id/fabMenu"));

        add.click();

        //
        // driver.quit();
    }
}
