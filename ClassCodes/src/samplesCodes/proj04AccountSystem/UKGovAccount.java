package samplesCodes.proj04AccountSystem;

import java.util.Random;

/**
 * Created by dotcom on 7/31/17.
 */
public class UKGovAccount {

    //Static or Class Variables
    protected static long licenseNumber = 3475732l;
    protected static String headOffice = "2 Queen Ave. London";

    //Instance/Field Variables
    protected String motto = "Yes we can";
    protected String bankAddress ;

    //Constructor
    public UKGovAccount(String motto, String bankAddress) {
        this.motto = motto;
        this.bankAddress = bankAddress;
    }

    //Methods - 1
    public double createOverDraftCharges(double amountBorrowed){
       return amountBorrowed * 0.001;
    }

    //Methods - 2
    public String createBankAccount(int bankRegCode){
        long accountType = 01;
        long acountEnd = 44;
        return bankRegCode + ""+accountType +""+ acountEnd;
    }

    public static String generateSortCode(int bankCode){
        Random random = new Random();
        int  n = random.nextInt(50) + 1;
        String sortCode = "01-"+bankCode +"-" + n;
        return sortCode;
    }


}
