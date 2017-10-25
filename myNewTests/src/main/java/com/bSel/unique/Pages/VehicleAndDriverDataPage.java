package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class VehicleAndDriverDataPage extends BasePage {

    private By vehicleInfoLocator = By.linkText("Get vehicle information from DVLA");


    public VehicleAndDriverDataPage(WebDriver driver) {
        super(driver);
    }

    public VehicleInformationPage goToVehicleInfoPage() {
        for (WebElement idElement : driver.findElements(vehicleInfoLocator)) {
            if (idElement.getAttribute("href").toLowerCase().contains("/get-vehicle-information-from-dvla")) {
                idElement.click();
                break;
            }
        }

        return new VehicleInformationPage(driver);
    }



}
