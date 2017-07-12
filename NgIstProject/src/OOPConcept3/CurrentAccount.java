package OOPConcept3;

/**
 * Created by beatriceotugo on 11/07/2017.
 */
public class CurrentAccount extends Account{

    private String accountName = "Jo";

    public void DepositCash() {
        System.out.println(cashInherited);

    }

    void displayBalAfter() {
        int myBalAfter = 6000;
        System.out.println("The account balance of " +accountName+"'s account after deposit is " +myBalAfter);
    }

}
