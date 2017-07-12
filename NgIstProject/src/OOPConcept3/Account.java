package OOPConcept3;

/**
 * Created by beatriceotugo on 11/07/2017.
 */
public class Account {

    private double accountBal = 30000;
    protected double cashInherited = 5000;


    public void displayAccountBal(double accountBal) {
        this.accountBal = accountBal;

    }

    public double getAccountBal() {
        return this.accountBal;

    }

    public void issueCheque() {
        System.out.println("issueCheque");

    }

    protected void withdrawCash() {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.displayBalAfter();
        System.out.println("Withdrawing money...");

    }

    private void remitCashToCharity(){
        System.out.println("Pay the remaining cash of " +accountBal+ " to charity");

    }
}
