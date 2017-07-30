package MethodsInJava;

/**
 * Created by Nick on 30/07/2017.
 */
public class CalcRunner {

    public static void main(String[] args) {

        Calculator sharpCalculator = new Calculator();
       /* sharpCalculator.addTwoNums1();*/
       /*sharpCalculator.addTwoNums2(12, 9);*/

       String answer = sharpCalculator.addTwoNums3(12, 13);
       System.out.println(answer);

    }
}
