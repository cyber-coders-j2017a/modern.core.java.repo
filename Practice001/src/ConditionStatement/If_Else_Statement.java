/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionStatement;

import java.util.Scanner;

/**
 *
 * @author oddie
 */
public class If_Else_Statement {
   public static void main(String [] args){
   System.out.println("Hello, welcome to the Maths Grading System");
   System.out.println("Please, enter your Maths score");
   Scanner scanner = new Scanner(System.in);
   String score = scanner.nextLine();
   int mathsScore = Integer.parseInt(score);
 
   if(mathsScore >= 0  && mathsScore <= 39){
      System.out.println("Grade F, You failed the course and need to resit");
   }else if(mathsScore >= 40 && mathsScore <= 45){
      System.out.println("Grade E, Weak pass");
   }else if(mathsScore >= 46 && mathsScore <= 49){
      System.out.println("Grade D, Passed");
   }else if(mathsScore >= 50 && mathsScore <= 59){
      System.out.println("Grade C, credit");
   }else if(mathsScore >= 60 && mathsScore <= 69){
      System.out.println("Grade B, Merit");
   }else if(mathsScore >= 70 && mathsScore <= 89){
      System.out.println("Grade A, Distinction without scholarship");  
   }else if(mathsScore >= 90 && mathsScore <= 100){
      System.out.println("Grade A, Dictinction. Welldone you have won a scholarship!!");}  
   }
 
}
    
