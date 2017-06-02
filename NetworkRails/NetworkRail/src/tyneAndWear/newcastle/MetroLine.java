/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyneAndWear.newcastle;

import java.util.Scanner;



/**
 *
 * @author Edwin
 */
public class MetroLine {
    
    
    public static void main(String [] args){
           
       
        System.out.println("Which Train Station is near your home please?");
         
        Scanner scanner1 = new Scanner(System.in);
        String k = scanner1.nextLine();            
        
        System.out.println("The train station near my home is "+ k + " and it is 10km from where I live");

        
        
    }
    
}
