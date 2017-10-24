package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class DrivingAndTransportPage extends BasePage {

    private By parentTagLocator = By.tagName("a");
    private By tagLocator = By.tagName("h3");



    public DrivingAndTransportPage(WebDriver driver) {

        super(driver);
    }

    public VehicleAndDriverDataPage goToDataInformationPage() {

        for (WebElement element : driver.findElement(parentTagLocator).findElements(tagLocator)) {
            if (!element.getText().toLowerCase().contains("Vehicle and driver data and information".toLowerCase())) continue;
            break;
        }

        return new VehicleAndDriverDataPage(driver);
    }
}
