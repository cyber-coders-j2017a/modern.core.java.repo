package samplesCodes.prog03;

/**
 * Created by dotcom on 7/5/17.
 */
public class AccountRunner {

    public static void main(String[] args) {

//      Class   Object   = newMemory   Constructor
        Account barclays = new Account(128000, "Wilson Jones", "Barclays");

        double initialAmount = barclays.getAccountBalance();
        System.out.println(initialAmount);

        String newBal = barclays.depositMoney(8000);
        System.out.println(newBal);

        String newBal2 = barclays.withdrawMoney(125);
        System.out.println(newBal2);


    }
}
