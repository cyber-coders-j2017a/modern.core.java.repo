package samplesCodes.prog02;

import java.util.Scanner;

/**
 * Created by dotcom on 6/23/17.
 */
public class Passanger {
    public static void main(String[] args) {
        Scanner myConsoleScanner = new Scanner(System.in);
        System.out.println("Where are you traveling to ?");

        String destination = myConsoleScanner.nextLine();

        BusTicketStand standA = new BusTicketStand();
        standA.sellTicket(destination);
    }
}
