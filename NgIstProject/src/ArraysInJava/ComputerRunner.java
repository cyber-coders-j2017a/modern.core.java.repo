package ArraysInJava;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 17/07/2017.
 */
public class ComputerRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the computer brand you want");
        String computer = scanner.nextLine();
        Computers myComputer = new Computers();
        myComputer.buyComputer(computer);


        System.out.println("Please enter your city");
        String outlet = scanner.nextLine();
        myComputer.showAllStoreOutlets(outlet);


    }





}