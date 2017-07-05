package samplesCodes.prog03;

import java.util.Scanner;

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
        int pin = getPin();
        if(pin == pinNumber){
            return accountBalance;
        }else{
           return 0.0;
        }
    }


    public String depositMoney(double amount){
        int pin = getPin();
        if(pin == pinNumber){
            double newAccountBalance = accountBalance + amount;
            this.accountBalance = newAccountBalance;
            return "Your account balance is £"+newAccountBalance;
        }else {
            return "Access is denied";
        }
    }




    public String withdrawMoney(double amount){
        int pin = getPin();
        if (pin == pinNumber){
            System.out.println("Access granted");
            double newAccountBalance = accountBalance - amount;
            this.accountBalance = newAccountBalance;
            return "Your account balance is £"+newAccountBalance;
        }else{
            return "Authorisation is denied";
        }
    }


    private int getPin() {
        System.out.println("Please enter your PIN number");
        Scanner myConsole = new Scanner(System.in);
        String pinRaw = myConsole.nextLine();
        return Integer.parseInt(pinRaw);
    }


}
