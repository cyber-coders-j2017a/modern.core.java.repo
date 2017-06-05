package assignment.one;

import java.util.Scanner;

/**
 * Created by Edwin on 05/06/2017.
 */
public class VersionOne {

    public static void main(String[] args) {

        System.out.println("Welcome to basic Calculator");
        System.out.println("This calculator is capable of adding, etc");

        Scanner myScan = new Scanner(System.in);
        System.out.println("What would like to do");

        System.out.println("Please enter the first number:? ");
        String firstValue  = myScan.nextLine();
        double firstVal = Double.parseDouble(firstValue);

        System.out.println("Select the operator: 1 => Add, 2 => Minus, 3 => Division, 4 => Multiply, 5 => Reminder");
        String operator = myScan.nextLine();

        System.out.println("Please enter the second number:? ");
        String secondValue  = myScan.nextLine();
        double secondVal = Double.parseDouble(secondValue);

        //Use mathematical symbols when you are dealing with numbers
        //if(variable operator reference)
        //if(36.7 == 37)
        //if("36.7".equal("37"))

        if(operator.equalsIgnoreCase("1")){
            double result = firstVal + secondVal;
            System.out.println("The total of the two numbers is "+result);
        }else if(operator.equalsIgnoreCase("2")){
            double result = firstVal - secondVal;
            System.out.println("The total of the two numbers is "+result);
        }else if(operator.equalsIgnoreCase("3")){
            double result = firstVal / secondVal;
            System.out.println("The total of the two numbers is "+result);
        }else if(operator.equalsIgnoreCase("4")){
            double result = firstVal * secondVal;
            System.out.println("The total of the two numbers is "+result);
        }else if(operator.equalsIgnoreCase("5")){
            double result = firstVal % secondVal;
            System.out.println("The total of the two numbers is "+result);
        }else{
            System.out.println("Calculator cannot handle the operation requested");
        }

//        if(operator.equalsIgnoreCase("+")){
//            double result = firstVal + secondVal;
//            System.out.println("The total of the two numbers is "+result);
//        }else if(operator.equalsIgnoreCase("-")){
//            double result = firstVal - secondVal;
//            System.out.println("The total of the two numbers is "+result);
//        }else if(operator.equalsIgnoreCase("/")){
//            double result = firstVal / secondVal;
//            System.out.println("The total of the two numbers is "+result);
//        }else if(operator.equalsIgnoreCase("*")){
//            double result = firstVal * secondVal;
//            System.out.println("The total of the two numbers is "+result);
//        }else if(operator.equalsIgnoreCase("%")){
//            double result = firstVal % secondVal;
//            System.out.println("The total of the two numbers is "+result);
//        }else{
//            System.out.println("Calculator cannot handle the operation requested");
//        }
    }
}
