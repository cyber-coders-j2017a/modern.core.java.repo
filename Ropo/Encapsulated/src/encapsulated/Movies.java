/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulated;

import java.util.Scanner;

/**
 *
 * @author ropof
 */
public class Movies {
  
    protected String actors;
    protected int boxOfficeEarnings;
     
    public Movies(){
        String name = this.actors ;
        int earnings = this.boxOfficeEarnings;   
    }
    public void wasSuccessful(){
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        
        if( actor.equalsIgnoreCase("Jamie Foxx" )){
                 System.out.println ("The film will be nice to watch"); 
    }
        else if (actor.equalsIgnoreCase("Johnny Depp" )){
                System.out.println ("The film cannot be low budget");
    }
        else if(actor.equalsIgnoreCase("Charlize theron")){
                 System.out.println ("The film go make sense die");
    }
        else {
                 System.out.println ("Save the money make we go buy lottery tickets joor");
            }
             
    }
    
}

