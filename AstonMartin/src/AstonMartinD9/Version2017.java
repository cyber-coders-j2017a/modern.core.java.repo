package AstonMartinD9;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Kanini W'Tang on 6/11/2017.
 */
public class Version2017 {
    public static void main (String [] args){
        System.out.println("Welcome to Casio Calculator for all mathematical solutions");

        System.out.println("This calculator will add,substract,multiple,divide and Modulus");

        Scanner myScan = new Scanner (System.in);

        System.out.println("What mathematical calculation do you want to perform");
        System.out.println("Please enter your first digit for calculation");

        String firstValue= myScan.nextLine();
        double firstVal=Double.parseDouble(firstValue);

        System.out.println("Please select an operator where 1=Add,2=Substract,3=Multiple,4=Divide and 5= Modulus");
        String operator = myScan.nextLine();
        System.out.println("Please enter your second digit for calculation");

        String secondValue= myScan.nextLine();
        double secondVal=Double.parseDouble(secondValue);

        if (operator.equals("1"));
        double result =firstVal + secondVal;
        System.out.println("The total of the two numbers is:" + result);

    }

}
