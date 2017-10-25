package com.bSel.unique.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by beatriceotugo on 24/10/2017.
 */
public class ConfirmVehiclePage extends BasePage{

    private By makeClassLocator = By.className("list-summary-item");
    private By makeTagLocator = By.linkText("Make");
    private By colourTagLocator = By.linkText("Colour");


    public ConfirmVehiclePage(WebDriver driver) {

        super(driver);
    }

    public boolean validateVehicleMake(String make, String colour) {
        for (WebElement element : driver.findElement(makeClassLocator).findElements(makeTagLocator)) {
            if (!element.getText().toLowerCase().contains(make.toLowerCase())) continue;
            break;
        }


        for (WebElement element2 : driver.findElement(makeClassLocator).findElements(colourTagLocator)) {
            if (!element2.getText().toLowerCase().contains(colour.toLowerCase())) continue;
            return true;
        }
        return false;
    }


}
