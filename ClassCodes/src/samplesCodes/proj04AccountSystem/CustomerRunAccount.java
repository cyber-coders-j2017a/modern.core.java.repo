package samplesCodes.proj04AccountSystem;

/**
 * Created by dotcom on 7/31/17.
 */
public class CustomerRunAccount {

    public static void main(String[] args) {
        HsbcUk currentAccount = new HsbcUk("Yes we can", "12 Imiana Street", "White and Red");

        currentAccount.createCustomerAccount("John Doe");
        currentAccount.creditAccount(233, 1000);

    }
}
