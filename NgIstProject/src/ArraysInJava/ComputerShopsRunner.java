package ArraysInJava;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 19/07/2017.
 */
public class ComputerShopsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a shop and City");
        String city = scanner.nextLine();

        ComputerShops shops = new ComputerShops();
        shops.sourceCheaperComputerBrand(city);

    }

}
