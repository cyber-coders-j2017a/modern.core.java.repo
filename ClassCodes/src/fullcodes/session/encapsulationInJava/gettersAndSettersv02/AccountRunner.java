package fullcodes.session.encapsulationInJava.gettersAndSettersv02;

/**
 * Created by dotcom on 7/28/17.
 */
public class AccountRunner {

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();
        account.setAccountbalance(2131, 1000);
        double bal = account.getAccountbalance(2131);

    }
}
