package OOPConcept2;

import java.util.Scanner;

/**
 * Created by beatriceotugo on 29/06/2017.
 */
public class Passenger {

    public static void main(String[] args) {

        System.out.println("Please enter your destination");

        Scanner myscan = new Scanner(System.in);
        String myDestination = myscan.nextLine();

        TicketMachine machine3 = new TicketMachine();
        machine3.displayRequestedTicket(myDestination);








    }
}
