/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wutangcodes;

import java.util.Scanner;

/**
 *
 * @author Kanini W'Tang
 */
public class Wutangcodes {



// Assignment on Simple Calculator in Java using conditional statements//

public static void main(String[]args){

   System.out.println("Please input your First integer = X :");

   Scanner firstNumber = new Scanner (System.in);
int x = firstNumber.nextInt();
firstNumber.nextLine();


System.out.println("Please input your second integer = Y :");
 
int y = firstNumber.nextInt();

firstNumber.nextLine();

   //Choose the mathematical operation to perform (+,-,*,/,%)

        System.out.println("What operation would you like to use?");
        System.out.println("Type \"+\" to add.");
        System.out.println("Type \"-\" to subtract.");
        System.out.println("Type \"*\" to multiply.");
        System.out.println("Type \"/\" to divide.");
	System.out.println("Type \"%\" to modulus.");
        String calculation = firstNumber.nextLine();

        //Addition
        if (calculation.equals("+")) {
            int ans = x + y;
            System.out.println("Adding " + y + " to " + x + " equals " + ans + ".");
        
        }

        //Subtractration
        else if (calculation. equals ("-")) {
            int ans = x - y;
            System.out.println("Subtracting " + y + " from " + x + " equals " + ans + ".");
        }

        //Multiplication
        else if (calculation. equals ("*")) {
            int ans = x * y;
            System.out.println("Multiplying " + y + " with " + x + " equals " + ans + ".");
        }

        //Division
        else if (calculation.equals("/")) {
            int ans = x / y;
            System.out.println("Dividing " + x + " by " + y + " equals " + ans + ".");
        }
	
	//Modulus
        else if (calculation.equals("%")) {
            int ans = x % y;
            System.out.println("Modulus " + x + " by " + y + " equals " + ans + ".");
    }

}
}

    
    
    
    
        
    
      

        
    
    
    
    
    
    
            
    
            
    
  

