package com.automation.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager {
    static AppiumDriver driver;

    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", ConfigReader.getValue("platform.name"));
        capabilities.setCapability("deviceName", ConfigReader.getValue("device.name"));
        capabilities.setCapability("automationName", ConfigReader.getValue("automation.name"));
        capabilities.setCapability("app", System.getProperty("user.dir") + "\\" + ConfigReader.getValue("app.path"));
        capabilities.setCapability("appActivity", ConfigReader.getValue("app.activity"));
        capabilities.setCapability("appPackage", ConfigReader.getValue("app.package"));
        driver = new AndroidDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
