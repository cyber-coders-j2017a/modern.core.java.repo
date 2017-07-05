package fullcodes.session.accessModifiers;

/**
 * Created by dotcom on 6/30/17.
 */
public class AccessModRunner {

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.withdrawMoney();
        currentAccount.payIn();
    }
}
