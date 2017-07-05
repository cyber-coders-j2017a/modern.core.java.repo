package samplesCodes.prog03;

/**
 * Created by dotcom on 7/5/17.
 */
public class Account {

    private double accountBalance;
    private String accountName;
    private String bankName;
    private int pinNumber;



    public Account(double accountBalance, String accountName, String bankName) {
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.bankName = bankName;
        this.pinNumber = 4321;
    }

    public double getAccountBalance(){
        return accountBalance;
    }


    public String depositMoney(double amount){
        double newAccountBalance = accountBalance + amount;
        this.accountBalance = newAccountBalance;
        return "Your account balance is £"+newAccountBalance;
    }


//    public void depositMoney1(double amount){
//        this.accountBalance  = accountBalance + amount;
//    }

    public String withdrawMoney(double amount){
        if (pinNumber == 4321){
            double newAccountBalance = accountBalance - amount;
            this.accountBalance = newAccountBalance;
            return "Your account balance is £"+newAccountBalance;
        }else{
            return "Authorisation is denied";
        }
    }


}
