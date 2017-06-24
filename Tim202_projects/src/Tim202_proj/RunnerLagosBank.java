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

    }
}
