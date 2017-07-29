package fullcodes.session.encapsulationInJava.gettersAndSettersv02;

/**
 * Created by dotcom on 7/28/17.
 */
public class BankAccount {
    private static final int PIN_NUMBER = 2131;

    private double accountbalance = 1500;
    private boolean isAccessed = true;




    public double getAccountbalance(int pinNum) throws Exception {
        if(pinNum == PIN_NUMBER){
            return accountbalance;
        }else {
            throw new Exception("You are not Authorised to view this account");
        }
    }

    public void setAccountbalance(int pinNum, double amount) throws Exception {
        if(pinNum == PIN_NUMBER){
            this.accountbalance = accountbalance + amount;
        }else{
            throw new Exception("Please try again!!!");
        }
    }








    public boolean isAccessed() {
        return isAccessed;
    }

    public void setAccessed(boolean accessed) {
        isAccessed = accessed;
    }
}
