package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class HomePage extends BasePage {

    private By drivingAndTransportLocator = By.linkText("Driving and transport");


    public HomePage(WebDriver driver) {

        super(driver);
    }

    public DrivingAndTransportPage goToDrivingAndTransportPage() {
        for (WebElement idElement : driver.findElements(drivingAndTransportLocator)) {
            if (idElement.getAttribute("href").toLowerCase().contains("/browse/driving")) {
                idElement.click();
                break;
            }
        }

        return new DrivingAndTransportPage(driver);


    }
}
