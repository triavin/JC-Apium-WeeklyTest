package com.juaracoding.driver.strategy;

import com.juaracoding.utils.Constants;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android implements DriverStrategy{
    @Override
    public AndroidDriver setStrategy() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","CPH1701");
        desiredCapabilities.setCapability("udid","87b2c81a");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("appPackage","com.chad.financialrecord");
        desiredCapabilities.setCapability("appActivity","com.rookie.catatankeuangan.feature.splash.SplashActivity");
        desiredCapabilities.setCapability("noReset",true);

        URL url = new URL(Constants.URL);

        AndroidDriver driver = new AndroidDriver<> (url, desiredCapabilities);

        return driver;
    }
}
