package EncapsulationInJava.GettersAndSettersSecure;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class AccountBalRunner {
    public static void main(String[] args) throws Exception {
        AccountBalance accountBalance = new AccountBalance(4000, 3456, true);
        double myBal = accountBalance.getAccountBal(3456);
        System.out.println(myBal);

        accountBalance.setAccountBal(3456, 3000);

    }
}
