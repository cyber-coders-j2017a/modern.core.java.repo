package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by beatriceotugo on 17/07/2017.
 */
public class Computers {


    public void buyComputer() {
        String[] ComputerBrands = new String[10];
        ComputerBrands[0] = "hp";
        ComputerBrands[1] = "mac";
        ComputerBrands[2] = "lenovo";
        ComputerBrands[3] = "dell";
        ComputerBrands[4] = "asus";
        ComputerBrands[5] = "sony";
        ComputerBrands[6] = "acer";
        ComputerBrands[7] = "panasonic";
        ComputerBrands[8] = "fujitsu";
        ComputerBrands[9] = "compaq";

        for (int x = 0; x < ComputerBrands.length; x++) {
            System.out.println(ComputerBrands[x]);

            if (ComputerBrands[x].toLowerCase().contains("Hitachi".toLowerCase())) {
                System.out.println("We do not sell Hitachi, please choose another computer brand");
                break;
            }


        }

    }


    public void showAllStoreOutlets() {
        String[] storeOutlet = {"london", "lancaster", "Aberystwyth", "Portcawl", "HemelHempstead", "Woking"};
        for(String stores : storeOutlet) {
            System.out.println(stores);

            String[] outlet1 = storeOutlet.clone();
        }


    }
}
