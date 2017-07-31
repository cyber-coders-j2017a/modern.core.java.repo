package samplesCodes.proj04AccountSystem;

import java.util.Random;

/**
 * Created by dotcom on 7/31/17.
 */
public class HsbcUk extends UKGovAccount {

    private String bankLogo;
    private double accountNumber;
    private static long PIN;


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
        this.PIN = radom.nextLong() + 233;
    }

    public void createCustomerAccount(String customerName){
        System.out.println("Welcome to HSBC and our watch word is "+ motto);
        this.accountNumber = this.createBankAccount(10);
    }


    public void creditAccount(long pin, double amountToBeDeposited){
        if(pin == PIN){
            if(accountNumber != 0){
               this.accountNumber = accountNumber +  amountToBeDeposited;
            }else{
                System.out.println("There is no account number for this customer");
            }
        }else{
            System.out.println("Access denied");
        }
    }
}
