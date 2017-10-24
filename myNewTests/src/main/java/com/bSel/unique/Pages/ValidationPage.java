package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class ValidationPage extends BasePage{

    private By vehicleDetailLocator = By.className("form-control-1-4");
    protected By buttonLocator = By.className("button");


    public ValidationPage(WebDriver driver) {
        super(driver);
    }

    public ConfirmVehiclePage enterVehicleDetails(String vehicleNumber){
            driver.findElement(vehicleDetailLocator).sendKeys(vehicleNumber);

            for (WebElement classElement : driver.findElements(buttonLocator)) {
            if (classElement.getAttribute("name").toLowerCase().contains("continue".toLowerCase())) {
                classElement.click();
                break;
            }
        }

        return new ConfirmVehiclePage(driver);
    }




}
