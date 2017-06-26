/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_multiple_class;

/**
 *
 * @author Jeffries Pc
 */
public class PhoneDealership_Class {
    
  String director = "jeff";
  String NumbOfAssistants = "3";
  boolean phoneDisplaySection = true;
  boolean waitingArea = true;
  

   
    
   public void sellphones(String phone){
       if (phone.equalsIgnoreCase("jphone")){
           
        jphone_Class slim  = new  jphone_Class ();
         System.out.println (slim.price1);
           
        } else if (phone.equalsIgnoreCase("mphone")){
           mphone slimmer  = new  mphone();
         System.out.println (slimmer.price2);
      
        } else if (phone.equalsIgnoreCase("nphone")){ 
         nphone_Class slimz  = new  nphone_Class ();
         System.out.println (slimz.price3);
      
       } else{
          System.out.println("there is no such phone");
           
          
       }
               
   }
   
   public void sellphoneAccessories(){}
  
   public void repairs(){}
   
   public void offerPhoneContracts(){}
   
  
  
  
    
   
    
}
