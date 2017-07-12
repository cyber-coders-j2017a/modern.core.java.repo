package OOPConcept3;

/**
 * Created by beatriceotugo on 07/07/2017.
 */
public class BuildingRunner {

    public static void main(String[] args) {

        Building building = new Building(100, "house", 200000.00D);


        building.buyBuilding();


        Account myAccount = new Account();
        myAccount.displayAccountBal(29500);
        System.out.println("Please issue a bank cheque for initial deposit of 1000");


        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.withdrawCash();
        currentAccount.DepositCash();
    }



}

