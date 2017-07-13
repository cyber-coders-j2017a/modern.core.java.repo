package OOPConceptRev2;
import java.util.Scanner;

/**
 * Created by beatriceotugo on 12/07/2017.
 */
public class Account {

    //check balance, withdraw and deposit cash

    private String accountName;
    private double accountBal;
    private String bankName;
    private int pinNumber;

    //public Account() {
      //  this.accountName = "Dee Mine";
       // this.accountBal = 2000D;
        //this.bankName = "barclays";
        //this.pinNumber = 1234;
    //}

    public Account(String accountName, double accountBal, String bankName) {
        this.accountName = accountName;
        this.accountBal = accountBal;
        this.bankName = bankName;
        this.pinNumber = 1234;
    }

    public double getAccountBalance() {
        System.out.println("Please enter your pin number");
        Scanner scanner = new Scanner(System.in);
        String myPin = scanner.nextLine();
        int pinNo = Integer.parseInt(myPin);

        if (pinNo == pinNumber) {
            return accountBal;

        } else {
            return Double.parseDouble("Authorisation denied");
        }
    }

    public void depositCash(double amount) {
            double newaccountBal = accountBal + amount;
            this.accountBal = newaccountBal;
            System.out.println("Your new account balance after deposit is " + newaccountBal);

    }

    public String withdrawCash(double amount) {
        int pinNo = getPinNo();

        if(pinNo == pinNumber) {
            double newaccountBal = accountBal - amount;
            this.accountBal = newaccountBal;
            return "Your new account balance after withdrawal is " + newaccountBal;

        }else{
            return "Authorisation denied";
        }
    }

    private int getPinNo() {
        System.out.println("Please kindly reconfirm your pin number in order to make withdrawal");
        Scanner scanner = new Scanner(System.in);
        String myPin = scanner.nextLine();
        return Integer.parseInt(myPin);
    }

    public void showaccountName() {
        System.out.println("Welcome back " +accountName+ "!");
    }
}

