package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class VehicleInformationPage extends BasePage {

    protected By buttonLocator = By.className("button");


    public VehicleInformationPage(WebDriver driver) {
        super(driver);
    }


    public ValidationPage startValidationPage() {
        for (WebElement idElement : driver.findElements(buttonLocator)) {
            if (idElement.getAttribute("href").toLowerCase().contains("https://www.vehicleenquiry.service.gov.uk")) {
                idElement.click();
                break;
            }
        }
        return new ValidationPage(driver);
    }
}
