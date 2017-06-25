/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_multiple_class;

import java.util.Scanner;

/**
 *
 * @author Jeffries Pc
 */
public class Customer_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello Welcome to phoneDealership");
      
        Scanner takefromconsole = new Scanner(System.in);
        System.out.println("What phone are you after?");
         
  
         String phone = takefromconsole.nextLine();
        
         PhoneDealership_Class attendant = new PhoneDealership_Class();
         attendant.sellphones(phone);
    }
    
    
    
   
   
}
