/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WelcomeProgram;

import java.util.Scanner;

/**
 *
 * @author oddie
 */
public class HelloMessage {
    public static void main(String[] args){
        
    System.out.println("Hello, what is your name please?");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
   
    System.out.println("Hello "  + input + " welcome to Value cars");
    System.out.println("How can we help you");
    
   }

}
