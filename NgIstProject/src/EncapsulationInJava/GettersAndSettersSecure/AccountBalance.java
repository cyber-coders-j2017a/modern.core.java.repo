package EncapsulationInJava.GettersAndSettersSecure;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class AccountBalance {

    private double accountBal = 2000;
    private static final int pinNumber = 3456;
    private boolean canBeAccessed;


    public AccountBalance(double accountBal, int pinNo, boolean canBeAccessed) {
        this.accountBal = accountBal;
        this.canBeAccessed = canBeAccessed;
    }


    public double getAccountBal(int pinNo) throws Exception {
        if(pinNo == pinNumber) {
            return accountBal;

        }else{
            throw new Exception("Authorisation Denied");
        }

    }
    public void setAccountBal(int pinNo, double amount) throws Exception {
        if(pinNo == pinNumber) {
            this.accountBal = accountBal + amount;
            System.out.println("Your new account balance after deposit is " + accountBal);

        }else if (pinNo != pinNumber){
            throw new Exception("Pin number incorrect, please try again!!!");

        }
    }


    public boolean isCanBeAccessed() {
        return canBeAccessed;
    }
    public void setCanBeAccessed(boolean canBeAccessed) {
        this.canBeAccessed = canBeAccessed;
    }
}
