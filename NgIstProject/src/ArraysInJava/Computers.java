package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by beatriceotugo on 17/07/2017.
 */
public class Computers {


    public void buyComputer(String findMyComputer) {
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
            //System.out.println(ComputerBrands[x]);

            if (findMyComputer.toLowerCase().equalsIgnoreCase(ComputerBrands[x])) {
                System.out.println("We do sell this computer brand");
                return;

            }

        }

        System.out.println("We do not sell this computer brand");

    }

    public void showAllStoreOutlets(String findAnOutlet) {
        String[] storeOutlet = {"london", "lancaster", "Aberystwyth", "Portcawl", "HemelHempstead", "Woking"};
        for(String stores : storeOutlet) {


            if(findAnOutlet.toLowerCase().equalsIgnoreCase(stores)) {
                System.out.println("We do sell this computer brand in the outlet above, please check our address section for Postcode");
                return;

            }

        }

        System.out.println("We do not sell this computer brand in the city entered");



    }


    //String[] outlet1 = storeOutlet.clone();
}
