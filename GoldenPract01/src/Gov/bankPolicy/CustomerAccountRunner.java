package Gov.bankPolicy;

/**
 * Created by Ritanadis on 10/08/2017.
 */
public class CustomerAccountRunner {
    public static void main(String[] args) {
        AccessBankUk currentAccount = new AccessBankUk("7 Market Place Kent", "01334563832", "Excellent Banking");

        currentAccount.createCustomerAccount("Afam Udoh");


    }
}
