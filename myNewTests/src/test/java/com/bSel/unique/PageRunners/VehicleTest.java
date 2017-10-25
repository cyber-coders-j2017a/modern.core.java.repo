package com.bSel.unique.PageRunners;

import Reader.ExcelXlsReaderParameter;
import com.bSel.unique.Hooks.hooksTest;
import com.bSel.unique.Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/**
 * Created by beatriceotugo on 24/10/2017.
 */



@RunWith(Parameterized.class)
public class VehicleTest extends hooksTest {


    private String vehicleNumber;
    private String make;
    private String colour;




    @Parameterized.Parameters
    public static Collection spreadsheetData() throws IOException {
        String excelName = "/TestData/VehicleData.xls";
        String localPath = "/src/test/java/Resources";
        String path = System.getProperty("user.dir")+ localPath+excelName;
        InputStream spreadsheet = new FileInputStream(path);
        return new ExcelXlsReaderParameter(spreadsheet).getData();
    }



    public VehicleTest(String vehicleNumber, String make, String colour) {
        this.vehicleNumber = vehicleNumber;
        this.make = make;
        this.colour = colour;
    }



    @Test(timeout = 20000)
    public void validateVehicleDetails() {
        browserManager.visitURL("https://www.gov.uk/");
        HomePage homePage = new HomePage(driver);
        boolean result = homePage
                .goToDrivingAndTransportPage()
                .goToDataInformationPage()
                .goToVehicleInfoPage()
                .startValidationPage()
                .enterVehicleDetails(vehicleNumber)
                .validateVehicleMake(make, colour);
        Assert.assertTrue(result);
    }

}
