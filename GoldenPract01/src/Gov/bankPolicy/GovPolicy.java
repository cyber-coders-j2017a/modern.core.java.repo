package Gov.bankPolicy;

import java.util.Random;

public class GovPolicy {
    private static long policyCode = 18368651002l;
    protected static String headOffice = "18 Prospect place Kent";
    protected float phoneNumber = 01322147821f;
    protected String bankAddress;

    public GovPolicy(String bankAddress, String phonenumber) {
        this.bankAddress = bankAddress;
        this.phoneNumber = phoneNumber;
    }


    public long createBankAccount(int bankSortCode) {
        long accountBranch = 02;
        long accountType = 14;
        return bankSortCode + accountBranch + accountType;

    }

    public static String generateAccountNumber(int bankAccount) {
        Random random = new Random();
        int n = random.nextInt(30)+1;
        String accountNumber = "bankAccount" + "221" + "n";
        return accountNumber;

    }
}