package com.automation.Utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportManager {
    public static Scenario scenario;

    public static void initScenario(Scenario scenario) {
        ReportManager.scenario = scenario;
    }

    public static void attachScreenShot() {
        scenario.attach(takeScreenShot(), "image/png", "FailedTestSnap");
    }

    public static byte[] takeScreenShot() {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        return ts.getScreenshotAs(OutputType.BYTES);

    }
}
