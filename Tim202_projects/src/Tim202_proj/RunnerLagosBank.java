package Tim202_proj;

/**
 * Created by Kanini W'Tang on 6/24/2017.
 */
public class RunnerLagosBank {
    public static void main(String[] args) {

        lagosBank myElephantBank = new lagosBank();
        myElephantBank.bankCustomers = 700000;
        myElephantBank.bankAddress ();
        myElephantBank.bankGdp();

        String transc1 = myElephantBank.bankOpeningtimes;

        System.out.println("The code worked as expected - bravo");
        System.out.println(myElephantBank.bankCustomers);
        System.out.println(myElephantBank.bankAddress);
        System.out.println(myElephantBank.bankGdp);
        System.out.println(myElephantBank.bankEmployees);
        System.out.println(myElephantBank.bankTypes3;);
        System.out.println(myElephantBank.bankMinimiumOpeningBalance);
        System.out.println(myElephantBank.bankRegulator(););

    }
}
