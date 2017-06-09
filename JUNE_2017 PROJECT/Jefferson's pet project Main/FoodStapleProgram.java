/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodStapleApp;

import java.util.Scanner;

/**
 *
 * @author Jeffries Pc
 */
public class FoodStapleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
//       STAPLE FOOD CENTRE
      
      System.out.println ("Hello welcome to the Staple Food Centre!!!");
      System.out.println ("Staples available today include: rice,beans,garri and pando");
      System.out.println ("What will you like to purchase?");
      
                     int bagOfRice  = 1000;
                     int bagOfBeans = 850;  
                     int bagOfGarri = 600;
                     int bagOfPando = 700;
         
        
        
       Scanner scanner = new Scanner(System.in);
       String itemName = scanner.nextLine();
                   
        if (itemName.equals("beans")){
              System.out.println("N850 per bag");
              System.out.println ("How many bags will you like to buy?");
          
         
          
          
              
              String numberOfBags = scanner.nextLine();
       
           int TotalNumbersOfBag = Integer.parseInt(numberOfBags);
       
        if (TotalNumbersOfBag >= 1); 
              System.out.println("price =N" + TotalNumbersOfBag * bagOfBeans );
              System.out.println("Are you paying by Card or Cash?"); 
     
             
              String methodOfPayment = scanner.nextLine();
         
         if (methodOfPayment.equals("card") || methodOfPayment.equals("cash") ); 
              System.out.println("Please insert into machine" );
              System.out.println("Thanks for shopping at the Staple food Centre" );
              System.out.println("Until next time, Bye for now!!!" );
               
       
             
           
  }else if  (itemName.equals("rice")){
              System.out.println("N1000 per bag");
              System.out.println ("How many bags will you like to buy?"); 
       
      
      
              
              String numberOfBags2 = scanner.nextLine();    
       
              int TotalNumbersOfBag2 = Integer.parseInt(numberOfBags2);
       
         if (TotalNumbersOfBag2 >= 1);
              System.out.println("price =N" + TotalNumbersOfBag2 * bagOfRice );
              System.out.println("Are you paying by Card or Cash?"); 
     
              
              String methodOfPayment = scanner.nextLine();
         
         if (methodOfPayment.equals("card") || methodOfPayment.equals("cash") ); 
              System.out.println("Please insert into machine" );
              System.out.println("Thanks for shopping at the Staple food Centre" );
              System.out.println("Until next time, Bye for now!!!" );
                          
    
              
  }else  if (itemName.equals("garri")){
             System.out.println("N600 per bag");
             System.out.println ("How many bags will you like to buy?");
          
          
          
          
             
             String numberOfBags3 = scanner.nextLine();
       
             int TotalNumbersOfBag3 = Integer.parseInt(numberOfBags3);
       
         if (TotalNumbersOfBag3 >= 1); 
             System.out.println("price =N" + TotalNumbersOfBag3 * bagOfGarri );
             System.out.println("Are you paying by Card or Cash?"); 
   
            
             String methodOfPayment = scanner.nextLine();
         
         if (methodOfPayment.equals("card") || methodOfPayment.equals("cash") ); 
             System.out.println("Please insert into machine" );
             System.out.println("Thanks for shopping at the Staple food Centre" );
             System.out.println("Until next time, Bye for now!!!" );
               
              
               
  }else  if  (itemName.equals("pando")){
             System.out.println("N700 per bag");
             System.out.println ("How many bags will you like to buy?");
          
          
          
          
             
             String numberOfBags4 = scanner.nextLine();
       
             int TotalNumbersOfBag4 = Integer.parseInt(numberOfBags4);
       
         if  (TotalNumbersOfBag4 >= 1); 
             System.out.println("price =N" + TotalNumbersOfBag4 * bagOfPando );
             System.out.println("Are you paying by Card or Cash?"); 
     
           
            String methodOfPayment = scanner.nextLine();
         
         if (methodOfPayment.equals("card") || methodOfPayment.equals("cash") ); 
            System.out.println("Please insert into machine" );
            System.out.println("Thanks for shopping at the Staple food Centre" );
            System.out.println("Until next time, Bye for now!!!" );
               
               
               
    }else{
             System.err.println("error!!! not recognised try again");
         }  
      
      
       
          
          
      }
      
   }
    
                 
                    
                   
  
      
      
      
      
      
        
        
        
    
    

