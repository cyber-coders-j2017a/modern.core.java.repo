/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprisePark;

import java.util.Scanner;


/**
 *
 * @author Edwin
 */
public class Matalan {
    
    //This is a code that would take customer in Matlan and greet people and ask them what they want
    
    public static void main(String [] args){
        
        
        System.out.println("What is your name?");
        
        Scanner matlanScanner = new Scanner(System.in);
        String customerNameValue  = matlanScanner.nextLine();
        
        System.out.println("Hey, "+ customerNameValue + "Welcome to Matlan this afternoon.");
        System.out.println("What can we do for you ");
        
                
        // Data Types        
        
        System.out.println(2+2);
        
    }
    
    
}
