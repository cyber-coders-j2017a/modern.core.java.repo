package OOPConceptRev3;

import java.util.Random;

/**
 * Created by beatriceotugo on 19/08/2017.
 */
public class BankCustomer extends BankAccount {

    private String bankLogo;
    private long accountNumber;
    private String cardNumber;
    private static final long pinNumber = 2011;


    public BankCustomer(String bankName, long bankUniqueNumber, String bankLogo) {
        super(bankName, bankUniqueNumber);
        this.bankLogo = bankLogo;
        this.cardNumber = this.issueCustomerCard();

    }

    public String issueCardNumber() {
      String cardNumber = this.issueBankCard();
      return cardNumber;
    }

    public void generateAccountNumber() {
        Random random = new Random();
        int accountNumber = random.nextInt(60)  + 238795;
        System.out.println("Your new account number is " +accountNumber);
    }

    public static void issuePinNumber() {
        System.out.println("Your new pin is " +pinNumber);
    }

    public String issueCustomerCard() {
        String bankCard = this.issueBankCard();
        return bankCard;
    }


    public void issuenewPinNumber(int pin) {
      if (pin == pinNumber) {
          if(!cardNumber.equalsIgnoreCase("null")) {
              System.out.println("Please change your pin after first login");

          }else{
              System.out.println("Invalid Account");
          }
      }else{
          System.out.println("Access denied");

      }
    }

    public void depositCash(long amountDeposited) {
        System.out.println("Your account balance after initial deposit is " +amountDeposited);



    }



}
