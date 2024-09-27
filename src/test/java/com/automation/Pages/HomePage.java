package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "")
    WebElement doNotAllowNotification;

    @FindBy(xpath = "")
    WebElement closeButton;

    @FindBy(xpath = "")
    WebElement closeLocation;

    public void openApplication() {

        if (isPresent(closeButton)) {
            closeButton.click();
        }
        if (isPresent(doNotAllowNotification)) {
            doNotAllowNotification.click();
        }
        if (isPresent(closeLocation)) {
            closeLocation.click();
        }

    }
}