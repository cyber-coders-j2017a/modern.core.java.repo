package samplesCodes.prog03;

/**
 * Created by dotcom on 7/5/17.
 */
public class AccountRunner {

    public static void main(String[] args) {

//      Class   Object   = newMemory   Constructor
        Account barclays = new Account(128000, "Wilson Jones", "Barclays");
        Double initialAmount = barclays.getAccountBalance();

        String newBal = barclays.depositMoney(8000);

        String newBal2 = barclays.withdrawMoney(125);


        // Making this class very generic
        Account halifax = new Account(3000, "Jeff Oshare", "Halifx");
        double defualtBal = halifax.getAccountBalance();
    }
}
