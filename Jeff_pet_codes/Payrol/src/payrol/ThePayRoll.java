/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrol;

/**
 *
 * @author Jeffries Pc
 */
public class ThePayRoll {
    
    
    public void displayEmployeeNames(){
      
        String [] employeeNames = {
            "James cony",
            "Brain cony",
            "Jeffery cocks",
            "Mango butt",
            "Orange glutt",
            "Papi monuel",
            "Hannah clean",
            "Jeans degale",
            "Moses cony",
            "Mugu nana",
            "Clement dodd",
        }; 
        
//        
//         for (int i = 0; i < employeeNames.length; i++ ) {
//              System.out.println(i);
//        }
       for (String employeeName : employeeNames) {
           if (employeeName.equalsIgnoreCase("Clement dodd")){
            System.out.println("Clement dood you owe payroll");
           }  
       }
    
    }
    
     public void showBonusPackages(){
         
         double[] bonusPackages = new double[]{1000.00, 876.56, 3000, 4000, 1332.50};
          System.out.println(bonusPackages[2]); 
        
     }
}
