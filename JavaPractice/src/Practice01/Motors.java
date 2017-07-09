/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuecar;

import java.util.Scanner;

/**
 *
 * @author oddie
 */
public class Motors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     //
        System.out.println("Welcome to Value cars");
        System.out.println("We have these list of cars for sale");
        String a[] = new String[5];
       
        a[0] = "Toyota Yaris";
        a[1] = "Ford focus";
        a[2] = "Citreon C4";
        a[3] = "Mazda 3";
        a[4] = "Audi A4";
        for (String a1 : a) {
            System.out.println(a1);
           
        }
        
       
       System.out.println("Please enter your choice of car for price");
       Scanner scanner = new Scanner(System.in);
       String carMake = scanner.nextLine();
      
       if(carMake.equalsIgnoreCase("Toyota Yaris")){
         System.out.println("Price of car is £3500.00");
       }else if(carMake.equalsIgnoreCase("Ford focus")){
         System.out.println("Price of car is £2500.00");
       }else if(carMake.equalsIgnoreCase("Ford focus")){
         System.out.println("Price of car is £1500.00");
       }else if(carMake.equalsIgnoreCase("Mazda 3")){
         System.out.println("Price of car is £2000.00");
       }else if(carMake.equalsIgnoreCase("Ford focus")){
         System.out.println("Price of car is £3000.00");
       }else
         System.out.println("We dont have such car in stock");
    
    }
}           
 


