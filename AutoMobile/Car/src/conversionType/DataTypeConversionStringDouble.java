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
public class DataTypeConversionStringDouble {
    
    
     public static void main(String args []){
        
        //Converting from String to Integer
            String fuelPriceYesterday = "80";
            String fuelPriceToday = "100";
            
            
            
            double price1 = Double.parseDouble(fuelPriceYesterday);
//            int price1 = Integer.parseInt(fuelPriceYesterday);
            double price2 = Double.parseDouble(fuelPriceToday);
//            int price2 = Integer.parseInt(fuelPriceToday);
            
            
            System.out.println(price2 + price1);
            
            
    }
}
