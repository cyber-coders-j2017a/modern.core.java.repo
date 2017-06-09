/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionType;

/**
 *
 * @author Edwin
 */
public class DataTypeConversionStringToLong {
    
    public static void main(String args []){
        
        //Converting from String to Integer
            String fuelPriceYesterday = "85285";
            String fuelPriceToday = "10810";
            
            long price1 = Long.parseLong(fuelPriceYesterday);
//            double price1 = Double.parseDouble(fuelPriceYesterday);
//            int price1 = Integer.parseInt(fuelPriceYesterday);
            
              long price2 = Long.parseLong(fuelPriceToday);
//            double price2 = Double.parseDouble(fuelPriceToday);
//            int price2 = Integer.parseInt(fuelPriceToday);
            
            
            System.out.println(price2 + price1);
            
            
    }
    
}
