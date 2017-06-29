package OOPConcept2;

/**
 * Created by beatriceotugo on 29/06/2017.
 */


   /* Write a program to get a ticket from the ticket machine based on destination

      London to Surrey => £21
      London to Glasgow => £120.65
      London to Manchester => £62
      London to Birmingham => £55
      London to Wales => £68.71
     */
public class  TicketMachine {

    public String ticketMachineLocation = "EustonStation";
    public int ticketMachineNo = 3;
    public String ticketPrice = "Displayed Amount";


    public void displayRequestedTicket(String myDestination) {
        if(myDestination.equalsIgnoreCase("Surrey")) {
            Surrey woking = new Surrey();
            System.out.println("Please see price displayed " +woking.SurreyPrice);

        }else if(myDestination.equalsIgnoreCase("Glasgow")) {
            Glasgow city = new Glasgow();
            System.out.println("Please see price displayed " +city.GlasgowPrice);

        }else if(myDestination.equalsIgnoreCase("Manchester")) {
            Manchester cityCentre = new Manchester();
            System.out.println("Please see price displayed " +cityCentre.ManchesterPrice);

        }else if(myDestination.equalsIgnoreCase("Birmingham")) {
            Birmingham station = new Birmingham();
            System.out.println("Please see price displayed " +station.BirminghamPrice);

        }else if(myDestination.equalsIgnoreCase("Wales")) {
            Wales city = new Wales();
            System.out.println("Please see price displayed " +city.WalesPrice);

        }else {
            System.out.println("Sorry, no ticket for selected destination at this time");
        }

    }

    public void selectSpecificTicket() {

    }


    public void issueRequiredTicket() {

    }


    public void issueReceipt() {


    }
}
