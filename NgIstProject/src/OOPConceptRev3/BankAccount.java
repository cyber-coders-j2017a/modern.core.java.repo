package OOPConceptRev3;

import java.util.Random;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class BankAccount {

    //Instance or Field Variables
    protected String bankName;
    private long bankUniqueNumber;
    //static or class variables
    protected static String motto = "Our customers are key to our business";
    protected static int branchCode = 22;


    //constructor
    public BankAccount(String bankName, long bankUniqueNumber) {
        this.bankName = bankName;
        this.bankUniqueNumber = bankUniqueNumber;
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to " +bankName+ "!");
        System.out.println(motto);
        System.out.println("Please find below the details of your new account");

    }

    //Method1
    public String applyToOpenAccount(String accountName) {
    return accountName;
    }


    //Method2
    public void issueSortCode() {
       String sortCode =  bankUniqueNumber + "-" + branchCode;
       this.generateUKAccountNumber();
       System.out.println("Your sortcode is " +sortCode);

    }
    //Method3
    public static void generateUKAccountNumber() {
        int accountType = 02;
        Random random = new Random();
        int myNumber = random.nextInt(50) + 1;
        String accountNumber = branchCode +"-" + accountType + "-" + myNumber;
        System.out.println("Your unique IBAN number is " +accountNumber);
    }

    //Method4
    public String issueBankCard() {
        String cardUniqueNumber = "4444";
        String accountType = "0200";
        return bankUniqueNumber +  accountType + cardUniqueNumber;

    }

    //Method5
    public double assignOverdraft(double amountBorrowed) {
        return amountBorrowed * 0.01;

    }
}
