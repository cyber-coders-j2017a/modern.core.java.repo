package Calculator.calc;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by Ritanadis on 07/06/2017.
 */
public class mimic {
    public static void main(String[] args){
        System.out.println("Welcome to our Calculator");

        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter your first number");
       String firstNumber = myInput.nextLine();
       Long firstNum = Long.parseLong(firstNumber);

        System.out.println("Please enter your operator");
         String operator = myInput.nextLine();

        System.out.println("Please enter your second number");
        String secondNumber = myInput.nextLine();
        Long secondNum = Long.parseLong(secondNumber);

        if(operator.equalsIgnoreCase("+")) {
            Long result = firstNum + secondNum;
            System.out.println("Answer =" + result);

        }else if(operator.equalsIgnoreCase("-")) {
            Long result = firstNum - secondNum;
            System.out.println("Answer =" + result);

        }else if(operator.equalsIgnoreCase("*")) {
            Long result = firstNum * secondNum;
            System.out.println("Answer =" + result);

        }else if(operator.equalsIgnoreCase("/")) {
            Long result = firstNum / secondNum;
            System.out.println("Answer =" + result);

        }else if(operator.equalsIgnoreCase("%")) {
            Long result = firstNum % secondNum;
            System.out.println("Answer =" + result);

        }else {
            System.out.println("Error");
        }

        }


    }

