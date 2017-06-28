package fullcodes.session.oop.methods;

import java.util.Scanner;

/**
 * Created by dotcom on 6/28/17.
 */
public class RunnerCalc {

    public static void main(String[] args) {

        //Instantiation is a process of creating object out of a class
        Calculator calculator = new Calculator();
        Calculator compute = new Calculator(20, 10, 11d);
        Scanner scanner = new Scanner(System.in);

//        Calculator calc = new Calculator(new Focus());
        Object name = calculator.getFirstName();
        double firstName = (Double) name;


        calculator.addTwoNumbers1();
        calculator.addTwoNumbers2(11, 81);

        String batcha2017 = calculator.addTwoNumbers3(4, 1);
//        System.out.println(batcha2017);
    }
}
