/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        System.out.println("Please enter number 1");
        Scanner myInput = new Scanner(System.in);
        int locationOne = myInput.nextInt();

        System.out.println("Please enter operation");
        Scanner myOperation = new Scanner(System.in);
        String operation = myOperation.nextLine();
        
        System.out.println("Please enter number2");
        Scanner myInput1 = new Scanner(System.in);
        int location2  = myInput1.nextInt();
        
        
        if(operation.equals("+")){
            int result =  locationOne + location2;
            System.out.println("Answer =" + result);
        } else if (operation.equals("-")) {
           int result =  locationOne - location2;
            System.out.println("Answer =" + result);
        }else if (operation.equals("*")) {
          int result =  locationOne * location2;
            System.out.println("Answer =" + result);
       }else if (operation.equals("/") ){
          int result =  locationOne / location2;
            System.out.println("Answer =" + result);
       }
        
    

   
    
    }
    
    
}
    

