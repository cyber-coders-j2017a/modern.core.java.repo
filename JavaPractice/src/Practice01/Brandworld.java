package Practice01;

import java.util.Scanner;

/**
 * Created by oddie on 30/06/2017.
 */
public class Brandworld {
    public static void main(String[] args) {
        System.out.println("Welcome to Brandworld Ltd");
        System.out.println("Where would you like to go");
        System.out.println();

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 1 for Services department");
        System.out.println("Enter 2 for Sales department");
        System.out.println("Enter 3 for Human resource department");
        System.out.println("Enter 4 for Customer Services");
        System.out.println("Enter 5 for Management Offices");
        System.out.println();

        System.out.println("Please choose an option now");
        String Option = input.nextLine();
        int opt = Integer.parseInt(Option);
        if (opt == 1) {
            System.out.println("Service available from 10am - 2pm");
        } else if (opt == 2) {
            System.out.println("Our sales department is on the second floor");
            System.out.println("We are open from 9am - 6pm");
        } else if (opt == 3) {
            System.out.println("Our Human resource department is on the fifth floor");
        } else if (opt == 4){
            System.out.println("Our Customer Service department is on the first floor");
        } else if (opt == 5){
            System.out.println("Management Offices is on the Third floor");
            System.out.println("We are open from 9am - 6pm");

    }
 }
}


