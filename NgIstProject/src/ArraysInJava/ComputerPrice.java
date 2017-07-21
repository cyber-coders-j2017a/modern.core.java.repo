package ArraysInJava;

import java.util.Arrays;

/**
 * Created by beatriceotugo on 17/07/2017.
 */
public class ComputerPrice {


    public void displayStoreComputerPrice() {

        //int computerPrice [] = new int[5];

        int[] computerPrices = {50, 100, 900, 1500, 600};

        for (int StorePrice : computerPrices) {
            System.out.println(StorePrice);

        }


    }public void displayOnlineComputerPrice() {
            double [] price = {100.00, 200.00, 375.00, 1600.75, 655.99};
            System.out.println(price[3]);
            double[] price1 = price.clone();
            double[] price2 = Arrays.copyOf(price, 3);

    }


}
