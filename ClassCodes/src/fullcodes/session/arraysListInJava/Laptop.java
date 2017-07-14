package fullcodes.session.arraysListInJava;

import java.util.ArrayList;

/**
 * Created by dotcom on 7/14/17.
 */
public class Laptop {



    public void printOutAllValuesUsingEnhancedForLoop(){
        ArrayList<Double> prices = this.createLaptopNames();
        for(double lappyPrice : prices){
            System.out.println(lappyPrice);
        }

    }


    private ArrayList<Double> createLaptopNames(){

        ArrayList<Double> lappyPrices = new ArrayList<Double>();

        lappyPrices.add(1200D);
        lappyPrices.add(2500D);
        lappyPrices.add(2000D);
        lappyPrices.add(1600D);
        lappyPrices.add(1225D);
        lappyPrices.add(1400D);
        lappyPrices.add(5, 67890d);
        lappyPrices.set(1, 23142.0);
        return lappyPrices;
    }

    public void printOutAllValuesUsingForLoop() {
        ArrayList<Double> prices = this.createLaptopNames();
        for (int i = 0; i < prices.size(); i++){
            System.out.println(prices.get(i));
        }
    }

    public void getPriceLocation() {
        ArrayList<Double> prices = this.createLaptopNames();
        int numIndex = prices.indexOf(1225D);
        System.out.println(numIndex);
    }

    public void getRideOfLaptopPrice() {
        ArrayList<Double> prices = this.createLaptopNames();

        boolean ans = prices.remove(1200D);
        System.out.println(ans);
        //OR
//        double value = prices.remove(5);
//        System.out.println(value);
    }
}
