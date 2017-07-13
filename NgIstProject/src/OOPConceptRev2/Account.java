package OOPConceptRev2;

/**
 * Created by beatriceotugo on 12/07/2017.
 */
public class Account {

    //check balance, withdraw and deposit cash

    private String accountName;
    private double accountBal;
    private String bankName;

    public Account() {
        this.accountName = "Dee Mine";
        this.accountBal = 2000D;
        this.bankName = "barclays";
    }

    public Account(String accountName, double accountBal, String bankName) {
        this.accountName = accountName;
        this.accountBal = accountBal;
        this.bankName = bankName;
    }

    public double getAccountBalance() {
        return accountBal;
    }

    public void depositCash(double amount) {
       double newaccountBal = accountBal + amount;
       this.accountBal = newaccountBal;
       System.out.println("Your new account balance after deposit is " +newaccountBal);
    }

    public String withdrawCash(double amount) {
        double newaccountBal = accountBal - amount;
        this.accountBal = newaccountBal;
        return "Your new account balance after withdrawal is " +newaccountBal;
    }

    public void showaccountName() {
        System.out.println("Welcome back " +accountName+ "!");
    }
}

