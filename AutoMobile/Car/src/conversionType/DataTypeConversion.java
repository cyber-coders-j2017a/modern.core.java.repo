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
public class DataTypeConversion {
    
    
    public static void main(String args []){
        
        //Converting from String to Integer
            String fuelPriceYesterday = "80";
            String fuelPriceToday = "100";
            
            
            int price1 = Integer.parseInt(fuelPriceYesterday);
            
            int price2 = Integer.parseInt(fuelPriceToday);
            
            
            System.out.println(price2 + price1);
            
            String p1 = Integer.toString(price1);
            
              String p2 = Integer.toString(price2);
              
              String py = Double.toString(price2);
    }
    
}
