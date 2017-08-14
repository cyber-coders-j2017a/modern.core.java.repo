package Gov.bankPolicy;

/**
 * Created by Ritanadis on 10/08/2017.
 */
public class AccessBankUk extends GovPolicy {
    private String bankLogo;
    private long accountNumber;

    public AccessBankUk(String bankAddress, String phonenumber, String bankLogo) {
        super(bankAddress, phonenumber);
        this.bankLogo = bankLogo;
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }
    public void createCustomerAccount(String customerName){
        System.out.println("Welcome to Access Bank Uk");
        this.accountNumber = this.createBankAccount(12);
    }
}
