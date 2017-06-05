package assignment.one;

import java.util.Scanner;

/**
 * Created by Edwin on 05/06/2017.
 */
public class VersionTwo {

    public static void main(String []args){
        Scanner scanning = new Scanner(System.in);

        System.out.println("Welcome to basic Calculator");
        System.out.println("This calculator is capable of adding, etc");


        System.out.println("What would like to do");

        System.out.println("Please enter the first number:? ");
        String firstValue  = scanning.nextLine();
        double firstVal = Double.parseDouble(firstValue);

        System.out.println("Select the operator: 1 => Add, 2 => Minus, 3 => Division, 4 => Multiply, 5 => Reminder");
        String operator = scanning.nextLine();

        System.out.println("Please enter the second number:? ");
        String secondValue  = scanning.nextLine();
        double secondVal = Double.parseDouble(secondValue);


        switch (operator){
            case "1":
                double resultOne = firstVal + secondVal;
                System.out.println("Addition result is "+resultOne);
                break;
            case "2":
                double resultTwo = firstVal - secondVal;
                System.out.println("Subtraction result is "+resultTwo);
                break;
            case "3":
                double resultThree = firstVal / secondVal;
                System.out.println("Subtraction result is "+resultThree);
                break;
            case "4":
                double resultFour = firstVal * secondVal;
                System.out.println("Subtraction result is "+resultFour);
                break;
            case "5":
                double resultFive = firstVal % secondVal;
                System.out.println("Subtraction result is "+resultFive);
                break;
            default:
                System.out.println("Calculator cannot handle the operation requested");
                break;
        }


    }
}
