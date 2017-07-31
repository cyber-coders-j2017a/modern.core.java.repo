package samplesCodes.proj04AccountSystem;

import java.util.Random;

/**
 * Created by dotcom on 7/31/17.
 */
public class HsbcUk extends UKGovAccount {

    private String bankLogo;
    private String accountNumber;
    private static long PIN;
    private double accountBalance;


    public HsbcUk(String motto, String bankAddress, String bankLogo) {
        super(motto, bankAddress);
        this.bankLogo = bankLogo;
        this.generatePinNumber();
    }

    public String getBankLogo() {
        return bankLogo;
    }


    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }

    private void generatePinNumber(){
        Random radom = new Random();
        this.PIN = 233+ radom.nextInt(1) ;
    }

    public void createCustomerAccount(String customerName){
        System.out.println("Welcome to HSBC and our watch word is "+ motto);
        this.accountNumber = this.createBankAccount(10);
    }


    public void creditAccount(long pin, double amountToBeDeposited){
        if(pin >= PIN){
            this.decideAndCredit(amountToBeDeposited);
        }else{
            System.out.println("Access denied");
        }
    }



    private void decideAndCredit(double amountToBeDeposited){
        this.accountBalance = accountBalance +  amountToBeDeposited;
    }
}
