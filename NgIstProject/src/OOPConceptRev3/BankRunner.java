package OOPConceptRev3;

/**
 * Created by beatriceotugo on 19/08/2017.
 */
public class BankRunner {
    public static void main(String[] args) {


        BankCustomer bank = new BankCustomer("Barclays", 6543, "Yes we can!");

        bank.displayWelcomeMessage();

        String accountName = bank.applyToOpenAccount("Beef Rafter");
        System.out.println("Account Name: " + accountName);

        bank.issueSortCode();
        bank.generateAccountNumber();

        String cardNumber = bank.issueBankCard();
        System.out.println("You will receive your new card within the next 5 working days");

        String card = bank.issueCardNumber();
        System.out.println("Your new card number is " +card);

        bank.issuePinNumber();

        bank.issuenewPinNumber(2011);

        bank.issueCustomerCard();

        bank.depositCash(5000);

    }
}
